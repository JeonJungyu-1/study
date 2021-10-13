package oop;

//상품 한종류에 대한 정보 VO = Value Object
public class Product {
	private String code;		//상품코드
	private String name;		//상품명
	private int price;			//가격
	
	//new Product(), new Product("A01", "마우스", 1000)
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
	
	
	//toString() 오버라이딩
	@Override
	public String toString() {
		return "코드 : " + code + ", 상품명 : " + name + ", 가격 : " + price;
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
