package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanApiTest {

    @Test
    void shouldReturnPostedData() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("specific data"));
    }
}


