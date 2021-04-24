package autoqa.demowebservices;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestDemoW {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://covid-193.p.rapidapi.com/";
		
		Response covidRes = RestAssured.given()
				.log().all()
				.header("x-rapidapi-key", "ddbe1bc5f5msh2c6aebb9c181d4fp1feffdjsnec2db595f69d")
		.header("x-rapidapi-host","covid-193.p.rapidapi.com")
		.get("statistics");
		
	//	System.out.println(covidRes.asString());
		
	//	covidRes.prettyPrint(); //Response headers & body
		
		covidRes.peek();
	}			

}
