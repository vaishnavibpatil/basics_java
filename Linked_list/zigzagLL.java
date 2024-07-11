public class zigzagLL 
{
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    public void zigzag()
    {
        //midnode
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node mid = slow;
       

        //reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
       


        Node right = prev;
        Node left = head;
        Node nextR , nextL;

        while(left != null && right != null)
        {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;


            left = nextL;
            right = nextR;
        }


    }
    public void addLast(int data)
    {
        //step1:
        Node newnode = new Node(data);

        if(head==null)
        {
            head=tail=newnode;
            return;
        }
       

        //step2:
        tail.next = newnode;

        //step3:
        tail = newnode;

    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("null");
            return;
        }
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        zigzagLL li = new zigzagLL();
         li.addLast(1);
         li.addLast(2);
         li.addLast(3);
         li.addLast(4);
         li.addLast(5);
         li.addLast(6);

         li.print();
         li.zigzag();
         li.print();
         
        

    }
    
}
