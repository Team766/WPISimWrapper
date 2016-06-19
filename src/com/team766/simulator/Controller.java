package com.team766.simulator;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;

public class Controller extends JFrame implements Runnable {
	private static boolean enabled;

	private enum RobotState {
		OperatorControl, Autonomous, Test
	}

	private static RobotState state;

	public Controller(){
		
	}
	
	public Controller(String title) {
		super(title);

		state = RobotState.OperatorControl;
		enabled = false;

		JMenuBar menuBar;
		JMenu menu;
		JMenuItem menuItem;

		// Create the menu bar.
		menuBar = new JMenuBar();

		menu = new JMenu("A Menu");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription(
				"The only menu in this program that has menu items");
		menuBar.add(menu);

		// a group of JMenuItems
		JMenuItem m1 = new JMenuItem("menu item 1", KeyEvent.VK_T);
		// menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
		menu.add(m1);

		JMenuItem m2 = new JMenuItem("menu item 2", KeyEvent.VK_T);
		menu.add(m2);

		JMenuItem m3 = new JMenuItem("menu item 3", KeyEvent.VK_T);
		menu.add(m3);

		JLabel l1 = new JLabel("", JLabel.CENTER);

		l1.setBackground(Color.red);
		l1.setOpaque(true);

		setJMenuBar(menuBar);
		

		JButton b1 = new JButton("Enable/Disable");
		JButton b2 = new JButton("Test/Autonomous/Operator Control");

		JTextArea t1 = new JTextArea();
		DefaultCaret caret = (DefaultCaret)t1.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		t1.setVisible(true);
		JScrollPane scroll = new JScrollPane(t1);
		t1.setLineWrap(true);
		t1.setEditable(false);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);		
		getContentPane().add(scroll);
		GridLayout experimentLayout = new GridLayout(0, 2);

		setLayout(experimentLayout);

		add(b1);
		//add(t1);
		add(b2);
		add(l1);

		ActionListener a1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enabled = !enabled;
				if (enabled) {
					t1.append("Enabled\n");
					t1.setCaretPosition(t1.getDocument().getLength());
					l1.setBackground(Color.green);
				} else {
					t1.append("Disabled\n");
					t1.setCaretPosition(t1.getDocument().getLength());
					l1.setBackground(Color.red);
				}

			}
		};

		ActionListener a2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				t1.append("menu 1\n");
				t1.setCaretPosition(t1.getDocument().getLength());
			}
		};

		ActionListener a3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				switch (state) {
				case Autonomous:
					state = RobotState.OperatorControl;
					break;
				case OperatorControl:
					state = RobotState.Test;
					break;
				case Test:
					state = RobotState.Autonomous;
					break;
				default:
					break;

				}
				t1.append(state + "\n");
				t1.setCaretPosition(t1.getDocument().getLength());

			}
		};

		b1.addActionListener(a1);
		b2.addActionListener(a3);
		m1.addActionListener(a2);
	}

	public void run() {
		JFrame frame = new Controller("Simulator Driver Station");

		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	// JUST FOR TESTING PURPOSES
	public static void main(String[] args) {
		JFrame frame = new Controller("Simulator Driver Station");
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static boolean getDisabled() {
		return enabled;
	}

	public static boolean getEnabled() {
		return enabled;
	}

	public static boolean getOperatorControl() {
		return state == RobotState.OperatorControl;
	}

	public static boolean getAutonomous() {
		return state == RobotState.Autonomous;
	}

	public static boolean getTest() {
		return state == RobotState.Test;
	}

	public static boolean getEStop() {
		return false;
	}
}
