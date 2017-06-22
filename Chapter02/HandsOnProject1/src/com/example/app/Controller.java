package com.example.app;

import com.example.app.model.ModelFoo;
import com.example.app.view.ViewBar;

public class Controller {
    public static void main(String[] args) {
        ViewBar view = new ViewBar();
        view.showJVMInfo(new ModelFoo());
    }
}