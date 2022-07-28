package features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		
		
		
		List<employee> listOfEmployees=new ArrayList<>();
		
		
		listOfEmployees.add(new employee(1,"chai",88,"M"));
		listOfEmployees.add(new employee(2,"hehe",66,"F"));
		listOfEmployees.add(new employee(3,"sharu",88,"M"));
		listOfEmployees.add(new employee(4,"haha",99,"F"));
		
		
		//display based on gender grouping
		System.out.println(listOfEmployees.stream().collect(Collectors.groupingBy(employee :: getGender)));
		
		
		//display gender based on distinct fields like M F
		
		System.out.println(listOfEmployees.stream().map(x->x.getGender()).distinct().collect(Collectors.toList()));
		System.out.println(listOfEmployees.stream().map(employee :: getGender).distinct().collect(Collectors.toList()));
		
		
		//display number of male and female employees: for example: M -> 2 F -> 2
		Map<String, Long> employeeCount=listOfEmployees.stream().collect(Collectors.groupingBy(employee :: getGender,Collectors.counting()));
		System.out.println(employeeCount);
		 
	}
}
