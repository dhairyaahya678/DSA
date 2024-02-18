/*node class of the binary ssearch tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/

import org.w3c.dom.Node;

class Solution
{
    public static int sumOfLeafNodes(Node root)
    {
        if (root == null) {
            return 0; 
        }
        if (root.left == null && root.right == null) {
            return root.data; 
        }
        return sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);
    }
}
