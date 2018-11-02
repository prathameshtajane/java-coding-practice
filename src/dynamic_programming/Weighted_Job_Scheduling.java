package dynamic_programming;

/*
    Given certain jobs with start and end time and amount you make on finishing the job, find the

    Input :

        Schedule        profit
        (1,3)           5
        (2,5)           6
        (4,6)           5
        (6,7)           4
        (5,8)           11
        (7,9)           2

    Output :
        max profit -> 17

    Algorithm :

        if(doNotOverlap(i,j)){
            T[i] = max(T[i] , T[j] + profit[i])
        }

        link : https://www.youtube.com/watch?v=cr6Ip0J9izc
 */

import java.util.*;

public class Weighted_Job_Scheduling {

    static class Appointment{
        int start_time;
        int end_time;
        int profit;

        Appointment(int start_time,int end_time,int profit){
            this.start_time=start_time;
            this.end_time=end_time;
            this.profit=profit;
        }
    }

    static class Compare_By_End_Time implements Comparator<Appointment>{
        @Override
        public  int compare(Appointment aptmnt1 , Appointment aptmnt2){
            if(aptmnt1.end_time < aptmnt2.end_time){
                return -1;
            }else if(aptmnt1.end_time > aptmnt2.end_time) {
                return 1;
            }else{
                return 0;
            }
        }
    }


    static int getMaxProfitAfterScheduling(List<Appointment> sorted_endtime_asc){

        //Sorting List by ascending order of appointment end time
        Collections.sort(sorted_endtime_asc,new Compare_By_End_Time());

        //Initialising current profit array
        int[] curr_profit = new int[sorted_endtime_asc.size()];

        for(int i = 0 ; i<sorted_endtime_asc.size() ; i++){
            curr_profit[i]=sorted_endtime_asc.get(i).profit;
        }

        //Looping over current profit and appointment to find local maximum
        for(int i = 0; i < sorted_endtime_asc.size() ; i++){
            for(int j = 0 ; j < i ; j++){
                if(sorted_endtime_asc.get(j).end_time <= sorted_endtime_asc.get(i).start_time){
                    curr_profit[i] = Math.max(curr_profit[i],curr_profit[j]+sorted_endtime_asc.get(i).profit);
                }
            }
        }

        //get global maximum profit from current profit array
        int maxProfit = 0;
        for(int local_profit : curr_profit){
            if(local_profit > maxProfit){
                maxProfit = local_profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println("Weighted_Job_Scheduling");

        //populating schedule
        List<Appointment> sorted_endtime_asc = new ArrayList<Appointment>();
        sorted_endtime_asc.add(new Appointment(7,9,2));
        sorted_endtime_asc.add(new Appointment(5,8,11));
        sorted_endtime_asc.add(new Appointment(6,7,4));
        sorted_endtime_asc.add(new Appointment(4,6,5));
        sorted_endtime_asc.add(new Appointment(2,5,6));
        sorted_endtime_asc.add(new Appointment(1,3,5));
        System.out.println("Max Profit after scheduling :"+getMaxProfitAfterScheduling(sorted_endtime_asc));

    }
}
