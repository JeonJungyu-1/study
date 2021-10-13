create table spring_test_user(
	id			varchar2(30)		primary key
	,name		varchar2(30)		not null
	,password	varchar2(30)		not null
);

create table spring_test_board(
	board_num		number				primary key
	,board_title	varchar2(100)		not null
	,board_context	varchar2(2000)		not null
	,id				varchar2(30)		not null	references spring_test_user(id)
	,board_indate	date				default sysdate
);

create sequence spring_test_board_seq;

insert into
    spring_test_user(
        id
        ,name
        ,password
    )values(
        'test1'
        ,'테스터1'
        ,'1234'
    );

commit;

insert into
    spring_test_board(
        board_num
        ,board_title
        ,board_context
        ,id
    )values(
        spring_test_board_seq.nextval
        ,'제목입니다'
        ,'내용입니다'
        ,'test1'
    );
    
commit;