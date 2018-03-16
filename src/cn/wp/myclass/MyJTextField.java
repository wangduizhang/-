package cn.wp.myclass;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.swing.JTextField;

import cn.wp.utils.XMLUtils;
import cn.wp.window.RootWindow;

public class MyJTextField extends JTextField {
	private String name;

	public String getName() {
		return name;
	}

	private MyJTextField(){
	}
	
	public MyJTextField(String name){
		super();
		this.name = name;
		//System.out.println(path.replaceFirst("["+File.separator+"]",""));
		addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				InputStream file = MyJTextField.class.getResourceAsStream("/res/Prompt.xml");
				RootWindow.getTishi().setText("");
				MyJTextField jTextField = (MyJTextField) e.getSource();
				XMLUtils.getInfo(file,jTextField.getName());
			}
		});
	}
}
