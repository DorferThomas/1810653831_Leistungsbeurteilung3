package Uebung3_1810653831;

public class Aufgabe2 {
    public static void main(String[] args)
    {
        //Aufgabe2:4
        //Instanz wird angelegt, damit die nicht Static Methode aufgerufen werden kann
        Aufgabe2 eingabe = new Aufgabe2();
        eingabe.partialString("hi333");
        eingabe.partialString("Dieser String ist 60 Stellen lang, geteilt durch 2 ergibt:  ");

        //Aufgabe3:(Taschenrechner)
        Taschenrechner rechnen = new Taschenrechner();
        System.out.println("Ergebnis der Addition: " + rechnen.addieren(12,23));
        System.out.println("Ergebnis der Addition: " + rechnen.addieren(34,56));
        System.out.println("Ergebnis der Subdraktion: " + rechnen.subdrahieren(44,3));
        System.out.println("Ergebnis der Subdraktion: " + rechnen.subdrahieren(88,333));
        System.out.println("Ergebnis der Division: " + rechnen.division(66.34,3.33));
        System.out.println("Ergebnis der Division: " + rechnen.division(4566.344,23.33));
        System.out.println("Ergebnis der Multiplikation: " + rechnen.multiplikation(3.1415,5));
        System.out.println("Ergebnis der Multiplikation: " + rechnen.multiplikation(0.33,100));

        //Aufgabe4:(FibonacciFolge)     rekrusiv:
        System.out.println("Fibonacci Folge: " + rechnen.fibonacciFolge(1));
        System.out.println("Fibonacci Folge: " + rechnen.fibonacciFolge(2));
        System.out.println("Fibonacci Folge: " + rechnen.fibonacciFolge(3));
        System.out.println("Fibonacci Folge: " + rechnen.fibonacciFolge(4));
        System.out.println("Fibonacci Folge: " + rechnen.fibonacciFolge(5));
        System.out.println("Fibonacci Folge: " + rechnen.fibonacciFolge(40));
        //interativ:
        System.out.println(rechnen.fibonacciFolgeIterativ(1));
        System.out.println(rechnen.fibonacciFolgeIterativ(2));
        System.out.println(rechnen.fibonacciFolgeIterativ(3));
        System.out.println(rechnen.fibonacciFolgeIterativ(4));
        System.out.println(rechnen.fibonacciFolgeIterativ(5));
        System.out.println(rechnen.fibonacciFolgeIterativ(40));
    }
    //Aufgabe2:
    public void partialString(String a)
    {
        if (a.length()<=3)              //.length() überprüft, wie lange der string ist.(nur bei String)
        {
            System.out.println("Der übergebene Parameter ist zu kurz!!");
        }else
        {
            System.out.println(a.length()/2);
        }
    }


}
