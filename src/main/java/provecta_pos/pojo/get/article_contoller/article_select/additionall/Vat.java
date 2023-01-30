package provecta_pos.pojo.get.article_contoller.article_select.additionall;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vat {

    @JsonProperty("Id")
    private String id;

    public Vat() {

    }

    public Vat(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
