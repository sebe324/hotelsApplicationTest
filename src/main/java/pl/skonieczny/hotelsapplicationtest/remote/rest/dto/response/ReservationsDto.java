package pl.skonieczny.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class ReservationsDto {
    private List<ReservationDto> reservations;

    public ReservationsDto(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }

    public ReservationsDto() {
    }

    public List<ReservationDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }
}
