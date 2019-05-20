class Area
{
 public void printArea(int x,int y)
{
 System.out.println("Area of Rectangle:");
 System.out.println(z*y);
}
 public void printArea(int x)
{
 System.out.println("Area of Square :");
 System.out.println(z*z);
 }
}
 class Lab6Task4{
 public static void main(String args[])
{
 Area a=new Area();
 a.printArea(9,8); 
 a.printArea(9);
}
}
