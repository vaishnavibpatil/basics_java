public class addmiddle 
{
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next=null;

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
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void middle(int idx,int data)
     {
        Node newnode = new Node(data);
        Node temp = head;
        int i =0;
       if(head == null)
         {
              addFirst(data);
              return;
         }
         
         while( i < idx-1)
         {
             temp = temp.next;
             i++;        
         } 
        
         
         newnode.next = temp.next;
         temp.next = newnode;
        

     }

    public void print()
    {
        if(head == null)
        {
            System.out.print("empty");
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    
 public static void main(String args[])

 {
       addmiddle a = new addmiddle();
       a.addFirst(10);
       a.print();
       a.addFirst(20);
       a.print();
       a.addFirst(30);
       a.print();

       a.middle(1,50);
       a.print();
       a.middle(3,50);
       a.print();
       
 }
}
