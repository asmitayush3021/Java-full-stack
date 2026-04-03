package com.devtiro.dependency.injection.services.impl;

import com.devtiro.dependency.injection.services.BluePrinter;
import com.devtiro.dependency.injection.services.ColourPrinter;
import com.devtiro.dependency.injection.services.GreenPrinter;
import com.devtiro.dependency.injection.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
        this.bluePrinter = new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
