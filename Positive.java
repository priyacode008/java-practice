import java.util.*;
class Positive{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n,i,pos=0,neg=0,zero=0;
        System.out.println("enter the array size");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array value");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]>0){
                pos++;
            }
              else if(a[i]<0)
              {
            neg++;
            }
               else{
            zero++;
        }

        }
        System.out.println("postive number="+pos);
        System.out.println("negative number="+neg);
        System.out.println("zero="+zero);
    }
}