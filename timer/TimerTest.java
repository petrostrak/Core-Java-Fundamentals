package timer;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;


public class TimerTest {

	public static void main(String[] args) {
		TimePrinter listener = new TimePrinter();
		
		// Construct a timer that calls the listener
		// once every second
		Timer timer = new Timer(1000, listener);
		timer.start();
		
//		// Timer with lambda expression
//		Timer timer = new Timer(1000, event ->{
//			System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
//			Toolkit.getDefaultToolkit().beep();
//		});
		
		// Keep program running until user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
