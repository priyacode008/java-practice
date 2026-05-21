import java.util.*;
class Prime{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int  c=0,i,n;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0)
                c++;
    }
             if(c==2){
                System.out.println("prime number");
             }
        else
        {
            System.out.println("not prime number");
        }
    }
}