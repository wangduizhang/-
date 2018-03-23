package cn.wp.window;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;


import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import javax.swing.JTextPane;
import java.awt.Insets;
import java.awt.Font;


import javax.swing.UIManager;


public class RootWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static JTextPane tishi;
	private static JTabbedPane tabbedPane;
	
	public static JTextPane getTishi() {
		return tishi;
	}



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RootWindow frame = new RootWindow();
					frame.setVisible(true);
					//frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private RootWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 594, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.insets = new Insets(0, 0, -5, 0);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		contentPane.add(tabbedPane, gbc_tabbedPane);
		//提示面板
		tishi = new JTextPane();
		tishi.setEditable(false);
		tishi.setBorder(BorderFactory.createTitledBorder("提示"));
		tishi.setBackground(UIManager.getColor("Button.background"));
		tishi.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		GridBagConstraints gbc_tishi = new GridBagConstraints();
		gbc_tishi.insets = new Insets(10, 10, 0, 10);
		gbc_tishi.fill = GridBagConstraints.BOTH;
		gbc_tishi.gridx = 0;
		gbc_tishi.gridy = 1;
		contentPane.add(tishi, gbc_tishi);
		//System.out.println(0000);
		//加入平流沉砂池面板
		tabbedPane.addTab("平流式沉砂池", null, PlWindow.getPlWindow(), null);
		//加入曝气沉砂池面板
		 JPanel puqipanel = new JPanel();
		tabbedPane.addTab("曝气沉砂池", null, puqipanel, null);


	
	}
	
	public static JTabbedPane getTabbedPane() {
		return tabbedPane;
	}
}
