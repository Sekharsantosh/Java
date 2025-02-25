/* 
//by extending thread class.
class Program extends Thread{
    @Override   
    public void run(){
        System.out.println("Thread is running");
    }
}

public class Mythread  {
    public static void main(String[] args) {
        Program p=new Program();
        p.start();
        System.out.println("Thread name is :"+p.getName()+" It's priority is :"+p.getPriority());
    }
}

*/








/* 
// volatile keyword.

class A{
   synchronized void sum(int a){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+(a+i));
        }
    }
}
class B extends Thread{
    A a=new A();
    public void run(){
        a.sum(10);
    }
}

class Mythread{
    public static void main(String[] args) {
        B b=new B();
        Thread t1=new Thread(b);
        t1.setPriority(1);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
    }
}

*/


//By using Atomic classes.

import java.util.concurrent.atomic.AtomicInteger;

class A{
    AtomicInteger a=new AtomicInteger(0);
    public int getCount(){
         return a.incrementAndGet();
    }
    
}

class Mythread{
    static A a=new A();
    public static void main(String[] args) {
       Thread t1=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<100;i++){
                    System.out.print(a.getCount()+" ");
                }
                System.out.println("");
            }
       });

       Thread t2=new Thread(new Runnable(){
        public void run(){
            for(int i=0;i<100;i++){
                System.out.print(a.getCount()+" ");
            }
            System.out.println("");
        }
        });

       t1.start();
       t2.start();
       
       try{
        t1.join();
        t2.join();
       }
       catch(Exception e){
          e.printStackTrace();
       }


    }

}