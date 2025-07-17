
import java.util.PriorityQueue;

public class ConnectNropes 
{
    public static void main(String args[])
    {
        // int ropes[] = {2, 3, 3, 4, 6};
        int ropes[] = {2, 3, 6, 4 };

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0 ; i<ropes.length ; i++)
        {
            pq.add(ropes[i]);
        }

        int count = 0;
        while(pq.size() > 1)
        {
            int min = pq.remove();
            int min2 = pq.remove();
            count += min + min2;
            pq.add(min+min2);
        }

        System.out.println(count);
    }    
}
