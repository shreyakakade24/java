import java.util.Arrays; 
import java.util.Scanner; 
 
class NameSorter { 
    private String[] names; 
     
     
    NameSorter(int size) { 
        names = new String[size]; 
    } 
     
 
    void inputNames() { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter 10 names:"); 
        for (int i = 0; i < names.length; i++) { 
            names[i] = scanner.nextLine(); 
        } 
    } 
     
     
    void sortNames() { 
        Arrays.sort(names); 
    } 
     
    
    void displayNames() { 
        System.out.println("\nNames in alphabetical order:"); 
        for (String name : names) { 
            System.out.println(name); 
        } 
    } 
} 
 
public class alphabetical { 
    public static void main(String[] args) { 
        NameSorter sorter = new NameSorter(10); 
        sorter.inputNames(); 
        sorter.sortNames(); 
        sorter.displayNames(); 
    } 
} 