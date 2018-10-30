import java.util.ArrayList;
import java.util.HashMap;

public class ManishTest2 {

    int calculateTotalSecond(String stime){
        String time[] = stime.split(":");
        int totalSeconds = Integer.parseInt(time[0])*3600;
        totalSeconds += Integer.parseInt(time[1])*60;
        totalSeconds += Integer.parseInt(time[2]);
        return totalSeconds;
    }


    int calculatePriceByTime(String stime){
        String time[] = stime.split(":");
        int totalCharge=0;
        int totalSeconds = Integer.parseInt(time[0])*3600;
        totalSeconds += Integer.parseInt(time[1])*60;
        totalSeconds += Integer.parseInt(time[2]);

        if(totalSeconds < 300){
            //5 mintunes
            totalCharge=totalSeconds*3;
        }else{
            totalCharge = (int)Math.ceil(totalSeconds/60.0)*150;
        }
        return totalCharge;
    }

    String compareNumbers(String num1,String num2){
        int ph1 = Integer.parseInt(num1.replaceAll("-",""));
        int ph2 = Integer.parseInt(num2.replaceAll("-",""));
        if(ph1 >= ph2){
            return num2;
        }else{
            return num1;
        }
    }

    int solution(String input) {
//        String inputLines[] = input.split("\\r?\\n");
        String inputLines[] = input.split("\\n");
        HashMap<String,ArrayList<Integer>> numberTimeMap = new HashMap<>();
        int maxTime = 0;
        String maxTimeNumber = inputLines[0].split(",")[1];
        int totalBill = 0;

        for(int i=0;i<inputLines.length;i++){
            String number = inputLines[i].split(",")[1];

            int temp_time=calculateTotalSecond(inputLines[i].split(",")[0]);
            int temp_price=calculatePriceByTime(inputLines[i].split(",")[0]);

            if(numberTimeMap.containsKey(number)){
                ArrayList<Integer> oldList = numberTimeMap.get(number);
                ArrayList<Integer> newlist = new ArrayList<>();
                newlist.add(0,oldList.get(0)+temp_time);
                newlist.add(1,oldList.get(1)+temp_price);
                numberTimeMap.put(number,newlist);

            }else{
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(0,temp_time);
                tempList.add(1,temp_price);
                numberTimeMap.put(number,tempList);
            }
        }

        for(String eachKey : numberTimeMap.keySet()){
            if(maxTime < numberTimeMap.get(eachKey).get(0)){
                maxTime = numberTimeMap.get(eachKey).get(0);
                maxTimeNumber = eachKey;
            }else if(maxTime == numberTimeMap.get(eachKey).get(0)){
                maxTimeNumber = compareNumbers(maxTimeNumber,eachKey);
            }
        }

        //remove number with max total time
        numberTimeMap.remove(maxTimeNumber);

        //calculating totalBill
        for(String eachKey : numberTimeMap.keySet()){
            totalBill += numberTimeMap.get(eachKey).get(1);
        }
        System.out.println(maxTimeNumber);
        return totalBill;

    }


    public static void main(String args[]){
        ManishTest2 M2 = new ManishTest2();
        System.out.println(M2.solution("00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090"));
    }
}
