import application.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        FizzBuzz fizzBuzz = new FizzBuzz();
    }

    @Test
    public void umRecebeUm(){
        assertEquals("1", fizzBuzz.play(1));
    }

    @Test
    public void doisRetornaDois() {
        assertEquals("2", fizzBuzz.play(2));
    }

    @Test
    public void tresRetornaTres(){
        assertEquals("Fizz", fizzBuzz.play(3));
    }

    @Test
    public void cincoRetornaCinco(){
        assertEquals("Buzz", fizzBuzz.play(5));
    }

    @Test
    public void quinzeRetornaFizzBuzz(){
        assertEquals("FizzBuzz", fizzBuzz.play(15));
    }

}
