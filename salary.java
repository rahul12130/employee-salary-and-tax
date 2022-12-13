class Person {
  int id;
  String name;
  String phone;
  

  Person(int id, String phone, String name) {
    this.id=id;
    this.name = name;
    this.phone= phone;
  }
}

class Employee extends Person {
  
  int emp_salary;

  Employee(int id, String name, String phone, int salary) {
    super(id, phone, name);
    this.emp_salary = salary;
  }


  void printEmployeeDetails() {
    System.out.println("Employee ID     :  " + id);
    System.out.println("Employee Name   :  " + name);
    System.out.println("Employee phone   :  " + phone);
    System.out.println("Employee salary :  "+ emp_salary);
  }

  void printEmployeeDetails(int tax) {
    System.out.println("Employee salary :  "+ (emp_salary-tax));
    System.out.println("Tax deducted :  "+ tax);
  }
}

public class jp1 {
  public static void main(String[] args) {
    Person p = new Person(646, "9686515970", "Rahul Chavan");
    Employee emp = new Employee(646, "9686515970", "Rahul Chavan", 45000);

    emp.printEmployeeDetails();
    emp.printEmployeeDetails(5000);
  }
}
