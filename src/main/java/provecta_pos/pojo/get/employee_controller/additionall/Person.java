package provecta_pos.pojo.get.employee_controller.additionall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    @JsonProperty("BornOn")
    private String bornOn;

    @JsonProperty("Code")
    private String code;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("IDNP")
    private String idnp;

    @JsonProperty("Id")
    private String id;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("LockedOn")
    private String lockedOn;

    @JsonProperty("Patronymic")
    private String patronymic;

    @JsonProperty("PersonSexType")
    private String personSexType;

    @JsonProperty("Phone")
    private String phone;

    public Person() {
    }

    public Person(String bornOn,
                  String code,
                  String email,
                  String firstName,
                  String idnp,
                  String id,
                  String lastName,
                  String lockedOn,
                  String patronymic,
                  String personSexType,
                  String phone) {

        this.bornOn = bornOn;
        this.code = code;
        this.email = email;
        this.firstName = firstName;
        this.idnp = idnp;
        this.id = id;
        this.lastName = lastName;
        this.lockedOn = lockedOn;
        this.patronymic = patronymic;
        this.personSexType = personSexType;
        this.phone = phone;
    }

    public String getBornOn() {
        return bornOn;
    }

    public String getCode() {
        return code;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getIdnp() {
        return idnp;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLockedOn() {
        return lockedOn;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPersonSexType() {
        return personSexType;
    }

    public String getPhone() {
        return phone;
    }
}
