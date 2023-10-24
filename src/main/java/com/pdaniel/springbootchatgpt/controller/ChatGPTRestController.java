package com.pdaniel.springbootchatgpt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdaniel.springbootchatgpt.model.SearchRequest;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class ChatGPTRestController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger("SpringBootChatGPT");

	@PostMapping("searchChatGPT")
	public String searchChatGPT(@RequestBody SearchRequest searchRequest) {
		
		log.info("searchChatGPT Started query: " + searchRequest.getQuery());

		
		return "Hola";
	}
	
	@GetMapping("borracho")
	public String borracho() {
		return "Japirona borracho tembo";
	}

}
