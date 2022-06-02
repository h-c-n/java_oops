import java.util.*;  
class Product {
    int p_code;
    String pname;
    int price;

     void get(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter PCODE: "); 
        p_code = Integer.parseInt(sc.nextLine());
        System.out.print("Enter  product Name : "); 
        pname = sc.nextLine();
        System.out.print("Enter price : "); 
         price = Integer.parseInt(sc.nextLine());
    }
void show()
{
System.out.print(" \nPCODE: "+p_code); 
System.out.print("\nPNAME: "+pname); 
System.out.print("\nPRICE: "+price); 
}
}
class Bill extends Product
{ int quantity;
float bill;
  public void get1(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Quantity: "); 
 quantity = Integer.parseInt(sc.nextLine());
 System.out.println("QUANTITY:"+quantity);
bill=price*quantity;
}
void show1()
{
 
System.out.print("\nQUANTITY: "+quantity); 
System.out.print("\nTOTAL BILL: "+bill); 
}
}
 class PD
{
public static void main(String args[])
{
  Bill ob=new Bill();
ob.get();
ob.get1();
ob.show();
ob.show1();
}}

