class productarraypuzzle 
{ 
    public static long[] productExceptSelf(int nums[], int n) 
    { 
        long answer[]=new long[n];
        
        long leftval=1;
        for(int i=0;i<n;i++)
        {
           answer[i]=leftval;
           leftval*=nums[i];
        }
        long rightval=1;
        for(int i=n-1;i>=0;i--)
        {
          answer[i]=answer[i]*rightval;
          rightval*=nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {

        int[] nums = {10, 3, 5, 6, 2};
        int n = nums.length;

        long[] result = productExceptSelf(nums, n);

        System.out.println("Product of array except self:");
        for (long num : result) {
            System.out.print(num + " ");
        }
    } 
}
