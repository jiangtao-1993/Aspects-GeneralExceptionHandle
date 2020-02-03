package com.itcast.common;

import java.lang.annotation.*;

/**
 * @作者 itcast
 * @创建日期 2020/2/3 10:49
 **/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyLog {
    String value() default "";
    // 记录用户做了什么
}
