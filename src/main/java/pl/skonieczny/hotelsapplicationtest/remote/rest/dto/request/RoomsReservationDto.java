package pl.skonieczny.hotelsapplicationtest.remote.rest.dto.request;

import java.util.List;

public class RoomsReservationDto {
    private List<RoomReservationDto> rooms;
    private PersonDto person;
    public RoomsReservationDto() {
    }

    public RoomsReservationDto(List<RoomReservationDto> rooms, PersonDto person) {
        this.rooms = rooms;
        this.person = person;
    }

    public List<RoomReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
