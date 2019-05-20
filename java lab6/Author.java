class Author
{
 private String name;
 private String email;
 private Char gender;
  public Author(String name, String email,Char gender)
{
 this.name=name;
 this.email=email;
 this.gender=gender;
}
 public String getName()
{
 return name;
}
 public String getEmail()
{
 return email;
}
 public String getGender()
{
 return gender;
}
 public String toString()

 return name+"(" + gender +")at" +email;
}
}
 class UseAuthor
{
 public static void main(String [] args)
{
 Author a1=new Author(" John Bird" , " Johnbird@gamil.com" ," 'M');
  System.out.println(a1);
 a1.setEmail("Johnbird@jamil.com");
  System.out.println(a1);
  System.out.println(" name is:" + a1.getName());
  System.out.println("gender is:"+ a1.getGender());
  System.out.println("Email is:" + a1. getEmail());
}
}
