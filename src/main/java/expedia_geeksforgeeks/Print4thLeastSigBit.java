package expedia_geeksforgeeks;

/**
 * You are given an integer.
 * Print its 4th leaset significant biy
 */
public class Print4thLeastSigBit {
    public static void main(String args[]){
        int intputNum = 12345667;
        int tempReturnValue = 0;
        if(intputNum <= 999 && intputNum >= -999){
            System.out.println(0);
            System.exit(0);
        }else{
            for(int i = 1;i<=4;i++){
                tempReturnValue=intputNum%10;
                intputNum = intputNum/10;
            }
        }
        System.out.println(tempReturnValue);
    }
}
