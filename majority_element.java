class Solution {
    public int majorityElement(int[] nums) {
        int freq=1;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) freq++;
            else freq=1;
            if((n%2==0 && freq>n/2) || freq> (n-1)/2 ) return nums[i];
        }
         if((n%2==0 && freq>n/2) || freq> (n-1)/2 ) return nums[n-1];
        return nums[0];
    }
}


//https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150