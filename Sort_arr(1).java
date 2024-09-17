public class Sort_arr(1) {

    public static void sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp2;
                    high--;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 0, 1, 1, 0, 2,1,2,0};
        sortArray(arr);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
