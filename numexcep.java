 class numexcep {
    public static void main(String args[]){
    
        String b="shreya";
        int a;
        try{
            a=Integer.parseInt(b);
        System.out.println(a);
        }
        catch(NumberFormatException e)
   
        {
            System.out.println("string "+b+" cant be coverted into integer");
        }
        System.out.println("main method closed");
    }
}
