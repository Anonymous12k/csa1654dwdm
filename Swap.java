import java.util.*;
class Swap{
static void
swapValuesThirdVariable(int m,int n)
{
int temp=m;
m=n;
n=temp;
System.out.println("value of m is"+m+"and Value of n is"+n);
}
public static void main(String[]args)
{
int m=9,n=5;
swapValuesThirdVariable(m,n);
}
} 