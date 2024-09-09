package tests;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    public void testMinus() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex c = a.minus(b);
        assertEquals(new Complex(-2, -2), c);
    }

    @Test
    public void testPlusRealPart() {
        Complex a = new Complex(1, 2);
        double b = 5;
        Complex c = a.plusRealPart(b);
        assertEquals(new Complex(6, 2), c);
    }

    @Test
    public void testMinusRealPart() {
        Complex a = new Complex(1, 2);
        double b = 1;
        Complex c = a.minusRealPart(b);
        assertEquals(new Complex(0, 2), c);
    }
}