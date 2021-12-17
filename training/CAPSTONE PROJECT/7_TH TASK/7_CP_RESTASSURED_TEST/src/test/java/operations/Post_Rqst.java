package operations;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post_Rqst {

	@Test
	public void test2() {

		JSONObject request = new JSONObject();
		request.put("id", "5");
		request.put("name", "Guava");

		//System.out.println(request);
		System.out.println(request.toString());
	    given().contentType(ContentType.JSON).
		body(request).
		when().
		post("http://localhost:8080/products").
		then().statusCode(201 );

	}

}