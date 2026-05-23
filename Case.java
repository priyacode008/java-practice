import java.util.*;
class Case{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int a,b,c,ch,n;
        System.out.println("enter the no");
        ch=sc.nextInt();
        System.out.println("enter the a value");
        a=sc.nextInt();
        System.out.println("enter the b value");
        b=sc.nextInt();
        switch(ch)
        {
            case 1:
                c=a+b;
                System.out.println("addition="+c);
                break;
                case 2:
                    c=a-b;
                    System.out.println("subraction="+c);
                    break;
                    case 3:
                        c=a*b;
                        System.out.println("mulitiplication="+c);
                        break;
                        case 4:
                            c=a/b;
                            System.out.println("division="+c);
                            break;
                            case 5:
                                c=a%b;
                                System.out.println("modulo="+c);
                                break;
                                default:
                                    System.out.println("Software developer");
                                    break;
        }
    
                                }
                            }