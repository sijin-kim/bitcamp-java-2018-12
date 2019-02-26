-- 프로젝트
DROP TABLE prjt;

-- 사용기술
DROP TABLE tec;

-- 팀원
DROP TABLE team;

-- 리더
DROP TABLE leader;

-- 게시판
DROP TABLE board;

-- 회사
DROP TABLE company;

-- 팀원사용기술
DROP TABLE team_tec;

-- 리더사용기술
DROP TABLE leader_tec;

-- 사용자
DROP TABLE user;

-- 일정
DROP TABLE caldar;

-- 프로젝트
CREATE TABLE prjt (
  prjt_id    INTEGER      NOT NULL, -- 프로젝트번호
  leader_id  INTEGER      NOT NULL, -- 리더번호
  team_id    INTEGER      NOT NULL, -- 팀원번호
  prgss_stat INTEGER      NOT NULL, -- 진행상황
  wrk_tm     INTEGER      NOT NULL, -- 작업시간
  tot_bgt    INTEGER      NOT NULL, -- 총예산
  use_bgt    INTEGER      NOT NULL, -- 사용예산
  lft_bgt    INTEGER      NOT NULL, -- 남은예산
  pesnl      INTEGER      NOT NULL, -- 인원
  nm         VARCHAR(50)  NOT NULL, -- 이름
  conts      TEXT         NOT NULL, -- 설명
  ntce       VARCHAR(150) NOT NULL, -- 공지사항
  cldar_id   INTEGER      NULL,     -- 일정번호
  board_id   INTEGER      NULL      -- 게시판번호
);

-- 프로젝트 기본키
CREATE UNIQUE INDEX PK_prjt
  ON prjt ( -- 프로젝트
    prjt_id ASC -- 프로젝트번호
  );

-- 프로젝트
ALTER TABLE prjt
  ADD
    CONSTRAINT PK_prjt -- 프로젝트 기본키
    PRIMARY KEY (
      prjt_id -- 프로젝트번호
    );

-- 프로젝트
COMMENT ON TABLE prjt IS '프로젝트';

-- 프로젝트번호
COMMENT ON COLUMN prjt.prjt_id IS '프로젝트번호';

-- 리더번호
COMMENT ON COLUMN prjt.leader_id IS '리더번호';

-- 팀원번호
COMMENT ON COLUMN prjt.team_id IS '팀원번호';

-- 진행상황
COMMENT ON COLUMN prjt.prgss_stat IS '진행상황';

-- 작업시간
COMMENT ON COLUMN prjt.wrk_tm IS '작업시간';

-- 총예산
COMMENT ON COLUMN prjt.tot_bgt IS '총예산';

-- 사용예산
COMMENT ON COLUMN prjt.use_bgt IS '사용예산';

-- 남은예산
COMMENT ON COLUMN prjt.lft_bgt IS '남은예산';

-- 인원
COMMENT ON COLUMN prjt.pesnl IS '인원';

-- 이름
COMMENT ON COLUMN prjt.nm IS '이름';

-- 설명
COMMENT ON COLUMN prjt.conts IS '설명';

-- 공지사항
COMMENT ON COLUMN prjt.ntce IS '공지사항';

-- 일정번호
COMMENT ON COLUMN prjt.cldar_id IS '일정번호';

-- 게시판번호
COMMENT ON COLUMN prjt.board_id IS '게시판번호';

-- 프로젝트 기본키
COMMENT ON INDEX PK_prjt IS '프로젝트 기본키';

-- 프로젝트 기본키
COMMENT ON CONSTRAINT prjt.PK_prjt IS '프로젝트 기본키';

-- 사용기술
CREATE TABLE tec (
  tec_id INTEGER     NOT NULL, -- 사용기술번호
  tec    VARCHAR(50) NOT NULL  -- 사용언어
);

-- 사용기술 기본키
CREATE UNIQUE INDEX PK_tec
  ON tec ( -- 사용기술
    tec_id ASC -- 사용기술번호
  );

