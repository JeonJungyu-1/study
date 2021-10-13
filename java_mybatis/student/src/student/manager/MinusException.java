package student.manager;

public class MinusException extends Exception {
	public MinusException() {
		super("점수에 음수를 입력했음");
	}
}
