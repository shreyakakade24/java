import java.io.File;

public class fileinfo {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Shrishail\\OneDrive\\Desktop\\sample.txt");
        if(f.exists()){
            System.out.println("file name:"+f.getName());
            System.out.println("file location:"+f.getAbsolutePath());
            System.out.println("file writable:"+f.canWrite());
            System.out.println("file readble:"+f.canRead());
            System.out.println("file size"+f.length());
            System.out.println("file removed"+f.delete());
        }
        else{
            System.out.println("file doesnt exist");
        }
    }
}
