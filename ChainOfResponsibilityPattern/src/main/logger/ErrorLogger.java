package main.logger;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String msg) {
		System.out.println("Error Logger : "+msg);
	}

}
