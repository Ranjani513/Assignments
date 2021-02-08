/*1) Create a Spring MVC web application and use HTML, JSP,  CSS, and Image files from resources and also implements different types of URL Patterns.
2) For the above application create a UI layer to register a user and add form validations and also use different types of view Resolvers to get views.*/
package com.spring;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/hello")
	public String display(Model m)
	{
		m.addAttribute("user", new Employee());
		return "viewpage";
	}
	@RequestMapping("/user")
	public String submitForm( @Valid @ModelAttribute("user") Employee e, BindingResult br)
	{
		if(br.hasErrors())
		{
			return "errorpage";
		}
		else
		{
		return "welcome";
		}
	}
}
