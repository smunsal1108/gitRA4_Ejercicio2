package com.miempresa.app.modelo;

import java.util.ArrayList;
import java.util.List;

import com.miempresa.app.controlador.Employee;

public class EmployeeManager {

	List<Employee> lista = new ArrayList<Employee>();
	
	/*String[] employeeNames = new String[10];
int[] employeeYears = new int[10];
int numberOfEmployees = 0;*/

public void addEmployee(String name, int years) {
 Employee e1 = new Employee(name, years);
 lista.add(e1);

}
public void printEmployees() {
for (Employee emp : lista) {
	System.out.println(emp);
}
}

public static void main(String[] args) {
EmployeeManager manager = new EmployeeManager();
manager.addEmployee("John Doe", 5);
manager.addEmployee("Jane Smith", 2);
manager.printEmployees();
}
}