import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaranovArtemLab2Test {
    BaranovArtemLab2 lab2 = new BaranovArtemLab2();

    @Test
    void checkMinus8() {
        int x = -8;
        String expexted = "не принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkMinus5() {
        int x = -5;
        String expexted = "принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkMinus4() {
        int x = -4;
        String expexted = "принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkMinus3() {
        int x = -3;
        String expexted = "принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkMinus2() {
        int x = -2;
        String expexted = "не принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkMinus1() {
        int x = -1;
        String expexted = "принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkZero() {
        int x = 0;
        String expexted = "принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkPlus1() {
        int x = 1;
        String expexted = "принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkPlus2() {
        int x = 2;
        String expexted = "не принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkPlus4() {
        int x = 3;
        String expexted = "принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkPlus5() {
        int x = 5;
        String expexted = "принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
    @Test
    void checkPlus8() {
        int x = 8;
        String expexted = "не принадлежит";
        String result = lab2.CheckNumberX(x);
        Assertions.assertEquals(expexted, result);
    }
}