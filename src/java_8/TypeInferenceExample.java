package java_8;

public class TypeInferenceExample {
    public static void main(String[] args) {
        System.out.println("Java 8 Practice");
        StringLengthLambda stringLengthLambda = (s ) -> s.length();
        System.out.println(stringLengthLambda.getLength("Hello World"));
    }
}
