import java.util.PriorityQueue;

public class PQusingJCF
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(7);

        System.out.println(pq);

        // System.out.println(pq.peek());
        while(!pq.isEmpty())
        {
            System.out.println(pq.remove()); // [1, 4, 2, 7]
            // pq ni inside sorted manner ma j data stored hoy chhe 100% sathi vaat chhe mara MATE
            // SORTED rite j store thay chhe tene yaad rakho
        }
    }
}