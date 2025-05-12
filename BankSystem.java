class BankAccount{ 
double balance; 
BankAccount(double currBalance){ 
balance=currBalance; 
} 
 void deposit(double ammount){ 
 if(ammount>0){ 
 balance+=ammount; 
 System.out.println("deposited :"+ammount+"Rs"); 
 } 
 
 } 
 void withdraw(double ammount){ 
  if(ammount>0&& ammount<=balance){ 
  balance-=ammount; 
   System.out.println("withdrawn :"+ammount+"Rs"); 
  }else{ 
    System.out.println("Insufficient balance"); 
  } 
 } 
 void display(){ 
   System.out.println("current balance"+balance); 
 } 
} 
class SavingsAccount extends BankAccount{ 
 public SavingsAccount(double currBalance){ 
  super (currBalance); 
 } 
 void withdraw(double ammount){ 
 if(balance-ammount>=100){ 
  super.withdraw(ammount); 
 }else{ 
  System.out.println("denied ! minium balance should be 100"); 
 } 
 } 
} 
public class BankSystem { 
    public static void main(String[] args) { 
        SavingsAccount myAccount = new SavingsAccount(500); 
        myAccount.display(); 
        myAccount.deposit(200); 
        myAccount.display(); 
        myAccount.withdraw(550); 
        myAccount.display(); 
        myAccount.withdraw(400); 
        myAccount.display(); 
    } 
} 
 