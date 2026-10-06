package api.users.userList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

class UserListTest {

	@Test
	@DisplayName("Check status code")
	void checkStatusCode() {
		Response response=RestAssured.get("https://dummyjson.com/users");
		
		System.out.println("getStatusCode: "+response.getStatusCode());
		System.out.println("getTime: "+response.getTime());
		System.out.println("These two are the same: ");
		System.out.println("getBody().asString(): \n"+response.getBody().asString());
		System.out.println("asString(): \n"+response.asString());
		
		System.out.println("\ngetStatusLine: "+response.getStatusLine());
		
		System.out.println("getHeader: "+response.getHeader("content-type"));
		
		int statusCode=response.getStatusCode();
		
		assertEquals(200, statusCode);
		}

}
