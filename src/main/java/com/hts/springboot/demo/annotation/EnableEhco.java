package com.hts.springboot.demo.annotation;

import com.hts.springboot.demo.common.EchoImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: jam
 * Date: 2018/12/26
 * Time: 上午11:25
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({EchoImportBeanDefinitionRegistrar.class})
public @interface EnableEhco {
    String[] packages() default "";
}
