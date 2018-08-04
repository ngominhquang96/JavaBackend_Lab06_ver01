package model;

import java.util.Scanner;

import exception.InvalidValueException;

public class Officer extends Employee{
	private float coefficient;
	
	public float getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(float coefficient) throws InvalidValueException {
		if (coefficient >0) {
			this.coefficient = coefficient;
		}else{
			InvalidValueException invalidValueException = new InvalidValueException();
			throw invalidValueException;
		}
		
	}
	
	public Officer(float coefficient) {
		super();
		this.coefficient = coefficient;
	}

	public Officer() {
		super();
	}

	@Override
	public void inputData() throws InvalidValueException {
		 super.inputData(); 
	     System.out.println("input coefficient");
	     this.setCoefficient( new Scanner(System.in).nextFloat());
		
	}

	@Override
	public void showData() {
		 super.showData(); 
         System.out.println("coefficient" + this.getCoefficient());
		
	}

	@Override
	public float income() {
		return (float)this.getSalary() * this.coefficient;
	}

}
