import java.util.Arrays;

public class SolutionMedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        
        int totalLength = length1 + length2;
        
        int[] totalArray = new int[totalLength];

        for (int i = 0; i < length1; i = i + 1) {

            // Storing the elements in
            // the resultant array
            totalArray[i] = nums1[i];
        }

        // Loop to concat the elements of second
        // array into resultant array
        for (int i = 0; i < length2; i = i + 1) {

            // Storing the elements in the
            // resultant array
            totalArray[length1 + i] = nums2[i];
        }
        
        Arrays.sort(totalArray);
                
        if (totalLength % 2 != 0) {
            return totalArray[totalLength / 2]; 
        } else {
            int elemento1 = totalArray[(totalLength / 2) - 1];
            int elemento2 = totalArray[totalLength / 2];
            return (double) (elemento1 + elemento2) / 2;
        }
                
        

    }

    // Método main para probar la solución
    public static void main(String[] args) {
    	SolutionMedianofTwoSortedArrays solution = new SolutionMedianofTwoSortedArrays();
    	int[] nums1 = new int[2];
    	nums1[0] = 1;
    	nums1[1] = 3;
    	int[] nums2 = new int[1];
    	nums2[0] = 2;
        System.out.println(solution.findMedianSortedArrays(nums1,nums2));
    
    }

}
