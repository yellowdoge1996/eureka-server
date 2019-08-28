package com.example.eurekaserver;

import java.lang.reflect.Field;

public class TestCase {
    @Identity("student")
    @Identity("son")
    @Identity("worker")
    public static Person hxl = new Person();
    public static void main(String[] args) {
        Class<TestCase> clz = TestCase.class;
        Field[] declaredFields = clz.getDeclaredFields();
        for (Field field : declaredFields){
            if (field.isAnnotationPresent(Identities.class)){
                Identities identities = field.getAnnotation(Identities.class);
                Identity[] identityList = identities.value();
                for (Identity identity : identityList){
                    hxl.addIdentity(identity.value());
                }
            }
        }
        hxl.printIdentities();
    }
}
