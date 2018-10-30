package leetcode_solutions;

/**
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

 The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

 Example 1:
 Input: "UD"
 Output: true
 Example 2:
 Input: "LL"
 Output: false

 Link : https://leetcode.com/problems/judge-route-circle/description/
 *
 */
public class Judge_Route_Circle {

    public static boolean judgeCircle(String moves) {
        int[] coord = {0,0};
        for(int i=0;i<moves.length();i++){
            char currDir = moves.charAt(i);
            switch (currDir){
                case 'U' :
                    coord[1]+=1;
                    break;
                case 'R' :
                    coord[0]+=1;
                    break;
                case 'D' :
                    coord[1]-=1;
                    break;
                case 'L' :
                    coord[0]-=1;
                    break;
            }
        }
        return (coord[0] == 0 && coord[1] == 0);
    }

    public static void main(String args[]){
        System.out.println("Judge_Route_Circle");
        System.out.println(Judge_Route_Circle.judgeCircle("UD"));
        System.out.println(Judge_Route_Circle.judgeCircle("LDRRLRUULR"));
    }
}
