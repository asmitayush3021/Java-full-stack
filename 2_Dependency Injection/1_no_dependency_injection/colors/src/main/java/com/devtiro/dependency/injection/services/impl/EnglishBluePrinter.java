package com.devtiro.dependency.injection.services.impl;

import com.devtiro.dependency.injection.services.BluePrinter;

public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print(){
        return "blue";
    }
}
