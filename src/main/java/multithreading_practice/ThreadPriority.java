package multithreading_practice;

/**
 * Created by prathamesh on 1/13/18.
 */
public class ThreadPriority {
    public static void main(String args[]){
        System.out.println("multithreading_practice : Example for setting thread priority ");
        Thread t1Hello = new Thread(
                () -> {
                    for(int i=0;i<=5;i++){
                        System.out.println("Hello Thread Name :"+Thread.currentThread().getName());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );

        Thread t2Hi = new Thread(
                () -> {
                    for(int i=0;i<=5;i++){
                        System.out.println("Hi Thread Name :"+Thread.currentThread().getName());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );

        t1Hello.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2Hi.start();
    }
}
