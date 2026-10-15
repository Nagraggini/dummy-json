package api.users.putUser;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

class PutUserTest {

	 @Test
	    @DisplayName("Put an user with JSONObject")
	    void putUserTest() {
	    	
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
	        .put("/users/1")
	        .then()
	        	.statusCode(200)
	        	//.log().all()
	        	.log().ifValidationFails();
	    }
}
