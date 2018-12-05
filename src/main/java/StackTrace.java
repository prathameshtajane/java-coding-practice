public class StackTrace {
    public static void main(String args[]){
        try {
            int i = 1/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
//            System.out.println(e.getStackTrace());
        }

        System.out.println("Hello World !");
    }
}
