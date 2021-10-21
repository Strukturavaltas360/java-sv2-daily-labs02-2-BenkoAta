package day04;

public class GasStation {
    private int fuelPrice;

    public GasStation(int fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public double reFill(Car car, double fuelVolume) {
        car.setFuelVolume(fuelVolume);
        return fuelVolume * fuelPrice;
    }
}
