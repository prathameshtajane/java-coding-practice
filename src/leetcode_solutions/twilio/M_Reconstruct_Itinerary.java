package leetcode_solutions.twilio;

/*

    332. Reconstruct Itinerary

    Link : https://leetcode.com/problems/reconstruct-itinerary/description/

    Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.

    Note:

    If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string.
    For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
    All airports are represented by three capital letters (IATA code).
    You may assume all tickets form at least one valid itinerary.
    Example 1:

    Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
    Output: ["JFK", "MUC", "LHR", "SFO", "SJC"]

    Example 2:

    Input: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
    Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
    Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"].
                 But it is larger in lexical order.

    Algorithm :

    Step 1:
    Pre-process input String[][] into HashMap<String,ArrayList<String>> with comparator of ArrayList to
    store ArrayList<String> to lexicographical order


    Step 2 :
    while(HashMap is not empty (Based on given assumption -> You may assume all tickets form at least one valid itinerary.)):
        Perform DFS starting from JFK and remove visited airport from the values.Remove key of map when corresponding
        ArrayList is empty

    todo : Finding Eulerian tours is quite like DFS, with a little change :

 */


import java.util.*;

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}

public class M_Reconstruct_Itinerary {


    public static ArrayList<String> findItineraryUtil(HashMap<String, PriorityQueue<String>> fromToMap) {
        ArrayList<String> itenary = new ArrayList<>();
        String curr_airport = "JFK";
        itenary.add(curr_airport);
        while (!fromToMap.isEmpty()) {

            if (!fromToMap.containsKey(curr_airport) || fromToMap.get(curr_airport).peek() == null) {
                curr_airport = "JFK";
                continue;
            }
            curr_airport = fromToMap.get(curr_airport).poll();
            if(fromToMap.get(curr_airport).size() == 0){
                fromToMap.remove(curr_airport);
            }
            itenary.add(curr_airport);
        }
        return itenary;
    }

    public static List<String> findItinerary(String[][] tickets) {
        HashMap<String, PriorityQueue<String>> fromToMap = new HashMap<>();
        for (String[] ticket : tickets) {
            PriorityQueue<String> tempQueue;
            tempQueue = fromToMap.containsKey(ticket[0]) ? fromToMap.get(ticket[0]) : new PriorityQueue<>(new StringComparator());
            tempQueue.add(ticket[1]);
            fromToMap.put(ticket[0], tempQueue);
        }
        return findItineraryUtil(fromToMap);
    }

    public static void main(String args[]) {
        System.out.println("M_Reconstruct_Itinerary");
        String[][] input = {{"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"}, {"ATL", "JFK"}, {"ATL", "SFO"}};
        String[][] input2 = {{"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"}, {"ATL", "JFK"}, {"ATL", "SFO"}};
        System.out.println(Arrays.toString(findItinerary(input).toArray()));
    }

}
