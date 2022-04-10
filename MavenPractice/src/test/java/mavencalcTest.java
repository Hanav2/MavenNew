import static org.junit.Assert.*;

import org.junit.Test;



	import org.junit.Test;

	import com.craft.calculator.CalculatorM;

	import junit.framework.Assert;

	public class mavencalcTest {
		CalculatorM cal = new CalculatorM();
		
		@Test
		public void addTest() {
			Assert.assertEquals(18, cal.addition(10, 8) );
		}
		
		@Test
		public void subTest() {
			Assert.assertEquals(21, cal.subtraction(50, 29));
		}
		@Test
		public void mulTest() {
			Assert.assertEquals(16,cal.multiplication(4, 4));
		}
		@Test
		public void divTest() {
			Assert.assertEquals(15.0, cal.division(30, 2));
		}
	}


