package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Employee;
import controller.EmployeeManage;
import exception.InvalidValueException;

public class Menu implements IMenu{

	@Override
	public void showMenuContent() {
		EmployeeManage employeeManage = new EmployeeManage();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		listEmployees = null;
		while(true){
			System.out.println("1. nhap");
            System.out.println("2. Hien");
            System.out.println("3. Tim kiem va sap xep");
            System.out.println("4. Thoat");
            int select = new Scanner(System.in).nextInt();
            switch (select) {
            case 1:
                try {
					listEmployees = employeeManage.inputListEmployee();
				} catch (InvalidValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
                break;
            case 2 : 
            	employeeManage.displayEmployee(listEmployees);
			default:
				break;
			}
		}
		
	}
	
}
