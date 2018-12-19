package leetcode_solutions;

import java.util.Random;

public class E_Oracle_Create_Random_Prob {

    public static int rand50() {
        Random r = new Random();
        int val = r.nextInt(100);
        if(val < 50) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int rand75() {
        Random r = new Random();
        int val = r.nextInt(100);
        if(val < 50) {
            int res = rand50();
            if (res == 1) {
                return 0;
            } else {
                return res;
            }
        } else {
            return rand50();
        }
    }

}
