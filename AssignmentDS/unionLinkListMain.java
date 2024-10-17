package AssignmentDS;

import java.util.Scanner;

public class unionLinkListMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		unionLinkListClass list1 = new unionLinkListClass();
		
		System.out.println("Enter elements for 1st linked list (enter -1 to stop):");
		while (true) {
			int input = scanner.nextInt();
			if (input == -1) {
				break;
			}
			list1.insertSorted(input);
		}
		
		
		
		unionLinkListClass list2 = new unionLinkListClass();
		System.out.println("Enter elements for the 2nd linked list (enter -1 to stop):");
		while (true) {
			int input = scanner.nextInt();
			if (input == -1) {
				break;
			}
			list2.insertSorted(input);
		}
		
		System.out.print("First linked list: ");
		list1.display();
		System.out.print("Second linked list: ");
		list2.display();
		
	
		unionLinkListClass unionList = list1.union(list2);
		System.out.print("Union of the linked lists: ");
		unionList.display();
	}
}