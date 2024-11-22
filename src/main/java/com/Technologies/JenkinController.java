package com.Technologies;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class JenkinController {
	@GetMapping("/value")
	public String get() {
		return "jenkinsvalue";
	}
	

}
