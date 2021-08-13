
package newpackage;
public class ds1 {
    static class Node{
        int data;
        Node info;
    }
    
    static void traversal(Node first){
        Node temp=first;
        while(temp.info!=null){
            System.out.print(temp.data+" ");
            temp=temp.info;
        }
    }
    public static void main(String args[]){
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
        
        Node fifth=new Node();
        fifth.data=500;
        fifth.info=null;
        fourth.info=fifth;   
         traversal(first);
    }
}
