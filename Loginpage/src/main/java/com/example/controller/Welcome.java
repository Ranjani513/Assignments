package com.example.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
public class Welcome {
@GetMapping("/welcome")
public String welcome()
{
	return "HEllO";
}
}
