
package oops;
public class K {
    public static class Node{
        int data;
        Node info;
    }
    //LinkList Traversal
    public static void traversal(Node first){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.info;
        }
    }
    //LinkList InsertinBeginning
    public static Node insertAtBeginning(Node head,int data){
        Node temp=new Node();
        temp.data=data;
        temp.info=head;
        return temp;
    }
    //LinkList InsertinLast

    public static Node insertAtLast(Node head,int data){
        Node temp=new Node();
        temp.data=data;
        temp.info=null;
        Node temp2=head;
        while(temp2.info!=null){
            temp2=temp2.info;
            
        }
        temp2.info=temp;
        return head;     
    }
    public static Node middle(Node head){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.info!=null){
            prev=slow;
            slow=slow.info;
            fast=fast.info.info;
        }
        if(fast!=null){
            System.out.println(slow.data);
        }
        else{
            System.out.println(slow.data+" "+prev.data);
        }
        return head;
    }
    public static void main(String[] args) {
        
        Node first=new Node();
        first.data=100;
        first.info=null;
        
        Node second=new Node();
        second.data=200;
        second.info=null;
        first.info=second;
        
        Node third=new Node();
        third.data=300;
        third.info=null;
        second.info=third;
        
        Node fourth=new Node();
        fourth.data=400;
        fourth.info=null;
        third.info=fourth;
        traversal(first);
        System.out.println();
        middle(first);
        
        System.out.println();
        Node head=insertAtBeginning(first,900);
        traversal(head);
        System.out.println();
        middle(head);
        
        System.out.println();
        head=insertAtLast(head,980);
        traversal(head);
        System.out.println();
        middle(head);
        
    }
}
