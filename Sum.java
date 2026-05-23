import java.util.*;
class Sum{
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        int s=0,n,r;
        System.out.println("enter the dight");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("sum of dight="+s);
    }
}