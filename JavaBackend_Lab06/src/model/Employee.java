package model;

import java.util.Scanner;

import exception.InvalidValueException;

public abstract class Employee  implements IEmployee{
	protected static int idCurrent =1 ;
	private int id;
	private String name;
	private Gender gender;
	private float salary;
	public static int getIdCurrent() {
		return idCurrent;
	}
	public static void setIdCurrent(int idCurrent) {
		Employee.idCurrent = idCurrent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) throws InvalidValueException {
		if (salary >0) {
			this.salary = salary;
		}else{
			InvalidValueException invalidValueException = new InvalidValueException();
			throw invalidValueException ;
		}
	}
		
	@Override
	public void inputData() throws InvalidValueException {
		 System.out.println("input name ");
	        this.setName(new Scanner(System.in).nextLine());
	        System.out.println("input gender");
	        int gender = new Scanner(System.in).nextInt();
	        switch (gender){
	            case 1:
	                this.setGender(Gender.NAM);
	                break;
	            case 0:
	                this.setGender(Gender.NU);
	                break;
	            case -1:
	                this.setGender(Gender.KHONG_XAC_DINH);
	        }
	        System.out.println("input salary");
	        this.setSalary(new Scanner(System.in).nextFloat());
		
	}
	@Override
	public void showData() {
		  System.out.println("id :" + this.getId() + "name :" + this.getName() + "gender :" + this.getGender().getName());
		
	}
}
