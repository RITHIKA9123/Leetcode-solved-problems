public class Solution {  
    public int[] twoSum(int[] nums, int target) {
       ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) {
                   arr.add(i);
                   arr.add(j);
                   return new int[]{i, j}; 
            }
            
            }
        }
         return new int[]{};
    }
}