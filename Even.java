import java.util.*;
class Even{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the value");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}