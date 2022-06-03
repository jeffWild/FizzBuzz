import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    enum FizzBuzzEnum {
        Fizz, Buzz, FizzBuzz;
    }

    @BeforeEach
    private void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void doit_repondre_Fizz_quand_multiple_de_3() {
        assertEquals(FizzBuzzEnum.Fizz.name(), fizzBuzz.print(3));
    }

    @Test
    void doit_repondre_Fizz_quand_multiple_de_5() {
        assertEquals(FizzBuzzEnum.Buzz.name(), fizzBuzz.print(5));
    }

    @Test
    void doit_repondre_Fizz_quand_multiple_de_3_et_5() {
        assertEquals(FizzBuzzEnum.FizzBuzz.name(), fizzBuzz.print(15));
    }

    @Test
    void doit_repondre_nombre_quand_pas_multiple_de_3_ni_5() {
        assertEquals("1", fizzBuzz.print(1));
        assertEquals("2", fizzBuzz.print(2));
        assertEquals("4", fizzBuzz.print(4));
        assertEquals("7", fizzBuzz.print(7));
        assertEquals("8", fizzBuzz.print(8));
    }

}