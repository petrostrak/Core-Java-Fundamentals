import java.util.*;

// This program demonstrates operations on linked lists
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<>();
		a.add("Amy");
		a.add("Carl");
		a.add("Erica");
		
		LinkedList<String> b = new LinkedList<>();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");
		
		// Merge b list to a list
		
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();
		
		while (bIter.hasNext()) {
			if (aIter.hasNext()) {
				aIter.next();
			}
			aIter.add(bIter.next());
		}
		System.out.println(a);
		
		// Remove every second word from b list
		bIter = b.iterator();
		
		while (bIter.hasNext()) {
			bIter.next(); // skip one element
			if(bIter.hasNext()) {
				bIter.next(); //go to next element and..
				bIter.remove(); // ..remove that element
			}
		}
		System.out.println(b);
		
		// Remove all elements from linked list
		
		b.removeAll(b);
		System.out.println(b);
	}

}

