package day6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultiAndDiv {
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("Before class program started");
	}
	
	@Before
	public void beforMethod(){
		System.out.println("Starting test");
	}
	@Test
	public void testMul() {
		Calculator c= new Calculator();		
		int mul= c.multiplicationMethod(30, 20);
//		assertEquals(30, mul);
		assertEquals(600, mul);
		System.out.println(mul);
		
	}
	@Test
	public void testDiv() {
		Calculator c= new Calculator();		
		int div= c.divisionMethod(40, 20);
//		assertEquals(30, div);
		assertEquals(2, div);
		System.out.println(div);
		
	}
	@After
	public void afterMethod() {
		System.out.println("Ending test");
	}
	@AfterClass
	public static void afterClassMethod() {
		System.out.println("End of the program");
	}


}
