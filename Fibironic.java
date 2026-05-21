import java.util.*;
class Fibironic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,n,a=0,b=1,s;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            s=a+b;
            a=b;
            b=s;
            System.out.println(s);
        }
    }
}