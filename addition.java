import java.util.*;

class Main{
    public static int addition(int a, int b){
     return a+b;
    }
    
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("ADDITION");

  System.out.println("Enter number 1:");
  int a=sc.nextInt();
  System.out.println("Enter number 2:");
  int b=sc.nextInt();
 
  int ans=addition(a,b);
  System.out.println("Addition of two numbers "+a+"+"+b+"="+ans);

  }
}