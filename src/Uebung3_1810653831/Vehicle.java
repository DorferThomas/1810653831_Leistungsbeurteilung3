package Uebung3_1810653831;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Vehicle{
    int powerKw;
    double weight;
    String name;

    public String printName()
    {
        return name;
    }

    public void calculatePower()
    {
        double powerPs = powerKw*1.36;
        JOptionPane.showMessageDialog(null,"Das Auto hat " + powerPs + " PS.");
    }
}
