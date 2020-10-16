package treeSet;

import java.util.*;

// This program sorts a set of Item objects by comparing their description
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Item> parts = new TreeSet<>();
		parts.add(new Item("Toaster", 1234));
		parts.add(new Item("Widget", 4567));
		parts.add(new Item("Modem", 8901));
		System.out.println(parts);
		
		TreeSet<Item> sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));
		
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}

}
