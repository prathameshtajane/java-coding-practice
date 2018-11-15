package gracenote;/*
Name   MappingID
ABC       1
BCD       2
ABC       3
CDA       4
ABC       5
BCD       6
CDA       7
EFG       8

//first table
ABC -> 1,3,5
BCD -> 2,6
CDA -> 4,7
EFG -> 8

//second table
MappingID   ProvisionId
   1			101
   6			102
   4			103
   8			104

Output:

Name    ProvisionId
ABC			101
BCD			102
CDA			103
EFG			104


 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gracenote {

    private static Map<String, List<Integer>> getProvisionIdMapping(Map<String,List<Integer>> nameMapIdMap,Map<String,Integer> mapIdProbIdMap){
        Map<String,List<Integer>> op_map = new HashMap<>();
        for(String name : nameMapIdMap.keySet()){
            List<Integer> mapIdList = nameMapIdMap.get(name);
            for(int i = 0 ; i < mapIdList.size(); i++){
                int temp_map_id =  mapIdList.get(i);
                if(mapIdProbIdMap.containsKey(temp_map_id)){
                    List<Integer> temp_op_list;
                    if(op_map.get(name) == null){
                        temp_op_list = new ArrayList<>();
                    }else{
                        temp_op_list = op_map.get(name);
                    }
                    //temp_op_list=(op_map.get(name) == null) ? new ArrayList<>() : op_map.get(name);
                    temp_op_list.add(mapIdProbIdMap.get(temp_map_id));
                    op_map.put(name,temp_op_list);

                }
            }
        }
        return op_map;
    }

    public static void main(String[] args) {
    }

}
