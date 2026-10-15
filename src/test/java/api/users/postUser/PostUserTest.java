package api.users.postUser;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

class PostUserTest {

	 @Test
	    @DisplayName("Add a new user with JSONObject")
	    void postUserTest() {
	       /* Map<String, Object> map = new HashMap<>();
	        
	        map.put("id", "45644");
	        map.put("firstName", "Emily");
	        map.put("lastName", "Smith");
	        map.put("maidenName", "");
	        
	        System.out.println(map);
	        
	        JSONObject request=new JSONObject(map);
	        
	        System.out.println(request.toJSONString());*/
	    	
	    	JSONObject request=new JSONObject();    	
	    
	    	request.put("firstName", "Emily");
	    	request.put("lastName", "Smith");
	    	request.put("maidenName", "");
	        //System.out.println(request.toJSONString());
	          
	        baseURI = "https://dummyjson.com";

	     String id=   given()
	        	.header("Content-Type","application/json")
	        	.contentType(ContentType.JSON)
	        	.accept(ContentType.JSON)
	        	.body(request.toJSONString())
	        .when()
	        .post("/users/add")
	        .then()
	        	.statusCode(201)
	        	//.log().all()
	        	.log().ifValidationFails()
	        	.extract().jsonPath().getString("id");
	     
	     assertEquals(id,"209");
	 }

}
