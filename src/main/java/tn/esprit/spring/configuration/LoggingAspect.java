package tn.esprit.spring.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
@Aspect
public class LoggingAspect {
	
	//private static final Logger l = LogManager.getLogger(LoggingAspect.class);
	@Before("execution(* tn.esprit.spring.service.*.*(..))")
	public void logMethodEntry(JoinPoint joinPoint) {
	String name = joinPoint.getSignature().getName();
	log.info("In method " + name + " : ");
	}
	@AfterReturning("execution(* tn.esprit.spring.service.*.*(..))")
	public void logMethodExit(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		log.info("out" + name + " : ");
	}

}
