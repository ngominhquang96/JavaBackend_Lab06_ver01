package model;

import java.util.Scanner;

import exception.InvalidValueException;

public class Manager extends Employee {
	
	private int numberEmployee;

	public int getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) throws InvalidValueException {
		if (numberEmployee >0) {
			this.numberEmployee = numberEmployee;
		}else{
			InvalidValueException invalidValueException = new InvalidValueException();
			throw invalidValueException;
		}
	}

	public Manager(int numberEmployee) {
		super();
		this.numberEmployee = numberEmployee;
	}

	public Manager() {
		super();
	}

	@Override
	public float income() {
		if ( this.numberEmployee <10 ){
            return (float)this.getSalary() + 500;
        }else {
            if( this.numberEmployee < 20)
                return (float)this.getSalary() + 1000;
            else
                return (float)this.getSalary() + 2000;
        }
	}

	@Override
	public void inputData() throws InvalidValueException {
		super.inputData();
		System.out.println("input Number Employee");
        this.setNumberEmployee(new Scanner(System.in).nextInt());
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("Number Employee" + this.getNumberEmployee());
	}
	

}
