package autoqa.demowebservices;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestvalidationsMapMatchers {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://covid-193.p.rapidapi.com/";
		
		Map<String ,String> headObj = new HashMap<String ,String>();
		headObj.put("x-rapidapi-key", "ddbe1bc5f5msh2c6aebb9c181d4fp1feffdjsnec2db595f69d");
		headObj.put("x-rapidapi-host","covid-193.p.rapidapi.com");
		
		
		RestAssured.given()
				.log().all()
				.headers(headObj)
		.get("statistics").then()
		.body("results", Matchers.equalTo(200));
		
	
		
		
	}

}
