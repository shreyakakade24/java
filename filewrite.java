
import java.io.*;
public class filewrite {
    public static void main(String[] args) {
     try{
        FileWriter f=new FileWriter("C:\\Users\\Shrishail\\OneDrive\\Desktop\\sample.txt");
        try{
            f.write("hello guys");

        }
        finally{
            f.close();
        }
          System.out.println("file data has been wrote");
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}
