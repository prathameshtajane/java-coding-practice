package leetcode_solutions;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Convert given expression sring from Infix to PostFix
 */


public class InfixToPostfix {

    public void generateSum(ArrayList<Object> prefixedArray) {
        System.out.println(prefixedArray);
        while (prefixedArray.size() != 1) {
            for (int i = 0; i <= prefixedArray.size() - 1; i++) {
                if (prefixedArray.get(i) instanceof String) {
                    Integer temp1 = (Integer) prefixedArray.get(i - 1);
                    Integer temp2 = (Integer) prefixedArray.get(i - 2);
                    Integer currValue;
                    if (prefixedArray.get(i) == "*") {
                        currValue = temp1 * temp2;
                    } else if (prefixedArray.get(i) == "/") {
                        currValue = temp1 / temp2;
                    } else if (prefixedArray.get(i) == "-") {
                        currValue = temp1 - temp2;
                    } else {
                        currValue = temp1 + temp2;
                    }
                    prefixedArray.remove(i);
                    prefixedArray.add(i, currValue);
                    prefixedArray.remove(i - 1);
                    prefixedArray.remove(i - 2);
                }

            }
        }
        System.out.println("Calculated Value is : "+prefixedArray.get(0));
    }

    public void infixToPostfix(ArrayList<Object> inputArrayList) {
        Stack<Object> opsStack = new Stack<>();
        ArrayList<Object> outputString = new ArrayList<>();
        for (Object each : inputArrayList) {
            if (each instanceof String) {
                if (each == "+" || each == "-") {
                    if (opsStack.contains("*") || opsStack.contains("/")) {
                        while (!opsStack.isEmpty()) {
                            outputString.add(opsStack.pop());
                        }
                        opsStack.push(each);
                    } else {
                        opsStack.push(each);
                    }
                } else {
                    opsStack.push(each);
                }
            } else {
                outputString.add(each);
            }
        }
        while (!opsStack.isEmpty()) {
            outputString.add(opsStack.pop());
        }
            System.out.println(outputString);
        generateSum(outputString);
    }

    public static void main(String args[]) {
        System.out.println("Hello World !");
        InfixToPostfix test = new InfixToPostfix();
        ArrayList<Object> testInputArray = new ArrayList<>();
        testInputArray.add(1);
        testInputArray.add("+");
        testInputArray.add(2);
        testInputArray.add("*");
        testInputArray.add(3);
        test.infixToPostfix(testInputArray);
    }
}
