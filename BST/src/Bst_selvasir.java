
import java.util.*;


class Node
{
    int data;
    Node left;
    Node right;
    Node()
    {
        data=0;
        left=right=null;
    }
    Node(int giv_data,Node giv_left, Node giv_right)
    {
        data=giv_data;
        left=giv_left;
        right=giv_right;
    }
}

public class Bst_selvasir {
    static  Node insert_v1(Node root, int ins_val)
    {
        Node newnode=new Node(ins_val,null,null);
        if(root==null)
            root=newnode;
        else
        {
            Node tptr;
            Node prev;
            prev=null;
            tptr=root;
            while(tptr!=null)
            {
                prev=tptr;
                if(ins_val<tptr.data)
                    tptr=tptr.left;
                else
                    tptr=tptr.right;
            }
            if(ins_val<prev.data)
                prev.left=newnode;
            else
                prev.right=newnode;
        }
        return root;
    }
    static  Node insert_v2(Node root, int ins_val)
    {
        Node newnode=new Node(ins_val,null,null);
        if(root==null)
            root=newnode;
        else
        {
            Node tptr;
            tptr=root;
            while(true)
            {
                if(ins_val<tptr.data)
                {
                    if(tptr.left==null)
                    {
                        tptr.left=newnode;
                        break;
                    }
                    else
                        tptr=tptr.left;
                }
                else
                {
                    if(tptr.right==null)
                    {
                        tptr.right=newnode;
                        break;
                    }
                    else
                        tptr=tptr.right;
                }
            }


        }
        return root;
    }
    static  void bfs_v1(Node root)
    {
        Queue<Node> que=  new LinkedList<>();
        Node deq_node;
        System.out.println("BFS (QUEUE) V1: ");
        que.offer(root);
        while(que.isEmpty()==false)
        {
            deq_node =que.poll();
            System.out.print(deq_node.data+ " ");
            if(deq_node.left!=null)
                que.offer(deq_node.left);
            if(deq_node.right!=null)
                que.offer(deq_node.right);
        }
        System.out.println("");
        //poll()
        //offer()
        //isEmpty()
        //size()

    }
    static  void dfs_v1(Node root)
    {
        Stack<Node> mystack=  new Stack<>();
        Node pop_node;
        System.out.println("DFS (STACK) V1: ");
        mystack.push(root);
        while(mystack.isEmpty()==false)
        {
            pop_node =mystack.pop();
            System.out.print( pop_node.data+ " ");
            if( pop_node.left!=null)
                mystack.push( pop_node.left);
            if(pop_node.right!=null)
                mystack.push( pop_node.right);
        }
        System.out.println("");

    }
    public static void main(String[] args)
    {
        Node root=null;
        root=insert_v1(root,50);
        root=insert_v1(root,30);
        root=insert_v1(root,70);
        root=insert_v1(root,20);
        root=insert_v1(root,40);
        root=insert_v1(root,60);
        root=insert_v1(root,80);
        bfs_v1(root);
        dfs_v1(root);
    }
}
