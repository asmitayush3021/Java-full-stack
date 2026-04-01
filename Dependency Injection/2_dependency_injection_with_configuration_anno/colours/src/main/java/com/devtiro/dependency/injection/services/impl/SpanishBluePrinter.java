package com.devtiro.dependency.injection.services.impl;

import com.devtiro.dependency.injection.services.BluePrinter;

public class SpanishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "azul";
    }
}
