package com.scit.resume.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.resume.vo.UserVO;

@Repository
public class UserDao {
	@Autowired
	private SqlSession session;
	
	public int join(UserVO user) {
		int cnt = 0;
		
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			cnt = mapper.join(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public UserVO login(String user_id) {
		UserVO result = null;
		
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			result = mapper.login(user_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
