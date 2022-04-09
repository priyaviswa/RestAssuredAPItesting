package RestAPITest;


import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserStatic {
	
	@Test
	public void getRequestExample() {
		
		Response res = get("https://reqres.in/api/users?page=2");
		System.out.println(res.asString());
		
	}
	
	@Test
	public void getWithGiven() {
		
		baseURI = "https://reqres.in/api";
		given().
		    get("/users?page=2").
		then().
		    body("data[0].id",equalTo(7)).
		    body("data.first_name",hasItems("Lindsayy","Tobias")).
		    
		    log().all();
		
	}
	
	

}
