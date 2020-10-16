package map;

import java.util.*;

// This program demonstrates the use of a map with key type String
public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Employee> staff = new HashMap<>();
		
		staff.put("144-25-5464", new Employee("Amy Lee"));
		staff.put("576-24-2587", new Employee("Harry Hacker"));
		staff.put("157-62-7943", new Employee("Gary Cooper"));
		staff.put("458-62-5527", new Employee("Francesca Cruz"));
		
		// Print all staff
		System.out.println(staff);
		
		// Remove an entry
		staff.remove("458-62-5527");
		
		// Replace an entry
		staff.put("157-62-7943", new Employee("Petros Trak"));
		
		// Look up a value
		System.out.println(staff.get("157-62-7943"));
		
		// Iterate through all entries
		staff.forEach((k, v) ->
				System.out.println("Key: " + k + ",Value: " + v));
	}

}
