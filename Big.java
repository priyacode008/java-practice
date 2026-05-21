import java.util.*;
class Big{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter the array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array value");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
            int big=a[0];
            int small=a[0];
        for(i=0;i<n;i++){
            if(a[i]>big)
                big=a[i];
            if(a[i]<small)
                small=a[i];
        }
        System.out.println("bigest number="+big);
        System.out.println("smallest number="+small);
    }
}