import java.util.*;
class Apt{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0,i;
    System.out.println("enter the String" );
    String s=sc.nextLine();
    for(i=0;i<s.length();i++){
        if(s.charAt(i)=='a'){
            a++;
        }
        else if(s.charAt(i)=='b'){
            b++;
        }
        else
        {
            c++;
        }
    }
    System.out.println("a count="+a);
      System.out.println("b count="+b);
        System.out.println("c count="+c);
    }
}