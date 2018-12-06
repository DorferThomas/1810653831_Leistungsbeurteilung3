package Uebung3_1810653831;

import javax.swing.*;

public class Aufruf {
    public static void main(String[] args) {
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

        //Vehicle vehicle3 = new Vehicle(50,50,"Lupo");
        //Vehicle vehicle4 = new Vehicle(100,100,"Ferarri");
        //System.out.println(vehicle3.printName());
        //System.out.println("Es ist ein " + vehicle3.printName());
        //vehicle3.calculatePower();
        //System.out.println("Es ist ein " + vehicle3.printName());
        //vehicle4.calculatePower();
    }
}
