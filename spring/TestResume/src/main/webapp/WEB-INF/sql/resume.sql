CREATE TABLE test_user (
    user_id  VARCHAR2(30) PRIMARY KEY,
    user_pw  VARCHAR2(30) NOT NULL,
    user_nm  VARCHAR2(30) NOT NULL
);

CREATE TABLE test_resume (
    resume_no        NUMBER PRIMARY KEY,
    user_id          VARCHAR2(30) NOT NULL
        CONSTRAINT test_resume_fk
            REFERENCES test_user ( user_id ),
    resume_title     VARCHAR2(300) NOT NULL,
    resume_location  CHAR(1) NOT NULL,
    resume_position  CHAR(1) NOT NULL,
    resume_pr        VARCHAR2(3000) NOT NULL,
    resume_indate    DATE DEFAULT sysdate
);

CREATE SEQUENCE test_resume_seq;