package com.devtiro.dependency.injection.config;

import com.devtiro.dependency.injection.services.BluePrinter;
import com.devtiro.dependency.injection.services.ColourPrinter;
import com.devtiro.dependency.injection.services.GreenPrinter;
import com.devtiro.dependency.injection.services.RedPrinter;
import com.devtiro.dependency.injection.services.impl.ColourPrinterImpl;
import com.devtiro.dependency.injection.services.impl.SpanishBluePrinter;
import com.devtiro.dependency.injection.services.impl.SpanishGreenPrinter;
import com.devtiro.dependency.injection.services.impl.SpanishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }
    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(
            BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
