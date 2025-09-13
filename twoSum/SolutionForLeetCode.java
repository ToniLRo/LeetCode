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
}
