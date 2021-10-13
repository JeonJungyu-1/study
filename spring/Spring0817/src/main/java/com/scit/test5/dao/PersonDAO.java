package com.scit.test5.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test5.vo.PersonVO;

@Repository
public class PersonDAO {
	
	//DI Dependency Injection 의존성 주입 - 스프링이 만든 객체를 가져다 쓸 수 있게 함
	@Autowired
	private SqlSession session;
	
	public int join(PersonVO person) {
		int cnt = 0;
		
		try {
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			cnt = mapper.join(person);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
}
