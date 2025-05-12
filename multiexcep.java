public class multiexcep {
    public static void main(String args[]){
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);

        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            int a[]={ 10,20,30,40};
            System.out.println(a[5]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("main closed");

    }
}
