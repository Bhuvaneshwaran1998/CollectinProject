package arrayList;

public class Employee {
private String empName;
private int empId;
private int empAge;
private int empSalary;
private boolean empIsMale;

public Employee(String empName, int empId, int empAge, int empSalary, boolean empIsMale) {
this.empName = empName;
this.empAge = empAge;
this.empSalary = empSalary;
this.empId = empId;
this.empIsMale = empIsMale;
}

public int getEmpId() {
return empId;
}

public void setEmpId(int empId) {
this.empId = empId;
}

public String getEmpName() {
return empName;
}

public void setEmpName(String empName) {
this.empName = empName;
}

public int getEmpAge() {
return empAge;
}

public void setEmpAge(int empAge) {
this.empAge = empAge;
}

public int getEmpSalary() {
return empSalary;
}

public void setEmpSalary(int empSalary) {
this.empSalary = empSalary;
}

public boolean getIsEmpIsMale() {
return empIsMale;
}

public void setEmpIsMale(boolean empIsMale) {
this.empIsMale = empIsMale;
}

public String toString() {
return empName + " " + empId + " Emp age : " + empAge + " " + empSalary + " " + empIsMale;
}
}
