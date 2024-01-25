/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Map<Integer, Node> map = new HashMap<>();
        return cloneGraph(node, map);
    }
    
    private Node cloneGraph(Node node, Map<Integer, Node> map) {
        if (node == null) return null;
        if (map.containsKey(node.val)) return map.get(node.val);
        
        Node newNode = new Node(node.val, new ArrayList<>());
        map.put(node.val, newNode);
        
        for (Node neighbor : node.neighbors) {
            newNode.neighbors.add(cloneGraph(neighbor, map));
        }
        
        return newNode;
    }
}