class StaticDemo { 
     
    static int count; 
    
    static { 
        System.out.println("Static block executed!"); 
        count = 10;  
    } 
     
    
    static void displayCount() { 
        System.out.println("Count: " + count); 
    } 
     
  
    void increment() { 
        count++; 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
         
        StaticDemo.displayCount(); 
         
         
        StaticDemo obj1 = new StaticDemo(); 
        StaticDemo obj2 = new StaticDemo(); 
         
        obj1.increment(); //11
        //obj2.increment();//12 
         
        StaticDemo.displayCount(); 
    } 
} 