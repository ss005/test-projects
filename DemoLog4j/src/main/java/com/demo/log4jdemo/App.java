package com.demo.log4jdemo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	//BasicConfigurator.configure();
        System.out.println( "Hello World!" );
       
        log.info("in xml file priority level is set as intf for rootlogger...and debug for barlogger"); 
        log.info ("The below message should be printed in root logger");
        log.info("This is a debug message from log4j App class");

        log.warn("Now calling logMethod of Bar... log statement in Bar should be logged to barlogger...");
        Bar bar = new Bar ();
        bar.logMethod();
        log.debug("Exiting from application...");
   /*
    * // get a logger instance named "com.foo"
   Logger  logger = Logger.getLogger("com.foo");

   // Now set its level. Normally you do not need to set the
   // level of a logger programmatically. This is usually done
   // in configuration files.
   logger.setLevel(Level.INFO);

   Logger barlogger = Logger.getLogger("com.foo.Bar");

   // This request is enabled, because WARN >= INFO.
   logger.warn("Low fuel level.");

   // This request is disabled, because DEBUG < INFO.
   logger.debug("Starting search for nearest gas station.");

   // The logger instance barlogger, named "com.foo.Bar",
   // will inherit its level from the logger named
   // "com.foo" Thus, the following request is enabled
   // because INFO >= INFO.
   barlogger.info("Located nearest gas station.");

   // This request is disabled, because DEBUG < INFO.
   barlogger.debug("Exiting gas station search");
   */
    }
}
