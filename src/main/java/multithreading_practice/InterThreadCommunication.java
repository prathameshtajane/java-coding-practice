package multithreading_practice;

/**
 * Created by prathamesh on 1/13/18.
 */

class DataPacket{

    private int count;
    boolean valueFlag = false;

    public synchronized int getCount() {
        while(!valueFlag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get : "+count);
        valueFlag=false;
        notify();
        return count;
    }

    public synchronized void setCount(int count) {
        while(valueFlag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.count = count;
        System.out.println("Set : "+count);
        valueFlag=true;
        notify();
    }
}

class Producer implements Runnable{
    DataPacket dp;
    int counter=0;

    public Producer(DataPacket dp){
        this.dp=dp;
        Thread producerThread = new Thread(this,"producerThread-1");
        producerThread.start();
    }

    @Override
    public void run() {
        while(true){
            dp.setCount(counter++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    DataPacket dp;
    int counter;

    public Consumer(DataPacket dp){
        this.dp=dp;
        Thread consumerThread = new Thread(this,"consumerThread-1");
        consumerThread.start();
    }

    @Override
    public void run() {
        while(true){
            dp.getCount();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThreadCommunication {
    public static void main(String args[]){
        DataPacket origDataPacket = new DataPacket();
        new Producer(origDataPacket);
        new Consumer(origDataPacket);
    }
}
