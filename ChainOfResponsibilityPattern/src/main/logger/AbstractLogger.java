package main.logger;

public abstract class AbstractLogger {
	public static int INFO = 1, DEBUG = 2, ERROR = 3;
	
	
	protected int level;
	
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger logger) {
		this.nextLogger = logger;
	}
	
	public void logMessage(int l, String msg) {
		if(level<=l) {
			write(msg);
		}
		if(nextLogger!=null) {
			nextLogger.logMessage(l, msg);
		}
	}
	
	protected abstract void write(String msg);
}
