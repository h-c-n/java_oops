import java.util.*;
class Person
{ 
 String name,gender,address;
int age;
 Person(String a,String b,String c,int d)
{
 name=a;
gender=b;
address=c;
age=d;
}
}
class Employee extends Person
{
int empid,salary;
String cname,qualification;
 Employee(String a,String b,String c,int d ,int x,int y,String u,String v)
{ super(a,b,c,d);
   empid=x;
   salary=y;
  cname=u;
qualification=v;
}
}
class Teacher extends Employee
{
 int tid,deptid;
String subject;
Teacher(String a,String b,String c,int d,int e,int f,String m,String n,int i,String j,int k)
{ super(a,b,c,d,e,f,m,n);
 tid=i;
subject=j;
deptid=k;
}
void show()
{
System.out.println("name of student="+name);
System.out.println("gender="+gender);
System.out.println("address="+address);
System.out.println("age="+age);
System.out.println("employeeid="+empid);
System.out.println("salary="+salary);
System.out.println("company name="+cname);
System.out.println("qualification="+qualification);
System.out.println("teacher id="+tid);
System.out.println("subject="+subject);
System.out.println("department="+deptid);
}
}
class Inheritance
{ public static void main(String args[])
{

 Teacher ob[]=new Teacher[3];
  ob[0] = new Teacher("hcn","ekm","female",22,101,50000,"mace","mca",11,"cn",100001);
  ob[1] = new Teacher("rahul","ekm","male",22,102,50000,"nirmala","bca",16,"cpp",100005);
System.out.println("first object");
ob[0].show();
System.out.println("second object");
ob[1].show();
}
}










