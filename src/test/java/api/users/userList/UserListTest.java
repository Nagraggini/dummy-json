package api.users.userList;



import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;



import static org.hamcrest.Matchers.*;



import static io.restassured.RestAssured.*;

import io.restassured.response.Response;



class UserListTest {



@Test

@DisplayName("Check status code")

void checkStatusCode() {

Response response=get("https://dummyjson.com/users");


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


@Test

@DisplayName("Check user id")

void checkStatusCode2() {

baseURI="https://dummyjson.com/";


given()

.get("/users")

.then()

.statusCode(200)

.body("users.id[1]", equalTo(2));

//.log().all();

}



}


