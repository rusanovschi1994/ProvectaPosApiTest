package provecta_pos.pojo.get.article_contoller.article_select;

import com.fasterxml.jackson.annotation.JsonProperty;
import provecta_pos.pojo.get.article_contoller.article_select.additionall.Descriptions;
import provecta_pos.pojo.get.article_contoller.article_select.additionall.Measure;
import provecta_pos.pojo.get.article_contoller.article_select.additionall.Names;
import provecta_pos.pojo.get.article_contoller.article_select.additionall.Vat;

import java.util.List;

public class ArticleSelect {

    @JsonProperty("ArticleMeasureType")
    private String articleMeasureType;

    @JsonProperty("ArticleParentId")
    private String articleParentId;

    @JsonProperty("Barcode")
    private String barcode;

    @JsonProperty("Childs")
    private Integer childs;

    @JsonProperty("Code")
    private String code;

    @JsonProperty("CreatedOn")
    private String createdOn;

    @JsonProperty("DeletedOn")
    private String deletedOn;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Descriptions")
    private List<Descriptions> descriptions;

    @JsonProperty("Id")
    private String id;

    @JsonProperty("Measure")
    private Measure measure;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Names")
    private List<Names> names;

    @JsonProperty("Price")
    private Double price;

    @JsonProperty("PriceChangedOn")
    private String priceChangedOn;

    @JsonProperty("PricePrevious")
    private Double pricePrevious;

    @JsonProperty("References")
    private Integer references;

    @JsonProperty("Reserve")
    private Double reserve;

    @JsonProperty("UpdatedOn")
    private String updatedOn;

    @JsonProperty("Vat")
    private Vat vat;

    public ArticleSelect() {
    }

    public ArticleSelect(String articleMeasureType, String articleParentId, String barcode, Integer childs, String code, String createdOn, String deletedOn, String description, List<Descriptions> descriptions, String id, Measure measure, String name, List<Names> names, Double price, String priceChangedOn, Double pricePrevious, Integer references, Double reserve, String updatedOn, Vat vat) {
        this.articleMeasureType = articleMeasureType;
        this.articleParentId = articleParentId;
        this.barcode = barcode;
        this.childs = childs;
        this.code = code;
        this.createdOn = createdOn;
        this.deletedOn = deletedOn;
        this.description = description;
        this.descriptions = descriptions;
        this.id = id;
        this.measure = measure;
        this.name = name;
        this.names = names;
        this.price = price;
        this.priceChangedOn = priceChangedOn;
        this.pricePrevious = pricePrevious;
        this.references = references;
        this.reserve = reserve;
        this.updatedOn = updatedOn;
        this.vat = vat;
    }

    public String getArticleMeasureType() {
        return articleMeasureType;
    }

    public String getArticleParentId() {
        return articleParentId;
    }

    public String getBarcode() {
        return barcode;
    }

    public Integer getChilds() {
        return childs;
    }

    public String getCode() {
        return code;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public String getDeletedOn() {
        return deletedOn;
    }

    public String getDescription() {
        return description;
    }

    public List<Descriptions> getDescriptions() {
        return descriptions;
    }

    public String getId() {
        return id;
    }

    public Measure getMeasure() {
        return measure;
    }

    public String getName() {
        return name;
    }

    public List<Names> getNames() {
        return names;
    }

    public Double getPrice() {
        return price;
    }

    public String getPriceChangedOn() {
        return priceChangedOn;
    }

    public Double getPricePrevious() {
        return pricePrevious;
    }

    public Integer getReferences() {
        return references;
    }

    public Double getReserve() {
        return reserve;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public Vat getVat() {
        return vat;
    }
}
