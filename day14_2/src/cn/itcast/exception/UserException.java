package cn.itcast.exception;

public class UserException extends Exception {
	public UserException() {}
	public UserException(String message, Throwable cause) {
		super(message, cause);
	}
	public UserException(String message) {
		super(message);
	}
	public UserException(Throwable cause) {
		super(cause);
	}
}
