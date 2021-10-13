package board.vo;

public class ReplyVO {
	private int renum;
	private int bnum;
	private String id;
	private String text;
	public ReplyVO() {
		super();
	}
	public ReplyVO(int renum, int bnum, String id, String text) {
		super();
		this.renum = renum;
		this.bnum = bnum;
		this.id = id;
		this.text = text;
	}
	public int getRenum() {
		return renum;
	}
	public void setRenum(int renum) {
		this.renum = renum;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "ReplyVO [renum=" + renum + ", bnum=" + bnum + ", id=" + id + ", text=" + text + "]";
	}
	
	
}
