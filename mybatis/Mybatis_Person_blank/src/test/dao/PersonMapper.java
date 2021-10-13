package test.dao;

import java.util.ArrayList;

import test.vo.Person;

/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface PersonMapper {
	//Person��ü ���� //personMapper.xml�� ȸ���������� �κа� ���ļ� mybatis�� �˾Ƽ� �ڵ� �������
	public int insertPerson(Person p); //return�� int�� ���� ������ ���� delete, insert, update �� �߿� �ϳ� �� ��� ����� �����
	//����
	public int deletePerson(int n);
	//����
	public int updatePerson(Person p);
	//��ü �б�
	public ArrayList<Person> selectAll(); //������� �������� ArrayList ���/Mybatis�� �˾Ƽ� ArrayList ����� ���ǰ����� �־���.
	//1�� �б�
	public Person selectOne(int num);
	//�̸����� �˻��ϱ�(��ü ��ġ)
	public ArrayList<Person> selectName(String s);
	//�̸����� �˻��ϱ�(�κ���ġ
	public ArrayList<Person> selectName2(String s);
}
