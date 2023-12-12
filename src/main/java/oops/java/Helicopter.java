package oops.java;

public class Helicopter implements FlyingTransport{

    private String origin;
    private String dest;
    private String passenger;

    @Override
    public void fly(String origin, String dest, String passenger) {
        System.out.println(this.getOrigin());
        System.out.println(this.getDest());
        System.out.println(this.getPassenger());
    }
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "origin='" + origin + '\'' +
                ", dest='" + dest + '\'' +
                ", passenger='" + passenger + '\'' +
                '}';
    }
}
