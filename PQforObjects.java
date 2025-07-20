
import java.util.PriorityQueue;

public class PQforObjects 
{
    public static class Student implements Comparable<Student>
    {
        String name;
        int rank;

        Student(String n, int r)
        {
            this.name = n;
            this.rank = r;
        }

        @Override
        public int compareTo(Student s2)
        {
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[])
    {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("a", 205));
        pq.add(new Student("b", 1));
        pq.add(new Student("c", 10));
        pq.add(new Student("d", 78));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+ "----->" +pq.peek().rank);
            pq.remove();
        }
    }    
}
