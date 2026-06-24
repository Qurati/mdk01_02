import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class Lab5Test {
    @Test
    void getResultFirstMethod() {
        int[] k = {3};
        int[] c = {2};
        int[] x = {5};
        double expected = 27.0;
        double actual = Lab5.GetResult(k, c, x);
        Assertions.assertEquals(expected, actual);
    }
}