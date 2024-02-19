
import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class PersonTest {
    Person p;
    @BeforeEach
    void setup(){
         p = new Person("RAMDANE","Oussama",17);
    }
    @Test
    public void FullNameTest()
    {
        String result = p.getFullName();
        Assertions.assertEquals("RAMDANE Oussama",result);
    }
    @Test
    public void itsAdultTest()
    {
        boolean result = p.isAdult();
        Assertions.assertTrue(result);

    }
    @Test
    public void itsNotAdultTest()
    {
        boolean result = p.isAdult();
        Assertions.assertFalse(result);

    }
}
