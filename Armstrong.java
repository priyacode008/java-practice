import java.util.*;
class Armstrong{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int s=0,t,r,n;
        System.out.println("enter the number");
        n=sc.nextInt();
         t=n;
         while(n>0)
         {
            r=n%10;
            s=s+r*r*r;
            n=n/10;
         }
         if(t==s)
         {
            System.out.println("Armstrong number");
         }
         else
         {
            System.out.println("no armstrong number");
         }
    }

}