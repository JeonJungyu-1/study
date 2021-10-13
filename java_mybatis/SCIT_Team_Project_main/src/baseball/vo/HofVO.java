package baseball.vo;

public class HofVO {
	private int hallOfFameId;
	private String userid;
	private String characterName;
	private int allStat;
	public HofVO() {
		super();
	}
	public HofVO(int hallOfFameId, String userid, String characterName, int allStat) {
		super();
		this.hallOfFameId = hallOfFameId;
		this.userid = userid;
		this.characterName = characterName;
		this.allStat = allStat;
	}
	public int getHallOfFameId() {
		return hallOfFameId;
	}
	public void setHallOfFameId(int hallOfFameId) {
		this.hallOfFameId = hallOfFameId;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public int getAllStat() {
		return allStat;
	}
	public void setAllStat(int allStat) {
		this.allStat = allStat;
	}
	@Override
	public String toString() {
		return "HofVO [hallOfFameId=" + hallOfFameId + ", userid=" + userid + ", characterName=" + characterName
				+ ", allStat=" + allStat + "]";
	}
	
	
	
	
}
