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
          if(node == null) return null; // if the actual node is empty there is nothing to copy, so return null
        Node copy = new Node(node.val); // create a new node , with same value as the root node(given node)
        Node[] visited = new Node[101]; 
        Arrays.fill(visited , null); // initially store null at all places
        dfs(node , copy , visited); // make a dfs call for traversing all the vertices of the root node
        return copy;
    }
    public void dfs(Node node,Node copy,Node[] visited){
        visited[copy.val]=copy;
        for(Node n : node.neighbors){
            if(visited[n.val]==null){
                Node newnode= new Node(n.val);
                copy.neighbors.add(newnode);
                dfs(n,newnode,visited);
            }
            else{
                copy.neighbors.add(visited[n.val]);
            }
        }
    }
}