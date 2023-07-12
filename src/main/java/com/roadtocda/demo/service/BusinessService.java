package com.roadtocda.demo.service;
import org.springframework.stereotype.Component;
import com.roadtocda.demo.model.HelloWorld;

@Component
public class BusinessService {

	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();	
		return hw;
	}
}
