import java.util.*;
class Num{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int c=0,n;
        System.out.println("enter the digit");
        n=sc.nextInt();
        while(n>0){
            n=n/10;
            c++;
        }
        System.out.println("count="+c);
    }
}