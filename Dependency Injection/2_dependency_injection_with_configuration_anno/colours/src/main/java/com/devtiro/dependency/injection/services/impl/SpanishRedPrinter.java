package com.devtiro.dependency.injection.services.impl;

import com.devtiro.dependency.injection.services.RedPrinter;

public class SpanishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "rojo";
    }
}
