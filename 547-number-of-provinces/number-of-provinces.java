class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int province = 0;

        for(int city = 0; city<n; city++){
            if(!visited[city]){
                dfs(city,isConnected, visited);
                province++;
            }
        }
        return province;
        
    }

    public void dfs(int node, int[][] isConnected, boolean[] visited){
        visited[node] = true;

        for(int neighbour = 0; neighbour<isConnected.length ; neighbour++){
            if(isConnected[node][neighbour] == 1 && !visited[neighbour]){
                dfs(neighbour, isConnected, visited);
            }
        }
    }
}