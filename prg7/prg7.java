
import java.util.*;
class QueueException extends Exception{
    public void Error()
    {
        System.out.println("Queue is Full");
    }
}
class Queue{
    int rear;
    int fornt;
    int q[];
    Queue(int n)
   {
       q=new int[n];
    }
   void insert(int ele)throws QueueException
   {
      if(rear==q.length)
       {
        throw new QueueException();
       }
         if(fornt==-1)
         fornt=0;
         q[rear++]=ele;
   }
   int delete()
   {
      int ele;
      if(fornt==-1)
       {
      throw new ArrayIndexOutOfBoundsException();
       }
         if(fornt==rear)
         {
             ele=q[fornt];
             rear=fornt=-1;
          }
    else
    {
        ele=q[fornt++];
    }
    return ele;
   }
   void display()
   {
     if(fornt==-1)
     {
        System.out.println("Queue is Empty");
        return;
     }
       for(int i=fornt;i<rear;i++)
       System.out.println(q[i]+"\t");
   }

}
public class prg7 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a limit");
      int size=sc.nextInt();
     Queue que=new Queue(size);
     try{
        while(true){
        System.out.println("\n 1.Insert \n 2.Delete \n 3.Display \n 4.Exit");
        System.out.println("Enter your choice");
        int choice =sc.nextInt();
        switch(choice)
        {
            case 1:System.out.println("Enter a number to insert");
                   que.insert(sc.nextInt());
                   break;
            case 2:System.out.println("Deleted ittem is:" +que.delete());      
                   break;
            case 3:que.display();
                   break;
            default:System.out.println("Wrong choice");
                    return;       
        }
    }
}
         catch (QueueException e) {
            e.Error();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Queue is Empty");
        }
     }
}