package com.project.concessionaire.concessionaire;

import org.springframework.boot.SpringApplication;

public class TestConcessionaireBackApplication {

	public static void main(String[] args) {
		SpringApplication.from(ConcessionaireBackApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
