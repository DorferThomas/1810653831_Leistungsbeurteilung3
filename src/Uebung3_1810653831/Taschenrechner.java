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
    public double division(double a, double b) { return a / b; }
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
                {   //Methoden werden ineinander verschachtelt. (rekursiv=http://www.java-programmieren.com/rekursion-in-java.php)
                    //nachdem vom "param" -2 abgezogen worden sind, übergibt die Methode wieder einen Param, wodurch der
                    //Prozess wieder wiederholt wird. So lange bis 1 oder 0 rauskommt.
                    //dann wird der speicherplatz(wo die einzelnen "Rückgabewerte" gespeicher werden)
                    //abgerufen und dort steht immer eine 1 oder 0.

                     return fibonacciFolge(param-2) + fibonacciFolge(param-1);
                }
    }
    public int fibonacciFolgeIterativ(int param) {
        //fals der übergebene param kleiner oder 1 ist, ist die Fibonacci zahl auch 1 oder 0 weshalb er wieder zurück gegeben wird.
        if (param <= 1) {
            return param;
        }


        int a = 1;
        int b = 1;

        for (int i = 2; i < param; i++) {
            int c = a;
            a += b;
            b = c;
        }
        return a;
    }
}
