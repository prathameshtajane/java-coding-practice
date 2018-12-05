package classpass;

import java.util.Arrays;

public class MaxFamilySeatsArrangement {

    private int possibleFamilyCount;
    private String[] reservedSeats;

    private char[] ABC = {'A','B','C'};
    private char[] HJL = {'H','J','K'};
    private char[] DEF = {'D','E','F',};
    private char[] EFG = {'E','F','G',};

    public void ThreeSeatsArrangement(int N, char c){
        char[] possibleIteration;



        if(c == 'A'){
            possibleIteration = ABC;
        }else if(c == 'H'){
            possibleIteration = HJL;
        }else if(c == 'D'){
            possibleIteration = DEF;
        }else{
            possibleIteration = EFG;
        }

        for(char eachChar : possibleIteration){
            if(Arrays.asList(reservedSeats).contains(N + Character.toString(eachChar))){
                possibleFamilyCount--;
                break;
            }else{
                c++;
            }
        }
    }


    public void FourSeatsArrangement(int N){
            if(Arrays.asList(reservedSeats).contains(N + "D")){
                ThreeSeatsArrangement(N,'E');
            }else{
                ThreeSeatsArrangement(N,'D');
            }
    }

    public int solution(int N,String S){
        if(S.equals("") || S == null){
            return N*3;
        }

        reservedSeats = S.split(" ");
        possibleFamilyCount = N*3;
        for(int i = 1;i<=N;i++){
            ThreeSeatsArrangement(i,'A');
            FourSeatsArrangement(i);
            ThreeSeatsArrangement(i,'H');

        }
        return possibleFamilyCount;
    }

    public static void main(String args[]){
        System.out.println("MaxFamilySeatsArrangement");
        MaxFamilySeatsArrangement seatArrangement = new MaxFamilySeatsArrangement();
        System.out.println(seatArrangement.solution(2,"1A 2A 2E 2J"));
        System.out.println(seatArrangement.solution(1,""));
    }
}
