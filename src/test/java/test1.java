
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class test1 {
    @Test
    void addShouldReturnTheSumOfTwoNumbers() {
// Arrange
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;
// Act
        int result = calculator.add(a, b);
// Assert
        assertEquals(4, result);
    }
}
