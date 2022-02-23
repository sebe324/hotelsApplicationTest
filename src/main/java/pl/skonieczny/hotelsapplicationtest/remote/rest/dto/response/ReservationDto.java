package pl.skonieczny.hotelsapplicationtest.remote.rest.dto.response;
import pl.skonieczny.hotelsapplicationtest.remote.rest.dto.request.PersonDto;
import pl.skonieczny.hotelsapplicationtest.domain.model.Status;
import pl.skonieczny.hotelsapplicationtest.remote.rest.dto.request.RoomsReservationDto;

public class ReservationDto {
    private Integer id;
    private Status status;
    private RoomsReservationDto rooms;
    private PersonDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, Status status, RoomsReservationDto rooms, PersonDto person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public RoomsReservationDto getRooms() {
        return rooms;
    }

    public void setRooms(RoomsReservationDto rooms) {
        this.rooms = rooms;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
