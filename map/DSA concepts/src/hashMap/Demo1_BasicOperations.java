package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import hashMap.dto.Employee;
import hashMap.dto.EmployeeData;

public class Demo1_BasicOperations {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// 1. manually add data
		hm.put(1, "Purna Sahu");
		hm.put(2, "Brahma Sahu");
		hm.put(3, "Sahu");
		hm.put(3, "Sahu...");
		
		System.out.println(hm);
		
		
		// 2. fetch value using key
		String name = hm.get(3);
		System.out.println(name);
		
		// 3. check availability
		System.out.println(hm.containsKey(4));
		System.out.println(hm.containsValue("Purna Sahu"));
		
		
		// 4. Iterate HashMap 
		
			// a. traditionally -> 1st we need all key values
			Set<Integer> keys = hm.keySet();
			for(int key : keys) {
				System.out.print(hm.get(key)+" --- ");
			}
			System.out.println();
		
			// b. iterate each entry in HashMap
			Set<Map.Entry<Integer, String>> entries = hm.entrySet();
			// Entry<Integer, String> entry;
			for(Map.Entry<Integer, String> entry : entries) {
				System.out.println(entry.getKey()+"-> "+entry.getValue());
			}
			
		// 5. remove from HashMap
		System.out.println("deleted name: "+hm.remove(3));
		boolean status = hm.remove(2,"Purna");
		System.out.println(status);
		
		// 6. Change/modify values in HashMap
		Map<Integer, String> hMap = new HashMap<>();
		
			// a. insertion & modification can be done
			List<Employee> empData = EmployeeData.empList();
			for(Employee emp : empData) {
				hMap.put(emp.getId(),emp.toString());
			}
			//modification also allowed
			System.out.println(hMap);
			if(hMap.containsKey(6)){
				hMap.put(6, new Employee(6, "Rashmi", "Ranjan", "Sahu", "CSE", "BAM").toString());
			}
			System.out.println(hMap);
			
			
			// b. only insertion allowed strictly
			hMap.putIfAbsent(6, new Employee(6, "Rashmi", "Ranjan", "Sahu...", "CSE", "BAM").toString());
			hMap.putIfAbsent(7, new Employee(7, "Aisha", "", "Sahu", "School", "BAM").toString());
			System.out.println(hMap);
			
		// c. compute() -> 2 things to remember
		// 1. the key exist or not doesn't matter the lambda expression will execute at any cost
		// 2. once the compute() executes, it returns the value as output, if the value is NULL then that entry will removed from Map, automatically.
		String response = hMap.compute(6, (k, v)-> v==null && v.isEmpty() ? "something went wrong with this entry in HashMap" : 
			"Employee Obj exist but as a String");
		System.out.println(response);
			
			
		// d. computeIfAbsent() -> very important
			//1. Make a dictionary for words given or group words based on their 1st letter
			Map<Character, List<String>> m1 = new HashMap<>();
			List<String> words = List.of("Purna", "pure", "Sahu", " ", "keys", "kunu", "sahu Rina", " ");
			for(String word : words) {
				m1.computeIfAbsent(word.toUpperCase().charAt(0), key -> new ArrayList<String>()).add(word);
			}
			System.out.println(m1);
			
	}	
}
