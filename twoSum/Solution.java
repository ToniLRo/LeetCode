class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Usamos un HashMap para almacenar el valor y su índice
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Si encontramos el complemento en el mapa, retornamos los índices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            // Guardamos el valor actual y su índice
            map.put(nums[i], i);
        }
        
        // Si no encontramos solución, retornamos un array vacío
        return new int[0];
    }
    
    // Método main para probar la solución
    /*public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Caso de prueba 1: [2,7,11,15], target = 9
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Caso 1 - Array: [2,7,11,15], Target: 9");
        System.out.println("Resultado: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Verificación: " + nums1[result1[0]] + " + " + nums1[result1[1]] + " = " + (nums1[result1[0]] + nums1[result1[1]]));
        System.out.println();
        
        // Caso de prueba 2: [3,2,4], target = 6
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Caso 2 - Array: [3,2,4], Target: 6");
        System.out.println("Resultado: [" + result2[0] + ", " + result2[1] + "]");
        System.out.println("Verificación: " + nums2[result2[0]] + " + " + nums2[result2[1]] + " = " + (nums2[result2[0]] + nums2[result2[1]]));
        System.out.println();
        
        // Caso de prueba 3: [3,3], target = 6
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Caso 3 - Array: [3,3], Target: 6");
        System.out.println("Resultado: [" + result3[0] + ", " + result3[1] + "]");
        System.out.println("Verificación: " + nums3[result3[0]] + " + " + nums3[result3[1]] + " = " + (nums3[result3[0]] + nums3[result3[1]]));
        System.out.println();
        
        // Caso de prueba personalizado - puedes modificar estos valores
        System.out.println("=== CASO PERSONALIZADO ===");
        int[] customNums = {1, 5, 3, 8, 2, 9};
        int customTarget = 10;
        int[] customResult = solution.twoSum(customNums, customTarget);
        System.out.println("Array personalizado: [1,5,3,8,2,9], Target: 10");
        if (customResult.length > 0) {
            System.out.println("Resultado: [" + customResult[0] + ", " + customResult[1] + "]");
            System.out.println("Verificación: " + customNums[customResult[0]] + " + " + customNums[customResult[1]] + " = " + (customNums[customResult[0]] + customNums[customResult[1]]));
        } else {
            System.out.println("No se encontró solución");
        }
    }*/
    
    // Método auxiliar para imprimir arrays de forma legible
    /*public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }*/
}