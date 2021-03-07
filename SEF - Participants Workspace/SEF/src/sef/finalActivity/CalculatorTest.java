import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void getSum() {
        int a = 1;
        int b = 100;
        assertEquals(101, (calculator.getSum(a,b)));
        assertEquals(101, (calculator.getSum(b,a)));

        a = -1;
        b = 100;
        assertEquals(99, (calculator.getSum(a,b)));
        assertEquals(99, (calculator.getSum(b,a)));

        a = -10;
        b = -15;
        assertEquals(-25, (calculator.getSum(a,b)));
        assertEquals(-25, (calculator.getSum(b,a)));
    }

    @Test
    public void getDifference() {
        int a = 5;
        int b = 3;
        assertEquals(2, (calculator.getDifference(a,b)));
        assertEquals(-2, (calculator.getDifference(b,a)));

        a = 7;
        b = -2;
        assertEquals(9, (calculator.getDifference(a,b)));
        assertEquals(-9, (calculator.getDifference(b,a)));

        a = -15;
        b = -10;
        assertEquals(-5, (calculator.getDifference(a,b)));
        assertEquals(5, (calculator.getDifference(b,a)));
    }

    @Test
    public void getProduct() {
        double a = 8;
        double b = 9;
        assertEquals(72, (calculator.getProduct(a,b)),0);
        assertEquals(72, (calculator.getProduct(b,a)),0);

        a = -9;
        b = 10;
        assertEquals(-90, (calculator.getProduct(a,b)),0);
        assertEquals(-90, (calculator.getProduct(b,a)),0);

        a = -7;
        b = -5;
        assertEquals(35, (calculator.getProduct(a,b)),0);
        assertEquals(35, (calculator.getProduct(b,a)),0);
    }

    @Test
    public void getQuotient() {
        double a = 20;
        double b = 10;
        assertEquals(2, (calculator.getQuotient(a,b)),0);
        assertEquals(0.5, (calculator.getQuotient(b,a)),0);

        a = 18;
        b = -6;
        assertEquals(-3, (calculator.getQuotient(a,b)),0);
        assertEquals(-0.33, (calculator.getQuotient(b,a)),0.007);

        a = -20;
        b = -10;
        assertEquals(2, (calculator.getQuotient(a,b)),0);
        assertEquals(0.5, (calculator.getQuotient(b,a)),0);
    }
}