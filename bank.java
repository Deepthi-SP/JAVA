import java.util.Scanner;

class Account{
    String owner_name;
    String ac_no;
    double balance;
    Account(String name,String num,double bal)
    {
       this.owner_name=name;
       this.ac_no=num;
       this.balance=bal;
    }
    void deposite(double amount)
    {
        this.balance+=amount;
        System.out.println("The Balance Details");
        System.out.println(owner_name+ "\t" + ac_no+"\t"+balance);
    }
    void withdraw(double amount)
    {
        if(this.balance<500)
        {
            System.out.println("The less balance");
            return;
        }
        this.balance-=amount;
    }
}
public class bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Owner Name");
         String name=sc.next();
         System.out.println("Enter Account Number");
         String num=sc.next(); 
         System.out.println("Balance");
         double bal=sc.nextDouble();
         Account a=new Account(name, num, bal);
         boolean opt=true;
         while(opt)
         {
            System.out.println("1.Balance Enquiry \n2.Deposite  \n3.Withdraw");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
            case 1: System.out.println("Enter Amount Deposit");
            double amnt=sc.nextDouble();
            a.deposite(amnt);
            break;
            case 2: System.out.println("Enter Amount Deposit");
            double amount=sc.nextDouble();
            a.withdraw(amount);
            break;
         }
        }
    }
}
