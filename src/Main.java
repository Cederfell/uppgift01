import Uppgift.Logikklassen;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logikklassen analyser = new Logikklassen();//skapa ett objekt av Logikklassen
        Scanner scan = new Scanner(System.in);//skapa en scanner för att kunna läsa in text från användaren
        System.out.println("Skriv in din text, avsluta genom att skriva stop");
//while loop för att läs in text tills användaren skriver stop
        while(!analyser.isStopped()){
            String text = scan.nextLine();// läser nästa rad från användaren
            analyser.processline(text);//skicka raden till Logikklassen
        }
        //Skriv ut resultatet till användaren
        System.out.println("Totalt antal tecken " + analyser.getTotalCharacters());
        System.out.println("Totalt antal rader " + analyser.getTotalLines());
        System.out.println("Totalt antal ord " + analyser.getTotalWords());
        System.out.println("Det Längsta ordet " + analyser.getLongestWords());
    }

    }







