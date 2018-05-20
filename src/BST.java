public class BST {
    private Node root;

    public BST() {
        root=null;
    }
    // insert an element
    public void insert(String data) {
        //check  if the  tree is  empty
        if (root == null) {
            root = new Node(data);
            return;
        }
        // if the tree is  not empty
        Node p = root;

        while (true) {
            if (data.compareTo(p.getData()) <= 0 && p.getLeftChild() == null) {
                p.setLeftChild(new Node(data));
                return;
            } else if (data.compareTo(p.getData()) > 0 && p.getRightChild() == null) {
                p.setRightChild(new Node(data));
                return;
            } else if (data.compareTo(p.getData()) <= 0) {
                p = p.getLeftChild();
            } else {
                p = p.getRightChild();
            }
        }
    }
    public Node search(String key)
    {
        //  check if the tree is empty
        if(root==null)
        {
            return null;
        }
        Node p=root;
        while(true)
        {
            if(p==null)
            {
                return null;
            }
            else if(key.compareTo(p.getData())==0)
            {
                return p; // match  found ,return the node
            }
            else if(key.compareTo(p.getData())<0)
            {
                p=p.getLeftChild(); //move left
            }
            else
            {
                p=p.getRightChild();  // move right
            }
        }
    }


    // display the structure of the  binary search tree
    public void displayTreeStructure()
    {
        //  check  if the tree is empty
        if(root==null)
        {
            System.out.println("The tree is empty");
        }
        else
        {
            root.displayNodeStructure(0);
        }
    }

}
