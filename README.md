🔥 Day-54: Heaps & PriorityQueue in Java 🔥
#DSA #Java #Consistency #LevelUp

🚀 What You Will Learn Today:
What is a Heap?

Types of Heaps

PriorityQueue in Java (MinHeap / MaxHeap)

Use-Cases of Heaps

Coding Examples in Java

📚 1️⃣ What is a Heap?
Heap is a Complete Binary Tree structure.

Special property:

Min-Heap: Parent ≤ Children

Max-Heap: Parent ≥ Children

Fast access to min/max element.

⏳ Time Complexities (for array-backed implementation):

Operation	Time
Insertion	O(log N)
Deletion	O(log N)
Get Min/Max	O(1)

🔥 2️⃣ Types of Heaps:
Min Heap: Root = Smallest Element

Max Heap: Root = Largest Element

🏗 3️⃣ PriorityQueue in Java:
Java's PriorityQueue implements a Min-Heap by default.

👉 Syntax:
java
Copy
Edit
PriorityQueue<Integer> pq = new PriorityQueue<>();  // Min-Heap
PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());  // Max-Heap
✅ Common Methods:
Method	Purpose
add()	Insert element
offer()	Insert element
poll()	Remove and return head (min/max)
peek()	Return head (min/max) without removal

🔥 Min-Heap Example:
java
Copy
Edit
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

minHeap.add(10);
minHeap.add(5);
minHeap.add(20);

System.out.println(minHeap.peek());  // 5
minHeap.poll();  // removes 5
System.out.println(minHeap.peek());  // 10
🔥 Max-Heap Example:
java
Copy
Edit
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

maxHeap.add(10);
maxHeap.add(5);
maxHeap.add(20);

System.out.println(maxHeap.peek());  // 20
maxHeap.poll();  // removes 20
System.out.println(maxHeap.peek());  // 10
💡 4️⃣ Real-life Use Cases of Heaps:
Dijkstra’s Algorithm

Kth Largest/Smallest Element

Median of Stream

Merging K Sorted Lists

Top K Elements Problems

💻 5️⃣ Classic Example Question:
🔔 Kth Largest Element in Array (Leetcode 215)
java
Copy
Edit
public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    for (int num : nums) {
        minHeap.add(num);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
    }
    return minHeap.peek();
}
🚩 Summary:
Structure	Default Behavior
PriorityQueue	Min-Heap
Reverse Order	Max-Heap

💬 Motivation for Day 54:
"Heap ka funda clear ho gaya toh DSA me half battle jeet gaye."
– DSA Warriors Rulebook 📜
