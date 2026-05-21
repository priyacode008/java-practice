import java.util.*;
class Factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,n,s=1;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            s=s*i;
        }
            System.out.print(s);
    }
}