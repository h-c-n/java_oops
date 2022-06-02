import java.util.*;  
class Employee {
    int eNo;
    String eName;
    int eSalary;

    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : "); 
        eNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name : "); 
        eName = sc.nextLine();
        System.out.print("Enter monthly salary : "); 
        eSalary = Integer.parseInt(sc.nextLine());
    }

    public void display(){
        System.out.println("Name : "+ eName );
    }
    public static void main(String args[]){
        int i,n=2,f=0;
        int No;
        Employee emp[] = new Employee[n];
        for(i=0;i<n;i++){
            emp[i] = new Employee();
            emp[i].read();
        }
        System.out.println("Search"); 

            Scanner sc= new Scanner(System.in);
            System.out.print("Enter ID : "); 
            No = Integer.parseInt(sc.nextLine());
            for(i=0;i<n;i++){
                if(emp[i].eNo == No){
                    emp[i].display();
                       f=1;
                 }}
           if(f==0)
System.out.print("employee not found!!! ");        

    }
}