import java.util.*;
 public class LabTask1
{
  public static void main(String args[])
{
 int a,b,c;
 Scanner input= new Scanner(System.in);
 System.out.println("Enter Marks: -");
 a=input.nextInt();
 System.out.println("Marks in c++:" + a);
  System.out.println("Enter Marks: -");
 b=input.nextInt();
 System.out.println("Marks in Data Structers:" +b);
 System.out.println("Enter marks");
 c=input.nextInt();
 System.out.println("Marks in opreating System:"+ c);
 int total=300;
 int e=a+b+c;
 float per =(e*100)/300;
 System.out.println("precentage:"+ per);
  
 if(per>90)
{
 System.out.println("Grade A");
 }
 else if(per<90 && per>80)
{

System.out.println("Grade B");
}
 else if(per<79 && per>70)
{
 System.out.println("Grade C");
}
 else if (per<69 && per>60)
{
 System.out.println("Grade D");
}
 else if(per<60)
{
 System.out.println("Grade Fail");
}
 }
  }



 