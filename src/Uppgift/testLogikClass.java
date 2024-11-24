package Uppgift;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class testLogikClass {

    @Test
    public void testGetTotalCharacters(){
        Logikklassen test = new Logikklassen();
        test.processline("hej jag heter martin ");
        int actual = test.getTotalCharacters();
        assertEquals(21,actual);
    }
    @Test
    public void testTotalLines(){
        Logikklassen test = new Logikklassen();
        test.processline("Hej detta är roligt");
        int actual = test.getTotalLines();
        assertEquals(1,actual);
    }
    @Test
    public void testTotalLinesTimesTwo(){
        Logikklassen test = new Logikklassen();
        test.processline("Hej detta är roligt");
        test.processline("vi testar med två rader");
        int actual = test.getTotalLines();
        assertEquals(2,actual);
    }
    @Test
    public void testTotalWords(){
        Logikklassen test = new Logikklassen();
        test.processline("Jag måste köpa ett nytt kuddfodral");
        int actual = test.getTotalWords();
        assertEquals(6,actual);
    }
    @Test
    public void testLongestlWords(){
        Logikklassen test = new Logikklassen();
        test.processline("Jag måste köpa en ny upplaga av nationalencyklopedin");
        String actual = test.getLongestWords();
        assertEquals("nationalencyklopedin",actual);
    }
    @Test
            public void testIfisStoppedIsTrue() {
        Logikklassen test = new Logikklassen();
        test.processline("stop");
        boolean actual = test.isStopped();
        assertEquals(true,actual);
    }
    @Test
    public void testTotalLinesAndTotalWords() {
        Logikklassen test = new Logikklassen();
        test.processline("Trevlig kväll, det var trevligt");
        test.processline("Det var väldigt kul");
        assertEquals(2,test.getTotalLines());
        assertEquals(9,test.getTotalWords());
    }
    @Test
    public void testTotalLinesAndTotalWordsAndLongestWordAndTotalCharacters() {
        Logikklassen test = new Logikklassen();
        test.processline("Trevlig kväll, det var trevligt");
        test.processline("Det var väldigt kul");
        test.processline("nationalencyklopedin");
        test.processline("Jag äter 3 bananer om dagen ");
        assertEquals(4,test.getTotalLines());
        assertEquals(16,test.getTotalWords());
        assertEquals(98,test.getTotalCharacters());
        assertEquals("nationalencyklopedin",test.getLongestWords());
    }
    @Test
    public void testwhiteSpace(){
        Logikklassen test = new Logikklassen();
        test.processline("hej      jag       hör   inte");
        assertEquals(4,test.getTotalWords());
    }




}
