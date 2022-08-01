import java.util.Scanner;

class LessBalanceException extends Exception
{
    LessBalanceException(double amnt)
    {
        System.out.println("Withdrawing" +amnt+ " is invalid");
    }
}
class User
{
    String name;
    User(String name)
    {
       this.name=name;
     }
     class Account {
        int acno;
        Double bal;
        Account (int acno,Double bal)
        {
           this.acno=acno;
           this.bal=bal;
        }
    }
    Account [] a=new Account[2];
    void deposit(int a_no,double amount)
    {
        int found=0,k=-1;
        for(int i=0;i<2;i++)
        {
           if(a[i].acno==a_no)
            found=1;
            k=i;
            break;
        }
        if(found==1)
        {
            System.out.println("Balamce Updated");
            display(a[k].acno);
        }
      else
        System.out.println("Account Number Does not exists");
    }
    void withdrawl(double amount,int acno) throws LessBalanceException
    {
        int k=-1;
        int found=0;
        for(int i=0;i<2;i++)
        if(a[i].acno==acno)
        {
            k=i;
            found=1;
            break;
        }
        if(found==1)
        {
            if((a[k].bal<500) || (a[k].bal<amount))
            throw new LessBalanceException(amount);
            else{
                  a[k].bal-=amount;
                  display(a[k].acno);
            }
        }
        else
        System.out.println("Account Number doesn't exit");
    }
    void create_account()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter Account Number");
            int acno=sc.nextInt();
            System.out.println("Enter Balance");
            Double Bal=sc.nextDouble();
            a[i]=new Account(acno, Bal);
        }
    }
    void display(int acno)
    {
        int k=-1,found=0;
        for(int i=0;i<2;i++)
        if(a[i].acno==acno)
        {
            k=i;
            found=1;
            break;
        }
        if(found==1)
        {
            System.out.println("--------------Account Details---------");
            System.out.println(name+ "\t" +a[k].acno +"\t" +a[k].bal);
            System.out.println("----------------------------------------");
        }
    }
}
public class prg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CREATE ACCOUNT WITH MINIMUN BALANCE 500");
        System.out.println("Enter account holder name");
        String name=sc.next();
        int acno;
        User u=new User(name);
        u.create_account();
        System.out.println("Account created successfully");
        boolean opt=true;
        while(opt)
        {
            System.out.println("======================================");
            System.out.println("1.BALANCE ENQUIRY  2.DEPOSIT  3.WITHDRAWAL");
            System.out.println("======================================");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Your ACcount Details");
                System.out.println("Enter account number");
                acno=sc.nextInt();
                u.display(acno);
                break;
                case 2:System.out.println("Enter Account Number");
                acno=sc.nextInt();
                System.out.println("Enter ammount to deposit");
                double amt=sc.nextDouble();
                u.deposit(acno, amt);
                break;
                case 3:try
                {
                    System.out.println("Enter account number");
                    acno=sc.nextInt();
                    System.out.println("Enter Amount to withdraw");
                    double amount=sc.nextDouble();
                    u.withdrawl(amount, acno);
                }
                catch(LessBalanceException e){}
               break;
            }
        }
    }
}