-- 사용기술
ALTER TABLE tec
  ADD
    CONSTRAINT PK_tec -- 사용기술 기본키
    PRIMARY KEY (
      tec_id -- 사용기술번호
    );

-- 사용기술
COMMENT ON TABLE tec IS '사용기술';

-- 사용기술번호
COMMENT ON COLUMN tec.tec_id IS '사용기술번호';

-- 사용언어
COMMENT ON COLUMN tec.tec IS '사용언어';

-- 사용기술 기본키
COMMENT ON INDEX PK_tec IS '사용기술 기본키';

-- 사용기술 기본키
COMMENT ON CONSTRAINT tec.PK_tec IS '사용기술 기본키';

-- 팀원
CREATE TABLE team (
  team_id    INTEGER     NOT NULL, -- 팀원번호
  user_id    INTEGER     NOT NULL, -- 사용자번호
  company_id INTEGER     NOT NULL, -- 회사번호
  wwt        INTEGER     NOT NULL, -- 주간작업시간
  mwt        INTEGER     NOT NULL, -- 월간작업시간
  wd         INTEGER     NOT NULL, -- 작업일수
  role       VARCHAR(50) NULL      -- 역할
);

-- 팀원 기본키
CREATE UNIQUE INDEX PK_team
  ON team ( -- 팀원
    team_id ASC -- 팀원번호
  );

-- 팀원
ALTER TABLE team
  ADD
    CONSTRAINT PK_team -- 팀원 기본키
    PRIMARY KEY (
      team_id -- 팀원번호
    );

-- 팀원
COMMENT ON TABLE team IS '팀원';

-- 팀원번호
COMMENT ON COLUMN team.team_id IS '팀원번호';

-- 사용자번호
COMMENT ON COLUMN team.user_id IS '사용자번호';

-- 회사번호
COMMENT ON COLUMN team.company_id IS '회사번호';

-- 주간작업시간
COMMENT ON COLUMN team.wwt IS '주간작업시간';

-- 월간작업시간
COMMENT ON COLUMN team.mwt IS '월간작업시간';

-- 작업일수
COMMENT ON COLUMN team.wd IS '작업일수';

-- 역할
COMMENT ON COLUMN team.role IS '역할';

-- 팀원 기본키
COMMENT ON INDEX PK_team IS '팀원 기본키';

-- 팀원 기본키
COMMENT ON CONSTRAINT team.PK_team IS '팀원 기본키';

-- 리더
CREATE TABLE leader (
  leader_id  INTEGER NOT NULL, -- 리더번호
  user_id    INTEGER NOT NULL, -- 사용자번호
  company_id INTEGER NOT NULL, -- 회사번호
  meet_rpt   TEXT    NULL      -- 미팅보고서
);

-- 리더 기본키
CREATE UNIQUE INDEX PK_leader
  ON leader ( -- 리더
    leader_id ASC -- 리더번호
  );

-- 리더
ALTER TABLE leader
  ADD
    CONSTRAINT PK_leader -- 리더 기본키
    PRIMARY KEY (
      leader_id -- 리더번호
    );

-- 리더
COMMENT ON TABLE leader IS '리더';

-- 리더번호
COMMENT ON COLUMN leader.leader_id IS '리더번호';

-- 사용자번호
COMMENT ON COLUMN leader.user_id IS '사용자번호';

-- 회사번호
COMMENT ON COLUMN leader.company_id IS '회사번호';

-- 미팅보고서
COMMENT ON COLUMN leader.meet_rpt IS '미팅보고서';

-- 리더 기본키
COMMENT ON INDEX PK_leader IS '리더 기본키';

-- 리더 기본키
COMMENT ON CONSTRAINT leader.PK_leader IS '리더 기본키';

