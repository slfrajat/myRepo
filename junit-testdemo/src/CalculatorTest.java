import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	@Before
	public void init{
		System.out.println("alled before test case");
	}
	
	@After
	public void callafter() {
		System.out.println();
	}

	@Test
	public void testAddValues() {
		assertEquals(10, new Calculator().addValues(5, 5));
	}

}
