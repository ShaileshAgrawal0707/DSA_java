class Tester {
    public static int[] getMaxMin(int[] arr, int low, int high) { 
        if (low == high) {
            return new int[]{arr[low], arr[low]};
        }
        if (high - low == 1) {
            if (arr[low] > arr[high]) {
                return new int[]{arr[low], arr[high]};
            } else {
                return new int[]{arr[high], arr[low]};
            }
        }
        int mid = (low + high) / 2;
        int[] leftResult = getMaxMin(arr, low, mid);
        int[] rightResult = getMaxMin(arr, mid + 1, high);
        int max = Math.max(leftResult[0], rightResult[0]);
        int min = Math.min(leftResult[1], rightResult[1]);
        return new int[]{max, min};
    } 
    public static void main(String args[]) { 
        int arr1[] = {1000, 10, 5, 1, 2000};
        int arr2[] = {2,3};
        int[] result1 = getMaxMin(arr1, 0, arr1.length - 1);
        int[] result2 = getMaxMin(arr2,0,arr2.length - 1);
        System.out.println("Minimum value for array1 " + result1[1]); 
        System.out.println("Maximum value for array1 " + result1[0]); 
        System.out.println("Minimum value array2 " + result2[1]); 
        System.out.println("Maximum value arrat2 " + result2[0]); 
    } 
}
