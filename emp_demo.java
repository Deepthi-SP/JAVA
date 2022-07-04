import java.sql.Date;
import java.util.Scanner;

class employee
{
    int Ssn;
    String  Name;
    int Salary;
    String  Dob;
    employee(int Ssn, String Name, int Salary,String  Dob) 
    {
    
        this.Ssn=Ssn;
        this.Name=Name;
        this.Salary=Salary;
        this.Dob=Dob;
    }
    void printdata()
    {
        System.out.println(Ssn+"\t"+Name+"\t"+Salary+"\t"+Dob);
    }
}
public class emp_demo {
    public static void main(String[] args) {
        employee [] e=new employee[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
             int sn=sc.nextInt();
             String name=sc.next();
             int salary=sc.nextInt();
             String dob=sc.next();
             e[i]=new employee(sn,name,salary,dob);
             }
             System.out.println("array of data");
             for(int i=0;i<5;i++)
             {
                e[i].printdata();
             }
    }
    
}
