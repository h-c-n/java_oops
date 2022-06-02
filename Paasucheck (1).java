import java.util.Scanner;
import java.io.*;
class Validcheck extends Exception
{
   Validcheck(String s)
    {  super(s);
  //super();
    }
}
class Paasucheck
{ 
  public static void main(String str[])
  { 
     
     try{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a username");
                  String uname=s.nextLine();
                  System.out.println("Enter a password");
                  int pass=s.nextInt();
                
        Check(pass,uname);
       }catch(Validcheck n)
         {System.out.println("Denied ...> " +n);
        }
  }
  static void Check(int x,String u) throws Validcheck{
      
    
      if((x!=1234)&&(u!="hcn"))
			
   throw new Validcheck("incorrect password and username");
      else
      System.out.println("success");
     
          
    }
}     

