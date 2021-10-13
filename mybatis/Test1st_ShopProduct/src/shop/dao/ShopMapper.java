package shop.dao;

import java.util.ArrayList;

import shop.vo.ProductVO;
import shop.vo.SalesVO;

public interface ShopMapper {
	
	public int productInsert(ProductVO vo);
	public ArrayList<ProductVO> productSelectAll();
	public int salesInsert(SalesVO vo);
	public ArrayList<SalesVO> salesSelectAll();
	public ProductVO getCode(String code);
	public SalesVO getNum(int num);
	public int salesUpdateCode(SalesVO svo);
	public int salesDelete(int num);
	public ArrayList<SalesVO> productSales();
	public int salesUpdateQuantity(SalesVO svo);

}
