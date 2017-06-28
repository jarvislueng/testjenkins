package com.jarvis.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by jarvis on 2017/6/20.
 */

/**
 * 切面首先是IOC容器中的一个bean,即在切面类前加上标签@Component标签
 * 切面还需要添加标签@Aspect标签，声明该类是一个切面
 *  实现需要的通知，在方法之前添加如下的通知类型：
 *  @Before：前置通知，在方法前通知；
 @After :后置通知，在方法执行后通知；
 @AfterRunning：返回通知，在方法返回结果之后通知；
 @AfterThrowing：异常通知，在方法抛出异常之后通知；
 @Around：环绕通知，围绕着方法执行；
 * **/
@Aspect//该标签把类声明为一个切面
@Order(1)//设置切面的优先级，如果有多个切面的话可以设置优先控制的顺序（数值越小越高）
@Component
public class TestAOP {
    private static final Logger logger = LoggerFactory.getLogger(TestAOP.class);
    @Pointcut("execution (public * com.jarvis.web.*Controller.*(..))")
    public void declearJointPointExpression(){}
    @Before("declearJointPointExpression()")
    public void beforeMethod(){
        logger.info("之前");
    }
    @After("declearJointPointExpression()")
    public void afterMethod(){
        logger.info("之后");
    }
}
