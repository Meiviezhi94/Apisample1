//package org.assure;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//
//public class BaseClassRest {
//	RequestSpecification reqSpec;
//	Response response;
//	public void addHeader(String Key, String value) {
//	RestAssured.given().header(Key,value);
//	}
//	
//	public void queryParam(String key, String value) {
//		reqSpec = reqSpec.queryParam(key,value);
//	}
//	
//	public void pathParam(String key, String value) {
//		reqSpec = reqSpec.pathParam(key,value);
//	}
//	private void addBody(String reqBody) {
//		reqSpec = reqSpec.body(reqBody);
//	}
//	private void requestType(String reqType, String endpoint) {
//		
//		switch(reqType){
//		case "GET":
//			response = reqSpec.get(endpoint);
//			break;
//		switch
//		}
//	}
//
//}
package org.assure;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	RequestSpecification reqSpec;
	Response response;

	public void addHeader(String key, String value) {
		reqSpec = RestAssured.given().header(key, value);
	}

	public void queryParam(String key, String value) {
		reqSpec.queryParam(key, value);
	}

	public void pathParam(String key, String value) {
		reqSpec.queryParam(key, value);
	}

	public void addBody(String reqBody) {
		reqSpec = reqSpec.body(reqBody);
	}

	public Response requestType(String reqType, String endPoint) {
		switch (reqType) 
		{
		case "GET":
			response = reqSpec.get(endPoint);
			break;

		case "POST":
			response = reqSpec.post(endPoint);
			break;

		case "PUT":
			response = reqSpec.put(endPoint);
			break;

		case "DELETE":
			response = reqSpec.delete(endPoint);
			break;

		default:
			break;
		}
		return response;
	}

	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;
	}
	
	public ResponseBody getResponseBody(Response response) {
		ResponseBody body = response.getBody();
		return body;
	}

	public String getasString(Response response) {
		String asString = getResponseBody(response).asString();
		return asString;
	}
	
	public String getasPrettyString(Response response) {
		String asString = getResponseBody(response).asString();
		return asString;
	}
	
}