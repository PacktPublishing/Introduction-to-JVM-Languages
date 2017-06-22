package com.example.app.view;

import com.example.app.model.ModelFoo;

public class ViewBar {
    public void showJVMInfo(ModelFoo model) {
        System.out.println("This program is running on " + model.getJVMInfo());
    }
}