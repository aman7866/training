import java.util.*;
public class d5p14productdigits
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
int pd=1;
System.out.print("enter any positive integer:");
n=sc.nextInt();
while(n>0)
{
pd=pd*(n%10);
n=n/10;
}
System.out.println(pd);
}
} 