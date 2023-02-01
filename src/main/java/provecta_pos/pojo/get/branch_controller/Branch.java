package provecta_pos.pojo.get.branch_controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import provecta_pos.pojo.get.article_contoller.article_select.additionall.Descriptions;
import provecta_pos.pojo.get.article_contoller.article_select.additionall.Names;
import provecta_pos.pojo.get.branch_controller.additionall.Addresses;
import provecta_pos.pojo.get.branch_controller.additionall.Schedules;

import java.util.List;

public class Branch {

    @JsonProperty("Address")
    private String address;

    @JsonProperty("Addresses")
    private List<Addresses> addresses;

    @JsonProperty("Code")
    private String code;

    @JsonProperty("Contract")
    private String contract;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Descriptions")
    private List<Descriptions> descriptions;

    @JsonProperty("Id")
    private String id;

    @JsonProperty("Latitude")
    private Double latitude;

    @JsonProperty("LockedOn")
    private String lockedOn;

    @JsonProperty("Longitude")
    private Double longitude;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Names")
    private List<Names> names;

    @JsonProperty("Phone")
    private String phone;

    @JsonProperty("Schedule")
    private String schedule;

    @JsonProperty("Schedules")
    private List<Schedules> schedules;

    public Branch() {
    }

    public Branch(String address,
                  List<Addresses> addresses,
                  String code,
                  String contract,
                  String description,
                  List<Descriptions> descriptions,
                  String id,
                  Double latitude,
                  String lockedOn,
                  Double longitude,
                  String name,
                  List<Names> names,
                  String phone,
                  String schedule,
                  List<Schedules> schedules) {

        this.address = address;
        this.addresses = addresses;
        this.code = code;
        this.contract = contract;
        this.description = description;
        this.descriptions = descriptions;
        this.id = id;
        this.latitude = latitude;
        this.lockedOn = lockedOn;
        this.longitude = longitude;
        this.name = name;
        this.names = names;
        this.phone = phone;
        this.schedule = schedule;
        this.schedules = schedules;
    }

    public String getAddress() {
        return address;
    }

    public List<Addresses> getAddresses() {
        return addresses;
    }

    public String getCode() {
        return code;
    }

    public String getContract() {
        return contract;
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

    public Double getLatitude() {
        return latitude;
    }

    public String getLockedOn() {
        return lockedOn;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public List<Names> getNames() {
        return names;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchedule() {
        return schedule;
    }

    public List<Schedules> getSchedules() {
        return schedules;
    }
}
