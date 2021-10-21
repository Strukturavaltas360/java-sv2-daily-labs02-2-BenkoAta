package day04;

public class Car {
    private double fuelVolume;
    private int distance;

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getAverageFuelConsumption() {
        return fuelVolume / distance * 100;
    }
}
