 class finallexcep {
  public static void main(String agrs[]){
    try{
        System.out.println("shreya");
        int a=10,b=0,c;
        c=a/b;
        System.out.println(c);
        System.out.println("riya");
    }
    catch(Exception e){
        System.out.println("excepation occered");
    }
    finally{
        System.out.println("raj");//awyas excuted
    }
    System.out.println("main method closed");//abnomal ternmation
  }  
}
