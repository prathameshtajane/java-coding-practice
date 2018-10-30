package daily_coding_challenges;

/*

This problem was asked by Airbnb.

    We're given a hashmap with a key courseId and value a list of courseIds,
    which represents that the prerequsite of courseId is courseIds.
    Return a sorted ordering of courses such that we can finish all courses.

    Return null if there is no such ordering.

    For example, given {'CSC300': ['CSC100', 'CSC200'], 'CSC200': ['CSC100'], 'CSC100': []},
                 should return ['CSC100', 'CSC200', 'CSCS300'].

 */


import java.util.HashMap;
import java.util.List;

public class Prob92_Sorted_Ordering_Of_Courses {

    HashMap<Integer, List<Integer>> dependecyMap = new HashMap<>();
    // todo : Implement Sorted_Ordering_Of_Courses

    public static void main(String args[]){
        System.out.println("Prob92_Sorted_Ordering_Of_Courses");
    }
}
