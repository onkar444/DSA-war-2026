class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount=0;
        for(int i: nums){
            if(i!=0){
                product*=i;
            }
            else{
                zeroCount++;
            }
        }
        
        int ans[]=new int[nums.length];
        if(zeroCount>=2){
            return ans;
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0 && zeroCount==1){
                ans[i]=product;
            }
            if(nums[i]!=0 && zeroCount==1){
                ans[i]=0;
            }
            if(nums[i]!=0 && zeroCount == 0){
                ans[i]=product/nums[i];
            }
        }
        return ans;
    }
}
