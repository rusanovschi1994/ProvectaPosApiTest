package provecta_api_tests;

import org.junit.Assert;
import org.junit.Test;
import provecta_api_tests.base.LoginApiTest;
import provecta_api_tests.base.Specification;
import provecta_pos.helpers.Constants;
import provecta_pos.pojo.get.branch_controller.Branch;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class BranchApiTest extends LoginApiTest {

    @Test
    public void checkBranchNameWithNotNullValue(){

        Specification.installSpecification(Specification.requestSpec(), Specification.responseSpecOK200());

        List<Branch> branch = given()
                .header("Authorization", getLoginTypeAndToken())
                .when()
                .get(Constants.Actions.PROVECTA_GET_BRANCH)
                .then().log().body()
                .extract().jsonPath().getList(".", Branch.class);

        List<String> branches = branch.stream().map(Branch::getName).collect(Collectors.toList());
        for(String name : branches){

            Assert.assertNotNull("some branch name have a blank or null value", name);
        }
    }
}
