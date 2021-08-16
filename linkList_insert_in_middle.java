class Main {
    public static class Node {
        int data;
        Node info;
    }
    public static void traversal(Node first){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.info;
        }
    }
    public static void middle(Node head){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.info!=null){
            prev=slow;
            slow=slow.info;
            fast=fast.info.info;
        }
        if(fast==null){
            System.out.println(slow.data+" "+prev.data);
        }else{
            System.out.println(slow.data);
        }
    }
    public static Node insertAtBeginning(Node info, int data)
    {
        Node temp=new Node();
        temp.data=data;
        temp.info=info;
        return temp;
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
        
        Node head=insertAtBeginning(first,600);
        traversal(head);
        System.out.println();
        middle(head);
        

        
        
        
    }
}