package com.eomcs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;


//커넥션을 빌려주고 리턴받는 일을한다.
public class DataSource {
  String driver;
  String jdbcUrl;
  String username;
  String password;
  
  public DataSource(String driver,String jdbcUrl,String username,String password) {
    this.driver=driver;
    this.jdbcUrl=jdbcUrl;
    this.username=username;
    this.password=password;
  }
  
  
  //한번 생성된 db커넥션 객체를 보관하는 저장소
  ArrayList<Connection> list = new ArrayList<>();
  
  //커넥션 객체를 스레드에 보관할수 있도록 보자기를 준비한다.
  ThreadLocal<Connection> conLocal = new ThreadLocal<>();
  
  
 public  Connection getConnection() {

   try {
     //스레드 주머니에 들어있는 커넥션 객체꺼내기
     Connection con= conLocal.get();
     
     if(con ==null) {// 현재 스레드 주머니에 connection 객체가 들어있지 않다면
       if(list.size()==0) { // 
         System.out.println("새로 db커넥션 생성 함");
         con= DriverManager.getConnection(
             "jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111");
         con.setAutoCommit(false);   
       } else {  
         System.out.println("커넥션풀에 보관된 것을 리턴함");
         con=list.remove(0);
       }
   conLocal.set(con);
     }else {
       System.out.println("스레드 주머니에 보관된 커넥션 객체 리턴함.");
     }
     return con;
     
 }catch (Exception e) {
   throw new RuntimeException(e);
 }
  
 }
 
 public void returnConnection(Connection con) {
   //다 사용한 커넥션 객체는 다시 재활용할 수 있도록 목록에 보관한다.
   list.add(con);
 }
}
