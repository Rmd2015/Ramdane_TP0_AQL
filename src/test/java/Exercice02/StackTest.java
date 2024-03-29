package Exercice02;

import org.example.Exercice02.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    public void pushTest() {
        stack.push(12);
        // ici je test le size de la pile il faut size == 1
        // car j'ajouter un element a la pile !
        assertEquals(1, stack.size());
    }

    @Test
    void PopTest() {
        stack.push(2001);
        //verifier la validite de valeur retourne par la méthode pop
        assertEquals(2001, stack.pop());
        //verfier que la méthode pop() retire l'element de la pile
        // On peut aussi le verifier par la méthode stack.isEmpty()
        //assertFalse(stack.isEmpty());
        assertEquals(0, stack.size());

    }
    @Test
    public void PeekTest(){
        stack.push(2001);
        assertEquals(2001,stack.peek());
        //verifer que le size de la pile n'est changeé pas!
        assertEquals(1,stack.size());
    }
    @Test
    public void IsEmptyTest(){
        stack.push(2001);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void SizeTest(){
        assertEquals(0,stack.size());
        stack.push(2001);
        stack.push(2002);
        assertEquals(2,stack.size());
    }
    @Test
    public void ExpandArrayTest(){
        //remarque la taille max de la pile = 10
        for(int i =0 ;i<10 ; i++)
        {
            stack.push(i);
        }
        //ajouter  l'element numero 11
        stack.push(11);
        assertEquals(11,stack.size());
    }

}


