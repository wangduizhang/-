package cn.wp.myclass.factory;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.InputStream;

import cn.wp.myclass.MyJTextField;
import cn.wp.utils.XMLUtils;
import cn.wp.window.RootWindow;
//可以指定查询的文档位置
public class JTextFieldFactory {

	private MyJTextField j;
	private String filepath;

	public JTextFieldFactory(String filepath) {
		super();
		this.filepath = filepath;
	}
	public MyJTextField getJText(String name){
		j = new MyJTextField(name);
		j.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				InputStream file = MyJTextField.class.getResourceAsStream(filepath);
				RootWindow.getTishi().setText("");
				MyJTextField jTextField = (MyJTextField) e.getSource();
				XMLUtils.getInfo(file,jTextField.getName());
			}
		});
		return j;
	}
}
