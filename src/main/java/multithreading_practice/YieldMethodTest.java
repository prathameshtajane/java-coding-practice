package multithreading_practice;

/**
 *
 */

class Thread2 extends Thread{
    public void run(){
        this.yield();
        for(int i=0;i<=5;i++){
            System.out.println("Thread2: "+i);
        }
    }
}

class Thread3 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread3: "+i);
        }
    }
}

public class YieldMethodTest {
    public static void main(String args[]){
        Thread2 thd2 = new Thread2();
        Thread3 thd3 = new Thread3();
        thd2.start();
        thd3.start();
    }
}
