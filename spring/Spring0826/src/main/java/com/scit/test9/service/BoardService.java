package com.scit.test9.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.scit.test9.dao.BoardDao;
import com.scit.test9.util.FileService;
import com.scit.test9.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private BoardDao dao;
	
	@Autowired
	private HttpServletResponse response;
	
	private static final String UPLOAD_PATH = "/uploadFiles";
	
	//글 쓰기 기능
	public String write(BoardVO board, MultipartFile upload) {
		
		//첨부파일(upload)이 있을경우에는 파일저장을 한다.
		if(!upload.isEmpty()) {
			String original = upload.getOriginalFilename();
			String saved = FileService.saveFile(upload, UPLOAD_PATH);
			
			board.setBoard_original(original);
			board.setBoard_saved(saved);
		}
		
		
		
		//전달받은 데이터(제목, 내용)에다가 글쓴이의 ID값을 추가한다.
		//글쓴이의 ID값 == 로그인한 사용자의 ID값
		//로그인한 사용자의 ID값은 어디에 있나요? 세션스코프
		String loginId = (String)session.getAttribute("loginId");
		board.setMember_id(loginId);
		
		int cnt = dao.write(board);
		String path = "";
		
		//글쓰기 성공시 글 목록
		if (cnt > 0) {
			path = "redirect:/board/listForm";
		}
		//글쓰기 실패시 글 작성 폼
		else {
			path = "redirect:/board/writeForm";
		}
		
		return path;
	}
	
	public ArrayList<BoardVO> list(String searchText, int startRecord, int countPerPage) {
		return dao.list(searchText, startRecord, countPerPage);
	}
	
	public BoardVO detail(BoardVO board) {
		
		String loginId = (String)session.getAttribute("loginId");
		board.setMember_id(loginId);
		return dao.detail(board);
	}
	
	public String delete(BoardVO board) {
		
		String path = "";
		String loginId = (String)session.getAttribute("loginId");
		board.setMember_id(loginId);
		
		//삭제 전에 조회를 해서 저장 파일명을 알 수 있도록 한다.
		BoardVO vo = dao.selectOne(board.getBoard_no());
		
		int cnt = dao.delete(board);
		
		if (cnt > 0) {
			//첨부파일이 있을때만 파일삭제한다.
			if (vo.getBoard_saved() != null) {
				String fullFath = UPLOAD_PATH + "/" + vo.getBoard_saved();
				FileService.deleteFile(fullFath);
			}
			//삭제 성공시에는 목록으로
			path = "redirect:/board/listForm";
		}
		else {
			//삭제 실패시에는 상세페이지로
			path = "redirect:/board/detail?board_no="+board.getBoard_no();
		}
		return path;
	}
	
	public BoardVO selectOne(int board_no) {
		return dao.selectOne(board_no);
	}
	
	public String update(BoardVO board, MultipartFile upload) {
		
		//첨부파일(upload)이 있을경우에는 파일 저장을 한다.
		if (upload != null) {
			if (!upload.isEmpty()) {
				String original = upload.getOriginalFilename();
				String saved = FileService.saveFile(upload, UPLOAD_PATH);
				
				board.setBoard_original(original);
				board.setBoard_saved(saved);
			}
		}
		
		String path = "";
		String loginId = (String)session.getAttribute("loginId");
		board.setMember_id(loginId);
		
		int cnt = dao.update(board);
		if (cnt > 0) {
			//수정 성공
			path = "redirect:/board/listForm";
		}
		else {
			//수정 실패
			path = "redirect:/board/updateForm?board_no="+board.getBoard_no();
		}
		return path;
	}
	
	public int totalRecord(String searchText) {
		return dao.totalRecord(searchText);
	}
	
	public void download(int board_no) {
		BoardVO board = dao.selectOne(board_no);
		
		//원본 파일명
		String originalFile = board.getBoard_original();
		
		try {
			//응답할때 파일을 같이 전송할 것이고, 그 파일은 지정된 파일명으로 다운로드를 해라 설정
			response.setHeader("Content-Disposition", " attachment;filename="+ URLEncoder.encode(originalFile, "UTF-8").replaceAll("\\+", "%20"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String fullPath = UPLOAD_PATH + "/" + board.getBoard_saved();
		
		//서버의 파일을 읽을 입력 스트림과 클라이언트에게 전달할 출력스트림
		FileInputStream filein = null;
		ServletOutputStream fileout = null;
		
		try {
			filein = new FileInputStream(fullPath);
			fileout = response.getOutputStream();
			
			//Spring의 파일 관련 유틸
			FileCopyUtils.copy(filein, fileout);
			
			filein.close();
			fileout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
