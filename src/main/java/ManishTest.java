import java.util.Arrays;

public class ManishTest {
    public int solution(int[] A){
        Arrays.sort(A);
        int missingValue = 1;
        for(int i=A.length-1;i>0;i--){
            if(A[i] < 0){
                return missingValue;
            }else if(A[i]-A[i-1] > 1) {
                missingValue = A[i-1]+1;
                return missingValue;
            }else if(A[i]-A[i-1] == 0){
                continue;
            }
        }
        //perfect array
        missingValue = A[A.length-1]+1;
        return missingValue;
    }

    public static void main(String args[]){
        ManishTest MTEST = new ManishTest();
        int[] input={1,2,3};
        System.out.println(MTEST.solution(input));
    }
}
