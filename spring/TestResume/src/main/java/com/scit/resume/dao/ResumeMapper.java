package com.scit.resume.dao;

import java.util.ArrayList;

import com.scit.resume.vo.ResumeVO;
import com.scit.resume.vo.UserVO;

public interface ResumeMapper {
	public ArrayList<ResumeVO> list(ResumeVO resume);
	public int write(ResumeVO resume);
	public ResumeVO detail(int resume_no);
	public int delete(ResumeVO resume);
	public int update(ResumeVO resume);
}
