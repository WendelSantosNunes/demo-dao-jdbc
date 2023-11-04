package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao department = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findAll ===");
		
		List<Department>list = department.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.printf("%n=== TEST 2: seller findById ===%n");
		
		System.out.print("Enter the department id: ");
		Integer idDepartment = sc.nextInt();
		
		Department obj = department.findById(idDepartment);
		
		if(obj != null) {
			System.out.println(obj);
		}else {
			System.out.println("Department not found");
		}
		
		System.out.printf("%n=== TEST 3: seller insert ===%n");
		
		Department newDepartment = new Department(null, "Music");
		
		department.insert(newDepartment);
		
		System.out.println(newDepartment.getId());
		
		System.out.printf("%n=== TEST 4: seller update ===%n");

		Department departmentUpdate = department.findById(2);
		
		departmentUpdate.setName("Game");
		
		department.update(departmentUpdate);

		System.out.println("Update completed");
	
		System.out.printf("%n=== TEST 5: seller delete ===%n");

		System.out.printf("Enter id for delete test: ");
		Integer departmentDeleteId = sc.nextInt();
		
		department.deleteById(departmentDeleteId);;
		System.out.println("Delete completed");

		sc.close();
	}

}
