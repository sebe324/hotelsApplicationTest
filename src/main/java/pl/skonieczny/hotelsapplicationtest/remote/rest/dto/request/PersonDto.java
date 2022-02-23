package pl.skonieczny.hotelsapplicationtest.remote.rest.dto.request;

public class PersonDto {
    private String name;
    private Integer phone;
    private String address;
    private Integer floor;

    public PersonDto() {
    }

    public PersonDto(String name, Integer phone, String address, Integer floor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
