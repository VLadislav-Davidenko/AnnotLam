package com.company;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // on class
@Retention(RetentionPolicy.RUNTIME)
public @interface About {

    String info() default "Default info";

}
