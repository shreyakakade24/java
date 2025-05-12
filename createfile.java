import java.io.*;
public class createfile {
    public static void main(String[] args) //throws IOException 
    {
        File f=new File("C:\\Users\\Shrishail\\OneDrive\\Desktop\\sample.txt");
        
        // if(f.createNewFile()){
        //     System.out.println("file successfully create");
        // }
        // else{
        //     System.out.println("file alredy exist");
        // }
        try{
          if(f.createNewFile()){
            System.out.println("file successfully create");
        }
        else{
            System.out.println("file alredy exist");
        }
    }
    catch(Exception e)
    {

        System.out.println(e);
    }
    
   
    }
}
