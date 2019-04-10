package testes_api;

import static com.jayway.restassured.RestAssured.*;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class TestesAPI {
	
	public TestesAPI(){
		baseURI = "https://jsonplaceholder.typicode.com/todos/1";
	}


	
	@Test
	 public void consultarUrl()
	 {
	     RestAssured.baseURI  = "https://jsonplaceholder.typicode.com/todos/1";
	 
	     Response res = given()
	    	     .contentType("application/json").
	    	     body("{\"title\":\"delectus aut autem\"}").
	    	        when().
	    	        post("");
	    	 
	    	     String body = res.getBody().asString();
	    	     System.out.println(body);
	
	
	

	 }
	
}


