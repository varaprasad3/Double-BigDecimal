package com.wissen.task;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalTask {
	public static void main(String[] args) {
		Double d = 12345.123456;
		int precission = 25;
		int scale = 5;
		
		Double expectedOutput = 12345.12346 ;

		// rounding of number using BigDecimal

		// setting precession and scale to the bigdecimal and used roundingMode.DOWN enumerator
	
		BigDecimal bigDecimal1 = new BigDecimal(d).round(new MathContext(precission)).setScale(scale, RoundingMode.DOWN);
		System.out.println(bigDecimal1); // 12345.12345

		// setting precession and scale to the bigdecimal and used roundingMode.UP enumerator	
		BigDecimal bigDecimal2 = new BigDecimal(d).round(new MathContext(precission)).setScale(scale, RoundingMode.UP);
		System.out.println(bigDecimal2); // 12345.12346
		
		//comparing the result and printing the output
		System.out.println(bigDecimal2.equals(new BigDecimal("12345.12346")));
		
		

	}
}
