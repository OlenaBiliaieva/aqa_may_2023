package hillel.rest;

import hillel.rest.dto.FullUserInfo;
import hillel.rest.dto.ResponceData;
import hillel.rest.dto.User;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RestTest {
    private static RequestSpecification requestSpecification;

    @BeforeAll
    public static void init() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setContentType(ContentType.JSON)
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    @Test
    public void getUser() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get("api/users/2")
                .thenReturn();
        response.then().statusCode(200);
    }

    @Test
    public void getUsers() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .param("page", 2)
                .get("api/users")
                .thenReturn();
        response.then().statusCode(200);
    }

    @Test
    public void createUser() {

        User expected = new User();
        expected.setName("morpheus");
        expected.setJob("lid");

//        User
//                .builder()
//                .name("morpheus")
//                .job("lid")
//                .build();
        User user1 = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .body(expected)
                .post("api/users")
                .then()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .extract()
                .as(User.class);

        assertThat(user1).isEqualToIgnoringGivenFields(expected, "id", "createdAt");

        Assertions.assertEquals(user1.getName(), expected.getName());
        Assertions.assertEquals(user1.getJob(), expected.getJob());
    }

    @Test
    public void getUser2() {
        Response response = RestAssured.given()
                .spec(requestSpecification)
                .get("api/users/2")
                .thenReturn();
        response.then().statusCode(200);
        ResponceData data = response.then()
                .extract()
                .body()
                .jsonPath()
                .getObject("data", ResponceData.class);
        String id = response.then()
                .extract()
                .body()
                .jsonPath()
                .getString("data.id");
        System.out.println(id);
        System.out.println(data);
    }

    @Test
    public void getUsers1() {
        String id = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .param("page", 2)
                .get("api/users")
                .then()
                .extract()
                .body()
                .jsonPath()
                .getString("data[0].id");
        System.out.println(id);
    }
    @Test
    public void getUsers2() {
       FullUserInfo id = RestAssured.given()
                .spec(requestSpecification)
                .when()
                .get("api/users/2")
                .then()
                .extract()
                .as(FullUserInfo.class);
        System.out.println(id);
    }
}
