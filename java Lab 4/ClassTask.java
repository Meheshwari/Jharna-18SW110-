import java.util.Scanner;
class ClassTask
{
 public static void main(String args[])
{
 Scanner Sc =new Scanner(System.in);
 System.out.print("enter table=");
 int tab =Sc.nextInt();
 System.out.print("enter STARTING POINT=");
 int sp=Sc.nextInt();
 System.out.print("enter and point= ");
 int ep= Sc.nextInt();
 int result;
 for(int i=sp; i<= ep; i++)
{
 result=tab*i;
System.out.println(tab+ "x" + i+ "="+result);
}
 }
 }
