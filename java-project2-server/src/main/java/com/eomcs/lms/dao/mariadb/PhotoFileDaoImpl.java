package com.eomcs.lms.dao.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.lms.domain.PhotoFile;
import com.eomcs.util.DataSource;

public class PhotoFileDaoImpl implements PhotoFileDao {
  DataSource dataSource;
  
  public PhotoFileDaoImpl(DataSource dataSource) {
    this.dataSource=dataSource;
  }
  
  @Override
  public List<PhotoFile> findByPhotoBoardNo(int photoBoardNo) {
    Connection con =dataSource.getConnection();;
    try (
        PreparedStatement stmt = con.prepareStatement(
        "select photo_file_id, photo_id, file_path"
        + " from lms_photo_file"
        + " where photo_id = ? "
        + " order by photo_file_id asc")) {

      stmt.setInt(1, photoBoardNo); // 특정 사진 게시물에 대해 첨부파일을 가져오기
      
      try (ResultSet rs = stmt.executeQuery()) {

        ArrayList<PhotoFile> list = new ArrayList<>();
        while (rs.next()) {
          PhotoFile photoFile = new PhotoFile();
          photoFile.setNo(rs.getInt("photo_file_id"));
          photoFile.setPhotoBoardNo(rs.getInt("photo_id"));
          photoFile.setFilePath(rs.getString("file_path"));

          list.add(photoFile);
        }
        return list;
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void insert(PhotoFile photoFile) {
    Connection con =dataSource.getConnection();
    try (
        PreparedStatement stmt = con.prepareStatement(
        "insert into lms_photo_file(file_path,photo_id) values(?,?)")) {

      stmt.setString(1, photoFile.getFilePath());
      stmt.setInt(2, photoFile.getPhotoBoardNo());
      stmt.executeUpdate();
      
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  public PhotoBoard findByNo(int no) {
    Connection con =dataSource.getConnection();
    try {
      // 조회수 증가시키기
      try (PreparedStatement stmt = con.prepareStatement(
          "update lms_photo set vw_cnt = vw_cnt + 1 where photo_id = ?")) {
        stmt.setInt(1, no);
        stmt.executeUpdate();
      }

      try (PreparedStatement stmt = con.prepareStatement(
          "select photo_id, titl, cdt, vw_cnt, lesson_id from lms_photo"
          + " where photo_id = ?")) {

        stmt.setInt(1, no);

        try (ResultSet rs = stmt.executeQuery()) {

          if (rs.next()) {
            PhotoBoard photoBoard = new PhotoBoard();
            photoBoard.setNo(rs.getInt("photo_id"));
            photoBoard.setTitle(rs.getString("titl"));
            photoBoard.setCreatedDate(rs.getDate("cdt"));
            photoBoard.setViewCount(rs.getInt("vw_cnt"));
            photoBoard.setLessonNo(rs.getInt("lesson_id"));
            return photoBoard;
            
          } else {
            return null;
          }
        }
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  public int update(PhotoBoard photoBoard) {
    Connection con =dataSource.getConnection();
    try (
        PreparedStatement stmt = con.prepareStatement(
        "update lms_photo set titl = ? where photo_id = ?")) {

      stmt.setString(1, photoBoard.getTitle());
      stmt.setInt(2, photoBoard.getNo());

      return stmt.executeUpdate();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  public int deleteByPhotoBoardNo(int photoBoardNo) {
    Connection con =dataSource.getConnection();
    try (
        PreparedStatement stmt = con.prepareStatement(
        "delete from lms_photo_file where photo_id = ?")) {

      stmt.setInt(1, photoBoardNo);

      return stmt.executeUpdate();
      
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
