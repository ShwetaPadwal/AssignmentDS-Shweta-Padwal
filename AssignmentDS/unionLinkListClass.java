package AssignmentDS;

public class unionLinkListClass {
	private Node root;

	public void insertSorted(int data) {
		Node n = new Node(data);
		if (root == null || root.data > data) {
			n.next = root;
			root = n;
		} else {
			Node t = root;
			while (t.next != null && t.next.data <= data) {
				t = t.next;
			}
			if (t.data != data) {
				n.next = t.next;
				t.next = n;
			}
		}
	}

	public void display() {
		Node t = root;
		while (t != null) {
			System.out.print(t.data + " ");
			t = t.next;
		}
		System.out.println();
	}

	public unionLinkListClass union(unionLinkListClass list2) {
		
		unionLinkListClass unionList = new unionLinkListClass();
		
		Node t1 = this.root;
		Node t2 = list2.root;

		while (t1 != null && t2 != null) {
			if (t1.data < t2.data) {
				unionList.insertSorted(t1.data);
				t1 = t1.next;
			} else if (t1.data > t2.data) {
				unionList.insertSorted(t2.data);
				t2 = t2.next;
			} else {
				unionList.insertSorted(t1.data);
				t1 = t1.next;
				t2 = t2.next;
			}
		}
		while (t1 != null) {
			unionList.insertSorted(t1.data);
			t1 = t1.next;
		}
		while (t2 != null) {
			unionList.insertSorted(t2.data);
			t2 = t2.next;
		}
		return unionList;
	}
}
