class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestInt=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int rigth=nums.length-1;
            while(left < rigth){
                int currentInt=nums[i]+nums[left]+nums[rigth];
                if(Math.abs(currentInt-target) < Math.abs(closestInt-target)){
                    closestInt = currentInt;
                }
                else if(currentInt < target){
                    left+=1;
                }
                else if(currentInt > target){
                    rigth-=1;
                }else{
                    return currentInt;
                }
            }
        }
        return closestInt;
        
    }
}
