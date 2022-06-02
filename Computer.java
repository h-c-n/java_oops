import java.util.*;
class cpu
{  int price;
  class processor
      {int noc;
       String manufacturer;
 void get()
    {
    Scanner in = new Scanner(System.in);  
          System.out.println("Enter the no of cores: ");  
          noc= in.nextInt();  
       System.out.println("Enter the manufacturer: ");  
          manufacturer= in.next();  
    }
void display()
{ System.out.println("number of cores="+noc);
  System.out.print("manufacturer="+manufacturer);
  System.out.println("");
}
      }
 void get1()
{
         Scanner sc = new Scanner(System.in);  
          System.out.println("Enter the no of price: ");  
          price= sc.nextInt();  
}

void display1()
{ System.out.println("Price="+price);}

 static class Ram
   {
    static  public void disp()
      {
        System.out.println("inside static ram");
      }
}
}
class Computer
{public static void main (String arg[])
{
  cpu ob =new cpu();
 cpu.processor ob1=ob.new processor();
 ob1.get();
 ob.get1();
ob1.display();
ob.display1();
cpu.Ram.disp();
}
}