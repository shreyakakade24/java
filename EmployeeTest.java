import java.util.Scanner;  
class Employee { 
     
String firstName;    
String lastName; 
double salary; 
Employee() { 
firstName = ""; 
lastName = ""; 
salary = 0.0; 
} 
void getInfo() { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter first name: "); 
firstName = sc.nextLine(); 
System.out.print("Enter last name: "); 
lastName = sc.nextLine(); 
System.out.print("Enter monthly salary: "); 
salary = sc.nextDouble(); 
if (salary < 0) { 
salary = 0.0; 
} 
} 
void display() { 
System.out.println("\nEmployee Details:"); 
System.out.println("First Name: " + firstName); 
System.out.println("Last Name: " + lastName); 
System.out.println("Monthly Salary: " + salary); 
System.out.println("Yearly Salary: " + getYearlySalary()); 
} 
double getYearlySalary() { 
return salary * 12; 
} 
void Raise(){ 
salary += salary * 0.10;  
} 
}
 public class EmployeeTest { 
public static void main(String[] args) { 
Employee emp = new Employee(); 
System.out.println("Enter Employee Details:"); 
emp.getInfo(); 
emp.Raise(); 
System.out.println("\nAfter 10% Raise:"); 
emp.display(); 
}  
} 
  
