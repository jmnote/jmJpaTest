package com.example.jpatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class MyController {
	
	@Autowired MovieRepository movieRepository;

	@RequestMapping("/")
	public String home() {
		return "안녕하세요. 자료보내드립니다.<hr>" + movieRepository.findAll().toString();
	}

}