-- 게시판
CREATE TABLE board (
  board_id INTEGER      NOT NULL, -- 게시판번호
  vw_cnt   INTEGER      NOT NULL, -- 조회수
  titl     VARCHAR(255) NOT NULL, -- 제목
  conts    TEXT         NOT NULL, -- 내용
  atacmt   VARCHAR(50)  NULL      -- 첨부파일
);

-- 게시판 기본키
CREATE UNIQUE INDEX PK_board
  ON board ( -- 게시판
    board_id ASC -- 게시판번호
  );

-- 게시판
ALTER TABLE board
  ADD
    CONSTRAINT PK_board -- 게시판 기본키
    PRIMARY KEY (
      board_id -- 게시판번호
    );

-- 게시판
COMMENT ON TABLE board IS '게시판';

-- 게시판번호
COMMENT ON COLUMN board.board_id IS '게시판번호';

-- 조회수
COMMENT ON COLUMN board.vw_cnt IS '조회수';

-- 제목
COMMENT ON COLUMN board.titl IS '제목';

-- 내용
COMMENT ON COLUMN board.conts IS '내용';

-- 첨부파일
COMMENT ON COLUMN board.atacmt IS '첨부파일';

-- 게시판 기본키
COMMENT ON INDEX PK_board IS '게시판 기본키';

-- 게시판 기본키
COMMENT ON CONSTRAINT board.PK_board IS '게시판 기본키';

-- 회사
CREATE TABLE company (
  company_id INTEGER      NOT NULL, -- 회사번호
  bn         INTEGER      NOT NULL, -- 사업자번호
  email      VARCHAR(40)  NOT NULL, -- 이메일
  nm         VARCHAR(50)  NOT NULL, -- 이름
  tel        VARCHAR(30)  NOT NULL, -- 전화
  addr       VARCHAR(255) NOT NULL  -- 주소
);

-- 회사 기본키
CREATE UNIQUE INDEX PK_company
  ON company ( -- 회사
    company_id ASC -- 회사번호
  );

-- 회사 유니크 인덱스
CREATE UNIQUE INDEX UIX_company
  ON company ( -- 회사
    email ASC -- 이메일
  );

-- 회사 유니크 인덱스2
CREATE UNIQUE INDEX UIX_company2
  ON company ( -- 회사
    bn ASC -- 사업자번호
  );

-- 회사
ALTER TABLE company
  ADD
    CONSTRAINT PK_company -- 회사 기본키
    PRIMARY KEY (
      company_id -- 회사번호
    );

-- 회사
ALTER TABLE company
  ADD
    CONSTRAINT UK_company -- 회사 유니크 제약
    UNIQUE (
      email -- 이메일
    );

-- 회사
ALTER TABLE company
  ADD
    CONSTRAINT UK_company2 -- 회사 유니크 제약2
    UNIQUE (
      bn -- 사업자번호
    );

-- 회사
COMMENT ON TABLE company IS '회사';

-- 회사번호
COMMENT ON COLUMN company.company_id IS '회사번호';

-- 사업자번호
COMMENT ON COLUMN company.bn IS '사업자번호';

-- 이메일
COMMENT ON COLUMN company.email IS '이메일';

-- 이름
COMMENT ON COLUMN company.nm IS '이름';

-- 전화
COMMENT ON COLUMN company.tel IS '전화';

-- 주소
COMMENT ON COLUMN company.addr IS '주소';

-- 회사 기본키
COMMENT ON INDEX PK_company IS '회사 기본키';

-- 회사 유니크 인덱스
COMMENT ON INDEX UIX_company IS '회사 유니크 인덱스';

-- 회사 유니크 인덱스2
COMMENT ON INDEX UIX_company2 IS '회사 유니크 인덱스2';

-- 회사 기본키
COMMENT ON CONSTRAINT company.PK_company IS '회사 기본키';

-- 회사 유니크 제약
COMMENT ON CONSTRAINT company.UK_company IS '회사 유니크 제약';

