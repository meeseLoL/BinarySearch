import java.util.Random;
public class BinarySearch {


public static void printArray(int[] array) {
     System.out.print("[");
     for(int i = 0; i < array.length; i++) {
         System.out.print(array[i]);
         if(i < array.length - 1) {
             System.out.print(",");
         }
          
     }
     System.out.println("]");
   }
   public static int binarySearch(int[] array, int value) {
       int low = 0;
       int high = array.length -1; // last element
       int middle;
       
       while (low <= high) {
         middle = (low + high) / 2;
         
         if (array[middle] == value) {
            return middle; // element found.. return the index
         } else if (array[middle] < value) {
            low = middle + 1; //adjust low for he right half
            } else {
            high = middle - 1; //adjust for left half
            }
         }
         return -1; //not found   
   }
   public static void main(String[]args) {

       int[] array1 = {1};
       int[] array2 = {};
       int[] array3 = {1,2,3,4};
       int[] array5 = {1,2,3,4,5};
      
      
       /** Test to make sure that your algorithm works with the following:
       Any modifications to the arrays will be rewarded with 0 points
       Make sure that all the ouputs are correct*/
       System.out.println("Does Not Exist: " + binarySearch(array1, 4) );
       System.out.println("Expected: 0 Returned:" + binarySearch(array1, 1) );
       System.out.println("Does Not Exist: " + binarySearch(array1, 0) );
       
       System.out.println("---------------------");
       
       System.out.println("Does Not Exist: "  + binarySearch(array2, 2)); 
        
       System.out.println("---------------------");
        
       System.out.println("Does Not Exist: "  + binarySearch(array3, 5) );
       System.out.println("Does Not Exist: "  + binarySearch(array3, -1) );
       System.out.println("Expected: 3 Returned: " + binarySearch(array3, 4) );
       System.out.println("Expected: 0 Returned: " + binarySearch(array3, 1) );
       System.out.println("Expected: 1 Returned: " + binarySearch(array3, 2) );
       System.out.println("Expected: 2 Returned: " + binarySearch(array3, 3) );
       
       System.out.println("---------------------");
       
       System.out.println("Does Not Exist: " + binarySearch(array5, -1) );
       System.out.println("Does Not Exist: " + binarySearch(array5, 7) );
       System.out.println("Expected: 4 Returned: " + binarySearch(array5, 5) );
       System.out.println("Expected: 0 Returned: " + binarySearch(array5, 1) );
       System.out.println("Expected: 2 Returned: " +binarySearch(array5, 3) );
       System.out.println("Expected: 1 Returned: " + binarySearch(array5, 2) );
       System.out.println("Expected: 3 Returned: " +binarySearch(array5, 4) );
       
       
       System.out.println("---------------------");
       
       
       
       
   }
}
