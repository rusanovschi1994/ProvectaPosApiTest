package provecta_api_tests.no_pojo;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import provecta_api_tests.base.LoginApiTest;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ArticlesSelectApiNoPojoTest extends LoginApiTest {

    @Test
    public void checkArticle(){

        Response response = given()
                .header("Authorization", getLoginTypeAndToken())
                .when()
                .get("api/v1/stock/article/select")
                .then().log().body()
                .extract().response();

        JsonPath jsonPath = response.jsonPath();

        List<String> names = jsonPath.get("name");

        for(String name: names){

            System.out.println(name);
        }
    }
}