-- 회사 유니크 제약2
COMMENT ON CONSTRAINT company.UK_company2 IS '회사 유니크 제약2';

-- 팀원사용기술
CREATE TABLE team_tec (
  team_tec_id INTEGER NOT NULL, -- 사용기술번호
  team_id     INTEGER NOT NULL  -- 팀원번호
);

-- 팀원사용기술 기본키
CREATE UNIQUE INDEX PK_team_tec
  ON team_tec ( -- 팀원사용기술
    team_tec_id ASC, -- 사용기술번호
    team_id     ASC  -- 팀원번호
  );

-- 팀원사용기술
ALTER TABLE team_tec
  ADD
    CONSTRAINT PK_team_tec -- 팀원사용기술 기본키
    PRIMARY KEY (
      team_tec_id, -- 사용기술번호
      team_id      -- 팀원번호
    );

-- 팀원사용기술
COMMENT ON TABLE team_tec IS '팀원사용기술';

-- 사용기술번호
COMMENT ON COLUMN team_tec.team_tec_id IS '사용기술번호';

-- 팀원번호
COMMENT ON COLUMN team_tec.team_id IS '팀원번호';

-- 팀원사용기술 기본키
COMMENT ON INDEX PK_team_tec IS '팀원사용기술 기본키';

-- 팀원사용기술 기본키
COMMENT ON CONSTRAINT team_tec.PK_team_tec IS '팀원사용기술 기본키';

-- 리더사용기술
CREATE TABLE leader_tec (
  leader_tec_id INTEGER NOT NULL, -- 리더번호
  tec_id        INTEGER NOT NULL  -- 사용기술번호
);

-- 리더사용기술 기본키
CREATE UNIQUE INDEX PK_leader_tec
  ON leader_tec ( -- 리더사용기술
    leader_tec_id ASC, -- 리더번호
    tec_id        ASC  -- 사용기술번호
  );

-- 리더사용기술
ALTER TABLE leader_tec
  ADD
    CONSTRAINT PK_leader_tec -- 리더사용기술 기본키
    PRIMARY KEY (
      leader_tec_id, -- 리더번호
      tec_id         -- 사용기술번호
    );

-- 리더사용기술
COMMENT ON TABLE leader_tec IS '리더사용기술';

-- 리더번호
COMMENT ON COLUMN leader_tec.leader_tec_id IS '리더번호';

-- 사용기술번호
COMMENT ON COLUMN leader_tec.tec_id IS '사용기술번호';

-- 리더사용기술 기본키
COMMENT ON INDEX PK_leader_tec IS '리더사용기술 기본키';

-- 리더사용기술 기본키
COMMENT ON CONSTRAINT leader_tec.PK_leader_tec IS '리더사용기술 기본키';

-- 사용자
CREATE TABLE user (
  user_id INTEGER      NOT NULL, -- 사용자번호
  nm      VARCHAR(50)  NOT NULL, -- 이름
  pw      VARCHAR(255) NOT NULL, -- 암호
  pstion  VARCHAR(50)  NOT NULL, -- 직책
  email   VARCHAR(40)  NOT NULL, -- 이메일
  tel     VARCHAR(30)  NULL,     -- 전화
  phot    VARCHAR(50)  NULL      -- 사진
);

-- 사용자 기본키
CREATE UNIQUE INDEX PK_user
  ON user ( -- 사용자
    user_id ASC -- 사용자번호
  );

-- 사용자 유니크 인덱스
CREATE UNIQUE INDEX UIX_user
  ON user ( -- 사용자
    email ASC -- 이메일
  );

-- 사용자
ALTER TABLE user
  ADD
    CONSTRAINT PK_user -- 사용자 기본키
    PRIMARY KEY (
      user_id -- 사용자번호
    );

-- 사용자
ALTER TABLE user
  ADD
    CONSTRAINT UK_user -- 사용자 유니크 제약
    UNIQUE (
      email -- 이메일
    );

