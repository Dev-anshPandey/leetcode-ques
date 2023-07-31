class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1) return;
        k=k%nums.length;
        int i=0;
        int  j=nums.length-1;
        int temp=0;
        while(i<j){
            temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
         i=0;
         j= k-1;
         temp=0;
        while(i<j){
            temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
        i=k;
         j=nums.length-1;
       while(i<j){
            temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
         
    }
}

//https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150