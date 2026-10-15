package api.users.getAndPostUser;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

class GetAndPostUserTest {

    @Test
    @DisplayName("Check firstname field test")
    void getUserTest() {
        baseURI = "https://dummyjson.com";

        given()
                .get("/users")
                .then()
                .statusCode(200)
                .body("users.firstName[0]", equalTo("Emily"))
                // whether any of them contains the following names
                .body("users.firstName", hasItems("James", "William"));
    }

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

        given()
        	.header("Content-Type","application/json")
        	.contentType(ContentType.JSON)
        	.accept(ContentType.JSON)
        	.body(request.toJSONString())
        .when()
        .post("/users/add")
        .then()
        	.statusCode(201)
        	//.log().all()
        	.log().ifValidationFails();
    }

}