package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    public  BinaryTree()
    {

    }
    public  class Node
    {
        int val;
        Node left;
        Node right;
        public Node(int val)
        {
            this.val=val;
        }
    }
    private Node root;

    //Insertion
    public  void insertion(Scanner scanner)
    {
        System.out.print("Enter the root node: ");
        int val=scanner.nextInt();
        root=new Node(val);
        insertion(scanner,root);

    }
    private void insertion(Scanner scanner, Node node) {
        System.out.println("Do you want to enter value left to "+ node.val);
        boolean left=scanner.nextBoolean();
        if(left)
        {
            System.out.print("Enter the node value: ");
            int val=scanner.nextInt();
            node.left=new Node(val);
            insertion(scanner,node.left);
        }
        System.out.println("Do you want to enter value right to "+ node.val);
        boolean right=scanner.nextBoolean();
        if(right)
        {
            System.out.print("Enter the node value: ");
            int val=scanner.nextInt();
            node.right=new Node(val);
            insertion(scanner,node.right);
        }
    }
    //Display

    public void display()
    {
        display(root," ");
    }

    private void display(Node node, String indent) {
        if(node==null)
            return;
        System.out.print(indent + node.val );
        display(node.left, indent);
        display(node.right,indent);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();

        tree.insertion(scanner);
        tree.display();

    }
}
