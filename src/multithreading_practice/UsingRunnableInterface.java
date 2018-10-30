package multithreading_practice;

/**
 * Created by prathamesh on 1/12/18.
 *
 * Notes  :
 * 1.   When you use 'Runnable' interface to create Thread,make sure that the class implements Runnable interface
 *      and inplement the run()
 * 2.   While using 'Runnable' interface in multiThreading make sure to create an object of 'Thread' class
 *      and then pass objects of runnable interface.After that call start()
        of Thread calss
 */

class PrintHello implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=5;i++) {
            System.out.println("Hello!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class PrintHi implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=5;i++) {
            System.out.println("Hi!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class UsingRunnableInterface {
    public static void main(String args[]){
        System.out.println("Example Program to study multithreading_practice using Runnable interface !");
        Runnable hello = new PrintHello();
        Runnable hi = new PrintHi();

        //create a Thread object and then call the start() to start the Thread
        Thread t1 = new Thread(hello);
        Thread t2 = new Thread(hi);

        t1.start();
        try{
        Thread.sleep(50);
        }catch (Exception e){
            e.printStackTrace();
        }
        t2.start();
    }
}
