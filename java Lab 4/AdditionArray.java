class AdditionArray
{
 public static void main(String args[])
{
 int sum;
 int a[][]={{1,2},{3,4}};
 int b[][]={{5,6},{7,8}};
 int c[][]=new int[2][2];
 for(int i=0; i<2; i++)
{
 c[i][j]=a[i][j]+b[i][j];
}
}
 for(int i=0; i<2; i++)
{
 for(int j=0; j<2; j++)
{
 System.out.println(c[i][j]);
} 
 }
   }
    
