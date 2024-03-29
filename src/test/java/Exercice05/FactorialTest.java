package Exercice05;

import org.example.Exercice03.Fibonacci;
import org.example.Exercice05.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @Test
    public void NlessThanZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-5);
        });
    }
    @Test
    public void NequalsZero(){
        int rslt = Factorial.factorial(0);
        assertEquals(1,rslt);
    }
    @Test
    public void NsupThanZero(){
        int rslt = Factorial.factorial(5);
        assertEquals(120,rslt);
    }
    @Test
    public void NequalsOne(){
        int rslt = Factorial.factorial(1);
        assertEquals(1,rslt);
    }
}
