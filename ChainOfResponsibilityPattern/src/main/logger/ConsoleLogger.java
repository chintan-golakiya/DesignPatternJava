package main.logger;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String msg) {
		System.out.println("Console Logger : "+msg);
	}

}
