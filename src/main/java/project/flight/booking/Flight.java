package project.flight.booking;

import oops.java.Airport;

import java.util.List;

public class Flight {
    private int flightNo;
    private Airport depurtureAirport;
    private Airport arrivalAirport;
    private int durationMinutes;

    /*
    * Cancel flight
    * */
    public boolean cancelFlight(){
        return false;
    }

    /*
    * Administer can add a flight schedule
    *
     */
    public boolean addFlightSchedule(){
        return false;
    }

    public List<Flight> getFlights(){
        return null;
    }


    public int getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public Airport getDepurtureAirport() {
        return depurtureAirport;
    }

    public void setDepurtureAirport(Airport depurtureAirport) {
        this.depurtureAirport = depurtureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
}
