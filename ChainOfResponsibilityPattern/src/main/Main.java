package main;

import main.logger.AbstractLogger;
import main.logger.ConsoleLogger;
import main.logger.ErrorLogger;
import main.logger.FileLogger;

public class Main {

	private static AbstractLogger getLoggerChain() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		consoleLogger.setNextLogger(fileLogger);
		errorLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger logger = getLoggerChain();
		logger.logMessage(AbstractLogger.INFO, "Hello User");
		logger.logMessage(AbstractLogger.ERROR, "Critical error logs");
		logger.logMessage(AbstractLogger.DEBUG, "debug point");
	}

}
