package com.soap.calculatorservice.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticOperationsService {
	public Double addition(Double operand1, Double operand2) {
		BigDecimal bigDecimalOperand1 = new BigDecimal(operand1.toString());
		BigDecimal bigDecimalOperand2 = new BigDecimal(operand2.toString());
		
		return bigDecimalOperand1.add(bigDecimalOperand2).doubleValue();
	}
	
	public Double substraction(Double operand1, Double operand2) {
		BigDecimal bigDecimalOperand1 = new BigDecimal(operand1.toString());
		BigDecimal bigDecimalOperand2 = new BigDecimal(operand2.toString());
		
		return bigDecimalOperand1.subtract(bigDecimalOperand2).doubleValue();
	}
	
	public Double multiplication(Double operand1, Double operand2) {
		BigDecimal bigDecimalOperand1 = new BigDecimal(operand1.toString());
		BigDecimal bigDecimalOperand2 = new BigDecimal(operand2.toString());
		
		return bigDecimalOperand1.multiply(bigDecimalOperand2).doubleValue();
	}
	
	public Double division(Double operand1, Double operand2) {
		BigDecimal bigDecimalOperand1 = new BigDecimal(operand1.toString());
		BigDecimal bigDecimalOperand2 = new BigDecimal(operand2.toString());
		
		return bigDecimalOperand1.divide(bigDecimalOperand2).doubleValue();
	}	
}
