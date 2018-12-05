package leetcode_solutions.google;

import java.util.Arrays;
import java.util.List;

/*
    Given two 1d vectors, implement an iterator to return their elements alternately.

    Example:

    Input:
    v1 = [1,2]
    v2 = [3,4,5,6]

    Output: [1,3,2,4,5,6]

    Explanation: By calling next repeatedly until hasNext returns false,
                 the order of elements returned by next should be: [1,3,2,4,5,6].
    Follow up: What if you are given k 1d vectors? How well can your code be extended to such cases?

    Clarification for the follow up question:
    The "Zigzag" order is not clearly defined and is ambiguous for k > 2 cases. If "Zigzag" does not look right to you, replace "Zigzag" with "Cyclic". For example:

    Input:
    [1,2,3]
    [4,5,6,7]
    [8,9]

    Output: [1,4,8,2,5,9,3,6,7].

    Link : https://leetcode.com/problems/zigzag-iterator/description/

 */
public class M_Zigzag_Iterator {

    List<Integer> v1List;
    List<Integer> v2List;
    int v1ListCurrIndex;
    int v2ListCurrIndex;
    boolean isv1Printed;

    public M_Zigzag_Iterator(List<Integer> v1, List<Integer> v2) {
        this.v1List = v1;
        this.v2List = v2;
        v1ListCurrIndex = 0;
        v2ListCurrIndex = 0;
        isv1Printed=false;
    }

    public int next() {
        //case 1 : if all the elements in v1 are traversed,print only elements in v2
        //case 2 : if all the elements in v2 are traversed,print only elements in v1
        //case 3 : else print elements in v1 and v2 in zig-zag fashion
        int result=0;
        if(v1ListCurrIndex >= v1List.size()){
            //case 1
            result = v2List.get(v2ListCurrIndex);
            v2ListCurrIndex++;
        }else if(v2ListCurrIndex >= v2List.size()){
            //case 2
            result = v1List.get(v1ListCurrIndex);
            v1ListCurrIndex++;
        }else{
            //case 3
            if(isv1Printed){
                result = v2List.get(v2ListCurrIndex);
                v2ListCurrIndex++;
                isv1Printed = false;
            }else{
                result = v1List.get(v1ListCurrIndex);
                v1ListCurrIndex++;
                isv1Printed = true;
            }
        }
        return result;
    }

    public boolean hasNext() {
        return (v1ListCurrIndex < v1List.size() || v2ListCurrIndex < v2List.size());
    }

    public static void main(String args[]){
        System.out.println("M_Zigzag_Iterator");
        Integer [] input1 = {1,2,3,4,5,6};
        Integer [] input2 = {7,8,9,10,11,12,13,14};
        M_Zigzag_Iterator zigzagIterator = new M_Zigzag_Iterator(Arrays.asList(input1),Arrays.asList(input2));
        while (zigzagIterator.hasNext()){
            System.out.println(zigzagIterator.next());
        }

    }
}
