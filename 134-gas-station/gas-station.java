class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalgas = 0;
        int tank = 0;
        int start = 0;
        for(int i = 0; i<gas.length;i++){
            totalgas+=gas[i]-cost[i]; // gas[i] -> how much gas is needed to travel from 1 point to another
            //cost[i]-> how much cost it takes to travle 1 point to another
            tank+=gas[i]-cost[i];

            if(tank<0){
                start = i+1;
                tank=0;
            }
        }

        if(totalgas<0){
            return -1;
        }
        return start;
        
    }
}