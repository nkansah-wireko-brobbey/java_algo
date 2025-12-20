public class App{
    public static void main(String[] args) {
     System.out.print("Two sum test!");

     int[] arr = {2,75,11,7};
     int target = 86;
     
     int[] indices = TwoSum.twoSum(arr, target);

     for (int index : indices){

         System.out.println("index :"+index);
     }
    }
}