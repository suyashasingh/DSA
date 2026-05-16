class Solution {

    List<String> result = new ArrayList<>();

    public List<String> addOperators(String num, int target) {
        solve(num, target, 0, "", 0, 0);
        return result;
    }

    public void solve(String num, int target, int index, String path, long currValue, long prev){
        if(index==num.length()){
            if(currValue == target){
                result.add(path);
            }
            return;
        }

        for(int i = index; i< num.length(); i++){
            if(i != index && num.charAt(index)=='0'){
                break;
            }

            String currStr = num.substring(index, i+1);
            Long currNum = Long.parseLong(currStr);

            if(index == 0){
                solve(num, target, i+1, currStr, currNum, currNum);
            }
            else{
                solve(num, target, i+1, path+"+"+currStr, currValue+currNum, currNum);
                solve(num, target, i+1, path+"-"+currStr, currValue-currNum, -currNum);
                solve(num, target, i+1, path+"*"+currStr, currValue-prev+(currNum*prev), prev*currNum);
            }
            
        }
    }
}