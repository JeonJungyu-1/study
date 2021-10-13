--회원제 게시판

--회원정보 테이블
CREATE TABLE member (
    id        VARCHAR2(30) PRIMARY KEY,
    password  VARCHAR2(100) NOT NULL,
    name      VARCHAR2(30) NOT NULL
);

--회원 입력

INSERT INTO member VALUES (
    'aaa',
    '111',
    '홍길동'
);

INSERT INTO member VALUES (
    'bbb',
    '222',
    '김철수'
);

INSERT INTO member VALUES (
    'ccc',
    '333',
    '이영희'
);

--게시판 글 정보 테이블

CREATE TABLE board (
    num        NUMBER(11) PRIMARY KEY,         --글번호
    id         VARCHAR2(30),                                      --작성자 ID
    title      VARCHAR2(200) NOT NULL,               --글 제목
    content    VARCHAR2(4000),                         --글 내용
    hits       NUMBER DEFAULT 0,                          --조회수
    inputdate  DATE DEFAULT sysdate,         --작성일
    CONSTRAINT board_fk FOREIGN KEY ( id )
        REFERENCES member ( id )
            ON DELETE CASCADE --member에서 id를 삭제할 때 board에서 삭제할 id가 쓴 글을 삭제할지 말지 정하는것
                                                                                                                                                                          --cascade는 id를 삭제할 때 글을 삭제함.
);

UPDATE board
SET
    title = null
WHERE
    num = 2;

--게시판 글번호에 사용할 시퀀스

CREATE SEQUENCE boardseq;

--글 저장

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'aaa',
    '글제목1',
    '글내용 1111'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'aaa',
    '글제목1',
    '글내용 1111'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'aaa',
    '글제목12',
    '글내용 1111'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'bbb',
    '글제목133',
    '글내용 1111'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'bbb',
    '글제목1444',
    '글내용 33333'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'aaa',
    '글제목1',
    '글내용 33333'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'aaa',
    '글제목1',
    '글내용 33333'
);



--특정 글에 달린 댓글

CREATE TABLE reply (
    renum  NUMBER PRIMARY KEY,       --댓글 테이블 일련번호
    bnum   NUMBER,                                      --본문 글번호
    id     VARCHAR2(30),                               --댓글 작성자 아이디
    text   VARCHAR2(1000),                          --댓글내용
    CONSTRAINT replyfk1 FOREIGN KEY ( id )
        REFERENCES member ( id )
            ON DELETE CASCADE,
    CONSTRAINT replyfk2 FOREIGN KEY ( bnum )
        REFERENCES board ( num )
            ON DELETE CASCADE
);
