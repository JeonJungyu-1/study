package student.manager;

public class OverException extends Exception {
	public OverException() {
		super("점수가 100을 초과했음");
	}
}
