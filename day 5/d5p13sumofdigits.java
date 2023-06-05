import java.util.*;
public class d5p13sumofdigits
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
int sd=0;
System.out.print("enter any positive integer:");
n=sc.nextInt();
while(n>0)
{
sd=sd+n%10;
n=n/10;
}
System.out.println(sd);
}
} 