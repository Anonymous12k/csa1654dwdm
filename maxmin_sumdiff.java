import java.util.Scanner;
public class maxmin_sumdiff {
 public static void main(String[] args){
 Scanner v = new Scanner(System.in);
 int n=v.nextInt();
 int[] array = new int[n];
 for(int i=0; i<n; i++) {
 array[i]=v.nextInt();}
 int max = array[0];
 for (int j = 0; j < array.length; j++){
 if (array[j] > max)
 max = array[j];}
 System.out.println("maximum="+max);
 int min = array[0];
 for (int s=0;s<array.length;s++){
 if (array[s]< min)
 min=array[s];}
 System.out.println("minimum="+min);
 System.out.println("addition of max & min="+" "+(max+min));
 System.out.println("subtraction of min & max="+" " +(max-min));
 }
}
