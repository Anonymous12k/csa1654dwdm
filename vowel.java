import java.util.Scanner;
public class Counting
{
public static void main(String args[])
{
int count = 0;
System.out.println("Enter a sentence :");
Scanner sc = new Scanner(System.in);
String sentence = sc.nextLine();
for (int i=0 ; i<sentence.length(); i++)
{
char ch = sentence.charAt(i);
if(ch == 'a'||ch == 'A'||ch == 'e'||ch == 'E'||ch == 'i' ||ch == 'I'||ch == 'o' ||ch == 'O'||ch == 'u'||ch =='U')
{
count ++;
}
}
System.out.println("Number of vowels in the given sentence is "+count);
}
}
