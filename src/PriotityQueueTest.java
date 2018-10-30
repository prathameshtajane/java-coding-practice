import java.util.Comparator;
import java.util.PriorityQueue;

public class PriotityQueueTest {



    public static class StateClassComparator  implements Comparator<StateClass>{
        @Override
        public int compare(StateClass o1, StateClass o2) {
            if ((o1.dist_travelled+o1.hueristic_value) > (o2.dist_travelled+o2.hueristic_value))
                return 1;
            else if ((o1.dist_travelled+o1.hueristic_value) < (o2.dist_travelled+o2.hueristic_value))
                return -1;
            return 0;
        }
    }

    public static class StateClass{
        public int hueristic_value;
        public int dist_travelled=0;

        public StateClass(int hValue,int dTravelled){
            dist_travelled=dist_travelled+dTravelled;
            hueristic_value=hValue;
        }

        public String toString(){
            return String.valueOf(dist_travelled);
        }

    }

    public static void main(String args[]){
        System.out.println("Hello World !");
        PriorityQueue<StateClass> pq = new PriorityQueue<StateClass>(new StateClassComparator());
        StateClass s1 = new StateClass(1,1);
        StateClass s2 = new StateClass(1,3);
        StateClass s3 = new StateClass(1,2);
        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
