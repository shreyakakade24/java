import java.util.*;
class Ascending{
static void order_ascen(int arr[], int n){
for(int turn=0; turn<n-1;turn++){
for(int i=0;i<n-1;i++){
if(arr[i]>arr[i+1])
{
int temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}//if
}//for
}//for
}//fun
static void print_array(int arr[],int n){
System.out.println("Ascending order is :");
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}//for
}//fun
public static void main(String []args){
Scanner sc=new Scanner (System.in);
System.out.println("enter size of array:");
int n=sc.nextInt();
int []arr=new int[n];
System.out.println("enter the elements of array:");
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
order_ascen(arr, n);
print_array(arr,n);
}//main
}//class
