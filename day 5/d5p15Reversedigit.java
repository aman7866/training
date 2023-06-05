import java.util.Scanner;
public class d5p15Reversedigit
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int rd=0;
System.out.print("Enter a number");
int num=sc.nextInt();
while(num>0)
{
rd=rd*10+(num%10);
num=num/10;
}
System.out.println("The reverse of a number is"+rd);
}
}