-- 사용자
COMMENT ON TABLE user IS '사용자';

-- 사용자번호
COMMENT ON COLUMN user.user_id IS '사용자번호';

-- 이름
COMMENT ON COLUMN user.nm IS '이름';

-- 암호
COMMENT ON COLUMN user.pw IS '암호';

-- 직책
COMMENT ON COLUMN user.pstion IS '직책';

-- 이메일
COMMENT ON COLUMN user.email IS '이메일';

-- 전화
COMMENT ON COLUMN user.tel IS '전화';

-- 사진
COMMENT ON COLUMN user.phot IS '사진';

-- 사용자 기본키
COMMENT ON INDEX PK_user IS '사용자 기본키';

-- 사용자 유니크 인덱스
COMMENT ON INDEX UIX_user IS '사용자 유니크 인덱스';

-- 사용자 기본키
COMMENT ON CONSTRAINT user.PK_user IS '사용자 기본키';

-- 사용자 유니크 제약
COMMENT ON CONSTRAINT user.UK_user IS '사용자 유니크 제약';

-- 일정
CREATE TABLE caldar (
  cldar_id INTEGER  NOT NULL, -- 일정번호
  std      DATETIME NOT NULL, -- 시작일자
  edt      DATETIME NOT NULL  -- 종료일자
);

-- 일정 기본키
CREATE UNIQUE INDEX PK_caldar
  ON caldar ( -- 일정
    cldar_id ASC -- 일정번호
  );

-- 일정
ALTER TABLE caldar
  ADD
    CONSTRAINT PK_caldar -- 일정 기본키
    PRIMARY KEY (
      cldar_id -- 일정번호
    );

-- 일정
COMMENT ON TABLE caldar IS '일정';

-- 일정번호
COMMENT ON COLUMN caldar.cldar_id IS '일정번호';

-- 시작일자
COMMENT ON COLUMN caldar.std IS '시작일자';

-- 종료일자
COMMENT ON COLUMN caldar.edt IS '종료일자';

-- 일정 기본키
COMMENT ON INDEX PK_caldar IS '일정 기본키';

-- 일정 기본키
COMMENT ON CONSTRAINT caldar.PK_caldar IS '일정 기본키';

-- 프로젝트
ALTER TABLE prjt
  ADD
    CONSTRAINT FK_team_TO_prjt -- 팀원 -> 프로젝트
    FOREIGN KEY (
      team_id -- 팀원번호
    )
    REFERENCES team ( -- 팀원
      team_id -- 팀원번호
    );

-- 팀원 -> 프로젝트
COMMENT ON CONSTRAINT prjt.FK_team_TO_prjt IS '팀원 -> 프로젝트';

-- 프로젝트
ALTER TABLE prjt
  ADD
    CONSTRAINT FK_board_TO_prjt -- 게시판 -> 프로젝트
    FOREIGN KEY (
      board_id -- 게시판번호
    )
    REFERENCES board ( -- 게시판
      board_id -- 게시판번호
    );

-- 게시판 -> 프로젝트
COMMENT ON CONSTRAINT prjt.FK_board_TO_prjt IS '게시판 -> 프로젝트';

-- 프로젝트
ALTER TABLE prjt
  ADD
    CONSTRAINT FK_leader_TO_prjt -- 리더 -> 프로젝트
    FOREIGN KEY (
      leader_id -- 리더번호
    )
    REFERENCES leader ( -- 리더
      leader_id -- 리더번호
    );

-- 리더 -> 프로젝트
COMMENT ON CONSTRAINT prjt.FK_leader_TO_prjt IS '리더 -> 프로젝트';

-- 프로젝트
ALTER TABLE prjt
  ADD
    CONSTRAINT FK_caldar_TO_prjt -- 일정 -> 프로젝트
    FOREIGN KEY (
      cldar_id -- 일정번호
    )
    REFERENCES caldar ( -- 일정
      cldar_id -- 일정번호
    );

