package com.testautomation.logs;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	// static Logger logger = (Logger) LogManager.getLogger();
	private static final Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {

		try {
			String[] arr = new String[3];
			logger.debug("This is debug message");
			logger.info("This is info message");
			logger.warn("This is warn message");
			logger.fatal("This is fatal message");
			logger.error("This is error message");
			System.out.println(arr[5]);

			System.out.println("Logic executed successfully....");
			
		} catch (Exception e) {
			logger.error(e.toString());
		}

	}

}
