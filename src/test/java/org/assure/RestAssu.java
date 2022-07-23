package org.assure;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssu {
	static 	RequestSpecification reqSpec;
public static void main(String[] args) {
reqSpec=RestAssured.given();
reqSpec=reqSpec.header("content-type","application/JSON");

//GET

//reqSpec= reqSpec.pathParam("page", "2");
//Response respone = reqSpec.get("https://reqres.in/api/users/{page}");
//int statusCode = respone.getStatusCode();
//ResponseBody body = respone.getBody();
//String asString = body.asString();
//System.out.println(asString);
//String asPrettyString = body.asPrettyString();
//System.out.println(asPrettyString);
	
// POST

//reqSpec = reqSpec.body("{\r\n" + 
//		"    \"name\": \"morpheus\",\r\n" + 
//		"    \"job\": \"leader\"\r\n" + 
//		"}");
//Response response = reqSpec.post("https://reqres.in/api/users");
//int statusCode = response.getStatusCode();
//System.out.println(statusCode);
//ResponseBody body = response.getBody();
//String asString = body.asString();
//System.out.println(asString);

//PUT

//reqSpec = reqSpec.body("{\r\n" + 
//		"    \"name\": \"morpheus\",\r\n" + 
//		"    \"job\": \"zion resident\"\r\n" + 
//		"}");
//
//Response response = reqSpec.post("https://reqres.in/api/users/2");
//int statusCode = response.getStatusCode();
//System.out.println(statusCode);
//ResponseBody body = response.getBody();
//String asString = body.asString();
////System.out.println(asString);
//String asPrettyString = body.asPrettyString();
//System.out.println(asPrettyString);

//DELETE

Response response2 = reqSpec.delete("https://reqres.in/api/users/2");
int statusCode = response2.getStatusCode();
System.out.println(statusCode);























}









}
