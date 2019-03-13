package com.eomcs.lms.handler;
import java.util.List;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;

public class HelloCommand extends AbstractCommand {

  
  public HelloCommand() {
   
    this.name="/hello";
  }

  @Override
  public void execute(Response response) {
    response.println("안녕하세요");
  }

}
