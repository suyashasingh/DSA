class Solution {
    public boolean isCycle(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i<V ;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visited = new boolean[V];
        
        for(int i = 0; i<V; i++){
            if(!visited[i]){
               if(dfs(i, -1, visited, adj)){
                   return true;
               }
            }
        }
        return false;

    }
    
    public boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        
        visited[node] = true;
        
        for(int neighbour : adj.get(node)){
            if(!visited[neighbour]){
                if(dfs(neighbour, node, visited, adj)){
                    return true;
                }
            }
            else if(neighbour != parent){
                return true;
                
            }
        }
        return false;
    }
}