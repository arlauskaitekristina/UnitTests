import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tests.Main;

public class TestHw {

    private Main main;

    @BeforeEach
    void setup() {
        main = new Main();
    }

    @Test
    public void testEvenOddNumber_EvenTrue() {
        boolean isEven = main.evenOddNumber(4);
        Assertions.assertTrue(isEven);
    }

    @Test
    public void testEvenOddNumber_OddFalse() {
        boolean isEven = main.evenOddNumber(7);
        Assertions.assertFalse(isEven);
    }

    @Test
    void numberInInterval_From25to100_True() {
        boolean isInInterval = main.numberInInterval(50);
        Assertions.assertTrue(isInInterval);
    }

    @Test
    void numberInInterval_LessThan25_False() {
        boolean isInInterval = main.numberInInterval(10);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInInterval_EqualTo25_False() {
        boolean isInInterval = main.numberInInterval(25);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInInterval_GreaterThan100_False() {
        boolean isInInterval = main.numberInInterval(150);
        Assertions.assertFalse(isInInterval);
    }
}
