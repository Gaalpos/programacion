import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void testAdd() {
		float r = Principal.add(4, 2);
		assertEquals(6, r);
	}

	@Test
	void testAddWithDecimal() {
		float r = Principal.add(3.5f, 0.2f);
		assertEquals(3.7, r, 0.01);
	}

	@Test
	void testGetFirstLetter() {
		char letter = Principal.getFirstCharacterInUpperCase("pepe");
		assertEquals('P', letter);
	}

	@Test
	void testEmptyString() {
		char letter = Principal.getFirstCharacterInUpperCase("");
		assertEquals(0, letter);
	}

	@Test
	void testANullString() {
		char letter = Principal.getFirstCharacterInUpperCase(null);
		assertEquals(0, letter);
	}

	@Test
	void testSumOfArray() {
		float list[] = new float[] { 4, 7, 2 };
		float sum = Principal.sum(list);
		assertEquals(13, sum);

	}

	@Test
	void testSumOfEmptyArray() {
		float list[] = new float[] {};
		float sum = Principal.sum(list);
		assertEquals(0, sum);

	}

	@Test
	void testSumOfNullArray() {
		float list[] = null;
		float sum = Principal.sum(list);
		assertEquals(0, sum);

	}

	@Test
	void testLargestvalue() {
		int list[] = new int[] { 4, 7, 2, 99 };
		int l = Principal.getLargestValue(list);
		assertEquals(99, l);

	}
	
	void testLargestvalueEmpty() {
		int list[] = new int[] { };
		int l = Principal.getLargestValue(list);
		assertEquals(0, l);

	}
	
	@Test
	void testLargestvalueNull() {
		int list[] = null;
		int l = Principal.getLargestValue(list);
		assertEquals(0, l);

	}
	
	@Test
	void testLargestvalueOnevalue() {
		int list[] = new int [] {4};
		int l = Principal.getLargestValue(list);
		assertEquals(4, l);

	}

}
