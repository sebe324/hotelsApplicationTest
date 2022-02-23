package pl.skonieczny.hotelsapplicationtest.remote.rest.dto.response;

public class HotelDto {
    private Integer id;
    private String name;
    private RoomsDto rooms;

    public HotelDto() {
    }

    public HotelDto(Integer id, String name, RoomsDto rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoomsDto getRooms() {
        return rooms;
    }

    public void setRooms(RoomsDto rooms) {
        this.rooms = rooms;
    }
}
