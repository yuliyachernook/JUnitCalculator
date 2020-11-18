import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathMethodsTest {

    MathMethods mathMethods;

    @Before
    public void setUp() {
        mathMethods = new MathMethods();
    }

    @Test
    public void SumOfTwoPositiveValuesTest() {
        assertEquals(4.8, mathMethods.sumOfTwoValues(1.2, 3.6),  0.00001);
    }

    @Test
    public void SumOfValueAndMinusValueTest() {
        assertEquals(0, mathMethods.sumOfTwoValues(7.777, -7.777),  0.00001);
    }

    @Test
    public void DifferenceBetweenTwoNegativeValuesTest() {
        assertEquals(1, mathMethods.differenceBetweenTwoValues(-4.55, -5.55),  0.00001);
    }

    @Test
    public void DifferenceWhenFirstValueIsLessThanSecondTest() {
        assertEquals(-0.5, mathMethods.differenceBetweenTwoValues(2.5, 3),  0.00001);
    }

    @Test
    public void MultiplyTwoNegativeValuesTest() {
        assertEquals(8.2, mathMethods.multiplyTwoValues(-4.1, -2),  0.00001);
    }

    @Test
    public void DivisionOfTwoPositiveValuesTest() {
        assertEquals(0.39361, mathMethods.divisionOfTwoValues(2.22, 5.64),  0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void DivideByZeroTest() {
        mathMethods.divisionOfTwoValues(6, 0);
    }

    @Test
    public void ModuloOfTwoValuesTest() {
        assertEquals(1, mathMethods.moduloOfTwoValues(3, 2),  0.00001);
    }

    @Test
    public void SquaringOfNegativeValueTest() {
        assertEquals(9, mathMethods.squaringValue(-3),  0.00001);
    }

    @Test
    public void SinOfPositiveValueTest() {
        assertEquals(0.99, mathMethods.sinOfValue(7.7),  0.01);
    }

    @Test
    public void SinOfNegativeValueTest() {
        assertEquals(-0.99, mathMethods.sinOfValue(-7.7),  0.01);
    }

    @Test
    public void СosOfPositiveValueTest() {
        assertEquals(0.15, mathMethods.cosOfValue(7.7),  0.01);
    }

    @Test
    public void TanOfNegativeValueTest() {
        assertEquals(-0.60, mathMethods.tanOfValue(8.88),  0.01);
    }
}