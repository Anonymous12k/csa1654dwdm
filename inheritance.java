import java.util.*;
   class student{
    public  int roll(){
       
            Scanner a=new Scanner(System.in);
            System.out.println("Enter the roll number");
            int roll_no=a.nextInt();
            a.close();
            return roll_no;
    }
            
        
    }
   class test extends student{
        public  int integer_marks(){
            Scanner a=new Scanner(System.in);
            System.out.println("enter the no of sub");
            int n=a.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the marks");
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=a.nextInt();
                sum=sum+arr[i];
            }
            a.close();
            return sum;


        }
    }
     class result extends test{
        public  void result1(){
            test ob=new test();
            int sum=ob.integer_marks();
            System.out.println("total marks: "+sum);
            System.out.println("roll no: "+ob.roll());


        }

    }
    class inheritance{
        public static void main(String[] args){
            result ob=new result();
            
            ob.result1();
    
        }
    }
