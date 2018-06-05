package com.demo.log4jdemo;

import org.apache.log4j.Logger;

public class Bar {
	public static Logger logger = Logger.getLogger(Bar.class);
	public void logMethod ()
	{
		logger.info("From logMethod of Bar...");

	}
}

