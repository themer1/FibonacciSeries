package com.umr.fib.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.umr.fib.main.FibGenerator;
import static org.hamcrest.CoreMatchers.is;


public class FibGeneratorTest {
	FibGenerator fibGenerator;
	
	@Before
	public void setup() {
		fibGenerator = new FibGenerator();
	}

	@Test
	public void test_WhenIndex2IsPassed_GetsSecondNumberInFibonaciSeries() {		
		int result = fibGenerator.getNumberInSeries(2);
		assertThat(result, is(1));
	}
	
	@Test
	public void test_WhenIndex3IsPassed_GetsThirdNumberInFibonaciSeries() {		
		int result = fibGenerator.getNumberInSeries(3);
		assertThat(result, is(2));
	}
	
	@Test
	public void test_WhenIndex4IsPassed_GetsFourthNumberInFibonacciSeries() {		
		int result = fibGenerator.getNumberInSeries(4);
		assertThat(result, is(3));
	}
	
	@Test
	public void test_WhenIndex10IsPassed_GetsTenthNumberInFibonacciSeries() {		
		int result = fibGenerator.getNumberInSeries(10);
		assertThat(result, is(55));
	}
	
	@Test	
	public void test_When7IsPassed_GetsSeventhNumberInFibonacciSeries() {		
		int result = fibGenerator.getNumberInSeries(7);
		assertThat(result, is(13));
	}

}
