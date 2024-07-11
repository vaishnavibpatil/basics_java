public class doubleLL 
{
    class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = tail = newnode;
            return ;
        }
        newnode.next = head;
        head.prev = null;
        head = newnode;  
    }
    public int removefirst()
    {
        if(head == null)
        {
            System.out.print("LL is empty");
        }
        else if(head.next == null)
        {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev =null;
        return val;

    }
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        doubleLL dll = new doubleLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.print();
        dll.removefirst();
        dll.print();

    }
}
