import java.util.Scanner; 
 
class Student { 
    int rollNo; 
 
    Student(int rollNo) { 
        this.rollNo = rollNo; 
    } 
} 
 
class Test extends Student { 
    int sub1, sub2; 
 
    Test(int rollNo, int sub1, int sub2) { 
        super(rollNo); 
        this.sub1 = sub1; 
        this.sub2 = sub2; 
    } 
} 
 
class Result extends Test { 
    Result(int rollNo, int sub1, int sub2) { 
        super(rollNo, sub1, sub2); 
    } 
 
    void displayResult() { 
        int total = sub1 + sub2; 
        System.out.println("Roll No: " + rollNo); 
        System.out.println("Marks in Subject 1: " + sub1); 
        System.out.println("Marks in Subject 2: " + sub2); 
        System.out.println("Total Marks: " + total); 
    } 
} 
 
public class MultilevelInheritance { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.println("Enter roll number:"); 
        int rollNo = sc.nextInt(); 
 
        System.out.println("Enter subject 1 marks:"); 
        int sub1 = sc.nextInt(); 
 
        System.out.println("Enter subject 2 marks:"); 
        int sub2 = sc.nextInt(); 
 
        Result student1 = new Result(rollNo, sub1, sub2); 
        student1.displayResult();   
 
        sc.close();   
    } 
} 