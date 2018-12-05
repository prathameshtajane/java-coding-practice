package multithreading_practice;
/*
    Reference : https://www.youtube.com/watch?v=9Cov2yC5rkI
    Check the output without join() method call
*/

class Thread1 extends Thread{
    public void run(){
        for(int i = 0;i<=5;i++){
            System.out.println("Thead1 status from inside Thread1 :"+isAlive());
        }
    }
}
public class JoinMethodTest {
    public static void main(String args []){
        Thread1 th1 = new Thread1();
        System.out.println("Main Method : Thread Status :"+th1.isAlive());
        th1.start();
        try{
            th1.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Main Method : Thread Status after start():"+th1.isAlive());
    }
}
