package leetcode_solutions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 133. Clone Graph
 *
 * Given the head of a graph, return a deep copy (clone) of the graph. Each node in the graph contains a label (int)
 * and a list (List[UndirectedGraphNode]) of its neighbors. There is an edge between the given node and each of the
 * nodes in its neighbors.
 *
 *
 * OJ's undirected graph serialization (so you can understand error output):
 * Nodes are labeled uniquely.
 *
 * We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 *
 *
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 *
 * The graph has a total of three nodes, and therefore contains three parts as separated by #.
 *
 * First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * Second node is labeled as 1. Connect node 1 to node 2.
 * Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 *
 *
 * Visually, the graph looks like the following:
 *
 *        1
 *       / \
 *      /   \
 *     0 --- 2
 *          / \
 *          \_/
 * Note: The information about the tree serialization is only meant so that you can understand error output if you get
 * a wrong answer.
 *
 * You don't need to understand the serialization to solve the problem.
 *
 * link : https://leetcode.com/problems/clone-graph/description/
 */
public class M_Amazon_Clone_Graph {
    class UndirectedGraphNode {
         int label;
         List<UndirectedGraphNode> neighbors;
         UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    }

    Map<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null){
            return null;
        }

        //create new UndirectedGraphNode node
        UndirectedGraphNode current_node = new UndirectedGraphNode(node.label);
        map.put(node,current_node);
        for(UndirectedGraphNode neighbor : node.neighbors){
            if(!map.containsKey(neighbor)){
                cloneGraph(neighbor);
            }
            current_node.neighbors.add(map.get(neighbor));
        }
        return current_node;
    }
}
