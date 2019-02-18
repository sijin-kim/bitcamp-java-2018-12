// 프록시 패턴 적용해서 - boarddao에서 인터페이슬 추출한다.
package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.Board;

public interface MemberDao {

  
  void insert(Member member);
  List<Member> findAll() ;
  Member findByNo(int no);
  int update(Member member);
  int delete(int no);

  }









