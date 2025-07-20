
import java.util.PriorityQueue;

public class SlidingWindowMaximum 
{
    public static class Pair implements Comparable<Pair>
    {
        int val;
        int idx;

        Pair(int x, int i)
        {
            this.val = x;
            this.idx = i;
        }

        @Override
        public int compareTo(Pair p2)
        {
            // ASC return this.val - p2.val;
            // DESC mate
            return p2.val - this.val;
        }
    }
    public static void main(String args[])
    {
        int nums[] = {1, 3, -1, -3, 5, 3, 6, 7};
        
        int k=3;
        int res[] = new int[nums.length-k+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0 ; i<k ; i++)
        {
            pq.add(new Pair(nums[i], i));
        }

        res[0] = pq.peek().val;

        for(int i=k ; i<nums.length ; i++)
        {
            while(pq.size() > 0 && pq.peek().idx <= i-k)
            {
                pq.remove();
            }
            pq.add(new Pair(nums[i], i));
            res[i-k+1] = pq.peek().val;
        }

        for(int i: res) System.out.print(i+ " ");
    }    
}
