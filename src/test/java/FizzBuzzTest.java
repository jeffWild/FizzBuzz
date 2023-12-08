import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void doit_retourner_1() {
        assertEquals("1", FizzBuzz.print());
    }

}
