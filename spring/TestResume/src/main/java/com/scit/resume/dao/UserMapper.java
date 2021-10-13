package com.scit.resume.dao;

import com.scit.resume.vo.UserVO;

public interface UserMapper {
	public int join(UserVO user);
	public UserVO login(String user_id);
}
