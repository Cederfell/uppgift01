package Uppgift;

public class Logikklassen {
    //Deklarear variabler
    private int totalCharacters;
    private int totalLines;
    private int totalWords;
    private String longestWord;
    private boolean stopped;

    // initiera variablerna i konstruktorn.
    public Logikklassen(){
        totalCharacters = 0;
        totalLines = 0;
        totalWords = 0;
        longestWord = "";
        stopped = false;
    }
    //metod för att lägga till text
    public void processline(String line) {
        //Kontrollera om raden innehåller "stop"
        if(line.equalsIgnoreCase("stop")) {
            stopped = true; // sätt stopp till true för att avsluta
            return; // avslutar metoden
        }
        totalLines++; //öka antalet rader med 1
        totalCharacters += line.length(); //addera antalet tecken

        //skapa en String array som delar upp orden i text raden.
        String[] words = line.split("\\s+"); //delar upp strängen i delar och exkluderar  mellanslag.
        totalWords += words.length;//lägg till antal ord på raden till totalWords.

        //kontorllerar längsta ordet och uppdatera om ett längre ord dycker upp.
        for (String word : words) { // gå igenom alla ord i array words. för varje word i words.
            if (word.length() > longestWord.length()) { // jämför längden i texten word är längre är longestWord.
                longestWord = word; // det längsta ordet uppdateras
            }
        }
    }

    // metod för att kontorllera om programmet avslutas
    public boolean isStopped(){
        return stopped;
    }
    //metod för totalt antal tecken som retunerar totalt antal tecken
    public int getTotalCharacters() {
        return totalCharacters;
    }
    //metod för totalt antal rader som retunerar totalt antal rader
    public int getTotalLines() {
        return totalLines;
    }
    //metod för totalt antal ord som retunerar totalt antal ord
    public int getTotalWords() {
        return totalWords;
    }
    //metod för längsta ordet som retunerar det
    public String getLongestWords() {
        return longestWord;
    }


}
