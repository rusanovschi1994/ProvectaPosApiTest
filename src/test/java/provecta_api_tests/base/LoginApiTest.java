package provecta_api_tests.base;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import provecta_pos.helpers.Constants;
import provecta_pos.pojo.post.common_controller.LoginRequest;
import provecta_pos.pojo.post.common_controller.LoginResponse;

import static io.restassured.RestAssured.given;
import static provecta_pos.helpers.Constants.Actions.PROVECTA_POST_LOGIN;
import static provecta_pos.read_properties.ConfigProvider.*;

public class LoginApiTest {

    private final LoginRequest loginRequest = new LoginRequest(ADMIN_USERNAME, ADMIN_PASSWORD);

    public void login(){

        Specification.installSpecification(Specification.requestSpec(), Specification.responseSpecOK200());

        given()
                .body(loginRequest)
                .when()
                .post(PROVECTA_POST_LOGIN)
                .then().log().all()
                .extract().as(LoginResponse.class);
    }

    public String getLoginTypeAndToken(){

        Specification.installSpecification(Specification.requestSpec(), Specification.responseSpecOK200());

        LoginResponse loginResponse = given()
                .body(loginRequest)
                .when()
                .post(PROVECTA_POST_LOGIN)
                .then().log().all()
                .extract().as(LoginResponse.class);

        return loginResponse.getType() + loginResponse.getToken();
    }
}
