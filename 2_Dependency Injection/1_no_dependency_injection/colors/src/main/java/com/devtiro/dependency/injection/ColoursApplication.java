package com.devtiro.dependency.injection;

import com.devtiro.dependency.injection.services.ColourPrinter;
import com.devtiro.dependency.injection.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColoursApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(com.devtiro.dependency.injection.ColoursApplication.class, args);
	}
    @Override
    public void run(final String... args) {
        final ColourPrinter colourPrinter = new ColourPrinterImpl();
        log.info(colourPrinter.print());
    }

}
