/**
 * Author: Leensey M. Lawas
 * Program Description: Tester of MyCalc methods nfactorial() and binarySearch()
**/

import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {
	// NOTE: MyCalc.java is a complete copy-paste of MyCalculator.java
	// I cannot make the pulled MyCalculator.java appear in the package
	// so I made a new java class to represent it.	

	@Test
	public void testNfactorial0() {
		MyCalc sol1 = new MyCalc();
		int fact1 =	sol1.nfactorial(0);
		assertSame("Test for 0!: ",1,fact1);
		// correct
	}
	
	@Test
	public void testNfactorial1() {
		MyCalc sol1 = new MyCalc();
		int fact1 =	sol1.nfactorial(1);
		assertSame("Test for 1!: ",1,fact1);
		// correct
	}
	
	@Test
	public void testNfactorialPositive() {
		MyCalc sol1 = new MyCalc();
		int fact1 =	sol1.nfactorial(10);
		assertSame("Test for 10!: ",3628800,fact1);
		// error because of MyCalc line 41
	}	

	@Test
	public void testBinarySearchFoundMiddle() {
		MyCalc sol2 = new MyCalc();
		int[] arr = {1,2,9,30,102};
		int x = 9;
		int res = sol2.binarySearch(arr, x);
		assertSame("Test for x=9 not in arr={1,2,9,30,102} ",2,res);
		// correct
	}
	
	@Test
	public void testBinarySearchFoundLower() {
		MyCalc sol2 = new MyCalc();
		int[] arr = {1,2,9,30,102};
		int x = 1;
		int res = sol2.binarySearch(arr, x);
		assertSame("Test for x=1 not in arr={1,2,9,30,102} ",0,res);
		// correct
	}
	
	@Test
	public void testBinarySearchFoundUpper() {
		MyCalc sol2 = new MyCalc();
		int[] arr = {1,2,9,30,102};
		int x = 30;
		int res = sol2.binarySearch(arr, x);
		assertSame("Test for x=30 not in arr={1,2,9,30,102} ",3,res);
		// correct
	}

}
