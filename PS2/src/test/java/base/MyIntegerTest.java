package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestIsEven(){
		MyInteger m1 = new MyInteger(12);
		MyInteger m2 = new MyInteger(15);
		
		assertEquals(true, MyInteger.isEven(6));
		assertEquals(false, MyInteger.isEven(7));
		
		assertEquals(true, MyInteger.isEven(m1));
		assertEquals(false, MyInteger.isEven(m2));
	}
	
	@Test
	public void TestIsOdd(){
		MyInteger m1 = new MyInteger(33);
		MyInteger m2 = new MyInteger(22);
		
		assertEquals(false, MyInteger.isOdd(8));
		assertEquals(true, MyInteger.isOdd(11));
		
		assertEquals(true, MyInteger.isOdd(m1));
		assertEquals(false, MyInteger.isOdd(m2));
		
	}
	
	@Test
	public void TestIsPrime(){
		MyInteger m1 = new MyInteger(3);
		MyInteger m2 = new MyInteger(4);
		
		assertEquals(false, MyInteger.isPrime(9));
		assertEquals(true, MyInteger.isPrime(7));
		
		assertEquals(true, MyInteger.isPrime(m1));
		assertEquals(false, MyInteger.isPrime(m2));
		
	}
	
	@Test 
	public void TestEquals(){
		MyInteger m1 = new MyInteger(17);
		
		assertEquals(false, m1.equals(20));
		assertEquals(true, m1.equals(m1));
		
		
	
	
		
		
	}
		
		
		
	
		
		
		
	
		
				
	}


