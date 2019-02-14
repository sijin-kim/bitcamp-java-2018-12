package com.eomcs.lms.agent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.domain.Lesson;

public class LessonAgent {

  public static void add(Lesson lesson, ObjectInputStream in, ObjectOutputStream out) throws Exception {

    out.writeUTF("/lesson/add"); 
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");

    out.writeObject(lesson);
    out.flush();

    String status = in.readUTF();

    if (!status.equals("OK"))
      throw new Exception("서버에서 저장 실패!");

  }
  
  public static void Delete(int no, ObjectInputStream in, ObjectOutputStream out) throws Exception {
  
    out.writeUTF("/lesson/delete");
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");
    
    out.writeInt(no);
    out.flush();
    
    String status = in.readUTF();
    
    if (!status.equals("OK")) 
      throw new Exception("서버의 데이터 삭제 실패!");
  }
  public static Lesson get(int no, ObjectInputStream in, ObjectOutputStream out) throws Exception {
  
    out.writeUTF("/lesson/detail");
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");
    
    out.writeInt(no);
    out.flush();
    
    String status = in.readUTF();
    
    if (!status.equals("OK")) 
      throw new Exception("서버의 데이터 가져오기 실패!");
    
  } 
  
  
  
  
}