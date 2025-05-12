public class nestedcatch {
    public static void main(String args[]){
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("arethemitic exception");
            try{
                String a=null;
                System.out.println(a.toUpperCase());
            }
            catch(Exception b){
          System.out.println("array exception");
            }
        }
        System.out.println("shreya");
    }
}
