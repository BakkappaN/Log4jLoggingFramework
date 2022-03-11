#log4j #Log4jLoggingFramework 
Log4j Logging Framework, Selenium Automation Testing Framework

# Follow below steps to generate logs on console and create log file

## Step1: Create Java or Maven Project

## Step2: Add below dependency

		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-api</artifactId>
			<version>2.17.2</version>
			</dependency>

		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-core</artifactId>
			<version>2.17.2</version>
		</dependency>

## Step3: Build the Maven Project

## Step4: Add below content in log4j2.properties file under resources folder

```
#Declare loggers 
- name=LoggingConfig
- appenders=a_console, a_rolling
- rootLogger.level=info
- rootLogger.appenderRefs=ar_console,ar_rolling
- rootLogger.appenderRef.ar_console.ref=StdoutAppender
- rootLogger.appenderRef.ar_rolling.ref=DailyRollingAppender

#Console logger
appender.a_console.type=Console
appender.a_console.name=StdoutAppender
appender.a_console.layout.type=PatternLayout
appender.a_console.layout.pattern=%d{ISO8601} [%t] %-5p (%F\:%L) - %m%n

#File logger
appender.a_rolling.type=RollingFile
appender.a_rolling.name=DailyRollingAppender
appender.a_rolling.layout.pattern=%d{ISO8601} [%t] %-5p (%F\:%L) - %m%n
appender.a_rolling.fileName=./logs/app.txt
appender.a_rolling.filePattern=log4j2-sample-%d{yyyy-MM-dd}.log
appender.a_rolling.layout.type=PatternLayout
appender.a_rolling.policies.type=Policies
appender.a_rolling.policies.time.type=TimeBasedTriggeringPolicy
appender.a_rolling.policies.time.interval=1
```

## Step5: Start using Logger!!!!

	private static final Logger logger = LogManager.getLogger(Log4jDemo.class);
  
  	logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");
		logger.error("This is error message");

# End...
# ENJOY...!!!


