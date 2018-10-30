package clarify;


public class FidgetProblem {

    static long waitingTime(int[] spinners, int p) {
        long wtime = 0;
        /*while (spinners[p - 1] != 0)
            for (int i = 0; i < spinners.length; i++) {
                if (spinners[i] != 0) {
                    wtime++;
                    spinners[i] -= 1;
                }
            }*/

        if (spinners.length == 0 || spinners[p] == 0)
            return 0;

        int myVal = spinners[p];

        for (int i =0; i<spinners.length; i++) {

            if (p == i) {
                if (myVal == 1) {
                    return wtime + 1;
                }
                wtime += myVal;
            }


            else if (i < p) {
                if (spinners[i] <= myVal) {
                    wtime += spinners[i];
                }
                else {
                    wtime += myVal;
                }
            }
            else {
                if (spinners[i] <= myVal - 1) {
                    wtime += spinners[i];
                }
                else {
                    wtime += myVal - 1;
                }

            }
        }

        return wtime;
    }

    public static void main(String args[]) {
        System.out.println("FidgetProblem");

        int[] spinners = {2,6,3,4,5};
        int[] spinners1 = {1,1,1,1};
        int[] spinners2 = {5,5,2,3};


        System.out.println(waitingTime(spinners, 2));

        System.out.println(waitingTime(spinners1, 0));

        System.out.println(waitingTime(spinners2, 3));

    }
}
