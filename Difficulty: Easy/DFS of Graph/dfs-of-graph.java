class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        
        int V = adj.size();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfs(0, adj, visited, ans);
        return ans;
    }
    
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans){
        
        visited[node]= true;
        ans.add(node);
        
        for(int neighbour : adj.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour, adj , visited, ans);
            }
        }
    }
}