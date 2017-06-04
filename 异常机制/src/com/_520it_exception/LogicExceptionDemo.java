package com._520it_exception;
//自定义一个运行时期的异常类，并继承于java.lang.RuntimeException
//业务逻辑异常
public class LogicExceptionDemo extends RuntimeException {
	private static final long serialVersionUID = 5426152759533244574L;

	public LogicExceptionDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LogicExceptionDemo(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LogicExceptionDemo(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
