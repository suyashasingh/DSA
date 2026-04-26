// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        
        //at each point we have 2 decisions wheather we can take this point or skip this point,
        //when you want to skip do- index+1, sum
        //when you want to take do- index+1, sum+arr[i]
        
        
        ArrayList<Integer> result = new ArrayList<>();
        solve(0, 0, arr, result);
        return result;
    }
    
    public void solve(int index, int sum, int[] arr, ArrayList<Integer> result){
        if(index == arr.length){
            result.add(sum);
            return;
        }
        
        solve(index+1, sum+arr[index], arr, result);
        
        solve(index+1, sum, arr, result);
    }
}