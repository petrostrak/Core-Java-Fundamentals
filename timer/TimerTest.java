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
		
		// Keep program running until user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}
