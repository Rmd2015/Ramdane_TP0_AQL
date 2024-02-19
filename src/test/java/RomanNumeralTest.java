import org.example.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RomanNumeralTest {
    @Test
    public void singleNumber(){

        RomanNumeral roman = new RomanNumeral();
        /**/
        int result = roman.convert("I");
        Assertions.assertEquals(1,result);
    }
    @Test
    public void EqualMultipuleNumber()
    {
        RomanNumeral roman = new RomanNumeral();
        /**/
        int result = roman.convert("III");
        //int result = roman.convertCorrect("III");
        Assertions.assertEquals(3,result);
    }
    @Test
    public void SecondNumberBiggerThanFirst()
    {
        RomanNumeral roman = new RomanNumeral();
        /**/
        int result = roman.convert("IV");
        //int result = roman.convertCorrect("IV");
        Assertions.assertEquals(4,result);
    }

}
