class Q{
    int n;
    boolean valueSet=false;
    synchronized int get(){
        while(!valueSet)
        try{
            wait();
        }
         catch (InterruptedException e) {
          System.out.println("InterruptedException caught");
        }
        System.out.println("Got:"+n);
        valueSet=false;
        notify();;
        return n;
    }
    synchronized void put(int n)
    {
        while(valueSet)
        try {
            wait();
        } 
        catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        this.n=n;
        valueSet=true;
        System.out.println("Put:"+n);
        notify();
    }
}
class Procedure implements Runnable{
    Q q;
    Procedure(Q q){
        this.q=q;
        new Thread(this,"procedure").start();
    }
    public void run(){
        int i;
        for(i=0;i<10;i++){
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q=q;
        new Thread(this,"Consumaer").start();
    }
    public void run(){
        int i;
        for(i=0;i<10;i++){
            q.get();
        }
    }
}
public class prg6 {
    public static void main(String[] args) {
        Q q=new Q();
        new Procedure(q);
        new Consumer(q);
       
        
            
      }
}

