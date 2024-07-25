package day6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class UnitAddition {
	
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("Before class program started");
	}
	
	@Before
	public void beforMethod(){
		System.out.println("Starting test");
	}
//	@Ignore
	@Test
	public void testAdd() {
		Calculator c= new Calculator();
		int sum = c.additionMethod(10, 20);
		
		assertEquals(30, sum);
//		assertEquals(20, sum);
		System.out.println(sum);
	}
	@Test
	public void testSub() {
		Calculator c= new Calculator();
		int sub= c.subractionMethod(30, 20);
//		assertEquals(30, sub);
//		assertEquals(10, sub);
//		assertFalse(sub==20);
		assertTrue(sub==10);
//		assertFalse(sub==10);
		System.out.println(sub);
		
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
