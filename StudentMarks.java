import java.util.Scanner;
import java.util.Arrays;
public class StudentMarks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String n=sc.nextLine();
        int numOfSub;
        System.out.println("Enter the total subject:");
        numOfSub=sc.nextInt();
        int arr[]=new int[numOfSub];
        System.out.println("Enter the marks obtained in each subject");
        for(int i=0;i<numOfSub;i++)
        {
            arr[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<numOfSub;i++)
        {
            total=total+arr[i];
        }
        System.out.println("The total marks obtained is "+total);
    }

    
}
