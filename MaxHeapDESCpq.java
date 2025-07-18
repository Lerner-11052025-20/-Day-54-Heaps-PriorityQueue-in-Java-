import java.util.ArrayList;

public class MaxHeapDESCpq 
{
    public static class Heap
    {
        ArrayList<Integer> list = new ArrayList<>();

        void add(int data)
        {
            list.add(data);

            int x = list.size()-1;
            int par = (x-1)/2;

            while(list.get(x) > list.get(par))
            {
                int t = list.get(x);
                list.set(x, list.get(par));
                list.set(par, t);

                x = par;
                par = (x-1)/2;
            }
        }

        int peek()
        {
            return list.get(0);
        }

        void heapify(int i)
        {
            int maxIndex = i;
            int l = 2*i+1;
            int r = 2*i+2;

            if(l < list.size() && list.get(l) > list.get(maxIndex))     maxIndex = l;
            if(r < list.size() && list.get(r) > list.get(maxIndex))     maxIndex = r;
            if(maxIndex != i)
            {
                int t = list.get(maxIndex);
                list.set(maxIndex, list.get(i));
                list.set(i, t);

                heapify(maxIndex);
            }
        }

        int remove()
        {
            int data = list.get(0);

            int t = list.get(0);
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1, t);

            list.remove(list.size()-1); // last O(1) front O(n) swap each left by 1 index

            heapify(0);

            return data;
        }

        boolean isEmpty()
        {
            return list.isEmpty();
        }
    }
    public static void main(String args[])
    {
        Heap h = new Heap();
        h.add(5);
        h.add(1);
        h.add(8);
        h.add(50);
        h.add(0);
        h.add(10);
        h.add(20);

        System.out.println(h.list);

        System.out.println(h.peek());

        while(!h.isEmpty())
        {
            System.out.println(h.remove());
        }
    }    
}
