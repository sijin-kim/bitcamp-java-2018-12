package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;



  
  




public class App {
  

  
  
  

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10;
    
    Lesson[] lessons = new Lesson[LENGTH];
    int lessonIdx = 0;
    
    Member[] members = new Member[LENGTH];
    int memberIdx = 0;
    
    Board[] boards = new Board[LENGTH];
    int boardIdx = 0;

    while (true) {
      System.out.print("명령> ");
      String command = keyboard.nextLine().toLowerCase();

      if (command.equals("/lesson/add")) {
        
        
      } else if (command.equals("/member/list")) {
        listLesson(members, memberIdx);
        
      } else if (command.equals("/board/add")) {
        Board board = new Board();
        
        System.out.print("번호? ");
        board.no = Integer.parseInt(keyboard.nextLine());
        
        System.out.print("내용? ");
        board.contents = keyboard.nextLine();
        
        board.createdDate = new Date(System.currentTimeMillis()); 
        
        board.viewCount = 0;
        
        boards[boardIdx] = board;
        boardIdx++;
        
        System.out.println("저장하였습니다.");
        
      } else if (command.equals("/board/list")) {
        for (int j = 0; j < boardIdx; j++) {
          System.out.printf("%3d, %-20s, %s, %d\n", 
              boards[j].no, boards[j].contents, boards[j].createdDate, boards[j].viewCount);
        }
        
      } else if (command.equals("quit")) {
        System.out.println("안녕!");
        break;
        
      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      
      System.out.println(); // 결과 출력 후 빈 줄 출력
    }

    keyboard.close();
  }

  static void listLesson(Member[] members, int memberIdx) {
    for (int j = 0; j < memberIdx; j++) {
      System.out.printf("%3d, %-4s, %-20s, %-15s, %s\n", 
          members[j].no, members[j].name, members[j].email, 
          members[j].tel, members[j].registeredDate);
    }
  }

static void addLesson() {
  
  
  
  
}
}



