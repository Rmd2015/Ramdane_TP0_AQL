package Exercice03;

import org.example.Exercice03.Fibonacci;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    @Test
    public void NlessThanZeroTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(-1);
        });
    }
    @Test
    public void NEqualsZero(){
        int rslt = Fibonacci.fibonacci(0);
        assertEquals(0,rslt);
    }
    @Test
    public void NsupThanZero(){
        int rslt = Fibonacci.fibonacci(8);
        assertEquals(21, rslt);
    }
}
