class Solution {
    public int jump(int[] nums) {
        int jump=0,curend=0,curfarthest=0;
        for(int i=0;i<nums.length-1;i++){
            curfarthest=Math.max(curfarthest,i+nums[i]);
            if(i==curend){
                jump++;
                curend=curfarthest;
            }
        }
        return jump;
    }
}