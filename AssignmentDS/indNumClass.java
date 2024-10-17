package AssignmentDS;

import DAY2_LinkedList.Node;

public class indNumClass {
	Node root;

    void create_list() {
        root = null;//preparing with empty root
    }

    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;//n becomes 1st so root
        } else {
            n.next = root;//1
            root = n;//2
        }
        System.out.println(root.data + " inserted");

    }
    
    void delete_left() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            Node t;
            t = root;//1
            root = root.next;//2
            System.out.println(t.data + " deleted");
        }
    }
   
    void print_list() {
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }
    }

}