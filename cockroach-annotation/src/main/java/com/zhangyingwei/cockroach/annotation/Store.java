package com.zhangyingwei.cockroach.annotation;

import java.lang.annotation.*;

/**
 * Created by zhangyw on 2017/12/8.
 */
@Documented
@Target( {ElementType.TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Store {
    Class value();
}
