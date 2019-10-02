package es.upm.miw.iwvg.ecosystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before(){
        fraction = new Fraction(1,2);
    }

    @Test
    void testIntInt(){
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        assertEquals(0.5, fraction.decimal(), 10e-5);
    }

    @Test
    void testGetNumerator(){
        assertEquals(1, fraction.getNumerator());
    }

    @Test
    void testGetDenominator(){
        assertEquals(2, fraction.getDenominator());
    }
}