import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class test1{

//    static boolean decision(){
//        try{
//            return true;
//        }catch (Exception e){
//            System.out.println(e);
//        }finally{
//            return false;
//        }
//    }
    public static void main(String args[]){
        System.out.println("Hello World !");
        Map<Integer, ArrayList<Integer>> testMap = new HashMap<>();
        for(int i = 0 ; i <=5 ;i++){
            ArrayList<Integer> tempList = testMap.get(i);
            testMap.put(i,(tempList.size()==0? new ArrayList<Integer>() : tempList));
        }
    }
}