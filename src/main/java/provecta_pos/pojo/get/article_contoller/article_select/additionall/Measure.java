package provecta_pos.pojo.get.article_contoller.article_select.additionall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Measure {

    @JsonProperty("Id")
    private String id;

    public Measure() {
    }

    public Measure(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
