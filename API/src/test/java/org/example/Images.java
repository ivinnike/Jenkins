package org.example;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import lombok.ToString;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@ToString
public class Images extends DTO{

    static Map<String, String> headers = new HashMap<>();
    static ResponseSpecification responseSpecification;

    @BeforeAll
    static void setUp() {
        responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                /*.expectCookie()*/
                .expectContentType(ContentType.JSON)
                .expectHeader("Authorization","Client-ID 546c25a59c58ad7")
        .build();
        
    }

    @Test
    void getImageTest() {
        AccountInfoResponse response = (AccountInfoResponse) given()
                .log().all()
                .when().body("")
                .request("GET","https://api.imgur.com/3/image")
                .then()
                .spec(responseSpecification);
    }
    @Test
    public void uploadImageTest(){
        AccountInfoResponse response = (AccountInfoResponse) given()
                .when().body("")
                .request("POST","https://api.imgur.com/3/upload")
                .then()
                .spec(responseSpecification);
        given().
                multiPart(new File("/Desktop/space.jpeg"))
                .when()
                .post("/uploud");
    }
    @Test
    public void deletImageTest(){
        AccountInfoResponse response = (AccountInfoResponse) given()
                .when().body("")
                .delete("https://api.imgur.com/3/image/{{imageDeleteHash}}")
                .then()
                .spec(responseSpecification);
    }
    @Test
    public void updateImageInfoTest(){
        AccountInfoResponse response = (AccountInfoResponse) given()
                .when().body("")
                .delete("https://api.imgur.com/3/image/{{imageDeleteHash}}")
                .then()
                .spec(responseSpecification);

    }
}



