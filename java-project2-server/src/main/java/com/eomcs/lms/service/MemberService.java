package com.eomcs.lms.service;

import java.util.List;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Member;

public interface MemberService {
  List<Member> list(); // findAll 
 int add(Member member); // insert
  Member get(int no);   //detail == findbyno
  int update(Member member);
  List<Member> findByKeyword(String keyword);
   int delete(int no);
}
