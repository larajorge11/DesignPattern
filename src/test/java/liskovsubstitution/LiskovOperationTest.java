package liskovsubstitution;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LiskovOperationTest {

    private Calculator calculator;
    private SumOperation sumOperation;
    private MultOperation multOperation;

    @Before
    public void setUp() {
        calculator = new Calculator();
        sumOperation = new SumOperation();
        multOperation = new MultOperation();

        sumOperation.setOperator1(23.0);
        sumOperation.setOperator2(5.0);

        multOperation.setOperator1(6.0);
        multOperation.setOperator2(4.0);
    }

    @Test
    public void testSumOperation() {
        double result = calculator.calcular(sumOperation);
        assertThat(result, is(28.0));
    }

    @Test
    public void testMultOperation() {
        double result = calculator.calcular(multOperation);
        assertThat(result, is(24.0));
    }
}
