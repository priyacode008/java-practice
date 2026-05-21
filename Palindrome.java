import java.util.*;
class Palindrome{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n,r,rev=0,t;
        System.out.println("enter the number");
        n=sc.nextInt();
        t=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(t==rev){
            System.out.println("palindrome number");
        }
            else
                {
                System.out.println("not palindrome number");
            }
    }
}