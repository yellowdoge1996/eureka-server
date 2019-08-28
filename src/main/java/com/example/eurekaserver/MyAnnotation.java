package com.example.eurekaserver;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target({})
@Retention(RetentionPolicy.SOURCE)
@Documented
@Inherited
public @interface MyAnnotation {
}
