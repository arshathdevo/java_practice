//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node(){
//        data = 0;
//        left =  right =null;
//    }
//    Node(int insVal,Node givLeft,Node givRight){
//        data = insVal;
//        left = givLeft;
//        right = givRight;
//    }
//}
//
//public class BinaryTreebasics {
//    public static Node insert(int data,Node root){
//        Node nn =  new Node(data,null,null);
//      if(root == null){
//          root = nn;
//      }else{
//          Node tptr = root;
//          while(true){
//              if(tptr.data > nn.data){
//                  if(tptr.left == null){
//                      tptr.left = nn;
//                      break;
//                  }
//                  tptr = tptr.left;
//              }//end if
//              else{
//                  if(tptr.right == null){
//                      tptr.right= nn;
//                      break;
//                  }
//                  tptr = tptr.right;
//              }
//
//          }//end while
//      }//end if
//return root;
//    }
//    public static void main(String[] args) {
//        Node root = null;
//       root =  insert(40,root);
//       root =  insert(20,root);
//       root =  insert(10,root);
//       root =  insert(30,root);
//       root =  insert(60,root);
//       root =  insert(50,root);
//       root =  insert(70,root);
//       printBfs(root);
//        System.out.println();
//       printDfs(root);
//
//
//    }
//
//    private static void printBfs(Node root) {
//        Queue<Node> q =new LinkedList<>();
//        q.offer(root);
//        int qSize = q.size();
//        while(!q.isEmpty()){
//
//            for(int l = 0;l<qSize;l++) {
//                Node pVal = q.poll();
//                System.out.print(pVal.data + ",");
//                if (pVal.left != null) {
//                    q.offer(pVal.left);
//                }
//                if (pVal.right != null) {
//                    q.offer(pVal.right);
//                }
//
//            }//end for
//            qSize = q.size();
//            System.out.println();
//        }
//    }//end printbfs
//    private static void printDfs(Node root) {
//       Stack <Node> sk = new Stack<>();
//       sk.push(root);
//        int skSize = sk.size();
//        while(!sk.isEmpty()){
//
//          //  for(int l = 0;l<skSize;l++) {
//                Node pVal = sk.pop();
//                System.out.print(pVal.data + ",");
//
//                if (pVal.right != null) {
//                    sk.push(pVal.right);
//                }
//            if (pVal.left != null) {
//                sk.push(pVal.left);
//            }
//
//         //   }//end for
//         //   Size = q.size();
//            System.out.println();
//        }
//    }
//}
