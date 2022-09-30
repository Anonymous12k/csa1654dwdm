import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
 class alpha
{
public static void main(String[] args)
{
System.out.print("Enter string to reverse:");
Scanner read = new Scanner(System.in);
String str = read.nextLine();
char c[] = str.toCharArray();
Arrays.sort(c);
String n=new String(c);
String reverse = "";
for(int i = n.length() - 1; i >= 0; i--)
{
reverse = reverse +n.charAt(i);
}
System.out.print("Reversed string is:");
System.out.print(reverse);
}
}



OUTPUT:

C:\Users\vigne_gg6a71g\Desktop>java Alpha.java
Enter string to reverse:HYPOTHECATION
Reversed string is:YTTPOONIHHECA
C:\Users\vigne_gg6a71g\Desktop>java Alpha.java
Enter string to reverse:MOSQUE
Reversed string is:USQOME
C:\Users\vigne_gg6a71g\Desktop>java Alpha.java
Enter string to reverse:MATRICULATION
Reversed string is:UTTRONMLIICAA
C:\Users\vigne_gg6a71g\Desktop>java Alpha.java
Enter string to reverse:SATIFICATION
Reversed string is:TTSONIIIFCAA
C:\Users\vigne_gg6a71g\Desktop>java Alpha.java
Enter string to reverse:DEDICATION
Reversed string is:TONIIEDDCA
C:\Users\vigne_gg6a71g\Desktop>


