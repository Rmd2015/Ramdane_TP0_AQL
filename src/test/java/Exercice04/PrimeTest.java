package Exercice04;

import org.example.Exercice04.Prime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PrimeTest {

    @Test
    public void NlessThanTow(){
        boolean rslt = Prime.isPrime(-1);
         assertFalse(rslt);
    }
    @Test
    public void NequalsToTow(){
        boolean rslt = Prime.isPrime(2);
        assertTrue(rslt);
    }
    @Test
    public void NsupThanTowNotPrime(){
        boolean rslt = Prime.isPrime(8);
        assertFalse(rslt);
    }
    @Test
    public void NsupThanTowItsPrime(){
        boolean rslt = Prime.isPrime(7);
        assertTrue(rslt);
    }

}
