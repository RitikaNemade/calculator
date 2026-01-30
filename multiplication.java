import java.util.*;

class Multiplication{

    public static int multiply(int a, int b){
        return a*b;
    }

public static void main(String[]args){

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter first Number: ");
    int a=sc.nextInt();
    System.out.println("Enter second Number: ");
    int b=sc.nextInt();

    int ans=multiply(a,b);
    System.out.println("Answer (Multiplication): "+ans);
    sc.close();

}

}
