package Uebung3_1810653831;

public class Taschenrechner {
    //Erstellen Sie eine neue Klasse Taschenrechner in Ihrem Projekt. Diese soll vier Methoden für die
    //Grundrechenarten enthalten(jeweils zwei Variablen vom jeweiligen Typ als Parameter). Es sollen
    //sowohl ganzzahlige, als auch Gleitkomma Operationen möglich sein. Rufen Sie dann aus Ihrer main
    //Methode (Aufgabe 2) alle Methoden jeweils einmal auf und geben Sie das Ergebnis auf der Konsole
    //aus.

    public double addieren(double a, double b)
    {
        return a + b;
    }
    public double subdrahieren(double a, double b)
    {
        return a - b;
    }
    public double division(double a, double b)
    {
        return a / b;
    }
    public double multiplikation(double a, double b)
    {
        return a * b;
    }
    public int fibonacciFolge(int param)
    {
            if (param <= 1)
            {
                return param;
            }else
                {   //Methoden werden ineinander verschachtelt.
                     return fibonacciFolge(param-2) + fibonacciFolge(param-1);
                }
    }
}
