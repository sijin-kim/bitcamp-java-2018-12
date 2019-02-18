package com.eomcs.lms.proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import com.eomcs.lms.domain.Member;

public class MemberDaoproxy implements MemberDao{
  
  String serverAddr;
  int port;
  String rootPath;

  public MemberDaoproxy(String serverAddr, int port, String rootPath) {
    this.serverAddr = serverAddr;
    this.port = port;
    this.rootPath = rootPath;
  }

  @SuppressWarnings("unchecked")
  public List<Member> findAll()  {
    try (Socket socket = new Socket(this.serverAddr, this.port);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

    out.writeUTF("/member/list"); 
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");

    String status = in.readUTF();

    if (!status.equals("OK")) 
      throw new Exception("서버의 데이터 목록 가져오기 실패!");

    return (List<Member>) in.readObject();
    }catch (Exception e){
      throw new RuntimeException(e);
    }
  }
  
  public void insert(Member member) {
    try (Socket socket = new Socket(this.serverAddr, this.port);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

    out.writeUTF("/member/add"); 
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");
    
    out.writeObject(member);
    out.flush();
    
    String status = in.readUTF();
    
    if (!status.equals("OK"))
      throw new Exception("서버의 데이터 저장 실패!");
    }catch (Exception e){
      throw new RuntimeException(e);
    }
  }
  
  public Member findByNo(int no) {
    try (Socket socket = new Socket(this.serverAddr, this.port);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

    out.writeUTF("/member/detail");
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");
    
    out.writeInt(no);
    out.flush();
    
    String status = in.readUTF();
    
    if (!status.equals("OK")) 
      throw new Exception("서버의 데이터 가져오기 실패!");
    
    return (Member) in.readObject();
    }
  }
  
  public void update(Member member)  {
    try (Socket socket = new Socket(this.serverAddr, this.port);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

    out.writeUTF("/member/update");
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");
    
    out.writeObject(member);
    out.flush();
    
    String status = in.readUTF();
    if (!status.equals("OK")) 
      throw new Exception("서버의 데이터 데이터 변경 실패!");
    }catch (Exception e){
      throw new RuntimeException(e);
    }
  }
  
  public void delete(int no)  {
    try (Socket socket = new Socket(this.serverAddr, this.port);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

    out.writeUTF("/member/delete");
    out.flush();
    if (!in.readUTF().equals("OK"))
      throw new Exception("서버에서 해당 명령어를 처리하지 못합니다.");
    
    out.writeInt(no);
    out.flush();
    
    String status = in.readUTF();
    
    if (!status.equals("OK")) 
      throw new Exception("서버의 데이터 삭제 실패!");
    }catch (Exception e){
      throw new RuntimeException(e);
    }
  }
}









