package goldman_sachs;


import java.util.*;

public class SchoolAllotment {

    // Complete the allocateSchools function below.
    static class CompareByValues implements Comparator<Integer> {
        Map<Integer, Integer> testMap;
        public CompareByValues(Map<Integer, Integer> testMap){
            this.testMap=testMap;
        }
        public int compare(Integer s1,Integer s2){
            return (testMap.get(s2)).compareTo(testMap.get(s1));
        }
    }
    static List<Integer> allocateSchools(List<Integer> schoolSeatsArray, List<Integer> studentScoreArray, List<List<Integer>> studentSchoolPreferencesArray) {

        Map<Integer, Integer> schoolSeats = new HashMap<Integer, Integer>();
        for(int i = 0; i<schoolSeatsArray.size(); i++)
            schoolSeats.put(i, schoolSeatsArray.get(i));

        Map<Integer,Integer> testMap = new HashMap<Integer,Integer>();
        CompareByValues compareValues = new CompareByValues(testMap);
        for(int j = 0; j<studentScoreArray.size(); j++)
            testMap.put(j, studentScoreArray.get(j));
        TreeMap<Integer,Integer> testTreeMap = new TreeMap<>(compareValues);
        testTreeMap.putAll(testMap);

        List<Integer> removeStudent = new ArrayList();
        for(int key1 : testTreeMap.keySet()){
            List<Integer> studentPrefList = studentSchoolPreferencesArray.get(key1);
            for(int k : studentPrefList){
                if(schoolSeats.containsKey(k)){
                    int noOfSeats = schoolSeats.get(k);
                    if(noOfSeats <= 0){
                        schoolSeats.remove(k);
                        continue;
                    }

                    noOfSeats = noOfSeats - 1;
                    if(noOfSeats > 0){
                        schoolSeats.put(k, noOfSeats);
                    } else{
                        schoolSeats.remove(k);
                    }
                    removeStudent.add(key1);
                    break;
                }
            }
        }
        int emptySeats = 0;
        for(int seat1 : schoolSeats.keySet()){
            emptySeats = emptySeats + schoolSeats.get(seat1);
        }
        int studentsNotAlloted = testTreeMap.size() - removeStudent.size();

        List<Integer> op = new ArrayList<Integer>();
        op.add(emptySeats);
        op.add(studentsNotAlloted);

        return op;

    }

    public static void main(String args[]){
        System.out.println("goldman_sachs : SchoolAllotment");
    }
}
