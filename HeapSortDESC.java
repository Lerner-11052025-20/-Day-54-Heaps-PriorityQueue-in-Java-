public class HeapSortDESC 
{
    public static void heapify(int nums[], int i, int size)
        {
            int minIndex = i;
            int l = 2*i+1;
            int r = 2*i+2;

            if(l < size && nums[l] < nums[minIndex])     minIndex = l;
            if(r < size && nums[r] < nums[minIndex])     minIndex = r;
            if(minIndex != i)
            {
                int t = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = t;

                heapify(nums, minIndex, size);
            }
        }

    public static void heapSort(int nums[])
    {
        int n = nums.length;

        // for descending order uses the minHeap
        for(int i=n/2 ; i>=0 ; i--)
        {
            heapify(nums, i, n);
        }

        for(int i=n-1 ; i>=1 ; i--)
        {
            int t = nums[0];
            nums[0] = nums[i];
            nums[i] = t;

            heapify(nums, 0, i);
        }
    }
    public static void main(String args[])
    {
        int nums[] = {4, 2, 5, 3, 1};
        heapSort(nums);

        for(int i: nums)    System.out.println(i);
    }    
}

