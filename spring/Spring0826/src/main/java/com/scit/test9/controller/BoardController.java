package com.scit.test9.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.scit.test9.service.BoardService;
import com.scit.test9.util.PageNavigator;
import com.scit.test9.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	private final int countPerPage = 3;
	private final int pagePerGroup = 3;
	
	@RequestMapping(value="/board/listForm" , method = RequestMethod.GET)
	public String listForm(Model model
			, @RequestParam(name = "searchText", defaultValue = "") String searchText
			, @RequestParam(name = "currentPage", defaultValue = "1") int currentPage) {
		
		int totalRecordsCount = service.totalRecord(searchText);
		
		PageNavigator navi = new PageNavigator(countPerPage, pagePerGroup, currentPage, totalRecordsCount);
		
		//메인 화면에서 게시글 목록을 눌렀을때는(검색어가 없을때) 전체글을 조회하고
		//게시글 목록 화면에서 검색을 했을때는(검색어가 있을때) 검색글만 조회한다.
		
		//DB에 접근해서 게시글 목록을 조회하고
		ArrayList<BoardVO> result = service.list(searchText, navi.getStartRecord(), navi.getCountPerPage());
		//조회된 데이터를 JSP로 전달한다.
		model.addAttribute("result", result);
		model.addAttribute("searchText", searchText);
		model.addAttribute("navi", navi);
		
		return "board/listForm";
	}
	
	@RequestMapping(value="/board/writeForm" , method = RequestMethod.GET)
	public String writeForm() {
		return "board/writeForm";
	}
	
	@RequestMapping(value="/board/write" , method = RequestMethod.POST)
	public String write(BoardVO board, MultipartFile upload) {
		//글쓰기 기능 실행
		String path = service.write(board, upload);
		return path;
	}
	
	@RequestMapping(value="/board/detail" , method = RequestMethod.GET)
	public String detail(BoardVO vo, Model model) {
		//전달받은 글번호(PK)로 DB에 접근해서 해당 글을 조회한다.
		BoardVO board = service.detail(vo);
		//조회한 글 정보를 JSP에 전달한다.
		model.addAttribute("board", board);
		
		return "board/detail";
	}
	
	@RequestMapping(value="/board/delete" , method = RequestMethod.GET)
	public String delete(BoardVO board) {
		return service.delete(board);
	}
	
	@RequestMapping(value="/board/updateForm" , method = RequestMethod.GET)
	public String updateForm(int board_no, Model model) {
		//전달받은 PK로 원본 글 내용을 조회한 뒤에
		BoardVO board = service.selectOne(board_no);
		//조회한 데이터를 가지고 JSP로 이동한다.
		model.addAttribute("board", board);
		
		return "board/updateForm";
	}
	
	@RequestMapping(value="/board/update" , method = RequestMethod.POST)
	public String update(BoardVO board, MultipartFile upload) {
		return service.update(board, upload);
	}
	
	@RequestMapping(value="/board/download" , method = RequestMethod.GET)
	public String download(int board_no) {
		service.download(board_no);
		return null;
	}

	
}
