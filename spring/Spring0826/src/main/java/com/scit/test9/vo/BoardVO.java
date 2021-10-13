package com.scit.test9.vo;

import lombok.Data;

@Data
public class BoardVO {
	private int board_no;
	private String board_title;
	private String board_context;
	private String board_indate;
	private String member_id;
	private int board_hits;
	private String board_original; 	//사용자가 올린(업로드할때) 파일의 이름
	private String board_saved;		//서버에서 변경된 파일의 이름
}
