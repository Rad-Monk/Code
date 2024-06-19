public class _74 {
    public boolean binarySearch(int[] array, int left, int right, int target){
        while(left <= right){
            int mid = left + (right -left )/2;
            if(target == array[mid]) return true;
            if(target < array[mid]) right = mid - 1;
            if(target > array[mid]) left = mid + 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int i;
        for(i =0; i < matrix.length; i++){
            if(target == matrix[i][0]) return true;
            if(target <= matrix[i][0]) break;
        }
        return binarySearch(matrix[i==0? i:i-1], 0, matrix[i==0? i:i-1].length-1, target);
    }

    public static void main(String[] args) {
        _74 obj = new _74();
        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(obj.searchMatrix(matrix, 3));
    }
}
