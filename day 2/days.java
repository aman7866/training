import java.util.scanner;
class InputDayNumber1{
public static void main(string args[])
{
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
switch(dn)
{
case0 : System.out.println("SUNDAY");break;
case1 : System.out.println("MONDAY");break;
case2 : System.out.println("TUESDAY");break;
case3 : System.out.println("WEDNESDAY");break;
case4 : System.out.println("THURSDAY");break;
case5 : System.out.println("FRIDAY");break;
case6 : System.out.println("SATURDAY");break;
default: System.out.println("INVALID");
}
}
}