package controller;

import java.util.ArrayList;
import java.util.Scanner;

import exception.InvalidValueException;
import model.Employee;
import model.Manager;
import model.Officer;
import model.Worker;

public class EmployeeManage implements IEmployeeManage {

	@Override
	public Employee createEmployee(int indexEmployee) {
		switch (indexEmployee){
        case 1:
            return new Officer();
        case 2:
            return new Worker();
        case 3: 
            return new Manager();
        default:
            throw  new AssertionError();
		}
	}

	@Override
	public ArrayList<Employee> inputListEmployee() throws InvalidValueException {
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		System.out.println("Nhap vao so luong nhan vien");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
        	System.out.println("Nhap vao loại nhan vien");
            int indexEmployee = new Scanner(System.in).nextInt();
            Employee e =createEmployee(indexEmployee);
			e.inputData();
            listEmployees.add(e);     
        }   
        return listEmployees;
		
	}

	@Override
	public void displayEmployee(ArrayList<Employee> listEmployees) {
		if( ! listEmployees.isEmpty()){
            for (int i = 0; i < listEmployees.size(); i++) {
                if (listEmployees.get(i) != null) {
                    System.out.println("Nhan vien thu " + i );
                    listEmployees.get(i).showData();
                }
            }
        }
		
	}

	@Override
	public ArrayList<Employee> searchByIncomeAndGender(int genderCode,ArrayList<Employee> listEmployees) {
		ArrayList<Employee> listEmployeeIncome =new ArrayList<Employee>();
		if (!listEmployees.isEmpty()){
            float incomeMax = 0;
            for (int i = 0; i <listEmployees.size(); i++) {
                Employee e =listEmployees.get(i);
                if( e!=null && e.income() > incomeMax && e.getGender().getCode() == genderCode ){
                    incomeMax = e.income();
                }
            }
            for (int i = 0; i <listEmployees.size(); i++) {
                Employee e =listEmployees.get(i);
                if( e!=null && e.income() == incomeMax && e.getGender().getCode() == genderCode ){
                    listEmployeeIncome.add(e);
                }
            }   
        }
		return listEmployeeIncome;
	}
	private int getClassFromObj(Employee employee) {
        if (employee instanceof Manager) {
            return MANAGER;
        }

        if (employee instanceof Officer) {
            return OFFICER;
        }
        return WORKER;
    }

	@Override
	public ArrayList<Employee> searchBySalaryAndIndexEmployee(int indexEmployee, ArrayList<Employee> listEmployees) {
		 ArrayList<Employee> listEmployeeIncomeMax =new ArrayList<Employee>();
		 if (!listEmployees.isEmpty()){
	            float incomeMax =0;
	            for (int i = 0; i <listEmployees.size(); i++) {
	                Employee e =listEmployees.get(i);
	                if( e!=null && e.income() > incomeMax && getClassFromObj(e)==indexEmployee ){
	                    incomeMax = e.income();
	                }
	            }
	            for (int i = 0; i <listEmployees.size(); i++) {
	                Employee e =listEmployees.get(i);
	                if( e!=null && e.income() == incomeMax && getClassFromObj(e)==incomeMax ){
	                    listEmployeeIncomeMax.add(e);
	                }
	            }       
	        }
		return listEmployeeIncomeMax;
	}

}
