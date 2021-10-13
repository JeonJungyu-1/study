package shop.manager;

import java.util.ArrayList;

import shop.dao.ShopDAO;
import shop.vo.ProductVO;
import shop.vo.SalesVO;

public class ShopManager {
	private ShopDAO dao = new ShopDAO();

	public int productInsert(ProductVO vo) {
		int result = dao.productInsert(vo);
		return result;
	}
	
	public ArrayList<ProductVO> productSelectAll() {
		ArrayList<ProductVO> list = dao.productSelectAll();
		return list;
	}

	public int salesInsert(SalesVO vo) {
		int result = dao.salesInsert(vo);
		return result;
	}

	public ArrayList<SalesVO> salesSelectAll() {
		ArrayList<SalesVO> list = dao.salesSelectAll();
		return list;
	}

	public ProductVO getCode(String code) {
		ProductVO v = dao.getCode(code);
		return v;
	}
	
	public SalesVO getNum(int num) {
		SalesVO v = dao.getNum(num);
		return v;
	}

	public int salesUpdateCode(SalesVO svo) {
		int result = dao.salesUpdateCode(svo);
		return result;
	}
	
	public int salesUpdateQuantity(SalesVO svo) {
		int result = dao.salesUpdateQuantity(svo);
		return result;
	}
	

	public int salesDelete(int num) {
		int result = dao.salesDelete(num);
		return result;
	}

	public ArrayList<SalesVO> productSales() {
		ArrayList<SalesVO> list = dao.productSales();
		return list;
	}

	
}
