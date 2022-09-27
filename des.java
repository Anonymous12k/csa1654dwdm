import .java.util.arrays;
import.java.util.scanner;
import java.util.*;
public class des
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
int n;
System.out.println(" Enter the number of elements");
n=sc.nextint();
String str[]=new String[n];
System.out.println('enter the string");
for(int i=0;i<n;i++)
{
str[i]=sc1.next String[n];
}
Scanner sc2=new Scanner(System.in);
System.out.print("orde(a/d);");
string sta=sc2.nextline();
if(sta.equals("A"))
{
Array.sort(str);
System.out.println(Arrays.toString(str));
}
else
{
Arrays.sort(str,collections.reverseOrder());
System.out.println(Arrays.toString(str));
}
}
}