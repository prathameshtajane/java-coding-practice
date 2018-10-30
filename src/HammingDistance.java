import java.util.ArrayList;
import java.util.Collections;

public class HammingDistance {

    private static final ArrayList<Integer> binaryNumArray=new ArrayList();


    public static int hammingDistance(int x, int y) {
        ArrayList  binNum1=decToBinary(x);
        ArrayList  binNum2=decToBinary(y);

        if(binNum1.size()>=binNum2.size()){
            binNum2=spanArrayList(binNum1,binNum2);
        }else{
            binNum1=spanArrayList(binNum1,binNum2);
        }

        System.out.println("binNum1 : "+binNum1);
        System.out.println("binNum2 : "+binNum2);

        return deltaArrayList(binNum1,binNum2);
    }

    public static int deltaArrayList(ArrayList<Integer> lista,ArrayList<Integer> listb){
        int hammingDistance=0;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i) !=listb.get(i)){
                hammingDistance++;
            }
        }
        return hammingDistance;
    }


    public static ArrayList<Integer> spanArrayList(ArrayList<Integer> listx,ArrayList<Integer> listy){
        if(listx.size()>=listy.size()){
            int diff=listx.size()-listy.size();
            return populateArrayList(listy,diff);
        }else{
            int diff=listy.size()-listx.size();
            return populateArrayList(listx,diff);
        }
    }

    public static ArrayList<Integer> populateArrayList(ArrayList<Integer> listz,int dist){
        Collections.reverse(listz);
        while(dist != 0){
            listz.add(0);
            dist--;
        }
        Collections.reverse(listz);
        return listz;
    }



    public static ArrayList<Integer> decToBinary(int x) {
        ArrayList<Integer> binaryNumArray1=new ArrayList<>();
        if (x <= 0) {
            binaryNumArray1.add(0);

        } else {
            while (x != 0) {
                binaryNumArray1.add(x % 2);
                x = x / 2;
            }
            Collections.reverse(binaryNumArray1);
        }
        return binaryNumArray1;
    }


    public static void main(String args[]){
        System.out.println("Main initialted");
        System.out.println("Hamming Distance "+hammingDistance(4,0));

    }

}
