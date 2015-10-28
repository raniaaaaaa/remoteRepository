package edu.esprit.calculator.test;

import org.junit.Assert;

import edu.esprit.calculator.calculator;

public class calculatorTest {
	public void itSouldRetur10(){
		Long[] params = {1l,2l,3l,4l};
		calculator calc = new calculator();
		Long actual = calc.add(params);
		Long expected = 10l;
		Assert.assertEquals(expected, actual);
		
		}
	}


