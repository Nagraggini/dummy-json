package api.users.getAndPostUser;



import static org.junit.jupiter.api.Assertions.*;



import java.util.HashMap;

import java.util.Map;



import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;



import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;



class GetAndPostUserTest {



@Test

@DisplayName("Check firstname field test")

void getUserTest() {

baseURI="https://dummyjson.com";


given()

.get("/users")

.then()

.statusCode(200)

.body("users.firstName[0]", equalTo("Emily"))

// whether any of them contains the following names

.body("users.firstName", hasItems("James","William"));

}


@Test

@DisplayName("Check status code")

void postUserTest() {


Map<String, Object> map=new HashMap<>();


// https://www.youtube.com/watch?v=EvG8r7AhanI&list=PLhW3qG5bs-L8xPrBwDv66cTMlFNeUPdJx&index=8


baseURI="https://dummyjson.com";


given()

.get("/users")

.then()

.statusCode(200)

.body("users.firstName[0]", equalTo("Emily"))

// whether any of them contains the following names

.body("users.firstName", hasItems("James","William"));

}



}