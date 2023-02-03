package provecta_pos.pojo.get.bank_controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import provecta_pos.pojo.get.article_contoller.article_select.additionall.Names;

public class Bank extends Names {

    @JsonProperty("Code")
    private String code;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Id")
    private String id;

    @JsonProperty("Name")
    private String name;

    public Bank() {
    }

    public Bank(String key, String value, String code, String description, String id, String name) {
        super(key, value);
        this.code = code;
        this.description = description;
        this.id = id;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
