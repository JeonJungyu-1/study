--�л� ���� ���̺�
create table student (
	id		varchar2(10) primary key,	--�й�
	name	varchar2(20) not null,		--�̸�
	kor		number(3) default 0,		--��������
	eng		number(3) default 0,		--��������
	mat		number(3) default 0			--��������
);

--�Է� ��
insert into student values ('1111', 'ȫ�浿', 100, 90, 80);

select id, name, kor, eng, mat, (kor+eng+mat) as tot, (kor+eng+mat)/3 as avg from student;

select id, (kor + eng + mat) /3 as avg from student order by avg desc;

select
	*
from 
	(select id, (kor + eng + mat)/3 as avg from student order by avg desc) s
where
	rownum <=2
;