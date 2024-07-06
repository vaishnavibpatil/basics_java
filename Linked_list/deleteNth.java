public void deleteNth(int n)
{
 int sz = 0;
 Node temp = head;
 while(temp != null)
 {
     temp = temp.next;
     sz++;
 }

 if(n == sz)
 {
     head = head.next;
     return;
 }
 int i = 1;
 int tofind = sz-n;
 Node  prev = head ;

 while(i < tofind)
 {
     prev = prev.next;
     i++;
 }
 prev.next = prev.next.next;

}