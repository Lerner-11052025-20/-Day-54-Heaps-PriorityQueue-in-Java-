
import java.util.PriorityQueue;

public class WeakestSoldier 
{
    public static class Row implements Comparable<Row>
    {
        int soldier;
        int i;

        Row(int s, int i)
        {
            this.soldier = s;
            this.i = i;
        }

        @Override
        public int compareTo(Row r2)
        {
            if(this.soldier == r2.soldier)
            {
                return this.i - r2.i;
            }
            else
            {
                return this.soldier - r2.soldier;
            }
        }
    }
    public static void main(String args[])
    {
        int army[][] = {{1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0}};

        int m = army.length;
        int n = army[0].length;
        int k=4;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i=0 ; i<m ; i++)
        {
            int count = 0;
            for(int j=0 ; j<n ; j++)
            {
                count += army[i][j] == 1 ? 1 : 0 ;
            }
            pq.add(new Row(count, i));
        }

        for(int i=0 ; i<k ; i++)
        {
            System.out.println("R" +pq.peek().i);
            pq.remove();
        }
    }    
}
