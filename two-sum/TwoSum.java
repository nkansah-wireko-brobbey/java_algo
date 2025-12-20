
import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public static int[] twoSum(int[] arr, int target){

        Map<Integer, Integer> targetMap = new HashMap<>();

        int[] indices = {-1,-1};

        for (int num= 0; num < arr.length; num++){
            int difference = target - arr[num];

            int secondIndex = targetMap.getOrDefault(difference, -1);

            if (secondIndex != -1){
                indices[0] = num;
                indices[1] = secondIndex;
            }
            targetMap.put(arr[num], num);
        }

        return indices;
    }
}