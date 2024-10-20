//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class Main {
    public static void push(DLLNode tail, int new_data) {
        DLLNode newNode = new DLLNode(new_data);
        newNode.next = null;
        newNode.prev = tail;

        if (tail != null) {
            tail.next = newNode;
        }
    }

    public static void printList(DLLNode head) {
        if (head == null) {
            return;
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] arr = br.readLine().trim().split(" ");
            int k = Integer.parseInt(br.readLine().trim());

            DLLNode head = new DLLNode(Integer.parseInt(arr[0]));
            DLLNode tail = head;

            for (int i = 1; i < arr.length; i++) {
                push(tail, Integer.parseInt(arr[i]));
                tail = tail.next;
            }

            Solution obj = new Solution();
            DLLNode sorted_head = obj.sortAKSortedDLL(head, k);
            printList(sorted_head);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
        if (head == null) {
            return head;
        }

        // Create a Min Heap (PriorityQueue) for storing the k+1 elements
        PriorityQueue<DLLNode> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);

        DLLNode newHead = null, last = null;

        // Add the first k+1 elements to the Min Heap
        DLLNode node = head;
        for (int i = 0; node != null && i <= k; i++) {
            minHeap.add(node);
            node = node.next;
        }

        // Extract the smallest and adjust pointers
        while (!minHeap.isEmpty()) {
            // Get the minimum element from the heap
            DLLNode minNode = minHeap.poll();

            // If this is the first element, set it as the new head
            if (newHead == null) {
                newHead = minNode;
                newHead.prev = null;
                last = newHead;
            } else {
                // Adjust the pointers
                last.next = minNode;
                minNode.prev = last;
                last = minNode;
            }

            // Add the next element from the unsorted list to the heap
            if (node != null) {
                minHeap.add(node);
                node = node.next;
            }
        }

        // Mark the end of the sorted list
        last.next = null;
        return newHead;
    }
}