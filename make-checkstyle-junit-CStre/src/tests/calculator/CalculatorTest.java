package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest
{

	private Calculator calc;
	
	@BeforeEach
	public void beforeEach()
	{
		calc = new Calculator();
	}
	
	@Test
	public void testConstructor()
	{
		assertNotNull(calc);
	}

	@Test
	public void testCalculate()
	{
		double ans1 = 25;
		double ans2 = 5;

		assertEquals(ans1, calc.calculate("5 + 4 * (10 / 2)"));
		assertEquals(ans2, calc.calculate("20 / 5 - 1"));


	}
}
