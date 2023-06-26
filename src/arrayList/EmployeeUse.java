package arrayList;

import java.util.ArrayList;

public class EmployeeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee("ABC", 101, 20, 20000, true);
		Employee employee2 = new Employee("DEFx", 102, 27, 24000, true);
		Employee employee3 = new Employee("GHIyz", 103, 29, 40000, false);
		Employee employee4 = new Employee("IJ", 104, 23, 350000, false);
		Employee employee5 = new Employee("LMNcdd", 105, 26, 25000, true);
		Employee employee6 = new Employee("OPQa", 106, 24, 19000, true);

		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);

		Employee employee =employee1;
		
		int min = employees.get(0).getEmpId();

		for(Employee x:employees){
		if(x.getEmpId()<min) {
		min=x.getEmpId();
		employee=x;}
		};

		System.out.println(employee);
System.out.println(".......");
		
		String a = "", b = "";
		 int min1 = employees.get(0).getEmpName().length();
		 int max = 0;
		 
		 for (int i = 0; i < employees.size(); i++) {
		 System.out.println(employees.get(i).getEmpName());
		
		 if(employees.get(i).getEmpSalary()>20000) {
		 System.out.println(employees.get(i).getEmpName());
		 }
		 
		 if (employees.get(i).getEmpAge() > max) {
		 max = employees.get(i).getEmpAge();
		 a = employees.get(i).getEmpName();
		 }
		 
		 if (employees.get(i).getEmpName().length() < min1) {
		 min1 = employees.get(i).getEmpName().length();
		 b = employees.get(i).getEmpName();
		 }
		 }
		 System.out.println("shortest name: " + b);
		 System.out.println("senior employee: " + a);

		 
		 
		// Foreach lambda
		 employees.forEach(x -> {
		 if (x.getEmpAge() >= 18) {
		 System.out.println(x.getEmpName());
		 }
		 });
		 for(Employee e:employees) {if(e.getIsEmpIsMale()==false) {
		 System.out.println(e.getEmpName());
		 }
		 }
		
		 for(int i=0;i<employees.size();i++) {
		 if(employees.get(i).getIsEmpIsMale()==false) {
		 System.out.println(employees.get(i));
		 }
		}
	
		 employees.forEach(x->{if(x.getEmpName().charAt(0)=='A'){System.out.println(x.getEmpName());}});
		// for each lambda
		 employees.forEach(x->System.out.println(x));
		// for enhanced
		 
		 for(Employee e:employees) {
		 System.out.println(e.getEmpAge());
		 }
	}
}

