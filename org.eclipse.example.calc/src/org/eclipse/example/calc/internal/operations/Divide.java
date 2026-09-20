package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;


/**
 * Binary Divide Operation
 */
public class Divide extends AbstractOperation implements BinaryOperation {
	
	@Override
	public float perform(float arg1, float arg2) {
		if (arg2 == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		
		return arg1 / arg2;
	}
	
	@Override
	public String getName() {
		return "/";
	}
}
