package com.roadtocda.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roadtocda.demo.model.HelloWorld;
import com.roadtocda.demo.service.BusinessService;

@SpringBootApplication

public class MonPremierProjetSpringBootApplication implements CommandLineRunner {

	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(MonPremierProjetSpringBootApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);

	}

}
