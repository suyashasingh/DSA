class Solution {
    int count = 0;
    public int numTilePossibilities(String tiles) {

        char[] arr = tiles.toCharArray();
        Arrays.sort(arr);
        boolean[] used = new boolean[arr.length];
        
        solve(arr, used);
        return count;
    }

    public void solve(char[] arr, boolean[] used){
        for(int i = 0; i<arr.length; i++){

            if(used[i]){
                continue;
            }
            if(i>0 && arr[i] == arr[i-1] && !used[i-1]){
                continue;
            }

            used[i] = true;
            count++;

            solve(arr, used);

            used[i] = false;
        }
    }
}