-- 일정 -> 프로젝트
COMMENT ON CONSTRAINT prjt.FK_caldar_TO_prjt IS '일정 -> 프로젝트';

-- 팀원
ALTER TABLE team
  ADD
    CONSTRAINT FK_company_TO_team -- 회사 -> 팀원
    FOREIGN KEY (
      company_id -- 회사번호
    )
    REFERENCES company ( -- 회사
      company_id -- 회사번호
    );

-- 회사 -> 팀원
COMMENT ON CONSTRAINT team.FK_company_TO_team IS '회사 -> 팀원';

-- 팀원
ALTER TABLE team
  ADD
    CONSTRAINT FK_user_TO_team -- 사용자 -> 팀원
    FOREIGN KEY (
      user_id -- 사용자번호
    )
    REFERENCES user ( -- 사용자
      user_id -- 사용자번호
    );

-- 사용자 -> 팀원
COMMENT ON CONSTRAINT team.FK_user_TO_team IS '사용자 -> 팀원';

-- 리더
ALTER TABLE leader
  ADD
    CONSTRAINT FK_company_TO_leader -- 회사 -> 리더
    FOREIGN KEY (
      company_id -- 회사번호
    )
    REFERENCES company ( -- 회사
      company_id -- 회사번호
    );

-- 회사 -> 리더
COMMENT ON CONSTRAINT leader.FK_company_TO_leader IS '회사 -> 리더';

-- 리더
ALTER TABLE leader
  ADD
    CONSTRAINT FK_user_TO_leader -- 사용자 -> 리더
    FOREIGN KEY (
      user_id -- 사용자번호
    )
    REFERENCES user ( -- 사용자
      user_id -- 사용자번호
    );

-- 사용자 -> 리더
COMMENT ON CONSTRAINT leader.FK_user_TO_leader IS '사용자 -> 리더';

-- 팀원사용기술
ALTER TABLE team_tec
  ADD
    CONSTRAINT FK_tec_TO_team_tec -- 사용기술 -> 팀원사용기술
    FOREIGN KEY (
      team_tec_id -- 사용기술번호
    )
    REFERENCES tec ( -- 사용기술
      tec_id -- 사용기술번호
    );

-- 사용기술 -> 팀원사용기술
COMMENT ON CONSTRAINT team_tec.FK_tec_TO_team_tec IS '사용기술 -> 팀원사용기술';

-- 팀원사용기술
ALTER TABLE team_tec
  ADD
    CONSTRAINT FK_team_TO_team_tec -- 팀원 -> 팀원사용기술
    FOREIGN KEY (
      team_id -- 팀원번호
    )
    REFERENCES team ( -- 팀원
      team_id -- 팀원번호
    );

-- 팀원 -> 팀원사용기술
COMMENT ON CONSTRAINT team_tec.FK_team_TO_team_tec IS '팀원 -> 팀원사용기술';

-- 리더사용기술
ALTER TABLE leader_tec
  ADD
    CONSTRAINT FK_leader_TO_leader_tec -- 리더 -> 리더사용기술
    FOREIGN KEY (
      leader_tec_id -- 리더번호
    )
    REFERENCES leader ( -- 리더
      leader_id -- 리더번호
    );

-- 리더 -> 리더사용기술
COMMENT ON CONSTRAINT leader_tec.FK_leader_TO_leader_tec IS '리더 -> 리더사용기술';

-- 리더사용기술
ALTER TABLE leader_tec
  ADD
    CONSTRAINT FK_tec_TO_leader_tec -- 사용기술 -> 리더사용기술
    FOREIGN KEY (
      tec_id -- 사용기술번호
    )
    REFERENCES tec ( -- 사용기술
      tec_id -- 사용기술번호
    );

-- 사용기술 -> 리더사용기술
COMMENT ON CONSTRAINT leader_tec.FK_tec_TO_leader_tec IS '사용기술 -> 리더사용기술';