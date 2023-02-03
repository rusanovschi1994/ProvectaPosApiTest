package provecta_pos.pojo.get.employee_controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import provecta_pos.pojo.get.employee_controller.additionall.Organisation;
import provecta_pos.pojo.get.employee_controller.additionall.Person;

public class Employee {

    @JsonProperty("Code")
    private String code;

    @JsonProperty("EmployeeActionType")
    private String employeeActionType;

    @JsonProperty("Function")
    private String function;

    @JsonProperty("Id")
    private String id;

    @JsonProperty("IsDefault")
    private boolean isDefault;

    @JsonProperty("Organisation")
    private Organisation organisation;

    @JsonProperty("Person")
    private Person person;

    @JsonProperty("Phone")
    private String phone;

    public Employee() {
    }

    public Employee(String code,
                    String employeeActionType,
                    String function,
                    String id,
                    boolean isDefault,
                    Organisation organisation,
                    Person person,
                    String phone) {

        this.code = code;
        this.employeeActionType = employeeActionType;
        this.function = function;
        this.id = id;
        this.isDefault = isDefault;
        this.organisation = organisation;
        this.person = person;
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public String getEmployeeActionType() {
        return employeeActionType;
    }

    public String getFunction() {
        return function;
    }

    public String getId() {
        return id;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public Person getPerson() {
        return person;
    }

    public String getPhone() {
        return phone;
    }
}
