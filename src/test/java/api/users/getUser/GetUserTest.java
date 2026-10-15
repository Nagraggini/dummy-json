package api.users.getUser;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GetUserTest {

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

   

}