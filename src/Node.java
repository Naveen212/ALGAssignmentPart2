public class Node {
    private String data; // this will  be replaced by the Word Class
    private Node leftChild;
    private Node rightChild;

    public Node(String data) {
        this.data = data;
        leftChild=null;
        rightChild=null;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    // display the node and its subtrees
    public void displayNodeStructure(int  n)
    {
        String dash="- ";
        String indent=new String();
        for(int i=1;i<=n;i++)
        {
            indent+=dash;
        }
        // display the node's data
        System.out.println(indent+ "Root: "+data);
        //display the left subtree
        if(leftChild==null)
        {
            System.out.println(indent+"Left: null");

        }
        else
        {
            System.out.println(indent +"Left ");
            leftChild.displayNodeStructure(n+1);  // might have to remove this recursion method due to stack overflow
        }
        // display the right subtree
        if(rightChild==null)
        {
            System.out.println(indent+"Right: null");
        }
        else
        {
            System.out.println(indent+"Right ");
            rightChild.displayNodeStructure(n+1);// might have to remove this recursion method due to stack overflow
        }
    }


}
