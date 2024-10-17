package AssignmentDS;

import java.util.Scanner;

public class indNumMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		indNumClass obj = new indNumClass();
		obj.create_list();

		int num, rem;
		System.out.println("Enter Number: ");
		num = in.nextInt();

		do {
			rem = num % 10;
			num=num/10;
			obj.insert_left(rem);
		}
		while(num>0);
		
		obj.print_list();

	}
}
