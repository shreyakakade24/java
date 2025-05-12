 class nullexcep {
    public static void main(String args[]){
        String a=null;
        //String b="shreya";
        try{
        System.out.println(a.toUpperCase());
        }
        catch(NullPointerException e)
    //catch(Exception e)both same
        {
            System.out.println("null cant be cased");
        }
        System.out.println("main method closed");
    }
}
