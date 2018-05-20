import com.sun.org.apache.xpath.internal.SourceTree;

import java.sql.SQLOutput;

public class LexiconTester {
    public static void main(String[] args) {
        Node n1=new Node("aaa");
        Node n2=new Node("bbb");
        Node n3=new Node("ddd");
        Node n4=new Node("ccc");

        n1.setLeftChild(n2);
        n1.setRightChild(n3);
        n3.setLeftChild(n4);
        System.out.println("Displaythe  Nodestucture --->");
        n1.displayNodeStructure(0); // 0 might be the level
        System.out.println("The tree  Structure----->");

        BST bst=new BST();
        bst.insert("aaa");
        bst.insert("bbb");
        bst.insert("ccc");
        bst.displayTreeStructure();
        Node p=bst.search("ccc");
        System.out.println("after searching");
        System.out.println(p.getData());

    }

}
