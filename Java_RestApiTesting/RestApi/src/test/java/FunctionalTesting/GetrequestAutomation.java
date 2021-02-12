package FunctionalTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class GetrequestAutomation {
@Test
public void test()
{
	given().get("http://dummy.restapiexample.com/api/v1/employees").
	then()
	.statusCode(200)
	.body("data.id[0]", equalTo("1")).body("data.employee_name",hasItems("Tiger Nixon","Garrett Winters"))
	.log().all();
	
}
}
/*@Test
public void test1()
{
	given().get("http://dummy.restapiexample.com/api/v1/employees").
	then()
	.statusCode(200)
	.body("data.employee_name",hasItems("Tiger Nixon","Garrett Winters"))
	.log().all();
	
}
}
/*@Test
public void test1()
{
	Response response=when().get("http://dummy.restapiexample.com/api/v1/employee/1");
	Assert.assertEquals(200, response.statusCode());
}
}*/
