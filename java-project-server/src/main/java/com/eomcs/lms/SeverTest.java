// 2단계 서버 실행 테스트
package com.eomcs.lms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.sql.Date;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Member;


public class SeverTest {

  public static void main(String[] args) {
        
     try(Socket socket = new Socket("localhost",8888);
       PrintStream out = new PrintStream(socket.getOutputStream());
       BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
           System.out.println("서버와 연결되었음");
       
       
         Member member =new Member();
         Date date = new Date(System.currentTimeMillis());
          member.setNo(1);
          member.setName("김시진");
          member.setEmail("tlwls456@naver.com");
          member.setPassword("4444");
          member.setPhoto("tlwls");
          member.setTel("456456");
          member.setRegisteredDate(date);
           out.println(member);
           out.flush();
             
           String respones= in.readLine();
           System.out.println(respones);
       
       
     }catch(Exception e) {
         e.printStackTrace();
    
     }
     System.out.println("서버와 연결을끊었음");
  }
  }

