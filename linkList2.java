
package datastructure;
public class b {
    public static class Node{
        int data;
        Node next;
    }
    static Node insertAtf(Node head,int data){
        Node temp=new Node();
        temp.data=data;
        temp.next=head;
        return temp;
        
    }
    static Node insertintoAtlast(Node head,int data){
        Node temp=new Node();
        temp.data=data;
        temp.next=null;
        Node temp2=head;
        while(temp2!=null){
            temp2=temp2.next;
        }
        temp2.next=temp;
        return head;
    }
    public static void t(Node first){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
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
        fourth.data=400;
        fourth.next=null;
        third.next=fourth;
        t(first);
        System.out.println();
        Node head=insertAtf(first,34);
        t(head);
        
        System.out.println();
        head=insertintoAtlast(head,34);
        t(head);
    }
}
