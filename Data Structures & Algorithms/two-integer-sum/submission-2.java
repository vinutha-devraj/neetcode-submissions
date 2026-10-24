class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;

        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
       int moreneeded = target-nums[i];
      if(hm.containsKey(moreneeded)&&hm.get(moreneeded)!=i){
                return new int[]{i,hm.get(moreneeded)};
            }
        }
        return new int [0];
    }
}
