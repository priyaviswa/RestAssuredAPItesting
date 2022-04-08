package RestAPITest;




import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUser {
	
	@Test
	public void getRequestExample() {
		
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.asString());
		
	}
	
	

}
