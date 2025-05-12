class excep1{
    public static void main(String agrs[]){
        System.out.println("main method started");
        int a=10,c;
        int b=0;
       try{
        c=a/b;//exception occur
        System.out.println(c);
       }
       catch(Exception e){
          System.out.println(e);
        // System.out.println("cant divide by 0");
       }
       System.out.println("main method closed");
    }
}