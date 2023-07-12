import java.util.HashMap;
import java.util.Map;



class twosum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            numMap.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two numbers add up to the target");
    }
    public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    
    twosum solution = new twosum();
    int[] result = solution.twoSum(nums, target);
    
    System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
}

}
