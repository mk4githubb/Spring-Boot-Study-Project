package com.monhikk.springbootinfoproject.aop

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

// LINKS
// https://jstobigdata.com/spring/pointcut-expressions-in-spring-aop/
// https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop-ataspectj

@Aspect
@Component
class LoggingAspect {
    var logger = LoggerFactory.getLogger(LoggingAspect::class.java)

    // @Around - executes before and after a method
    // within - within the package/sub packages
    // @within - the type (i.e. class) of the object containing the method must have the annotation.
    // @annotation - the method must have the annotation
    @Around("within(com.monhikk.springbootinfoproject..*)")
    fun logExecution2(joinPoint: ProceedingJoinPoint) {
        logger.info("###### Before executing   ========> ${joinPoint.signature.name}")
        joinPoint.proceed()
        logger.info("###### After executing   ========> ${joinPoint.signature.name}")
    }
}
