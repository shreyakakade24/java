// abstract class programing{
//     public abstract void Developer();
    
// }
// class html extends programing{
//    @Override
//    public void Developer(){
     
//       System.out.println("shreya");
//    }
  
// }
// class java extends programing{
//    @Override
//     public void Developer(){
//        System.out.println("riya");
//     }
//  }
//  class abstrmethod{
//     public static void main(String ags[]){
//         programing ob=new html();
//         ob.Developer();//shreya
//         programing ob1=new java();
//         ob1.Developer();//riya
//     }
//  }

// abstract class programing{
//    public abstract void Developer();
//    public abstract void task();
// }
// class html extends programing{
//   @Override
//   public void Developer(){
    
//      System.out.println("shreya");
//   }
//   public void task(){
//    System.out.println("priya");
//   }
// }
// abstract class java extends programing//will be abstract class
// {
//   @Override
//    public void Developer(){
//       System.out.println("riya");
//    }
//    // public void task(){

//    // }
// }
// class abstrmethod{
//    public static void main(String ags[]){
//        programing ob=new html();
//        ob.Developer();
//        ob.task();//shreya
//        //programing ob1=new java();
//        //ob1.Developer();//riya
//    }
// }

abstract class programing{
    public abstract void Developer();
    public abstract void task();
    
}
abstract class html extends programing{
   @Override
   public void Developer(){
     
      System.out.println("shreya");
   }
  
}
class java extends html{
   @Override
    public void task(){
       System.out.println("riya");
    }
 }
 class abstrmethod{
    public static void main(String ags[]){
        programing ob=new java();
        ob.Developer();//shreya
        programing ob1=new java();
        ob1.Developer();//riya
    }
 }