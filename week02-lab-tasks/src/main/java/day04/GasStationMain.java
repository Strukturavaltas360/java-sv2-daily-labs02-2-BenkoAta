package day04;

import java.util.Scanner;

public class GasStationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üzemanyagár [Ft]: ");
        GasStation shell = new GasStation(scanner.nextInt());
        Car skoda = new Car();

        System.out.print("Tankolt mennyiség [l]: ");
        double price = shell.reFill(skoda, scanner.nextDouble());
        System.out.println("Fizetendő [Ft]: " + price);

        System.out.print("Megtett távolság [km]: ");
        skoda.setDistance(scanner.nextInt());

        System.out.println("Átlagfogyasztás: " + skoda.getAverageFuelConsumption());
    }
}
