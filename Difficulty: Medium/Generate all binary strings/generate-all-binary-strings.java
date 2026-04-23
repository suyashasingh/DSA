class Solution {
    public ArrayList<String> binstr(int n) {
        
        ArrayList<String> result = new ArrayList<>();
        solve(n, "", result);
        return result;
        // code here
    }
    
    public void solve(int n, String curr, List<String> result){
        if(curr.length() == n){
            result.add(curr);
            return;
        }
        
        solve(n, curr+"0", result);
        
        solve(n, curr+"1", result);
    } 
}
