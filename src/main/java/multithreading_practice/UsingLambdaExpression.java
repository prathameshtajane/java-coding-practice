    package multithreading_practice;

    /**
    * Created by prathamesh on 1/12/18.
    */

public class UsingLambdaExpression {
        public static void main(String args[]) {
            System.out.println("Example Program to study multithreading_practice using Runnable interface and Lambda Expression !");

            /* Implementing Anonymous class */

            Runnable hello = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("Hello!");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };


            Runnable hi = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("Hi!");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };

            //create a Thread object and then call the start() to start the Thread
            Thread t1 = new Thread(hello);
            Thread t2 = new Thread(hi);

            Thread t1Lambda = new Thread(() -> {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("HelloLambda!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            Thread t2Lambda = new Thread(() -> {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("HILambda!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            t1.start();
            t1Lambda.start();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t2.start();
            t2Lambda.start();
        }
    }