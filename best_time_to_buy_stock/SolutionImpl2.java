
public class SolutionImpl2 implements Solution {

    @Override
    public int bestTimeToBuyStock(int[] arr) {
        int buy = arr[0];
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (buy >= arr[i]) {
                buy = arr[i];
            } else {
                profit = (arr[i] - buy) > profit? arr[i] - buy : profit;
            }
        }
        return profit;
    }


}
