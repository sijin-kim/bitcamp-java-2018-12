package com.eomcs.lms.dao.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;

// 서버쪽에 있는 BoardDaoImpl 객체를 대행할 클라이언트측 대행자 클래스 정의 
//
public class BoardMariadbimpl implements BoardDao {


  public List<Board> findAll() {

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {

      try (PreparedStatement stmt = con.prepareStatement(
          "select board_id ,conts ,cdt ,vw_cnt from board_id")) {


        try (ResultSet rs = stmt.executeQuery()){
          ArrayList<Board> list = new ArrayList<>();

          while (rs.next()) {
            Board board = new Board();
            board.setNo(rs.getInt("board_id"));
            board.setContents(rs.getString("conts"));
            board.setCreatedDate(rs.getDate("cdt"));
            board.setViewCount(rs.getInt("vw_cnt"));

            list.add(board);
          }
          return list;
        }

      }

    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public void insert(Board board) {

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {

      try (PreparedStatement stmt = con.prepareStatement(
          "insert into lms_board(conts) values(?)")) {
        stmt.setString(1,board.getContents());

      }

    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }


  public Board findByNo(int no) {

    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {

      // 조회수 증가시키기
      try (PreparedStatement stmt = con.prepareStatement(
          "update lms_board set vw_cnt= vw_cnt +1 where board_i=? ")) {
        stmt.setInt(1,no);
      }
      try (PreparedStatement stmt = con.prepareStatement(
          "select board_id,conts,cdt,vw_cnt from lms_board where board_id=?" )){

        try (ResultSet rs = stmt.executeQuery()){

          if(rs.next()) {
            Board board =new Board();
            board.setNo(rs.getInt("board_id"));
            board.setContents(rs.getString("conts"));
         

            return board;


          } else {
            return null;
          }
        }

      }

    } catch (Exception e) {
     throw new RuntimeException(e);
    }


  }


  public int update(Board board) {
    return 0;

  }

  public int delete(int no) {
    return 0;


  }
}









