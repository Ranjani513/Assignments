package FunctionalTesting;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;



public class PutrequestAutomation {
	@Test
	public void test() {
	JSONObject req=new JSONObject();
	req.put("name", "ranjani");
	req.put("job", "Engineer");
	req.put("id","121");
    System.out.println(req);
    given().
    body( req.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
}
	@Test
	public void test_patch() {
	JSONObject req=new JSONObject();
	req.put("name", "ranjani");
	//req.put("job", "Engineer");
    System.out.println(req);
   Response response= given().
 when() .body(req.toJSONString()).patch("https://reqres.in/api/users/2").then().statusCode(200).extract().response();
   System.out.println(response.asString());
}
	@Test
	public void test_delete() {
	
    given().when().delete("https://reqres.in/api/users/2").then().statusCode(204);
}

}