package Uebung3_1810653831;

public class Aufgabe2 {
    public static void main(String[] args)
    {
        //Instanz wird angelegt, damit die nicht Static Methode aufgerufen werden kann
        Aufgabe2 eingabe = new Aufgabe2();
        eingabe.partialString("hi");
        eingabe.partialString("Dieser String ist 60 Stellen lang, geteilt durch 2 ergibt:  ");
    }
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
