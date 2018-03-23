package cn.wp.myclass;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import java.io.InputStream;


import javax.swing.JTextField;

import cn.wp.utils.XMLUtils;
import cn.wp.window.RootWindow;

public class MyJTextField extends JTextField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}
	public MyJTextField(String name){
		super();
		this.name = name;
	}
}
