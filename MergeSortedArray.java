class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                res[k++]=nums1[i++];
                 
            }
            else{
                res[k++]=nums2[j++];
            }
        }
        while(i<m){
            res[k++]=nums1[i++];
        }
        while(j<n){
            res[k++]=nums2[j++];
        }
        for( i=0;i<res.length;i++){
            nums1[i]=res[i];
        }
    }
}


//https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150