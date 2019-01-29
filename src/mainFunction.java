
/*
 * Name of the Student: Hongyun Du
 * Class: CS3345
 * Section:003
 * Semester: Fall 2018
 * Project 2
 */

import java.util.*;

public class mainFunction {

	public static void main(String ags[]) {
		Scanner sc = new Scanner(System.in);
		myLinkedList<Magazine> LL = new myLinkedList<Magazine>(); // create the singly linked list
		boolean keepAsk = true;
		while (keepAsk == true) {
			// display the menu
			System.out.println("Operations on List");
			System.out.println("\t1. Make Empty");
			System.out.println("\t2. Find ID");
			System.out.println("\t3. Insert At Front");
			System.out.println("\t4. Delete From Front ");
			System.out.println("\t5. Delete ID ");
			System.out.println("\t6. Print All Records ");
			System.out.println("\t7. Done ");
			System.out.print("\t");
			int menu;
			menu = sc.nextInt();
			// get use's input
			System.out.println("\t\tYour Choice: " + menu);
			// based on the input, processing the data.
			switch (menu) {
			case 1:
				// clean the list up
				LL.makeEmpty();
				System.out.printf("\t\tThis linked list has been cleaned up.\n");
				break;
			case 2:
				// searching the ID
				int case2ID;
				System.out.print("\t\tID No:");
				case2ID = sc.nextInt();
				Magazine case2Temp = LL.findID(case2ID);
				if (case2Temp != null)
					// if found, print it
					case2Temp.printID();
				else
					// if not found, print error message.
					System.out.println("\t\tthe Magazine with ID: " + case2ID + "  doesn't exist");
				break;
			case 3:
				// insert magazine to the beginning.
				int case3ID;
				String mName;
				String pName;
				System.out.printf("\t\tEnter Magaine ID: ");
				case3ID = sc.nextInt();
				System.out.printf("\t\tEnter Magaine Name: ");
				mName = sc.next();
				System.out.printf("\t\tEnter Publisher Name: ");
				pName = sc.next();
				System.out.println("\t\t...");
				Magazine temp = new Magazine(case3ID, mName, pName);
				if (LL.insertAtFront(temp) == true)
					// if there is no such magazine with this ID, then add it to the front
					System.out.println("\t\tMagazine Added");
				else
					// if there is such magazine iwht this ID, then print the error message.
					System.out.println("\t\tMagazine already exists");
				break;
			case 4:
				// delete from the front.
				Magazine case4Temp = LL.deleteFromFront();
				if (case4Temp != null) {
					case4Temp.printID();
					System.out.println("\t\tFirst item deleted");
				} else
					System.out.println("\t\tThie list contains nothing.");
				break;
			case 5:
				// delete a data with specific ID
				int case5ID;
				System.out.printf("\t\tEnter Magaine ID: ");
				case5ID = sc.nextInt();
				Magazine case5Temp = LL.delete(case5ID);
				if (case5Temp != null) {
					// if success, print its data.
					case5Temp.printID();
					System.out.println("\t\tthe Magazine with ID: " + case5ID + " deleted");
				} else
					// if there is such magazine iwht this ID, then print the error message.
					System.out.println("\t\tthe Magazine with ID: " + case5ID + "  doesn't exist");
				break;
			case 6:
				// print all records.
				LL.printAllRecords();
				// if there is nothing, it will print nothing.
				break;
			case 7:
				// exit the loop
				keepAsk = false;
				System.out.println("\t\tDone.");
				return;
			}
		}
		sc.close();

	}

}
