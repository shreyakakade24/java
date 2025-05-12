import java.util.Scanner;

interface client{
    public abstract void input();
    public abstract void output();
}
class raju implements client{
    String name;
    double salary;
    public void input(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter name");
            name=sc.nextLine();
            System.out.println("enter salary");
            salary=sc.nextDouble();
    }
    public void output(){
        System.out.println(name+""+salary);
    }
}
class interfac{
public static void main(String args[]){
    //raju c=new raju();
    client c=new raju();
    c.input();
    c.output();

}
}