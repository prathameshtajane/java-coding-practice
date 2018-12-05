package visa;

public class MaxCoinCombination {

    int ways_num(int s, int arr[],int arrsize)
    {
        if (s<0)
            return 0;
        else if	(s==0 || arrsize==1)
            return 1;
        else
            return ways_num(s,arr,arrsize-1)+ways_num(s-arr[arrsize-1],arr,arrsize);
    }

    void solution(){
//        int Nums[]={1,5,20};
//        int sum=20;
        int Nums[]={1,3};
        int sum = 7;
        int size=Nums.length;
        int numofways = ways_num(sum,Nums,size); //algorithm
        System.out.println("Output :"+numofways);
    }

    public static void main(String args[]){
        System.out.println("MaxCoinCombination");
        MaxCoinCombination c = new MaxCoinCombination();
        c.solution();
    }
}
