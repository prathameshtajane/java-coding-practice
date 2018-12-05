
public class SuperStack {
    int stackSize = 0;
    Node firstNode;
    Node lastNode;

    public void push(int k){
        if(firstNode == null){
            firstNode = new Node(k);
            lastNode  =firstNode;
        }else{
            Node newNode = new Node(k);
            newNode.next=firstNode;
            firstNode=newNode;
        }
        stackSize=stackSize+1;

        //print
        System.out.println(firstNode.data);
    }

    public void pop(){
        if(firstNode != null){
            firstNode = firstNode.next;
            stackSize=stackSize-1;
        }

        if(stackSize == 0){
            System.out.println("EMPTY");
        }else{
            System.out.println(firstNode.data);
        }

    }

    public void inc(int e,int k){
        if(stackSize <= 0){
            return;
        }
        if(stackSize < e){
            return;
        }
        Node tempPointer = firstNode;
        for(int i=1;i<=stackSize;i++){
            if(i > (stackSize-e)){
                tempPointer.data=tempPointer.data+k;
            }
            tempPointer=tempPointer.next;
        }
        System.out.println(firstNode.data);
    }

    void  superStack(String[] operations){
        for(int i=1;i<=operations.length-1;i++){
            if(operations[i].split(" ").length ==3){
                //call inc
                inc(Integer.parseInt(operations[i].split(" ")[1]),Integer.parseInt(operations[i].split(" ")[2]));
            }else if(operations[i].split(" ").length ==2){
                // call push
                push(Integer.parseInt(operations[i].split(" ")[1]));

            }else{
                //call pop
                pop();
            }
        }
    }


    public static void main(String args[]){
        System.out.println("SuperStack");
        SuperStack ss = new SuperStack();
//        ss.push(4);
//        ss.inc(2,1);
        String[] input1 = {"12",
                "push 4",
                "pop",
                "push 3",
                "push 5",
                "push 2",
                "inc 3 1",
                "pop",
                "push 1",
                "inc 2 2",
                "push 4",
                "pop",
                "pop"};
        ss.superStack(input1);
    }
}

class Node{
    Node next;
    int data;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
