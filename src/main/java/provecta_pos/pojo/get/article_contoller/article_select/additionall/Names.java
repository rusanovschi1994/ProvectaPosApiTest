package provecta_pos.pojo.get.article_contoller.article_select.additionall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Names {

    @JsonProperty("Key")
    private String key;

    @JsonProperty("Value")
    private String value;

    public Names() {
    }

    public Names(String key, String value) {
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
