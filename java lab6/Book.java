class Book{
 private Strin name;
 private Author author;
 private double Price;
 private int qty;
 public Book(String name,Author author, double price,int qty)
{
 this.name=name;
 this.author=author;
 this.price=price ;
 this.qty=qty;
}
 public String getName(){
 return name;
}
 public Author getAuthor(){
 return author;
}
 public double getPrice(){
 return price;
}
 public void setPrice(Double price){
 this.price=price;
}
 public int getQty(){
 return qty;
}
 public void setQty(int qty){
 this.qty=qty;
 }
 public String toString(){
 return "'"+name+"'by"+author;
}
}
 class UseBook{
 public static void main(String[]args)
{
 Author a1=new Author("john Bird", "johnbird@gamil.com", 'M');
 System.out.println(a1);
 Book dummyBook=new Book("java for dumies",a1,9.99,99);
 System.out.println(dummyBook);
 dummyBook.setPrice(8.88);
 dummyBook.setPrice(88);
 System.out.println(dummyBook);
 System.out.println("name is"+dummyBook.getName());
 System.out.println("price is"+dummyBook.getPrice());
 System.out.println("quantity is"+dummyBook.getQty());
 System.out.println("author is"+dummyBook.getAuthor());
 System.out.println("author's name is"+dummyBook.getAuthor().getName()); 
 System.out.println("author's email is"+dummyBook.getAuthor().getEmail());
 System.out.println("author's gender is"+dummyBook.getAuthor().getGender());
 Book moreDummyBook=new Book("java for more dumies", new Author("peter lee","peter@gamil.com",'M'),19.99,8);
 System.out.println( moreDummyBook);
}
}
  
 
 



 



