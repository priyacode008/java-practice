import java.util.*;
class Pali{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int  i;
        String n;
        System.out.println("enter the name");
        n=sc.nextLine();
        String rev="";
        for(i = n.length()-1; i >=0; i--){
            rev = rev + n.charAt(i);
        }
        if(n.equals(rev)){
            System.out.println("palindrome ");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}