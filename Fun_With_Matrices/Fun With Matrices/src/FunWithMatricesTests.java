import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FunWithMatricesTests {

	@Test
	void testshiftUpSimple() {

		// Create a test array
		int[][] input = Arrays.copyOf(Main.MATRIX_1,Main.MATRIX_1.length);		
		String expected = "[[1, 1, 1], [2, 2, 2], [3, 3, 3]]";		
		Main.shiftUp(input);
		assertEquals(expected, Arrays.deepToString(input));

	}
	
	@Test
	void testshiftUpOneRow() {

		// Create a test array
		int[][] input = {{3, 3, 3}};		
		String expected = "[[3, 3, 3]]";		
		Main.shiftUp(input);
		assertEquals(expected, Arrays.deepToString(input));

	}	

}
