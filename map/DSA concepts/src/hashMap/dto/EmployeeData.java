package hashMap.dto;

import java.util.ArrayList;

public class EmployeeData {

	
	public static ArrayList<Employee> empList() {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "Purna", "Brahma", "Sahu", "IT", "BAM"));
		list.add(new Employee(2, "Rina", "Rani", "Sahu", "Govt", "BAM"));
		list.add(new Employee(3, "Bhikari", "Charana", "Sahu", "Govt", "Odisha"));
		list.add(new Employee(4, "Aswini", "Kumar", "Sahu", "IT", "BAM"));
		list.add(new Employee(5, "Srikanta", "Kumar", "Sahu", "LIC", "BAM"));
		list.add(new Employee(6, "Rama", "Hari", "Sahu", "Retired", "Odisha"));
		
		return list;
	}
}
