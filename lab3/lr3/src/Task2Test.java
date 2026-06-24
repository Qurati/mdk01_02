import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {
    @Test
    public void testDegToRad() {
        Task2 task = new Task2();

        assertEquals(3.14, task.DegToRad(180), 0.001);
    }
    @Test
    public void testDegToRad90() {
        Task2 task = new Task2();

        assertEquals(1.57, task.DegToRad(90), 0.001);
    }
    @Test
    public void testInvalidAngle() {
        Task2 task = new Task2();
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> task.DegToRad(360));
        assertEquals(
                "Угол должен быть больше 0 и меньше 360 градусов",
                exception.getMessage());
    }
}