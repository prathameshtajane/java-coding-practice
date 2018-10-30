package linkedIn;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UserNameSystem {

    public static List<String> usernameSystem(List<String> u){
        HashMap<String,Integer> umap = new HashMap<>();
        List<String> opList = new ArrayList<>();

        for(String username : u){
            String tempUname = null;
            if(umap.containsKey(username)){
                tempUname=username+(umap.get(username)+1);
                umap.put(username,(umap.get(username)+1));
            }else{
                tempUname=username;
                umap.put(username,0);
            }
            opList.add(tempUname);
        }

        return opList;
    }

    public static void main(String args[]){
        System.out.println("UserNameSystem");
        String[] input1 = {"john","john","tom","john"};
        String[] input2 = {"alex","xylos","alex","alan"};
        String[] input3 = {"alex","xylos","alan"};
        String[] input4 = {"alex"};
        String[] input5 = {};




//        System.out.println(usernameSystem(Arrays.asList(input1)));
        System.out.println(usernameSystem(Arrays.asList(input2)));
        System.out.println(usernameSystem(Arrays.asList(input3)));
        System.out.println(usernameSystem(Arrays.asList(input4)));
        System.out.println(usernameSystem(Arrays.asList(input5)));


    }
}
