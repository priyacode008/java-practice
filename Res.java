import java.util.*;
class Res{
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        int i;
        String n;
        System.out.println("enter the name");
        n=sc.nextLine();
        String rev="";
        for(i=n.length()-1 ; i>=0 ;i--){
            rev=rev+n.charAt(i);
        }
       System.out.println(rev);
    }
}