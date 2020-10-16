import java.util.*;
import java.time.*;

// This program demonstrates the use of a priority queue
public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<LocalDate> pq = new PriorityQueue<LocalDate>();
		pq.add(LocalDate.of(1906, 12, 9));
		pq.add(LocalDate.of(1815, 12, 10));
		pq.add(LocalDate.of(1903, 12, 3));
		pq.add(LocalDate.of(1910, 6, 22));
		
		System.out.println("Iterating through elements");
		for (LocalDate date : pq)
			System.out.println(date);
		
		System.out.println("Removing elements");
		while (!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}
}
