
package datastructure;
public class c {
    static class Node{
        int data;
        Node next;
    }
    static void traveral(Node first){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static Node insertInfont(Node head,int data){
        Node temp=new Node();
        temp.data=data;
        temp.next=head;
        return temp;
    }
    static Node insertInlast(Node head,int data){
        Node temp=new Node();
        temp.data=data;
        temp.next=null;
        Node temp2=head;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=temp;
        return head;
    }
    public static void main(String[] args) {
        Node first=new Node();
        first.data=100;
        first.next=null;
        
        Node second=new Node();
        second.data=200;
        second.next=null;
        first.next=second;
        
        Node third=new Node();
        third.data=300;
        third.next=null;
        second.next=third;
        
        Node fourth=new Node();
        fourth.data=500;
        fourth.next=null;
        third.next=fourth;
        traveral(first);
        System.out.println();
        
        Node head=insertInfont(first,56);
         traveral(head);
        System.out.println();
          head=insertInlast(head,59);
         traveral(head);
    }
}
