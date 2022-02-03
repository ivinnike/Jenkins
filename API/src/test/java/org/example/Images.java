package org.example;


import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Images {
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
        DTO.AccountInfoResponse response = (DTO.AccountInfoResponse) given()
                .contentType("application/json; charset=utf-8")
                .log().all()
                .when().body("{\n" +
                        "        \"id\": \"48WkbrB\",\n" +
                        "        \"title\": \"1x1 Pixel\",\n" +
                        "        \"description\": \"This is an 1x1 pixel image.\",\n" +
                        "        \"datetime\": 1643483422,\n" +
                        "        \"type\": \"image/jpeg\",\n" +
                        "        \"width\": 660,\n" +
                        "        \"height\": 420,\n" +
                        "        \"size\": 53623,\n" +
                        "        }")
                .request("GET","https://api.imgur.com/3/image")
                .then()
                .spec(responseSpecification);
    }
    @Test
    public void uploadImageTest(){
        DTO.AccountInfoResponse response = (DTO.AccountInfoResponse) given()
                .contentType("application/json; charset=utf-8")
                .log().all()
                .when().body("{\n" +
                        "        \"id\": \"5gbcwWG\",\n" +
                        "        \"deletehash\": \"EgcKMxcSpyvXOV7\",\n" +
                        "        \"account_id\": 159123277,\n" +
                        "        \"account_url\": \"ivinnike\",\n"+
                        "    }")
                .request("POST","https://api.imgur.com/3/upload")
                .then()
                .spec(responseSpecification);;
        given().
                multiPart(new File("/Desktop/space.jpeg"))
                .when()
                .post("/uploud");
    }
    @Test
    public void deletImageTest(){
        DTO.AccountInfoResponse response = (DTO.AccountInfoResponse) given()
                .contentType("application/json; charset=utf-8")
                .log().all()
                .when().body("{\n" +
                        "            \"data\": true,\n" +
                        "                \"success\": true,\n" +
                        "                \"status\": 200\n" +
                        "        }")
                .delete("https://api.imgur.com/3/image/{{imageDeleteHash}}")
                .then()
                .spec(responseSpecification);
    }
    @Test
    public void updateImageInfoTest(){
        DTO.AccountInfoResponse response = (DTO.AccountInfoResponse) given()
                .contentType("application/json; charset=utf-8")
                .log().all()
                .when().body("{\n" +
                        "    \"data\": true,\n" +
                        "    \"success\": true,\n" +
                        "    \"status\": 200\n" +
                        "}")
                .delete("https://api.imgur.com/3/image/{{imageDeleteHash}}")
                .then()
                .spec(responseSpecification);

    }
}



