
class Node{
    int data;
    Node next;
    Node(){
        data=0;
        next=null;
    }
    Node(int data){
        this.data = data;
        next = null;
    }

}
class LinkList{
   private Node start;
    LinkList(){
        start = null;
    }
     void addAtBegin(int num){
        Node newNode = new Node(num);
        if(start == null){
            newNode.next = null;
            start = newNode;

        }
        else{
            newNode.next = start;
            start =  newNode;
        }
    }
    public  int sizeOf(){
        int count = 0;
        Node tptr = start;
        while(tptr != null){
            count++;
            tptr = tptr.next;
        }
        return count;
    }
    void addAtEnd(int num){
        Node newNode = new Node(num);
        if(start == null){
            newNode.next = null;
            start = newNode;
            return;
        }
        Node tptr = start;
       while(tptr.next != null){
           tptr = tptr.next;
       }
       newNode.next = null;
       tptr.next = newNode;
    }
    void forwardprint(){

        if(start == null){
            return;
        }
        Node tptr = start;
        while(tptr != null){
            System.out.print(tptr.data+",");
            tptr =tptr.next;
        }
        System.out.println();
    }
    void reversePrint(){
        if(start == null){
            return;
        }
        else{
            Node tptr = start;
            reversePrintHelper(tptr);
        }

    }

    private void reversePrintHelper(Node tptr) {
        if(tptr.next == null){
            System.out.println(tptr.data);
            return;
        }
        reversePrintHelper(tptr.next);
        System.out.println(tptr.data);
    }

    public void insertAt(int ind,int num){
        if(ind > sizeOf()-1){
            System.out.println("not a valid index");
            return;
        }
        Node newNode = new Node(num);
        Node  cur = start;
        Node prev = null;
        int index = 0;
        while(index != ind){
            prev = cur;
            cur = cur.next;
            index++;
        }
        prev.next = newNode;
        newNode.next = cur;


    }

}


public class Basic {
    public static void main(String[] args) {
        LinkList lis =new LinkList();
        lis.addAtBegin(5);
        lis.addAtBegin(6);
        lis.addAtEnd(7);
        lis.addAtBegin(8);
        lis.addAtBegin(9);
        lis.addAtEnd(10);

        lis.forwardprint();
       // lis.reversePrint();
       // System.out.println(lis.sizeOf());
        lis.insertAt(3,45);
        lis.insertAt(2,29);
        lis.forwardprint();



    }

}
