public class multicatchexcep {
    public static void main(String args[]){
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);

            int r[]={10,20,30};
            System.out.println(r[8]);

            //String s="shreya";
            String s=null;
           System.out.println(s.toUpperCase());
        }
        catch(ArithmeticException a){
       System.out.println("cant divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException b){
       System.out.println("array exception");
        }
        catch(Exception e){
       System.out.println("all type exception");
        }

    }
}
