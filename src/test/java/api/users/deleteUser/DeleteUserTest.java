package api.users.deleteUser;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DeleteUserTest {

	 @Test
	    @DisplayName("Delete an user")
	    void deleteUserTest() {
	  	          
	        baseURI = "https://dummyjson.com";

	        given()	        	       
	        .when()
	        .delete("/users/2")
	        .then()
	        	.statusCode(anyOf(is(200), is(204)))
	        	.log().all()
	        	.log().ifValidationFails()
	        .body("isDeleted", equalTo(true));
	    }

}
