public class iterativesearch
    
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
    public  int Size;

    public void addFirst(int data)
    {
        //step 1:create a new node
        Node newnode = new Node(data);
        Size++;
       
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
        Size++;

        //step2:
        tail.next = newnode;

        //step3:
        tail = newnode;

    }

    public void addmiddle(int idx, int data)
    {

        if(head == null)
        {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        Size++;
        Node temp = head;
        int i=0;
        while(i < idx-1)
        {
            temp = temp.next;
            i++;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }



    public void removeFirst()
    {
        if(Size == 0)
        {
            System.out.print("LL is empty");        //if we need to return valuethen def function return type is int andd return all those things
            // return  Integer.MIN_VALUE;

        }
        else if(Size == 1)
        {
            // int val = head.data;
            head = tail = null;
            Size--;
            // return val;
        }

        // int val = head.data;
        head = head.next ;
        Size--;
        // return val;
    }


    public void removelast()
    {
        if(Size == 0)
        {
            System.out.print("LL is empty");

        }
        else if(Size == 1)
        {
            head = tail =null;
            Size--;
        }
        Node prev = head;
        for(int i=0; i < Size-2; i++)
        {
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        Size--;



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

    public int itrsearch(int key)
    {
        int i = 0;
        Node temp = head;
        while(temp != null)
         {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
         }
         return -1;
    }

    public static void main(String args[])
    {
        iterativesearch li = new iterativesearch();
     
       li.addFirst(1);
       li.addFirst(2);
       li.addLast(3);
       li.addLast(4);
       li.addmiddle(2,10);
       li.print();
       System.out.println("linked list size :" +li.Size);

       System.out.print(li.itrsearch(20)) ;


    //    li.removeFirst();
    //    li.print();

    //    li.removelast();
    //    li.print();

    //    System.out.println("linked list size :" +li.Size);
    }
   
}
    

