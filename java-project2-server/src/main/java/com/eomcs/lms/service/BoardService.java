package com.eomcs.lms.service;

import java.util.List;
import com.eomcs.lms.domain.Board;

public interface BoardService {
  List<Board> list(); // findAll 
  int add(Board board); // insert
  Board get(int no);   //detail == findbyno
  int update(Board board);
  int delete(int no);
}
