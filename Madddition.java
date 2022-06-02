class Maddition()
{  int i,j,a[5][5],b[5][5],c[5][5];

public static void main (String args[])
{ Scanner in = new Scanner(System.in);  
System.out.println("Enter the elements of first array ");  
 for(i=0;i<5;i++)
for(j=0;j<5;j++)
{
 
 a[i][j]= in.nextInt();  
}
System.out.println("Enter the elements of second array ");  
 for(i=0;i<5;i++)
for(j=0;j<5;j++)
{
 
 b[i][j]= in.nextInt();  
}

for(i=0;i<5;i++)
for(j=0;j<5;j++)
{
 
c[i]=a[i][j]+ b[i][j];
}

for(i=0;i<5;i++)
for(j=0;j<5;j++)
{
 System.out.println("SUM=");
 System.out.println("\n c[i][j]);
 }


}

