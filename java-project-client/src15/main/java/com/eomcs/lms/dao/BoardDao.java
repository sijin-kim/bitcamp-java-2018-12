// 프록시 패턴 적용해서 - boarddao에서 인터페이슬 추출한다.
package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.Board;

public interface BoardDao {

  
  void insert(Board board);
  List<Board> findAll() ;
  Board findByNo(int no);
  int update(Board board);
  int delete(int no);

  }









