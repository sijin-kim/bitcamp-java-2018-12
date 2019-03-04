package com.eomcs.lms.handler;
import java.util.List;
import com.eomcs.lms.dao.PhotoBoradDao;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.PhotoBoard;

public class PhotoBoardListCommand extends AbstractCommand {

  PhotoBoradDao photoBoardDao;
  
  public PhotoBoardListCommand(PhotoBoradDao photoBoardDao) {
    this.photoBoardDao = photoBoardDao;
  }

  @Override
  public void execute(Response response) {
    List<PhotoBoard> boards = photoBoardDao.findAll();
    
    for (PhotoBoard board : boards) {
      response.println(
          String.format("%3d, %-20s, %s, %d", 
            board.getNo(), board.getTitle(), 
            board.getCreateDate(), board.getViewcount()));
    }
  }

}
