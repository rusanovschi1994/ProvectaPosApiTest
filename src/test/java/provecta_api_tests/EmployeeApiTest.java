package provecta_api_tests;

import org.junit.Assert;
import org.junit.Test;
import provecta_api_tests.base.LoginApiTest;
import provecta_api_tests.base.Specification;
import provecta_pos.helpers.Constants;
import provecta_pos.pojo.get.employee_controller.Employee;
import provecta_pos.pojo.get.employee_controller.additionall.Person;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static provecta_pos.helpers.Constants.Actions.*;

public class EmployeeApiTest extends LoginApiTest {

    @Test
    public void checkFirstAndLastNameWithNotNullValue(){

        Specification.installSpecification(Specification.requestSpec(), Specification.responseSpecOK200());

        List<Employee> employees = given()
                .header("Authorization", getLoginTypeAndToken())
                .when().log().body()
                .get(PROVECTA_GET_EMPLOYEE)
                .then().log().body()
                .extract().jsonPath().getList(".", Employee.class);

        List<Person> persons = employees.stream().map(Employee::getPerson).collect(Collectors.toList());

        for(Person person : persons){
            Assert.assertNotNull(person.getFirstName());
            Assert.assertNotNull(person.getLastName());
        }
    }
}
