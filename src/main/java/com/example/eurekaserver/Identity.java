package com.example.eurekaserver;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Identities.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Identity {
    String value() default "";
}
