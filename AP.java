import java.io.*;
interface Area
{
 public void area();
public void perimeter();
}
class rectangle implements Area
{ int a=0;
int peri;
 public void area()
{

 a=5*2;
 System.out.println("area="+a);
}
 public void perimeter()
{peri=2*(5+2);
 System.out.println("area="+peri);
}
}

class circle implements Area
{ double a=0;
 double peri;
 public void area()
{

 a=3.14*2*2;
 System.out.println("area="+a);
}
 public void perimeter()
{peri=2*3.14*2;
 System.out.println("area="+peri);
}
}
class AP
{public static void main(String args[])
{
 rectangle r= new rectangle();
r.area();
r.perimeter();
 circle c= new circle();
c.area();
c.perimeter();
}

}