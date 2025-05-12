class r{
  private int value;//data hinding

  public void setvalue(int x)//data abstraction
  {
       value=x;
  
  }
  public int getvalue(){
    //return value;//100
    return ++value;//101
  }
}
class encap{
    public static void main(String args[]){
        r ob=new r();
        ob.setvalue(100);
        System.out.println(ob.getvalue());

    }
}
