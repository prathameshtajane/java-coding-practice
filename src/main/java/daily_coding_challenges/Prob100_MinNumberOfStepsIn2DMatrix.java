package daily_coding_challenges;

import java.util.ArrayList;
import java.util.List;


/*
* https://www.geeksforgeeks.org/minimum-steps-needed-to-cover-a-sequence-of-points-on-an-infinite-grid/
*/

// turns out that min steps between 2 points
// (go diagonal first then vertical/horizontal
// is the Max of (abs(x2-x1), abs(y2-y1))


public class Prob100_MinNumberOfStepsIn2DMatrix {

    public static class Point{
        int x_cord;
        int y_cord;

        Point(int x_cord,int y_cord){
            this.x_cord=x_cord;
            this.y_cord=y_cord;
        }
    }

    static int  getMinNumberOfStepsSrcDest(Point src_cord,Point dest_cord){
        int dx = Math.abs(src_cord.x_cord-dest_cord.x_cord);
        int dy = Math.abs(src_cord.y_cord-dest_cord.y_cord);
        return Math.max(dx,dy);

    }

    static int  calTotalMinSteps(List<Point> points){
        int minSteps = 0;
        for(int i=1;i<points.size();i++){
            minSteps += getMinNumberOfStepsSrcDest(points.get(i-1),points.get(i));
        }
        return minSteps;
    }

    public static void main(String args[]){
        System.out.println("Prob100_MinNumberOfStepsIn2DMatrix");
        List<Point> inputList = new ArrayList<>();
        inputList.add(new Point(0,0));
        inputList.add(new Point(1,1));
        inputList.add(new Point(1,2));
        System.out.println(calTotalMinSteps(inputList));
    }
}
