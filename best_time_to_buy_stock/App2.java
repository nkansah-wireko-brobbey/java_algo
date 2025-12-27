public class App2{
    public static void main(String[] args) {
        Solution solution = new SolutionImpl();
        int profit = solution.bestTimeToBuyStock(new int[]{7,1,5,3,6,90});
        System.out.println("Profit: "+profit);
    }
}