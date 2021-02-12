package FunctionalTesting;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class PostrequestAutomation {
@Test
public void test()
{
	Map<String,Object> map1=new HashMap<String,Object>();
	map1.put("name", "ranjani");
	map1.put("job", "Engineer");
	//map1.put("id", "121");
	System.out.println(map1);
	JSONObject req=new JSONObject(map1);
    System.out.println(req);
    given().
    body( req.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);
}

}
