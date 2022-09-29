import java.util.*;

public class day32{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.print("Enter the String :");
			String str=lol.nextLine();
			int c=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>=97 && str.charAt(i)<=122 || str.charAt(i)<=90 && str.charAt(i)>=65 || str.charAt(i)>=48 && str.charAt(i)<=57){
					continue;
				}	
				else{
					System.out.println(str.charAt(i)+",");
					c++;
				}
			}
			System.out.println("No of Special Characters Present In Given Line :"+c);
			
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input....");
		}
	}
}