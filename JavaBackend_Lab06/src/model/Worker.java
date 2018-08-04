package model;

import java.util.Scanner;

import exception.InvalidValueException;

public class Worker extends Employee {
	private int numberOfWorkDay;
	
	public int getNumberOfWorkDay() {
		return numberOfWorkDay;
	}

	public void setNumberOfWorkDay(int numberOfWorkDay) throws InvalidValueException {
		if (numberOfWorkDay>0) {
			this.numberOfWorkDay = numberOfWorkDay;
		}else{
			InvalidValueException invalidValueException = new InvalidValueException();
			throw invalidValueException;
		}
	}

	public Worker(int numberOfWorkDay) {
		super();
		this.numberOfWorkDay = numberOfWorkDay;
	}

	public Worker() {
		super();
	}

	@Override
	public float income() {
		return (float)this.getSalary()*this.numberOfWorkDay/26;
	}

	@Override
	public void inputData() throws InvalidValueException {
		super.inputData();
		System.out.println("input Number Of WorkDays");
        this.setNumberOfWorkDay(new Scanner(System.in).nextInt());
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("Number Of WorkDays: " + this.getNumberOfWorkDay());
	}
	
	
	

}
