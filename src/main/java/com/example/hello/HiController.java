package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HiController {

	@GetMapping("/hi")
	private Mono<String> hi(@RequestParam(name="name", required=false) String name) {
		
		String greeting = "Hi, ";
		if (name != null) {
			greeting += name;
		}
		else {
			greeting += "Spring WebFlux REST Controller";
		}
		
		Mono<String> greetingMono = Mono.just(greeting);
		
	    return greetingMono;
	}
}
