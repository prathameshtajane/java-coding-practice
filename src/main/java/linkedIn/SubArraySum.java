package linkedIn;

import java.util.Arrays;
import java.util.List;


public class SubArraySum {

    public long subArraySum(List<Integer> list){
        long list_length = list.size();
        long result = 0;

        // computing sum of subarray using formula
        for (int i=0; i<list_length; i++)
            result = result + (list.get(i) * (i+1) * (list_length-i));

        // return all subarray sum
        if(list.contains(0)){
            result=result-1;
        }

        return result ;
    }


//    public int subsets(List<Integer> nums) {
//        int count = (int) Math.pow(2,nums.size());
//        List<List<Integer>> oList = new ArrayList<>();
//        List<Integer> tList;
//
//        for(int i=0;i<count;i++){
//            tList = new ArrayList<>();
//            for(int j=0;j<nums.size();j++){
//                if((i & (1 << j)) > 0){
//                    tList.add(nums.get(j));
//                }
//            }
//            oList.add(tList);
//        }
//
//        return oList.stream()
//                .flatMap(x -> x.stream())
//                .reduce(0,(int1,int2)->int1+int2);
//
////        return outputList;
//    }

    public static void main(String args[]){
        System.out.println("SubArraySum");
        SubArraySum sum = new SubArraySum();
        Integer[] input1 = {1,2,3};
        Integer[] input2= {4,5,6};
        Integer[] input3= {4,5};
        Integer[] input4= {4};
        Integer[] input5= {1,2};
        Integer[] input6= {1,1,1};
        Integer[] input7= {2,1,1};

        System.out.println(sum.subArraySum(Arrays.asList(input1)));
        System.out.println(sum.subArraySum(Arrays.asList(input2)));
        System.out.println(sum.subArraySum(Arrays.asList(input3)));
        System.out.println(sum.subArraySum(Arrays.asList(input4)));
        System.out.println(sum.subArraySum(Arrays.asList(input5)));
        System.out.println(sum.subArraySum(Arrays.asList(input6)));
        System.out.println(sum.subArraySum(Arrays.asList(input7)));


//        System.out.println(sum.subsets(Arrays.asList(input1)));
//        System.out.println(sum.subsets(Arrays.asList(input2)));
//        System.out.println(sum.subsets(Arrays.asList(input3)));
//        System.out.println(sum.subsets(Arrays.asList(input4)));
//        System.out.println(sum.subsets(Arrays.asList(input5)));
//        System.out.println(sum.subsets(Arrays.asList(input6)));
//        System.out.println(sum.subsets(Arrays.asList(input7)));

    }
}
