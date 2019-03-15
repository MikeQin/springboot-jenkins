package com.example.hello;

import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class HelloHandler {
	
	public Mono<ServerResponse> hello(ServerRequest request) {
		String greeting = "Hello, ";
		Optional<String> name = request.queryParam("name");
		if (name.isPresent()) {
			greeting += name.get();
		}
		else {
			greeting += "Spring WebFlux Handler! - Functional Reactive Web Service";
		}
		
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
			.body(BodyInserters.fromObject(greeting));
	}

}
