package class4;

import org.example.class4.usermodule.Calculator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class Calculator3Test {

    @Test
    public void testWithRealObject() {
        // Using the real Calculator
        Calculator calculator = new Calculator();

        int result = calculator.add(10, 2);
         int result2 = calculator.divide(10,5);

        // Assert the result with the real calculation
        assertEquals(12, result);
        assertEquals(2, result2);

    }

    @Test
    public void testWithMockObject() {
        // Using a mock Calculator
        Calculator calculatorMock = Mockito.mock(Calculator.class);

        // Define the behavior of the mock for the add method
        when(calculatorMock.add(5, 3)).thenReturn(8);

        int result = calculatorMock.add(5, 3);
       // int result2 = calculatorMock.divide(10,5);


        // Verify that the mock method was called and returned the expected result
        verify(calculatorMock).add(5, 3);
        assertEquals(8, result);
       // assertEquals(2, result2);

    }

    @Test
    public void testWithSpyObject() {
        // Using a spy on the real Calculator
        Calculator calculator = new Calculator();
        Calculator calculatorSpy = Mockito.spy(calculator);

        // Override the behavior of the real divide method
        doReturn(5).when(calculatorSpy).add(10, 2);

        int result = calculatorSpy.add(10, 2);
        int result2 = calculatorSpy.divide(10,5);

        // Verify that the overridden method was called
        verify(calculatorSpy).add(10, 2);
        assertEquals(5, result);
        assertEquals(2, result2);
    }
}
