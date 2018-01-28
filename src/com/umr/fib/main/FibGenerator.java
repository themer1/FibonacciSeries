package com.umr.fib.main;

public class FibGenerator {
	private static final int MIN_VALUE_FOR_FIB = 1;
	
	public int getNumberInSeries(int index) {		
		return getNumberInSeries(index, MIN_VALUE_FOR_FIB, MIN_VALUE_FOR_FIB);
	}
	
	private int getNumberInSeries(int index, int currentNumber, int lastNumber) {
		if (index <= 2) {
			return currentNumber;
		}
		else {
			return getNumberInSeries(--index, currentNumber+lastNumber, currentNumber);
		}
	}
}
