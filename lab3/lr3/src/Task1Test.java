import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {

    @Test
    public void testProductDigits() {
        Task1 task = new Task1();
        assertEquals(24, task.f(234));
    }

    @Test
    public void testProductWithZero() {
        Task1 task = new Task1();
        assertEquals(0, task.f(105));
    }

    @Test
    public void testInvalidNumber() {
        Task1 task = new Task1();
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> task.f(99)
        );
        assertEquals("Число должно быть трехзначным",
                exception.getMessage());
    }
}