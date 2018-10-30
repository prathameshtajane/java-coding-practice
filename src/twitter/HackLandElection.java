package twitter;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HackLandElection {

    static String electionWinner(String[] votes){
        Map<String,Integer> votesMap = new HashMap<>();
        for(String vote : votes){
            if(!votesMap.containsKey(vote)){
                votesMap.put(vote,1);
            }else{
                int curr_votes=votesMap.get(vote);
                votesMap.put(vote,++curr_votes);
            }
        }
        Set<String> names = votesMap.keySet();
        String maxName="";
        int maxVotes=0;
        for(String name : names){
            if(votesMap.get(name) > maxVotes || (votesMap.get(name) == maxVotes && name.compareTo(maxName)>0)){
                maxName=name;
                maxVotes=votesMap.get(name);
            }
        }
        return maxName;
    }

    public static void main(String args[]) {
        System.out.println("HackLandElection");
        String[] votes = {"Joe","Mary","Mary","Joe"};
        System.out.println(electionWinner(votes));

        String[] votes2={"Alex","Michael","Harry","Dave","Michael","Victor","Harry","Alex","Mary","Mary"};
        System.out.println(electionWinner(votes2));

    }
}
