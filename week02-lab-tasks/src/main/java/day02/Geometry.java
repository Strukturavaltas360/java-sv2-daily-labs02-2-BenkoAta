package day02;

public class Geometry {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.5, 20.1);
        System.out.println("Téglalap mérete: " + rect.getA() + " * " + rect.getB());
        System.out.println("Terület: " + rect.calculateArea());
    }
}
