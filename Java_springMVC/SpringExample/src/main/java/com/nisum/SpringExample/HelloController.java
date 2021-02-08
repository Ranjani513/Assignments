package com.nisum.SpringExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 * Hello world!
 *
 */
@Controller
public class HelloController 
{
    @RequestMapping("/hello")
    public String print(Model model)
    {
    	model.addAttribute("message","Hello Nisum");
		return "hello;
    	
    }
}
