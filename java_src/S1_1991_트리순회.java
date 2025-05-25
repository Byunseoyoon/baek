package java_src;

import java.io.*;
import java.util.*;

class Node{
    char name;
    Node left;
    Node right;

    public Node (char name){
        this.name =name;
        this.left=null;
        this.right =null;
    }
}

public class S1_1991_트리순회 {
    static HashMap<Character, Node> nodeMap = new HashMap<>();
    static Node root;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parent= st.nextToken().charAt(0);
            char left= st.nextToken().charAt(0);
            char right= st.nextToken().charAt(0);

            Node parentNode = nodeMap.getOrDefault(parent, new Node(parent));

            if(parent=='A') {
                nodeMap.put(parent, parentNode);
                root=parentNode;
            }
            if(left!='.'){
                Node leftNode= new Node(left);
                parentNode.left = leftNode;
                nodeMap.put(left, leftNode);
            }
            if(right!='.'){
                Node rightNode = new Node(right);
                parentNode.right = rightNode;
                nodeMap.put(right, rightNode);
            }
        }

        preorder(root);
        sb.append("\n");
        inorder(root);
        sb.append("\n");
        postorder(root);

        bw.write(sb + "");
        bw.flush();
        bw.close();
    }

    public static void preorder(Node node) {
        if(node==null) return;
        sb.append(node.name);
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(Node node) {
        if(node==null) return;
        inorder(node.left);
        sb.append(node.name);
        inorder(node.right);
    }

    public static void postorder(Node node) {
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        sb.append(node.name);
    }
}
