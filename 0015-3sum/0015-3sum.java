class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> twosum = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
    
      for(int i=0; i<nums.length-2; i++){
        int target = 0 - nums[i];
        if(i>0 && nums[i] == nums[i-1])
        continue;
        twosum = twoSum(nums, i, target);
        ans.addAll(twosum);
        
    }
    return ans; 
    }
    public List<List<Integer>> twoSum(int[] nums, int fixed, int target){
        int left = fixed + 1;
        int right = nums.length - 1;
        List<List<Integer>> ans = new ArrayList<>();
        while(left<right){
            if(nums[left] + nums[right] == target){
            ans.add(Arrays.asList(nums[fixed] , nums[left], nums[right]));
            left++;
            right--;
            while(left< right && nums[left] == nums[left-1])
            left++;
            while(left< right && nums[right] == nums[right+1])
            right--;
            }
            else if (nums[left] + nums[right] < target)
            left++;
            else
            right--;

        }
        return ans;
    } 
}
