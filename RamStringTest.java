package cmsc256;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import cmsc256.MyIndexOutOfBoundsException;
import cmsc256.RamString;
import cmsc256.WackyStringInterface;

public class RamStringTest {
    WackyStringInterface normalString;

    @Test
    public void testSetWackyString(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("Rodeny the Rams");
        assertTrue("Rodeny the Rams".equals(normalString.getWackyString()));
    }

    @Test
    public void testGetWackyString(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("Rodeny the Rams");
        assertTrue("Rodeny the Rams",true);
    }

    @Test
    public void testGetEveryThirdCharacter1(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("Rodeny the Rams");
        String everyThird = normalString.getEveryThirdCharacter();
        assertTrue("dyt m".equals(everyThird));
    }

    @Test
    public void testGetEveryThirdCharacter2(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("Rodeny the Rams");
        String everyThirdOrdering = normalString.getEveryThirdCharacter();
        assertTrue("dyt m".equals(everyThirdOrdering));
    }
    @Test
    public void testGetEveryThirdCharacter3() {
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("Rodeny the Rams");
        String String = normalString.getEveryThirdCharacter();
        assertTrue("Rodney, the Ram".equals(String));
    }

    @Test
    public void testGetEvenOrOddCharacters1 (){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("Rodeny the Rams");
        String str = "Rodeny the Rams";
        String EvenOrOdd1 = normalString.getEvenOrOddCharacters(str);
        assertTrue("Rde,teRm".equals(EvenOrOdd1));
        assertTrue("ony h a".equals(EvenOrOdd1));
    }

    @Test
    public void testGetEvenOrOddCharacters2 (){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("Rodeny the Rams");
        String str = "Rodeny the Rams";
        String EvenOrOddOrdering = normalString.getEvenOrOddCharacters(str);
        assertTrue("Rde,teRm".equals(EvenOrOddOrdering));
        assertTrue("ony h a".equals(EvenOrOddOrdering));
    }

    @Test
    public void testGetEvenOrOddCharacters3 () {
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("Rodeny the Rams");
        String str = "Rodeny the Rams";
        String string = normalString.getEvenOrOddCharacters(str);
        assertTrue("Rodney, the Ram".equals(string));
    }

    @Test
    public void testCountDoubleDigits1(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("Rodeny the Rams17");
        int DoubleDigits= normalString.countDoubleDigits();
        assertTrue(true);
    }

    @Test
    public void testCountDoubleDigits2(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("Rodeny the Rams");
        int DoubleDigits= normalString.countDoubleDigits();
        assertTrue(false);
    }

    @Test
    public void testIsValidVCUEmail1(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("wang17@vcu.edu");
        Boolean ValidVCUEmail= normalString.isValidVCUEmail();
        assertTrue(true);
    }

    @Test
    public void testIsValidVCUEmail2(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("wang@mymail.vcu.edu");
        Boolean ValidVCUEmail= normalString.isValidVCUEmail();
        assertTrue(true);
    }

    @Test
    public void testIsValidVCUEmail3(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("@");
        Boolean ValidVCUEmail= normalString.isValidVCUEmail();
        assertTrue(false);
    }

    @Test
    public void testRamifyString1(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("0");
        String ramifyString= normalString.standardizePhoneNumber();
        assertTrue(true);
    }

    @Test
    public void testRamifyString2(){
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("00");
        String ramifyString= normalString.standardizePhoneNumber();
        assertTrue(true);
    }

    @Test
    public void testRamifyString3() {
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("");
        String ramifyString = normalString.standardizePhoneNumber();
        assertTrue(false);
    }

    @Test
    public void testConvertDigitsToRomenNumeralsIsInSubstring1()
            throws MyIndexOutOfBoundsException, IllegalArgumentException{
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("100");
        WackyStringInterface roman = normalString.convertDigitsToRomanNumeralsInSubstring(1,0);
        assertTrue(true);
    }

    @Test
    public void testConvertDigitsToRomenNumeralsIsInSubstring2()
            throws MyIndexOutOfBoundsException, IllegalArgumentException {
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("100");
        WackyStringInterface roman = normalString.convertDigitsToRomanNumeralsInSubstring(1, 4);
        assertTrue(false);
    }

    @Test
    public void testConvertDigitsToRomenNumeralsIsInSubstring3()
            throws MyIndexOutOfBoundsException, IllegalArgumentException {
        WackyStringInterface wackyStringInterface = new RamString();
        wackyStringInterface.setWackyString("100");
        WackyStringInterface roman = normalString.convertDigitsToRomanNumeralsInSubstring(1, 0);
        assertTrue(false);
    }

}
