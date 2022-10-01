import java.util.*;
import java.io.*;
public class org extends Thread{
	public void run(){
		try{
		int a=0,b=1,n;
		Scanner obj=new Scanner(System.in);
		System.out.print("enter the no of terms : ");
		n=obj.nextInt();
		if(n<=0)
			System.out.println("invalid.............");
		else{
		System.out.print("\n"+a+" "+b+" ");
		for(int i=3;i<=n;i++){
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		}
		}
		catch(Exception a){
			System.out.println("invalid...............");
		}
	}
}
