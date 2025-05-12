 abstract class Shape{ 
 double dim1,dim2; 
 Shape(double d1,double d2){ 
  dim1=d1; 
  dim2=d2; 
 } 
 abstract double area(); 
} 
class rectangle extends Shape{ 
 rectangle(double a ,double b){ 
  super(a,b); 
 } 
 double area(){ 
  return dim1*dim2; 
 } 
} 
class triangle extends Shape{ 
 triangle(double a, double b){ 
  super(a,b); 
 } 
  double area(){ 
    return 0.5*dim1*dim2; 
  } 
} 
class abstractDemo{ 
 public static void main(String []args){ 
 
  rectangle r= new rectangle(4,7.55); 
  triangle t =new triangle(10.44,9); 
  Shape s1; 
  s1=r; 
  System.out.println("area of rectangle is :" + s1.area()); 
  s1=t; 
  System.out.println("area of triangle is :" + s1.area()); 
   
 } 
 
} 