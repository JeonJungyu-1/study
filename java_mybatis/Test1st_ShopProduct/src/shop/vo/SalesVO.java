package shop.vo;

public class SalesVO {
	private int num;
	private String inputdate;
	private String code;
	private int quantity;
	private String pname;
	private int price;



	


	public SalesVO() {
		super();
	}
	
	
	public SalesVO(String code, int quantity) {
		super();
		this.code = code;
		this.quantity = quantity;
	}
	
	


	public SalesVO(int num, String code) {
		super();
		this.num = num;
		this.code = code;
	}
	
	


	public SalesVO(int num, int quantity) {
		super();
		this.num = num;
		this.quantity = quantity;
	}


	public SalesVO(int num, String inputdate, String code, int quantity) {
		super();
		this.num = num;
		this.inputdate = inputdate;
		this.code = code;
		this.quantity = quantity;
	}
	public SalesVO(int num, String inputdate, String code, int quantity, String pname, int price) {
		super();
		this.num = num;
		this.inputdate = inputdate;
		this.code = code;
		this.quantity = quantity;
		this.pname = pname;
		this.price = price;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getInputdate() {
		return inputdate;
	}
	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "SalesVO [num=" + num + ", inputdate=" + inputdate + ", code=" + code + ", quantity=" + quantity
				+ ", pname=" + pname + ", price=" + price + "]";
	}
	
	
	
	
	
}
