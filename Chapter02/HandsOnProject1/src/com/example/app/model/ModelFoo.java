package com.example.app.model;

public class ModelFoo {
    public String getJVMInfo() {
    return "JVM version " + System.getProperty("java.version") +
        " by " + System.getProperty("java.vendor");
    }
}