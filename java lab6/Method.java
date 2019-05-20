class Methods
{
 public void disp (char c, int num)
{
 System.out.println("Char:" + c+ "  " + " Integer: " + num);
}
 public void didp(int num, char c)
{
 System.out.println("Integer: " + num + " " + " Char: " + c);
}
}
  

  class Lab6Task3
{
  public static void main (String args[])
{
 Method obj=new Method ();
 obj.disp('x' ,2);
 obj.disp(8, 'y');
}
}