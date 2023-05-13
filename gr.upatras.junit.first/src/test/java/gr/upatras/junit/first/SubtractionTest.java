package gr.upatras.junit.first;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SubtractionTest {
	@Test
	void testSub1() {
		assertEquals("POSITIVE", Subtraction.sub(10, 5), "10 - 5 must be 5");
	}
	
	@Test
	void testSub2() {
		assertEquals("NEGATIVE", Subtraction.sub(3, 5), "3 - 5 must be -2");
	}
	
}

