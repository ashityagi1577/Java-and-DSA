class Counter{
    int count=0;

    public synchronized void increment(){
        count++;
    }
    
}

public class Synchronized{
public static void main(String[] args) throws InterruptedException{
    Counter c=new Counter();
    Runnable task=()->{
        for(int i=1;i<=1000000;i++){
            c.increment();
        }
    };;
    Thread t1=new Thread(task);
    Thread t2=new Thread(task);

    t1.start();
    t2.start();
  

    t1.join();
    t2.join();
      
          System.out.println("Final Value is :"+c.count);
}    
}

