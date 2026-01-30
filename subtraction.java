import java.util.*;

class Subtraction{
 public static int subtraction(int a,int b){
   int sub=a-b;
   return sub;
 }

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int a=sc.nextInt();
    System.out.println("Enter second number");
    int b=sc.nextInt();
    int sub=subtraction(a,b);
    System.out.println("Subtraction of the two numbers: "+sub);

}
}