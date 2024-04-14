import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args)
    {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
        if(result != null ){
            System.out.println("Indices of the two numbers whose sum equals target");
            System.out.println("["+result[0]+","+result[1]+"]");
        }
        else{
            System.out.println("Invalid input");
        }
    
    }
    
    
    public static int[] twoSum(int[] nums, int target){
    
        int[] result = new int[2];
        Map <Integer,Integer> map= new HashMap<>();
    
        for(int i =0;i<nums.length;++i){
            int complement = target - nums[i];
        
        if(map.containsKey(complement)){

            result[0]=map.get(complement);
            result[1]=i;
            return result;
        }

           map.put(nums[i], i);
        }
    
            return null;
    }
    
    
}