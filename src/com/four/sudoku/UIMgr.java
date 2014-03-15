package com.four.sudoku;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class UIMgr {

	protected JFrame frame;
	protected JProgressBar pbar;
	protected JPanel cpane;
	protected JPanel mpane;
	protected JPanel npane;
	protected JPanel spane;
	protected JLabel label;
	protected JButton cancelButton;
	public int value = 0;

	private ActionListener cButtonListener = new CancelButtonListener();

	protected static Dimension dim = Toolkit.getDefaultToolkit()
			.getScreenSize();

	public void Start() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		frame = new JFrame("The Sudoku Solver");
		cpane = new JPanel(new BorderLayout());
		pbar = new JProgressBar(0, 1);
		label = new JLabel();
		mpane = new JPanel(new BorderLayout());
		npane = new JPanel(new BorderLayout());
		spane = new JPanel(new BorderLayout());
		cancelButton = new JButton("Cancel");
		frame.setBounds((dim.width / 2) - (frame.getSize().width / 2),
				(dim.height / 2) - (frame.getSize().height / 2), 800, 175);
		frame.setBounds((dim.width / 2) - (frame.getSize().width / 2),
				(dim.height / 2) - (frame.getSize().height / 2), 800, 175);
		frame.setContentPane(cpane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		cpane.add(mpane, BorderLayout.CENTER);
		mpane.add(pbar, BorderLayout.CENTER);
		mpane.add(Box.createHorizontalStrut(35), BorderLayout.WEST);
		mpane.add(Box.createHorizontalStrut(35), BorderLayout.EAST);
		mpane.add(Box.createVerticalStrut(10), BorderLayout.SOUTH);
		cpane.add(npane, BorderLayout.NORTH);
		npane.add(label, BorderLayout.CENTER);
		npane.add(Box.createHorizontalStrut(40), BorderLayout.WEST);
		npane.add(Box.createVerticalStrut(15), BorderLayout.SOUTH);
		npane.add(Box.createVerticalStrut(10), BorderLayout.NORTH);
		label.setFont(new Font("Arial", Font.ITALIC, 24));
		label.setText("Loading...");
		cpane.add(spane, BorderLayout.SOUTH);
		spane.add(cancelButton, BorderLayout.CENTER);
		spane.add(Box.createHorizontalStrut(620), BorderLayout.WEST);
		spane.add(Box.createVerticalStrut(15), BorderLayout.SOUTH);
		spane.add(Box.createHorizontalStrut(35), BorderLayout.EAST);
		spane.add(Box.createVerticalStrut(15), BorderLayout.SOUTH);
		cancelButton.setFont(new Font("Arial", Font.BOLD, 16));
		cancelButton.setActionCommand("cancel");
		cancelButton.addActionListener(this.cButtonListener);
		cancelButton.setToolTipText("Cancels The Program");
		pbar.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		pbar.setIndeterminate(true);
		frame.setVisible(true);
	}

	public void SetText(String x) {
		label.setText(x);
		System.out.println("[UI Update]: " + x);
	}

	public void error(String x) {
		label.setText("Error: " + x);
		System.err.println("ERROR: " + x);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void SetValue(int v) {
		pbar.setIndeterminate(false);
		pbar.setValue(v);
		this.value = v;
	}

	public void StartBar(int max, int val) {
		pbar.setToolTipText(value + " Out Of " + max + ", "
				+ ((float) value / (float) max) + "%");
		pbar.setMaximum(max);
	}

	public void EnableExit() {
		this.cancelButton.setActionCommand("exit");
		this.cancelButton.setText("Exit");
		this.cancelButton.setToolTipText("Exits The Program");
	}

	public void AutoExit(int status) throws InterruptedException {
		this.EnableExit();
		this.pbar.setIndeterminate(true);
		this.SetText("Exiting...");
		Thread.sleep(800);
		System.exit(status);
	}

	public void AutoExit() throws InterruptedException {
		this.AutoExit(0);
	}

	public class CancelButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if ("cancel".equals(e.getActionCommand())) {
				System.out.println("User Cancelled Program.\nExiting...");
				System.exit(1);
			} else if ("exit".equals(e.getActionCommand())) {
				System.out.println("Exiting...");
				System.exit(0);
			}
		}
	}

}
