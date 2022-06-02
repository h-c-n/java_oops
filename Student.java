import java.util.*;  
class Student
{
public static void main(String args[])
{
 Academic ob= new Academic();
 Personal ob1=new Personal();
 
ob1.get1();

ob.get();
ob1.display1();
ob.display();
}
}
class Academic
{
    int p=0;
 void get()
{
   Scanner in = new Scanner(System.in);  
          System.out.print("Enter your percentage: ");  
          p= in.nextInt();  
}
void display()
{System.out.println("percentage="+p);}
}
class Personal
{
    int rollno;
  String name;
 void get1()
{ 
     Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          name = in.nextLine();  
     System.out.print("Enter your rollno: ");  
          rollno=in.nextInt();  
 
}
void display1()
{System.out.println("rollno="+rollno);
System.out.println("name="+name);
}
}
