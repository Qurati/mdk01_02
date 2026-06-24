import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    @Test
    public void testOneCow() {
        Task3 task = new Task3();
        assertEquals("1 корова", task.cows(1));
    }
    @Test
    public void testTwoCows() {
        Task3 task = new Task3();
        assertEquals("2 коровы", task.cows(2));
    }
    @Test
    public void testFiveCows() {
        Task3 task = new Task3();
        assertEquals("5 коров", task.cows(5));
    }
    @Test
    public void testElevenCows() {
        Task3 task = new Task3();
        assertEquals("11 коров", task.cows(11));
    }
    @Test
    public void testInvalidNumber() {
        Task3 task = new Task3();
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> task.cows(100));
        assertEquals(
                "Число должно быть больше 0 и меньше 100",
                exception.getMessage());
    }
}