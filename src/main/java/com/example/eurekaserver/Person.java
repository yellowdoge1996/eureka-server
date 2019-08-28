package com.example.eurekaserver;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<String> identities = new ArrayList<>();

    public void addIdentity(String identity){
        this.identities.add(identity);
    }

    public void printIdentities() {
        System.out.println(identities.toString());
    }
}
