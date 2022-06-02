class Complex{
  
    
    int real, image;
  
  
    public Complex(int r, int i)
    {
        real = r;
        image = i;
    }
  
    
    public void showC()
    {
        System.out.print(real + " +i" +image);
    }

    public static Complex add(Complex n1,
                                    Complex n2)
    {
  
        
        Complex res = new Complex(0, 0);
  
        
        res.real = n1.real + n2.real;
  
    
        res.image = n1.image + n2.image;
  
       
        return res;
    }
  
    public static void main(String arg[])
    {
  
        
        Complex c1 = new Complex(1,2);
        Complex c2 = new Complex(3,4);
   System.out.print("first Complex number: ");
        c1.showC();
          
        System.out.print("\nSecond Complex number: ");
        c2.showC();
  
    
        Complex res = add(c1,c2);
  
        
        System.out.println("\nAddition is :");
        res.showC();
    }
}