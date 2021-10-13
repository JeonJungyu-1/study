package shop.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import shop.dao.ShopMapper;
import shop.dao.MybatisConfig;
import shop.vo.ProductVO;
import shop.vo.SalesVO;

public class ShopDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	public int productInsert(ProductVO vo) {
		SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession(); 
			ShopMapper mapper = ss.getMapper(ShopMapper.class);
			result = mapper.productInsert(vo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;		
	}

	public ArrayList<ProductVO> productSelectAll() {
		SqlSession ss = null;
		ArrayList<ProductVO> result = null;
		try {
			ss = factory.openSession(); 
			ShopMapper mapper = ss.getMapper(ShopMapper.class);
			result = mapper.productSelectAll();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;	
	}

	public int salesInsert(SalesVO vo) {
		SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession(); 
			ShopMapper mapper = ss.getMapper(ShopMapper.class);
			result = mapper.salesInsert(vo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;	
	}

	public ArrayList<SalesVO> salesSelectAll() {
		SqlSession ss = null;
		ArrayList<SalesVO> result = null;
		try {
			ss = factory.openSession(); 
			ShopMapper mapper = ss.getMapper(ShopMapper.class);
			result = mapper.salesSelectAll();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;	
	}

	public ProductVO getCode(String code) {
		SqlSession ss = null;
		ProductVO result = null;
		try {
			ss = factory.openSession(); 
			ShopMapper mapper = ss.getMapper(ShopMapper.class);
			result = mapper.getCode(code);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;	
	}
	
	public SalesVO getNum(int num) {
		SqlSession ss = null;
		SalesVO result = null;
		try {
			ss = factory.openSession(); 
			ShopMapper mapper = ss.getMapper(ShopMapper.class);
			result = mapper.getNum(num);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;	
	}

	public int salesUpdateCode(SalesVO svo) {
		SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession(); 
			ShopMapper mapper = ss.getMapper(ShopMapper.class);
			result = mapper.salesUpdateCode(svo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;	
	}
	
	public int salesUpdateQuantity(SalesVO svo) {
		SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession(); 
			ShopMapper mapper = ss.getMapper(ShopMapper.class);
			result = mapper.salesUpdateQuantity(svo);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;
	}
	

	public int salesDelete(int num) {
		SqlSession ss = null;
		int result = 0;
		try {
			ss = factory.openSession(); 
			ShopMapper mapper = ss.getMapper(ShopMapper.class);
			result = mapper.salesDelete(num);
			ss.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;
	}

	public ArrayList<SalesVO> productSales() {
		SqlSession ss = null;
		ArrayList<SalesVO> result = null;
		try {
			ss = factory.openSession(); 
			ShopMapper mapper = ss.getMapper(ShopMapper.class);
			result = mapper.productSales();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (ss != null) ss.close();
		}
		return result;	
	}

	

}
