public class threewayPartition {

    public static void threewaypartition(int[] array, int a,int b) {
        int n = array.length;
        int low = 0; 
        int mid = 0; 
        int high = n - 1;

        while (mid <= high) {
            if (array[mid] < a) {
               
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            } else if (array[mid] > b) {
              
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            } else {
              
                mid++;
            }
        }
    }

    public static void main(String args[]) {
        int a = 1;
        int b = 2; 
        int[] array = {1, 2, 3, 3, 4};
        threewaypartition(array, a, b );
        
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
