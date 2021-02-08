package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller

public class HelloController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
   public String printHello(Model model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }
}