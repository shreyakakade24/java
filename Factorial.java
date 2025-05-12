 import java.util.*;
 class Factorial{
 public static void main(String []args)
 {
 int number;
 int fact=1;
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter any number :");
 number=sc.nextInt();
for(int i=1;i<=number; i++)
 {
 fact=fact*i;

}
 System.out.println("factorial of given number is:"+ fact);
 }

}

