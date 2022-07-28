package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.employee;

public class tes {

	public static void main(String[] args) {
	
		
		List<employee> listOfEmployees=new ArrayList<>();
		
		Map<String, Integer> hashMap=new HashMap<>();
		
		listOfEmployees.add(new employee(1,"chai",88,"M"));
		listOfEmployees.add(new employee(2,"hehe",66,"F"));
		listOfEmployees.add(new employee(3,"sharu",88,"M"));
		listOfEmployees.add(new employee(4,"haha",99,"F"));
			
		//sorting list based on the employee age
		Collections.sort(listOfEmployees, new ListComparator());
		System.out.println(listOfEmployees);
		
		hashMap.put("a",8);
		hashMap.put("b", 6);
		hashMap.put("c", 8);
		hashMap.put("d", 16);
		hashMap.put("e", 46);
		
		
		
		
		//sort hashmap based on the value and print the value
		
		hashMap.entrySet().stream().sorted((e1,e2)-> e1.getValue().compareTo(e2.getValue())).forEach(System.out::println);
		
		
		
	}
}
