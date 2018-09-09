package doublylinkedlist;

import java.util.Scanner;
import static doublylinkedlist.Utils.println;

public class DLinkedListDataStructure {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		do {
			println("");
			println("****Enter your choice****");
			println("1 for Insert at the End");
			println("2 for Insert at the First");
			println("3 for Insert at the Position");
			println("4 for Remove from End");
			println("5 for Remove from First");
			println("6 for Remove Data");
			println("7 for Traversing");
			int nOptions = scanner.nextInt();
			switch (nOptions) {
			case 1:
				println("Enter the value which you want to insert");
				int data = scanner.nextInt();
				doublyLinkedList.insertAtEnd(data);
				break;
			case 2:
				println("Enter the value which you want to insert at first");
				data = scanner.nextInt();
				doublyLinkedList.insertAtFirst(data);
				break;
			case 3:
				println("Enter the value which you want to insert");
				data = scanner.nextInt();
				println("Enter the position at which you want to insert");
				int position = scanner.nextInt();
				doublyLinkedList.insertAtPosition(data, position);
				break;
			case 4:
				//TODO:
				break;
			case 5:
				//TODO:
				break;
			case 6:
				println("Ener the value which you want to remove");
				data = scanner.nextInt();
				doublyLinkedList.removeData(data);
				break;
			case 7:
				doublyLinkedList.traverse();
				break;
			}
		} while (true);
	}
}
