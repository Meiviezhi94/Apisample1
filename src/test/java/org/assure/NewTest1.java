package org.assure;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class NewTest1 extends BaseClass {
  @Test
  public void f() {
	  addHeader("content-type", "application/json");
		Response response2 = requestType("DELETE","https://reqres.in/api/users/2");
		int statusCode = getStatusCode(response2);
		System.out.println(statusCode);
		String resgetasPrettyString = getasPrettyString(response2);
		System.out.println(resgetasPrettyString);

  }
}
