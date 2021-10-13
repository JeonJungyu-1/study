package test.dao;

import java.util.ArrayList;

import test.vo.Person;

/**
 * Mapper XML의 SQL문 사용 메서드 정의
 */
public interface PersonMapper {
	//Person객체 저장 //personMapper.xml의 회원정보저장 부분과 합쳐서 mybatis가 알아서 코드 만들어줌
	public int insertPerson(Person p); //return된 int는 지금 실행한 것이 delete, insert, update 셋 중에 하나 일 경우 변경된 행수임
	//삭제
	public int deletePerson(int n);
	//수정
	public int updatePerson(Person p);
	//전체 읽기
	public ArrayList<Person> selectAll(); //결과행이 여러개라서 ArrayList 사용/Mybatis가 알아서 ArrayList 만들고 행의값들을 넣어줌.
	//1명만 읽기
	public Person selectOne(int num);
	//이름으로 검색하기(전체 일치)
	public ArrayList<Person> selectName(String s);
	//이름으로 검색하기(부분일치
	public ArrayList<Person> selectName2(String s);
}
