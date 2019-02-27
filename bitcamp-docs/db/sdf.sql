-- 사용자
DROP TABLE IF EXISTS sdf RESTRICT;

-- 그룹
DROP TABLE IF EXISTS TABLE2 RESTRICT;

-- 연락처
DROP TABLE IF EXISTS TABLE3 RESTRICT;

-- 명함관리시스템
DROP TABLE IF EXISTS TABLE4 RESTRICT;

-- 국가번호
DROP TABLE IF EXISTS Temporary RESTRICT;

-- 직업번호
DROP TABLE IF EXISTS Temporary2 RESTRICT;

-- 사용자
CREATE TABLE sdf (
  COL10 INTEGER      NOT NULL COMMENT '사용자번호', -- 사용자번호
  COL   VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
  COL8  VARCHAR(50)  NOT NULL COMMENT '아이디', -- 아이디
  COL4  VARCHAR(30)  NOT NULL COMMENT '암호', -- 암호
  COL3  VARCHAR(30)  NOT NULL COMMENT '전화번호', -- 전화번호
  COL11 VARCHAR(50)  NULL     COMMENT '생일', -- 생일
  COL2  VARCHAR(40)  NULL     COMMENT '이메일', -- 이메일
  COL12 INTEGER      NOT NULL COMMENT '주민등록번호', -- 주민등록번호
  COL6  INTEGER      NOT NULL COMMENT '직업번호번호', -- 직업번호번호
  COL7  INTEGER      NULL     COMMENT '팩스번호', -- 팩스번호
  COL5  VARCHAR(255) NOT NULL COMMENT '주소', -- 주소
  COL9  VARCHAR(50)  NULL     COMMENT '사진' -- 사진
)
COMMENT '사용자';

-- 사용자
ALTER TABLE sdf
  ADD CONSTRAINT PK_sdf -- 사용자 기본키
    PRIMARY KEY (
      COL10 -- 사용자번호
    );

-- 그룹
CREATE TABLE TABLE2 (
  COL2 INTEGER     NOT NULL COMMENT '그룹번호', -- 그룹번호
  COL  VARCHAR(50) NOT NULL COMMENT '그룹명' -- 그룹명
)
COMMENT '그룹';

-- 그룹
ALTER TABLE TABLE2
  ADD CONSTRAINT PK_TABLE2 -- 그룹 기본키
    PRIMARY KEY (
      COL2 -- 그룹번호
    );

-- 연락처
CREATE TABLE TABLE3 (
  COL7  INTEGER      NOT NULL COMMENT '연락처번호', -- 연락처번호
  COL8  INTEGER      NOT NULL COMMENT '그룹번호', -- 그룹번호
  COL   VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
  COL2  VARCHAR(50)  NOT NULL COMMENT '회사', -- 회사
  COL3  VARCHAR(40)  NULL     COMMENT '이메일', -- 이메일
  COL4  INTEGER      NOT NULL COMMENT '국가번호번호', -- 국가번호번호
  COL5  INTEGER      NOT NULL COMMENT '전화번호', -- 전화번호
  COL9  INTEGER      NULL     COMMENT '생일', -- 생일
  COL6  VARCHAR(50)  NULL     COMMENT '메모', -- 메모
  COL10 VARCHAR(255) NULL     COMMENT '홈페이지' -- 홈페이지
)
COMMENT '연락처';

-- 연락처
ALTER TABLE TABLE3
  ADD CONSTRAINT PK_TABLE3 -- 연락처 기본키
    PRIMARY KEY (
      COL7 -- 연락처번호
    );

-- 명함관리시스템
CREATE TABLE TABLE4 (
  COL10 INTEGER NOT NULL COMMENT '사용자번호', -- 사용자번호
  COL7  INTEGER NOT NULL COMMENT '연락처번호' -- 연락처번호
)
COMMENT '명함관리시스템';

-- 국가번호
CREATE TABLE Temporary (
  COL  INTEGER     NOT NULL COMMENT '국가번호번호', -- 국가번호번호
  COL4 VARCHAR(50) NOT NULL COMMENT '국가명', -- 국가명
  COL2 VARCHAR(20) NOT NULL COMMENT '국가코드' -- 국가코드
)
COMMENT '국가번호';

-- 국가번호
ALTER TABLE Temporary
  ADD CONSTRAINT PK_Temporary -- 국가번호 기본키
    PRIMARY KEY (
      COL -- 국가번호번호
    );

-- 직업번호
CREATE TABLE Temporary2 (
  COL  INTEGER     NOT NULL COMMENT '직업번호번호', -- 직업번호번호
  COL6 VARCHAR(50) NOT NULL COMMENT '직업명' -- 직업명
)
COMMENT '직업번호';

-- 직업번호
ALTER TABLE Temporary2
  ADD CONSTRAINT PK_Temporary2 -- 직업번호 기본키
    PRIMARY KEY (
      COL -- 직업번호번호
    );

-- 사용자
ALTER TABLE sdf
  ADD CONSTRAINT FK_Temporary2_TO_sdf -- 직업번호 -> 사용자
    FOREIGN KEY (
      COL6 -- 직업번호번호
    )
    REFERENCES Temporary2 ( -- 직업번호
      COL -- 직업번호번호
    );

-- 연락처
ALTER TABLE TABLE3
  ADD CONSTRAINT FK_TABLE2_TO_TABLE3 -- 그룹 -> 연락처
    FOREIGN KEY (
      COL8 -- 그룹번호
    )
    REFERENCES TABLE2 ( -- 그룹
      COL2 -- 그룹번호
    );

-- 연락처
ALTER TABLE TABLE3
  ADD CONSTRAINT FK_Temporary_TO_TABLE3 -- 국가번호 -> 연락처
    FOREIGN KEY (
      COL4 -- 국가번호번호
    )
    REFERENCES Temporary ( -- 국가번호
      COL -- 국가번호번호
    );

-- 명함관리시스템
ALTER TABLE TABLE4
  ADD CONSTRAINT FK_sdf_TO_TABLE4 -- 사용자 -> 명함관리시스템
    FOREIGN KEY (
      COL10 -- 사용자번호
    )
    REFERENCES sdf ( -- 사용자
      COL10 -- 사용자번호
    );

-- 명함관리시스템
ALTER TABLE TABLE4
  ADD CONSTRAINT FK_TABLE3_TO_TABLE4 -- 연락처 -> 명함관리시스템
    FOREIGN KEY (
      COL7 -- 연락처번호
    )
    REFERENCES TABLE3 ( -- 연락처
      COL7 -- 연락처번호
    );