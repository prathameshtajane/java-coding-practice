package java_8;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i<=5; i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(2);
                    }catch (Exception e){

                    }

                }
            }
        });

        Thread myThreadLambda = new Thread(() -> {
            for(int i = 10 ; i<=15; i++){
                System.out.println(i);
                try {
                    Thread.sleep(2);
                }catch (Exception e){

                }

            }
        });

        myThread.start();
        myThreadLambda.start();
    }

}
