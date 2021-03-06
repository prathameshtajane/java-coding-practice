package ctci.LinkedLists;


public class ReturnKthToLast {

    int getKthToLast(Node head, int k){
        if(head == null || head.next == null){
            return -1;
        }
        Node slowRunner = head;
        Node fastRunner = head;

        for(int i = 1 ; i <= k ; i++){
            fastRunner=fastRunner.next;
        }

        while (fastRunner != null){
            fastRunner=fastRunner.next;
            slowRunner=slowRunner.next;
        }

        return slowRunner.data;
    }
}
