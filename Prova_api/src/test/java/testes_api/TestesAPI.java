package testes_api;

import static com.jayway.restassured.RestAssured.*;


import org.hamcrest.Matchers;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class TestesAPI {
	
	public TestesAPI(){
		baseURI = "https://jsonplaceholder.typicode.com/todos/1";
	}


	
	@Test
	public void deveVerificaPrimeiroNivel(){
		
	given()
	.when()
	.get("https://jsonplaceholder.typicode.com/todos/1")
	.then()
	.statusCode(200)
	.body("id", Matchers.is(1))
	;

}
	
}


