//java program to input a string
import java.util.*;
public class program205_readstring
{
public static void main(String[]args)
{
System.out.print("Enter your name:");
Scanner sc=new Scanner(System.in);
String n=sc.next();
char ch=n.charAt(1);
System.out.println("welcome"+n+ch);
}
}