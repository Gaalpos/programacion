package Ejercicios1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {
	

	@Test
	void testmultiplyWithNormalNumbers() {
	Principal app= new Principal();
	int r =app.multiplyWithNormalNumbers(2, 4);
	assertEquals(8,r);
	}
	@Test
	void testmultiplyWithDecimals() {
	Principal app= new Principal();
	float r =app.multiplyWithDecimals(2.5f, 4f);
	assertEquals(10,r);
	}

	@Test
	void testdivideNormalNumbers() {
		Principal app= new Principal();
		int r =app.divideNormalNumbers(4, 2);
		assertEquals(2,r);
	}
	@Test
	void testdivideDecimalNumbers() {
		Principal app= new Principal();
		double r =app.divideDecimalNumbers(2.5, 1);
		assertEquals(2.5,r);
	}

	@Test
	void testGetCAb() {
		Principal app= new Principal();
		String r =app.getCab("casa");
		assertEquals("C",r);
	}

}
