class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int currGas = 0;
        int store = 0;
        for(int i = 0; i < gas.length; i++){
            int dif = gas[i] - cost[i];
            store += dif;
            currGas += dif;

            if(currGas < 0){
                start = i+1;
                currGas = 0;
            }
            
        }
        if(store < 0){
            return -1;
        }
        return start;
    }
}