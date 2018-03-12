package com.kodilla.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRunner /* implements CommandLineRunner */ {
	// @Autowired
	// private CalcRunner cr;
	public static void main(String[] args) {
		SpringApplication.run(SpringRunner.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		cr.calculate();
//	}
}
