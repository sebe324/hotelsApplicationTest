package pl.skonieczny.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class RoomsDto {
    private List<RoomDto> rooms;

    public RoomsDto() {
    }

    public RoomsDto(List<RoomDto> rooms) {
        this.rooms = rooms;
    }

    public List<RoomDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDto> rooms) {
        this.rooms = rooms;
    }
}
