//사용자 정의 예외 클래스

public class MinusException extends Exception {
	public MinusException() {
		super("점수에 음수를 입력했음");
	}
}
