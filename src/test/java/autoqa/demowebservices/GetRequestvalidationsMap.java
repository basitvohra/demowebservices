package autoqa.demowebservices;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestvalidationsMap {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://covid-193.p.rapidapi.com/";
		
		Map<String ,String> headObj = new HashMap<String ,String>();
		headObj.put("x-rapidapi-key", "ddbe1bc5f5msh2c6aebb9c181d4fp1feffdjsnec2db595f69d");
		headObj.put("x-rapidapi-host","covid-193.p.rapidapi.com");
		
		
		Response covidRes = RestAssured.given()
				.log().all()
				.headers(headObj)
		.get("statistics");
		
	
		
		covidRes.prettyPrint(); //Response headers & body
		
		int sttauscode = covidRes.getStatusCode();
		System.out.println("status code: " + sttauscode);
		
		
		System.out.println(covidRes.getStatusLine());
		
		
	}

}
