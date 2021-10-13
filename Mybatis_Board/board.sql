--ȸ���� �Խ���

--ȸ������ ���̺�
CREATE TABLE member (
    id        VARCHAR2(30) PRIMARY KEY,
    password  VARCHAR2(100) NOT NULL,
    name      VARCHAR2(30) NOT NULL
);

--ȸ�� �Է�

INSERT INTO member VALUES (
    'aaa',
    '111',
    'ȫ�浿'
);

INSERT INTO member VALUES (
    'bbb',
    '222',
    '��ö��'
);

INSERT INTO member VALUES (
    'ccc',
    '333',
    '�̿���'
);

--�Խ��� �� ���� ���̺�

CREATE TABLE board (
    num        NUMBER(11) PRIMARY KEY,         --�۹�ȣ
    id         VARCHAR2(30),                                      --�ۼ��� ID
    title      VARCHAR2(200) NOT NULL,               --�� ����
    content    VARCHAR2(4000),                         --�� ����
    hits       NUMBER DEFAULT 0,                          --��ȸ��
    inputdate  DATE DEFAULT sysdate,         --�ۼ���
    CONSTRAINT board_fk FOREIGN KEY ( id )
        REFERENCES member ( id )
            ON DELETE CASCADE --member���� id�� ������ �� board���� ������ id�� �� ���� �������� ���� ���ϴ°�
                                                                                                                                                                          --cascade�� id�� ������ �� ���� ������.
);

UPDATE board
SET
    title = null
WHERE
    num = 2;

--�Խ��� �۹�ȣ�� ����� ������

CREATE SEQUENCE boardseq;

--�� ����

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'aaa',
    '������1',
    '�۳��� 1111'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'aaa',
    '������1',
    '�۳��� 1111'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'aaa',
    '������12',
    '�۳��� 1111'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'bbb',
    '������133',
    '�۳��� 1111'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'bbb',
    '������1444',
    '�۳��� 33333'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'aaa',
    '������1',
    '�۳��� 33333'
);

INSERT INTO board (
    num,
    id,
    title,
    content
) VALUES (
    boardseq.NEXTVAL,
    'aaa',
    '������1',
    '�۳��� 33333'
);



--Ư�� �ۿ� �޸� ���

CREATE TABLE reply (
    renum  NUMBER PRIMARY KEY,       --��� ���̺� �Ϸù�ȣ
    bnum   NUMBER,                                      --���� �۹�ȣ
    id     VARCHAR2(30),                               --��� �ۼ��� ���̵�
    text   VARCHAR2(1000),                          --��۳���
    CONSTRAINT replyfk1 FOREIGN KEY ( id )
        REFERENCES member ( id )
            ON DELETE CASCADE,
    CONSTRAINT replyfk2 FOREIGN KEY ( bnum )
        REFERENCES board ( num )
            ON DELETE CASCADE
);
