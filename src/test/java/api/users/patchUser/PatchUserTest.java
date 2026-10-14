package api.users.patchUser;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.*;

import io.restassured.http.ContentType;

class PatchUserTest {

	 @Test
	    @DisplayName("Patch an user with JSONObject")
	    void patchUserTest() {
	    	
	    	JSONObject request=new JSONObject();	    	
	    	
	    	request.put("firstName", "Jane");
	    	request.put("lastName", "Doe");
	    	request.put("maidenName", "");
	          
	        baseURI = "https://dummyjson.com";

	        given()
	        	.header("Content-Type","application/json")
	        	.contentType(ContentType.JSON)
	        	.accept(ContentType.JSON)
	        	.body(request.toJSONString())
	        .when()
	        .patch("/users/2")
	        .then()
	        	.statusCode(200)
	        	//.log().all()
	        	.log().ifValidationFails();
	    }

}
