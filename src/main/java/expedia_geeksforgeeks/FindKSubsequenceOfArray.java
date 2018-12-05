package expedia_geeksforgeeks;

public class FindKSubsequenceOfArray {
    public static void main(String args[]){
        int []inputArray = {1,2,3,4,1};
        int k =3;
        int finalCount=0;
        for(int n=1;n<=k;n++){
            for(int i =0;i<=inputArray.length-n-1;i++){
                int tempCollect = 0;
                for(int j=i;j<=i+n-1;j++){
                    tempCollect=tempCollect+inputArray[j];
                    if(tempCollect == k){
                        finalCount++;
                    }
                }
            }
        }
        System.out.println(finalCount);
    }
}
