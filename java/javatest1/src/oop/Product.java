package oop;

//��ǰ �������� ���� ���� VO = Value Object
public class Product {
	private String code;		//��ǰ�ڵ�
	private String name;		//��ǰ��
	private int price;			//����
	
	//new Product(), new Product("A01", "���콺", 1000)
	public Product() {
		
	}
	
	public Product(String code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	
	//Getter, Setter
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//toString() �������̵�
	@Override
	public String toString() {
		return "�ڵ� : " + code + ", ��ǰ�� : " + name + ", ���� : " + price;
	}
	
	//a.equals(b)
	@Override
	public boolean equals(Object obj) {
		Product p = (Product)obj;
		if (this.code.equals(p.code) && this.name.equals(p.name) && this.price == p.price) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
