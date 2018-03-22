package demoEmpList;

import java.util.ArrayList;

public class mainClass {

	public static void main(String[] args) {

		ArrayList <employee>Emps = new ArrayList<>();
		employee e1 = new employee("Ab","AB1", 5000);
		employee e2 = new employee("Abc","Abc1", 8000);
		employee e3 = new employee("Abcd","Abcd1", 10000);
		Emps.add(e1);
		Emps.add(e2);
		Emps.add(e3);
		
	//Ways of getting desired result of employee whose salary is 10000.
		
		//1. Lambda Expressions
		System.out.println("Result using Lambda Expression:");
		System.out.println(Emps.stream().filter(x->x.Sal==10000).findFirst().get().Name);
		System.out.println(Emps.stream().filter(o->o.Name.equals("Ab")).findFirst().get().Sal);
	
	//2. For loop of objects
		System.out.println("Result using For loop of Objects:");
		for(Object object : Emps) {
			employee e = (employee)object;
			if(e.Sal==10000) {
				System.out.println(e.Name);
				System.out.println(e.ID);
				System.out.println(e.Sal);
				break;
			}
		} 
	}

}
