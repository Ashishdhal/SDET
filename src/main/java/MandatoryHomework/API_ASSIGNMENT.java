package MandatoryHomework;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_ASSIGNMENT {
	
	public static void main(String[] args) {
		
	
	RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
	RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
	
	
	RequestSpecification contentType = RestAssured.given()
			.contentType("application/json");
			
			Response response = RestAssured.given()
			.contentType("application/json")
			.when()
			.body("{\r\n"
					+ "    \"short_description\": \"Created via postman\"\r\n"
					+ "}")
			.post("/incident");

	
	}
}
