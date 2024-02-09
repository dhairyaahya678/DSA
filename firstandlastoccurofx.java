import java.util.ArrayList;

public class firstandlastoccurofx
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        
        ArrayList<Integer> result = new ArrayList<>();
        int firstOccurrence = binarySearch(arr, n, x, true);
        int lastOccurrence = binarySearch(arr, n, x, false);
        
        result.add(firstOccurrence);
        result.add(lastOccurrence);
        
        return result;
    }

    private int binarySearch(int arr[], int n, int x, boolean isFirst) {
        int start = 0;
        int end = n - 1;
        int occur = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                occur = mid;
                if (isFirst)
                    end = mid - 1; 
                else
                    start = mid + 1;
            } else if (arr[mid] < x)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return occur;
        
    }
}
