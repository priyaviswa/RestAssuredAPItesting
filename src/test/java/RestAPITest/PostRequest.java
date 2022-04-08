package RestAPITest;


import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {
	
	@Test
	public void postRequestExample() {
		
		Response res = get("https://reqres.in/api/users?page=2");
		System.out.println(res.asString());
		
	}
	
		
	}
