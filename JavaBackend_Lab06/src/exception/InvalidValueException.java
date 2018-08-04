package exception;

public class InvalidValueException extends Exception {

	@Override
	public String getMessage() {
		return "Gia tri phai lon hon khong" +super.getMessage();
	}
	
}
