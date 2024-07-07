public class islinklistcycle 
{
    public static class Node
    {
        int data;
        Node next;
        public Node (int data)
        {
            this.data = data;
            next=null;
        }
    }
    public static  Node head;
    public static Node tail;
    public static boolean iscycle()
    {
        Node slow= head;
        Node fast = head;

        while(fast.next != null && fast != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                return true;
            }
        }
        return false;

    }
    public static void main(String args[])
    {
         head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = null;

        System.out.print(iscycle());
    }
    
}
