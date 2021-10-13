package oop; //��Ű�� ������ ���� ���� �־����.

//abc.co.kr��� ȸ�翡�� game�̶�� ������Ʈ ����
//������ ������ kr.co.abc.game.controller.Data�� �з��ؼ� ���(class �̸� ��ġ�� �ʵ��� �ϱ����ؼ���)
//class : ���� �ǹ̷� ���ϸ� ���ο� �ڷ����� ����� ���°�


//Ŭ������ ����
public class Data {
	//�Ӽ� = �������, �ν��Ͻ� ����
	//���������� : public(��𼭳� ���ٰ���) > protected(���� ��Ű���Ҽ��̰ų� �ٸ���Ű���߿� ��ӹ����� ���ٰ���) > (default)(���� ��Ű�� �Ҽ��̸� ���� ����) > private(�ܺο��� ���� �Ұ���)
	private String name;  //private ���̸� �ܺο��� ���ǵ帲
	private String phone;
	private int age;
	private String email;
	
	//��� = �޼ҵ�
	//���������� returnŸ�� �޼ҵ��̸�(�������� �Ǵ� �μ�)
	public void setAge(int age) {
		if (age < 0) return;
		this.age = age;
	} //�̷� ��쿡�� �򰥸��ϱ� ������ this.age ����� ��
	
	public int getAge() {
		return age;
//		return this.age; //�̷��� �ᵵ ��. this�� ����Ű�� ��ü�� �ּҸ� ���� ����.
	}
	public String getName() {
		return name;
	}
	
	public void print() {
		System.out.println("�̸�:" + name + " ��ȭ��ȣ:" + phone + " ����:" + age + " email:" + email);
	} //this.name �̷��� �ᵵ��.
}
