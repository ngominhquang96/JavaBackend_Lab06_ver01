package controller;

import java.util.ArrayList;

import exception.InvalidValueException;
import model.Employee;

public interface IEmployeeManage {
	static final int OFFICER = 1;
	static final int WORKER = 2;
	static final int MANAGER = 3;
	
	Employee createEmployee(int indexEmployee);
	ArrayList<Employee> inputListEmployee() throws InvalidValueException;
	void displayEmployee(ArrayList<Employee> listEmployees);
	ArrayList<Employee> searchByIncomeAndGender(int genderCode,ArrayList<Employee>  listEmployees);
	ArrayList<Employee> searchBySalaryAndIndexEmployee(int indexEmployee, ArrayList<Employee> listEmployees);

}
