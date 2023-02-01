package provecta_pos.pojo.get.branch_controller.additionall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Schedules {

    @JsonProperty("Key")
    private String key;

    @JsonProperty("Value")
    private String value;

    public Schedules() {
    }

    public Schedules(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
