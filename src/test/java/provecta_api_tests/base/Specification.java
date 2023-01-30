package provecta_api_tests.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import provecta_pos.pojo.post.common_controller.LoginRequest;
import provecta_pos.pojo.post.common_controller.LoginResponse;

public class Specification {

    public static RequestSpecification requestSpec(String url){

        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(url)
                .build();
    }

    public static ResponseSpecification responseSpecOK200(){

        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

    public static ResponseSpecification responseSpec400(){

        return new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();
    }

    public static void installSpecification(RequestSpecification requestSpec, ResponseSpecification responseSpec){

        RestAssured.requestSpecification = requestSpec;
        RestAssured.responseSpecification = responseSpec;
    }
}
