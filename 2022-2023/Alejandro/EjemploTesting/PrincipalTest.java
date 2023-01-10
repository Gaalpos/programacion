import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void testAddWithIntegers() {
		Principal p= new Principal();
		float r=Principal.add(4,3);
		assertEquals(7, r);
		
	}
	
	@Test
	void testAddWithDecimals() {
		float r=Principal.add(3.5f, 0.2f);
		assertEquals(3.7, r,0.001);
		
		
	}

	@Test
	void testGetFirstLetter() {
		char letter= Principal.getFirstCharacterInUppercase("pepe");
		assertEquals('P', letter);
		
	}
	
	@Test
	void testAEmptyString() {	
		char letter= Principal.getFirstCharacterInUppercase("");
		assertEquals(0, letter);
	}
	
	@Test
	void testANullString() {
		char letter= Principal.getFirstCharacterInUppercase(null);
		assertEquals(0, letter);
		
	}
	
	@Test
	void testSumOfArraySimple(){
		float list[]= new float[] {4,7,2};
		float sum= Principal.sum(list);
		assertEquals(13, sum);
	}
	
	@Test
	void testSumOfEmptyArray(){
		float list[]= new float[] {};
		float sum= Principal.sum(list);
		assertEquals(0, sum);
	}
	
	@Test
	void testSumOfNullArray() {
		float list[]= null;
		float sum= Principal.sum(list);
		assertEquals(0, sum);
	}
	
	@Test
	void testLargest() {
		int[]numberList= new int[] {4,2,14,32,21};
		int largest= Principal.getLargestValue(numberList);
		assertEquals(32, largest);
	}
	@Test
	void testLargestNumberOfEmptyArray() {
	
		int[]numberList= new int[] {};
		int largest= Principal.getLargestValue(numberList);
		assertEquals(0, largest);
	}
	@Test
	void testLargestNumberOfNullArray() {
	
		int[]numberList= null;
		int largest= Principal.getLargestValue(numberList);
		assertEquals(0, largest);
	}
	@Test
	void testLargestNumberIn1Element() {
	
		int[]numberList= new int[] {4};
		int largest= Principal.getLargestValue(numberList);
		assertEquals(4, largest);
	}
}
