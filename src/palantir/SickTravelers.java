package palantir;

import java.util.*;

public class SickTravelers {

    static HashMap<String, String[]> personLocationsMap = new HashMap<>();
    static HashMap<String, Integer> personCurrentLocationIndex = new HashMap<>();
    static HashMap<String, String> personCurrentHealthStatus = new HashMap<>();
    static Set<String> uniqueLocations = new HashSet<>();
    static HashMap<String,List<String>> locationCurrStaffCurrDay = new HashMap<>();
    static HashMap<String,List<String>> locationCurrStaffNextDay = new HashMap<>();

    static HashMap<String,String> currStatusNextStatusMap = new HashMap<>();

    static String[] traceDisease(String[] initialStates){
        for(String eachEnry : initialStates){
            String[] record = eachEnry.split(" ");
            personCurrentHealthStatus.put(record[0],record[1]);
            personLocationsMap.put(record[0], Arrays.copyOfRange(record,2,record.length));

            List<String> tempLocation = Arrays.asList(personLocationsMap.get(record[0]));
            uniqueLocations.addAll(tempLocation);
        }

        for(String eachLocation : uniqueLocations){
            locationCurrStaffCurrDay.put(eachLocation,new ArrayList<>());
            locationCurrStaffNextDay.put(eachLocation,new ArrayList<>());
        }

        currStatusNextStatusMap.put("HEALTHY","SICK");
        currStatusNextStatusMap.put("SICK","RECOVERING");
        currStatusNextStatusMap.put("RECOVERING","HEALTHY");

        for(String person : personLocationsMap.keySet()){
            List<String> tempList = locationCurrStaffCurrDay.get(person);
            tempList.add(person);
            locationCurrStaffCurrDay.put(personLocationsMap.get(person)[0],tempList);
        }

        for(int i=1;i<=365;i++){
            for(String location : locationCurrStaffCurrDay.keySet()){
                List<String> staffAtCurrLocation = locationCurrStaffCurrDay.get(location);
//                boolean as
                for(String person : staffAtCurrLocation){

                }
            }
        }
        return null;

    }

    public static void main(String arg[]){
        System.out.println("SickTravelers");
    }
}
