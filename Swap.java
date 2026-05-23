import java.util.*;
class Swap{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter the a value");
        a=sc.nextInt();
        System.out.println("enter the b value");
        b=sc.nextInt();
        System.out.println("the swap number :");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}