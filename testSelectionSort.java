package labpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {
	//@Test
	void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	
	public testSelectionSort() {
	}
	@Test
	void testPositive() {
		  int [] array = {4,2,5,3,1,6,8,7};
		  SelectionSort temporary = new SelectionSort();
	      int[] expected = {1,2,3,4,5,6,7,8};
	      int[] actual = temporary.basicSelectionSort(array);
	      assertArrayEquals(expected, actual);
	}
	@Test
	void testNegative() {
		int [] array = {-4,-2,-5,-3,-1,-6,-8,-7};
		SelectionSort temporary = new SelectionSort();
	    int[] expected = {-8,-7,-6,-5,-4,-3,-2,-1};
	    int[] actual = temporary.basicSelectionSort(array);
	    assertArrayEquals(expected, actual);
	}
	@Test
	void testMixed() {
		int [] array = {-4,0,-5,-3,1,6,8,-7};
		SelectionSort temporary = new SelectionSort();
	    int[] expected = {-7,-5,-4,-3,0,1,6,8};
	    int[] actual = temporary.basicSelectionSort(array);
	    assertArrayEquals(expected, actual);
	}
	@Test
	void testDuplicates() {
		int [] array = {-5,6,8,6,-1,8,-5,-1};
		SelectionSort temporary = new SelectionSort();
	    int[] expected = {-5,-5,-1,-1,6,6,8,8};
	    int[] actual = temporary.basicSelectionSort(array);
	    assertArrayEquals(expected, actual);
	}
}