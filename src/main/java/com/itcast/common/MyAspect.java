package com.itcast.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @作者 itcast
 * @创建日期 2020/2/3 10:46
 **/
@Aspect
@Component
public class MyAspect {

    // 定义切入点表达式

    @Pointcut("@annotation(com.itcast.common.MyLog)")
    public void Pointcut(){

    }
//    // 前置通知
//    @Before("Pointcut()")
//    public void before(){
//        System.out.println("before");
//    }
//    // 后置通知
//    @After("Pointcut()")
//    public void after(){
//        System.out.println("after");
//    }
//    // 最终通知
//    // 后置通知
//    @AfterReturning("Pointcut()")
//    public void AfterReturning(){
//        System.out.println("AfterReturning");
//    }
//    // 异常通知
//    @AfterThrowing("Pointcut()")
//    public void AfterThrowing(){
//        System.out.println("AfterThrowing");
//    }
    // 环绕通知

    @Around("Pointcut()")
    public Object arount(ProceedingJoinPoint point){
        Object result = null;
        // 把方法的调用权交给了用户
        try {
            // 写的代码相当于  之前的before
            long startTime = System.currentTimeMillis(); //开始时间

            result = point.proceed(); // 目标方法被执行

            String user = "张三";
            MethodSignature signature = (MethodSignature)point.getSignature();
            Method method = signature.getMethod();
            MyLog log = method.getAnnotation(MyLog.class);
            String msg = log.value();
            Date now = new Date();
            long endTime = System.currentTimeMillis();
            long times = (endTime - startTime);
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            //在外部获取web请求就要用RequestContextHolder,它以线程绑定对象的形式(RequestAttributes)暴露web的request请求
            String remoteAddr = request.getRemoteAddr();
            System.out.println("登录用户==>"+user);
            System.out.println("用户行为==>"+msg);
            System.out.println("执行时间==>"+now);
            System.out.println("持续时间==>"+times);
            System.out.println("登录IP==>"+remoteAddr);
            // 写的代码相当于  之前的after
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            // 写的代码相当于  之前的afterThrowing
        } finally {
            // 写的代码相当于  之前的afterReturning
        }
        return result;
    }





}
