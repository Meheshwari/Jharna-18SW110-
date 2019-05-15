class Person{
 String name;
 String qualification;
 public void ShowMsg(){
 this.name="Jharna";
 this.qualification=" Student";
 System.out.println("name is:"+name);
 System.out.println("qualification is:"+qualification);
}
}
 class Student extends Person{
 String rollno;
 int age;
 public void ShowMsg(){
 this.rollno="18SW110";
 this.age= 18;
   System.out.println("rollno is:"+rollno);
   System.out.println("age is:"+age);
}
}
 class Employee extends Person{
 int salary;
 String subject;
 public void ShowMsg(){
 this.salary=40000;
 this.subject= "Maths";
   System.out.println("salary is:"+salary);
   System.out.println("subject is:"+subject);
}
}
 class Ungraduate extends Student{
 String degree;
 public void ShowMsg(){
 this.degree="Null";
  System.out.println("degree is:"+degree);
}
}
  class Graduate extends Student{
 String degree;
 public void ShowMsg(){
 this.degree="BE";
  System.out.println("degree is:"+degree);
}
}

 class Faculty extends Employee{
 String  userid;
 public void ShowMsg(){
 this.userid="18sw110@gamil.com";
 System.out.println("userid is:"+userid);
}
}
 class Master extends Graduate{
 String department;
 public void ShowMsg(){
 this.department="Software Engineering";
 System.out.println("department is:"+department);
}
}
 class Doctoral extends Graduate{
 String phd;
 public void ShowMsg(){
 this.phd="Progamming";
System.out.println("phd is:"+phd);
}
}
  class MainClass{
 public static void main(String args[]){
 Person     p=new  Person();
 Student    s=new  Student();
 Employee   e=new  Employee();
 Ungraduate Un=new Ungraduate();
 Graduate   G =new Graduate();
 Faculty    f=new  Faculty ();
 Master     m=new  Master();
 Doctoral   d=new  Doctoral();
  p.ShowMsg();
  s.ShowMsg();
  e.ShowMsg();
 Un.ShowMsg();
  G.ShowMsg();
  f.ShowMsg();
  m.ShowMsg();
  d.ShowMsg();
}

}


