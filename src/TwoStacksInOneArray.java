import java.util.Arrays;

/*
    Problem Statement:
    Implement two Stacks in one Array

    Approach:
    1)Stack1 start from the 0th position of an Array
    2)Stack2 starts from Array.length()-1 of an Array
    3)Stack is full only when the Array is full


*/

public class TwoStacksInOneArray {
    private static int[] Array1;
    private static int top1;
    private static int top2;

    public TwoStacksInOneArray(){
        //Initialising Array
        Array1=new int[5];
        //Initialising top1 of the Stack1
        top1=0;
        //Initialising top1 of the Stack2 to the last element of an Array
        top2=Array1.length-1;
        System.out.println("top1: "+top1);
        System.out.println("top2: "+top2);
    }

    private static void AddIntoStack(String StackName,int data){
        switch (StackName) {
            case "s1":
                {
                    if(!isArrayFull()){
                        Array1[top1]=data;
                        top1++;
                    }else{
                        System.out.println("Array Full1");
                    }
                }
                break;

            case "s2":
                {
                    if(!isArrayFull()){
                        Array1[top2]=data;
                        top2--;
                    }else{
                        System.out.println("Array Full2");
                    }
                }
                break;

                default:
                    System.out.println("Array Full3");
        }
    }

    private static int removeFromStack(String StackName){
        switch (StackName) {
            case "s1":
            {
                if(top1>=0){
                    return Array1[--top1];

                }else{
                    System.out.println("Stack 1 is empty");
                    return 0;
                }

            }
            case "s2":
            {
                if(top2<(Array1.length-1)){
                    return Array1[++top2];
                }else{
                    System.out.println("Stack 2 is empty");
                    return 0;
                }
            }

            default:
                System.out.println("Stack is Empty");
                return 0;
        }
    }

    private static boolean isArrayFull(){
        return (top1>top2) ? true : false;
    }

    private static void printArray(){
        for(int i=0;i<=Array1.length-1;i++){
            System.out.println(Array1[i]);
        }
    }

    public static void main(String args[]){

        TwoStacksInOneArray TwoStacksInOneArray1=new TwoStacksInOneArray();

        AddIntoStack("s1",1);
        AddIntoStack("s1",2);
        AddIntoStack("s1",3);
        AddIntoStack("s2",8);
        printArray();

        System.out.println("Removing Operations");
        System.out.println("Remove1 stack2 : "+removeFromStack("s2"));
        System.out.println("Remove2 stack1 : "+removeFromStack("s2"));

        printArray();


    }

}
