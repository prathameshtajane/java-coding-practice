package daily_coding_challenges;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * This problem was asked by LinkedIn.
 *
 * Given a list of points, a central point, and an integer k, find the nearest k points from the central point.
 *
 * For example, given the list of points [(0, 0), (5, 4), (3, 1)],
 * the central point (1, 2), and k = 2, return [(0, 0), (3, 1)].
 */
public class Prob150_GetKNearestPoints {

    static class Point{
        int xcoord;
        int ycoord;

        Point(int xcoord,int ycoord){
            this.xcoord=xcoord;
            this.ycoord=ycoord;
        }
    }

    double getDistance(Point p , Point origin){
        return Math.sqrt(Math.pow((p.xcoord-origin.xcoord),2)+Math.pow((p.ycoord-origin.ycoord),2));
    }

    List<Point> getKNearestPoints(List<Point> points, Point centralPoint , int K){
        List<Point> nearestPoints = new ArrayList<>();
        if(points.size() < 1){
            return nearestPoints;
        }

        PriorityQueue<Point> min_heap = new PriorityQueue<>(points.size(), new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if(getDistance(p1,centralPoint) >= getDistance(p2,centralPoint)){
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        //adding into min heap
        for(Point p : points){
            min_heap.offer(p);
        }

        for(int i = 0; i < K ; i++){
            nearestPoints.add(min_heap.poll());
        }
        return nearestPoints;
    }

    public static void main(String[] args) {
        Prob150_GetKNearestPoints testObj = new Prob150_GetKNearestPoints();
        List<Point> inputPoints = new ArrayList<>();
        inputPoints.add(new Point(0,0));
        inputPoints.add(new Point(5,4));
        inputPoints.add(new Point(3,1));
        Point centralPoint = new Point(1,2);
        int k = 2;

        testObj.getKNearestPoints(inputPoints,centralPoint,k).forEach((Point p)->{
            System.out.println(p.xcoord+","+p.ycoord+"\n");
        });
    }
}
