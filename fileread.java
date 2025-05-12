import java.io.*;

public class fileread {
   public static void main(String[] args) {
    try{
        FileReader f=new FileReader("C:\\Users\\Shrishail\\OneDrive\\Desktop\\sample.txt");
        try{
            int i;
            while((i=f.read())!=-1){
            System.out.print((char)i);
            }
        }
        finally{
            f.close();
        }
    }
    catch(IOException e){
        System.out.println(e);
    }
   }
}
