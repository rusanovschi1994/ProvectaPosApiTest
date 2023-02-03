package provecta_pos.pojo.get.employee_controller.additionall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Organisation {

    @JsonProperty("Id")
    private String id;

    public Organisation() {
    }

    public Organisation(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
