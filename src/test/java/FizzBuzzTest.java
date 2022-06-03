import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void test_exemple() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("test", fizzBuzz.print());
    }

}