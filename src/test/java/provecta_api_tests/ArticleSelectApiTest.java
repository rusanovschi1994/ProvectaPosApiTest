package provecta_api_tests;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import provecta_api_tests.base.LoginApiTest;
import provecta_api_tests.base.Specification;
import provecta_pos.pojo.get.article_contoller.article_select.ArticleSelect;
import provecta_pos.read_properties.ConfigProvider;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class ArticleSelectApiTest extends LoginApiTest {

    @Test
    public void checkArticleNameWithNotNullValue(){

        Specification.installSpecification(Specification.requestSpec(ConfigProvider.BASE_URL), Specification.responseSpecOK200());

        List<ArticleSelect> articleSelect = given()
                .header("Authorization", getLoginTypeAndToken())
                .when()
                .get("api/v1/stock/article/select")
                .then().log().body()
                .body("Id", notNullValue())
                .body("Code", notNullValue())
                .extract().body().jsonPath().getList(".", ArticleSelect.class);

        List<String> articlesName = articleSelect.stream().map(ArticleSelect::getArticleMeasureType).collect(Collectors.toList());
        for(String articleName : articlesName){

            Assert.assertNotNull("some article have a blank or null value", articleName);
        }
    }
}
