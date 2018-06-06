import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testPrint() {
		int array[] = {25,10,5,1};
		assertEquals(5,Greedy.print(array));
	}
	
	@Test
	void testCoins() {
		int[] x = {9,4,2,3};
		assertEquals(18, Greedy.getCoinTotal(x));
	}
	
	@Test 
	void testEmptyArray() {
		int array[] = {};
		Exception e = assertThrows(IllegalArgumentException.class, () -> {  Greedy.calculate(array, 42); } );
		assertEquals("Array of size 0 is not allowed", e.getMessage());
	}
	
	/*@Test
	void testCalculate() {
		assertEquals());
	}*/

}
