package ru.k0r0tk0ff.SpringH2RestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.k0r0tk0ff.SpringH2RestApp")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
