public class linklist
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public static  Node head;
    public static Node tail;

    public void addFirst(int data)
    {
        //step 1:create a new node
        Node newnode = new Node(data);
       
        if(head==null)
        {
            head=tail=newnode;
            return;
        }

        //step 2: assign next address to head LINK
        newnode.next = head;

        //step 3: 
        head=newnode; 
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
       linklist li = new linklist();
       li.print();
       li.addFirst(1);
       li.print();
       li.addFirst(2);
       li.print();
    

       li.addLast(3);
       li.print();
       li.addLast(4);
       li.print();

    }
   
}