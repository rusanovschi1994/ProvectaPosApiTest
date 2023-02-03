package provecta_api_tests;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import provecta_api_tests.base.LoginApiTest;
import provecta_api_tests.base.Specification;
import provecta_pos.helpers.Constants;
import provecta_pos.pojo.get.article_contoller.article_select.ArticleSelect;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
import static provecta_pos.helpers.Constants.Actions.PROVECTA_GET_ARTICLE;

public class ArticleSelectApiTest extends LoginApiTest {

    @Test
    public void checkArticleNameWithNotNullValue(){

        Specification.installSpecification(Specification.requestSpec(), Specification.responseSpecOK200());

        List<ArticleSelect> articleSelect = given()
                .header("Authorization", getLoginTypeAndToken())
                .when()
                .get(PROVECTA_GET_ARTICLE)
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
