package com.devtiro.dependency.injection.services.impl;

import com.devtiro.dependency.injection.services.GreenPrinter;

public class SpanishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "verde";
    }
}
