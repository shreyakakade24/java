public class nestedtry {
    public static void main(String args[]){
       try{
        try{
            int a[]={10,20,30};
            System.out.println(a[9]);
            }
            catch(Exception e){
                System.out.println("array exception");
            }
            System.out.println(10/0);
        }
        catch(Exception b){
            System.out.println("divied by 0");
        }
         System.out.println("hey");

     }
}

