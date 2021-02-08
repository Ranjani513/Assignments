/*1) Create a Spring MVC web application and use HTML, JSP,  CSS, and Image files from resources and also implements different types of URL Patterns.
2) For the above application create a UI layer to register a user and add form validations and also use different types of view Resolvers to get views.
*/
package com.spring;
import javax.validation.constraints.Size;

public class Employee {

	String name;
	@Size(min=4, message="Required")
	String password;
	public void setname(String name)
	{
		this.name=name;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	public String getname()
	{
		return name;
	}
	public String getpassword()
	{
		return password;
	}
	
}
