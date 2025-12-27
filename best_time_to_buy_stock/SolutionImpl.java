public class SolutionImpl implements Solution{

    @Override
    public int bestTimeToBuyStock(int[] arr){
        
        int lowestPriceIndex = -1;

        for (int i=0; i< arr.length; i++){
                if (lowestPriceIndex == -1){
                    lowestPriceIndex = i;
                    continue;
                }

                if (arr[lowestPriceIndex] > arr[i]){
                    lowestPriceIndex = i;
                }
                               
        }

        System.out.println("Lowest point: "+arr[lowestPriceIndex]);

        int currentProfit = 0;
        for (int i = lowestPriceIndex+1; i < arr.length; i++){

            int profit = arr[i] - arr[lowestPriceIndex];

            if (profit < 0) continue;

            if (currentProfit < profit){
                currentProfit = profit;
            }

        }
        
        return currentProfit;
    }

}