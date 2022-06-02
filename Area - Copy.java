class Shapes
{
 
float area=0;
void area(int a)
{
  area=a*a;
System.out.println("area of square="+area);
}
void area(int l,int b)
{
 area=l*b;
System.out.println("area of rectangle="+area);
}

void area(int l,int b,int c)
{
 area=l*b*c;
System.out.println("area of cuboid="+area);
}
}
class Area
{ public static void main (String args[])
 { Shapes A=new Shapes();
   A.area(2);
  A.area(2,3);
  A.area(2,4,6);

}
}
