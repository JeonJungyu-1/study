package com.scit.resume.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.resume.vo.ResumeVO;
import com.scit.resume.vo.UserVO;

@Repository
public class ResumeDao {
	
	@Autowired
	private SqlSession session;
	
	public ArrayList<ResumeVO> list(ResumeVO resume) {
		ArrayList<ResumeVO> result = null;
		
		try {
			ResumeMapper mapper = session.getMapper(ResumeMapper.class);
			result = mapper.list(resume);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int write(ResumeVO resume) {
		int cnt = 0;
		
		try {
			ResumeMapper mapper = session.getMapper(ResumeMapper.class);
			cnt = mapper.write(resume);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public ResumeVO detail(int resume_no) {
		ResumeVO result = null;
		
		try {
			ResumeMapper mapper = session.getMapper(ResumeMapper.class);
			result = mapper.detail(resume_no);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int delete(ResumeVO resume) {
		int cnt = 0;
		
		try {
			ResumeMapper mapper = session.getMapper(ResumeMapper.class);
			cnt = mapper.delete(resume);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public int update(ResumeVO resume) {
		int cnt = 0;
		
		try {
			ResumeMapper mapper = session.getMapper(ResumeMapper.class);
			cnt = mapper.update(resume);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
}
