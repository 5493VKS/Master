package com.covid19restpage.covid19restpage.controller;

import java.net.URI;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CovidController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/covid19")
	public String getData(){
		
		String url = "https://covid19.mathdro.id/api";
		String str = restTemplate.getForObject(url, String.class );
		return str;
	}
}
