package Uebung3_1810653831;

public class Aufruf {
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();

        vehicle1.name = "Subaru Justy 4x4";
        vehicle1.powerKw = 50;

        vehicle2.name = "VW Käfer";
        vehicle2.powerKw = 90;

        System.out.println("Es ist ein " + vehicle1.printName());
        vehicle1.calculatePower();

        System.out.println("Es ist ein: " + vehicle2.printName());
        vehicle2.calculatePower();
    }
}
