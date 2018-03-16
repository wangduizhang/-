package cn.wp.window;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

import cn.wp.myclass.MyJTextField;
import cn.wp.utils.Utils;

public class PlWindow extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private static PlWindow plWindow = new PlWindow();
	
	private MyJTextField inputQ;
	private MyJTextField inputkz;
	private MyJTextField inputv;
	private MyJTextField inputt;
	private MyJTextField outLL;
	private MyJTextField outA;
	private MyJTextField inputh2;
	private MyJTextField outB;
	private MyJTextField outjhck;
	private MyJTextField inputday;
	private MyJTextField inputpai;
	private MyJTextField inputdoudi;
	private MyJTextField outvv;
	private MyJTextField inputh1;
	private MyJTextField inputqj;
	private MyJTextField inputpodu;
	private MyJTextField outch3;
	private MyJTextField outV0;
	private MyJTextField outHeight;
	private MyJTextField outtop;
	private MyJTextField outhh33;
	private MyJTextField inputmin;
	private MyJTextField outVmin;
	private MyJTextField inputQmin;
	private MyJTextField inputshanum;

	private PlWindow(){
		super();
		this.setBorder(null);
		SpringLayout sl_pingliupanel = new SpringLayout();
		this.setLayout(sl_pingliupanel);

		JPanel panel = new JPanel();
		sl_pingliupanel.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, this);
		sl_pingliupanel.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, this);
		sl_pingliupanel.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, this);
		sl_pingliupanel.putConstraint(SpringLayout.EAST, panel, 444, SpringLayout.WEST, this);
		this.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0 };
		gbl_panel.rowHeights = new int[] { 324, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		final JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u53C2\u6570", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);

		JLabel label_1 = new JLabel("最大流量");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_1);

		inputQ = new MyJTextField("最大流量");


		sl_panel_2.putConstraint(SpringLayout.NORTH, inputQ, 0, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputQ, 78, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputQ, -303, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_1, 4, SpringLayout.NORTH, inputQ);
		sl_panel_2.putConstraint(SpringLayout.EAST, label_1, -6, SpringLayout.WEST, inputQ);
		inputQ.setText("0.036");
		panel_2.add(inputQ);
		inputQ.setColumns(10);

		JLabel lblM = new JLabel("m³/s\n");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblM, 0, SpringLayout.NORTH, label_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblM, 6, SpringLayout.EAST, inputQ);
		lblM.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(lblM);

		JLabel lblNewLabel = new JLabel("总变化系数");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, label_1);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel, -145, SpringLayout.EAST, panel_2);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(lblNewLabel);

		inputkz = new MyJTextField("总变化系数");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputkz, -4, SpringLayout.NORTH, label_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputkz, 6, SpringLayout.EAST, lblNewLabel);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputkz, -88, SpringLayout.EAST, panel_2);
		inputkz.setText("1.50");
		panel_2.add(inputkz);
		inputkz.setColumns(10);

		JLabel label_3 = new JLabel("流速");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_3, 14, SpringLayout.SOUTH, label_1);
		sl_panel_2.putConstraint(SpringLayout.EAST, label_3, 0, SpringLayout.EAST, label_1);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_3);

		inputv = new MyJTextField("流速");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputv, -4, SpringLayout.NORTH, label_3);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputv, 78, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputv, 0, SpringLayout.EAST, inputQ);
		inputv.setText("0.15");
		panel_2.add(inputv);
		inputv.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("m/s");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, label_3);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblM);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_1);

		JLabel label_4 = new JLabel("停留时间");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_4, 0, SpringLayout.NORTH, label_3);
		sl_panel_2.putConstraint(SpringLayout.EAST, label_4, 0, SpringLayout.EAST, lblNewLabel);
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_4);

		inputt = new MyJTextField("停留时间");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputt, -4, SpringLayout.NORTH, label_3);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputt, 293, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputt, 0, SpringLayout.EAST, inputkz);
		inputt.setText("60");
		panel_2.add(inputt);
		inputt.setColumns(10);

		JLabel label_13 = new JLabel("s");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_13, 0, SpringLayout.NORTH, label_3);
		sl_panel_2.putConstraint(SpringLayout.WEST, label_13, 6, SpringLayout.EAST, inputt);
		label_13.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_13);

		JButton button = new JButton("计算");
		sl_panel_2.putConstraint(SpringLayout.WEST, button, 0, SpringLayout.WEST, label_4);
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel_2.add(button);

		JButton button_1 = new JButton("重置");
		sl_panel_2.putConstraint(SpringLayout.SOUTH, button_1, 0, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.NORTH, button, 0, SpringLayout.NORTH, button_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, button_1, 0, SpringLayout.WEST, inputQ);
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		panel_2.add(button_1);

		JLabel label = new JLabel("有效水深");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label, 16, SpringLayout.SOUTH, label_3);
		sl_panel_2.putConstraint(SpringLayout.EAST, label, 0, SpringLayout.EAST, label_1);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label);

		inputh2 = new MyJTextField("有效水深");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputh2, -4, SpringLayout.NORTH, label);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputh2, 6, SpringLayout.EAST, label);
		inputh2.setText("0.3");
		panel_2.add(inputh2);
		inputh2.setColumns(10);

		JLabel lblM_3 = new JLabel("m");
		sl_panel_2.putConstraint(SpringLayout.EAST, inputh2, -6, SpringLayout.WEST, lblM_3);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblM_3, 0, SpringLayout.NORTH, label);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblM_3, 0, SpringLayout.WEST, lblM);
		lblM_3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(lblM_3);

		JLabel label_7 = new JLabel("排砂时间间隔");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_7, 0, SpringLayout.NORTH, label);
		sl_panel_2.putConstraint(SpringLayout.EAST, label_7, 0, SpringLayout.EAST, lblNewLabel);
		label_7.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_7);

		inputday = new MyJTextField("排砂时间间隔");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputday, -4, SpringLayout.NORTH, label);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputday, 293, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputday, 0, SpringLayout.EAST, inputkz);
		inputday.setText("2");
		panel_2.add(inputday);
		inputday.setColumns(10);

		JLabel label_8 = new JLabel("天");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_8, 0, SpringLayout.NORTH, label);
		sl_panel_2.putConstraint(SpringLayout.WEST, label_8, 0, SpringLayout.WEST, label_13);
		label_8.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_8);

		JLabel label_9 = new JLabel("污水排砂量");
		sl_panel_2.putConstraint(SpringLayout.EAST, label_9, 0, SpringLayout.EAST, lblNewLabel);
		label_9.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_9);

		inputpai = new MyJTextField("污水排砂量");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputpai, -4, SpringLayout.NORTH, label_9);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputpai, 293, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputpai, 0, SpringLayout.EAST, inputkz);
		inputpai.setText("30");
		panel_2.add(inputpai);
		inputpai.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("m³/10⁶m³");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 0, SpringLayout.NORTH, label_9);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, label_13);
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_3);

		JLabel label_10 = new JLabel("斗底宽");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_9, 0, SpringLayout.NORTH, label_10);
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_10, 17, SpringLayout.SOUTH, label);
		sl_panel_2.putConstraint(SpringLayout.EAST, label_10, 0, SpringLayout.EAST, label_1);
		label_10.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_10);

		inputdoudi = new MyJTextField("斗底宽");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputdoudi, -4, SpringLayout.NORTH, label_10);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputdoudi, 6, SpringLayout.EAST, label_10);
		inputdoudi.setText("0.5");
		panel_2.add(inputdoudi);
		inputdoudi.setColumns(10);

		JLabel lblM_5 = new JLabel("m");
		sl_panel_2.putConstraint(SpringLayout.EAST, inputdoudi, -6, SpringLayout.WEST, lblM_5);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblM_5, 0, SpringLayout.NORTH, label_10);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblM_5, 0, SpringLayout.WEST, lblM);
		lblM_5.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(lblM_5);

		JLabel label_12 = new JLabel("超高");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_12, 19, SpringLayout.SOUTH, label_10);
		sl_panel_2.putConstraint(SpringLayout.EAST, label_12, 0, SpringLayout.EAST, label_1);
		label_12.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_12);

		inputh1 = new MyJTextField("超高");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputh1, -4, SpringLayout.NORTH, label_12);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputh1, 6, SpringLayout.EAST, label_12);
		inputh1.setText("0.3");
		panel_2.add(inputh1);
		inputh1.setColumns(10);

		JLabel lblM_7 = new JLabel("m");
		sl_panel_2.putConstraint(SpringLayout.EAST, inputh1, -6, SpringLayout.WEST, lblM_7);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblM_7, 0, SpringLayout.NORTH, label_12);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblM_7, 0, SpringLayout.WEST, lblM);
		lblM_7.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(lblM_7);

		JLabel label_14 = new JLabel("斗壁倾角");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_14, 0, SpringLayout.NORTH, label_12);
		sl_panel_2.putConstraint(SpringLayout.EAST, label_14, 0, SpringLayout.EAST, lblNewLabel);
		label_14.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_14);

		inputqj = new MyJTextField("斗壁倾角");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputqj, -4, SpringLayout.NORTH, label_12);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputqj, 293, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputqj, 0, SpringLayout.EAST, inputkz);
		inputqj.setText("60");
		panel_2.add(inputqj);
		inputqj.setColumns(10);

		JLabel label_15 = new JLabel("˚");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_15, 0, SpringLayout.NORTH, label_12);
		sl_panel_2.putConstraint(SpringLayout.WEST, label_15, 0, SpringLayout.WEST, label_13);
		label_15.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_15);

		JLabel lblNewLabel_5 = new JLabel("池底坡度");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 19, SpringLayout.SOUTH, label_12);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_5, 0, SpringLayout.EAST, label_1);
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(lblNewLabel_5);

		inputpodu = new MyJTextField("池底坡度");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputpodu, -4, SpringLayout.NORTH, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputpodu, 6, SpringLayout.EAST, lblNewLabel_5);
		inputpodu.setText("0.06");
		panel_2.add(inputpodu);
		inputpodu.setColumns(10);

		JLabel lblshi = new JLabel("最小流速砂斗数");
		sl_panel_2.putConstraint(SpringLayout.EAST, lblshi, 0, SpringLayout.EAST, lblNewLabel);
		lblshi.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(lblshi);

		inputmin = new MyJTextField("最小流速砂斗数");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputmin, -4, SpringLayout.NORTH, lblshi);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputmin, 0, SpringLayout.WEST, inputkz);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputmin, -88, SpringLayout.EAST, panel_2);
		inputmin.setText("1");
		panel_2.add(inputmin);
		inputmin.setColumns(10);

		JLabel label_21 = new JLabel("最小流量");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblshi, 21, SpringLayout.SOUTH, label_21);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputpodu, -106, SpringLayout.WEST, label_21);
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_21, 1, SpringLayout.NORTH, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.EAST, label_21, 0, SpringLayout.EAST, lblNewLabel);
		panel_2.add(label_21);

		JLabel label_22 = new JLabel("m³/s");
		sl_panel_2.putConstraint(SpringLayout.NORTH, label_22, 0, SpringLayout.NORTH, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.WEST, label_22, 0, SpringLayout.WEST, label_13);
		label_22.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_2.add(label_22);

		inputQmin = new MyJTextField("最小流量");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputQmin, -4, SpringLayout.NORTH, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputQmin, 293, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputQmin, 0, SpringLayout.EAST, inputkz);
		inputQmin.setText("0.036");
		inputQmin.setColumns(10);
		panel_2.add(inputQmin);

		JLabel label_24 = new JLabel("砂斗个数");
		label_24.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		sl_panel_2.putConstraint(SpringLayout.WEST, label_24, 0, SpringLayout.WEST, label_1);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, label_24, 0, SpringLayout.SOUTH, lblshi);
		panel_2.add(label_24);

		inputshanum = new MyJTextField("砂斗个数");
		inputshanum.setText("4");
		sl_panel_2.putConstraint(SpringLayout.NORTH, inputshanum, -4, SpringLayout.NORTH, lblshi);
		sl_panel_2.putConstraint(SpringLayout.WEST, inputshanum, 0, SpringLayout.WEST, inputQ);
		sl_panel_2.putConstraint(SpringLayout.EAST, inputshanum, 0, SpringLayout.EAST, inputQ);
		panel_2.add(inputshanum);
		inputshanum.setColumns(10);

		final JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\u7ED3\u679C", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		panel.add(panel_3, gbc_panel_3);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);

		JLabel label_5 = new JLabel("长度");
		label_5.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(label_5);

		outLL = new MyJTextField("长度");
		sl_panel_3.putConstraint(SpringLayout.WEST, outLL, 91, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.NORTH, label_5, 5, SpringLayout.NORTH, outLL);
		sl_panel_3.putConstraint(SpringLayout.EAST, label_5, -5, SpringLayout.WEST, outLL);
		sl_panel_3.putConstraint(SpringLayout.NORTH, outLL, 0, SpringLayout.NORTH, panel_3);
		outLL.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		panel_3.add(outLL);
		outLL.setColumns(10);

		JLabel lblM_1 = new JLabel("m");
		sl_panel_3.putConstraint(SpringLayout.WEST, lblM_1, 155, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, outLL, -17, SpringLayout.WEST, lblM_1);
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblM_1, 0, SpringLayout.NORTH, label_5);
		lblM_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(lblM_1);

		JLabel lblNewLabel_2 = new JLabel("水流断面积");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 0, SpringLayout.NORTH, label_5);
		sl_panel_3.putConstraint(SpringLayout.EAST, lblNewLabel_2, -109, SpringLayout.EAST, panel_3);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(lblNewLabel_2);

		outA = new MyJTextField("水流断面积");
		outA.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		sl_panel_3.putConstraint(SpringLayout.NORTH, outA, -4, SpringLayout.NORTH, label_5);
		sl_panel_3.putConstraint(SpringLayout.WEST, outA, 6, SpringLayout.EAST, lblNewLabel_2);
		sl_panel_3.putConstraint(SpringLayout.EAST, outA, -56, SpringLayout.EAST, panel_3);
		panel_3.add(outA);
		outA.setColumns(10);

		JLabel lblM_2 = new JLabel("m²");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblM_2, 0, SpringLayout.NORTH, label_5);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblM_2, 6, SpringLayout.EAST, outA);
		lblM_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(lblM_2);

		JLabel label_2 = new JLabel("池总宽度");
		sl_panel_3.putConstraint(SpringLayout.NORTH, label_2, 17, SpringLayout.SOUTH, label_5);
		sl_panel_3.putConstraint(SpringLayout.EAST, label_2, 0, SpringLayout.EAST, label_5);
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(label_2);

		outB = new MyJTextField("池总宽度");
		outB.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		sl_panel_3.putConstraint(SpringLayout.NORTH, outB, -4, SpringLayout.NORTH, label_2);
		sl_panel_3.putConstraint(SpringLayout.WEST, outB, 0, SpringLayout.WEST, outLL);
		sl_panel_3.putConstraint(SpringLayout.EAST, outB, 0, SpringLayout.EAST, outLL);
		panel_3.add(outB);
		outB.setColumns(10);

		JLabel lblM_4 = new JLabel("m");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblM_4, 0, SpringLayout.NORTH, label_2);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblM_4, 0, SpringLayout.WEST, lblM_1);
		lblM_4.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(lblM_4);

		JLabel label_6 = new JLabel("校核长宽比");
		sl_panel_3.putConstraint(SpringLayout.NORTH, label_6, 0, SpringLayout.NORTH, label_2);
		sl_panel_3.putConstraint(SpringLayout.EAST, label_6, 0, SpringLayout.EAST, lblNewLabel_2);
		label_6.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(label_6);

		outjhck = new MyJTextField("校核长宽比");
		outjhck.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		sl_panel_3.putConstraint(SpringLayout.NORTH, outjhck, -4, SpringLayout.NORTH, label_2);
		sl_panel_3.putConstraint(SpringLayout.WEST, outjhck, 329, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, outjhck, 0, SpringLayout.EAST, outA);
		outjhck.setColumns(10);
		panel_3.add(outjhck);

		JLabel label_11 = new JLabel("所需沉砂斗容积和");
		sl_panel_3.putConstraint(SpringLayout.EAST, label_11, 0, SpringLayout.EAST, lblNewLabel_2);
		label_11.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(label_11);

		outvv = new MyJTextField("所需沉砂斗容积和");
		outvv.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		sl_panel_3.putConstraint(SpringLayout.NORTH, outvv, -4, SpringLayout.NORTH, label_11);
		sl_panel_3.putConstraint(SpringLayout.WEST, outvv, 0, SpringLayout.WEST, outA);
		sl_panel_3.putConstraint(SpringLayout.EAST, outvv, 0, SpringLayout.EAST, outA);
		panel_3.add(outvv);
		outvv.setColumns(10);

		JLabel lblM_6 = new JLabel("m³");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblM_6, 0, SpringLayout.NORTH, label_11);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblM_6, 0, SpringLayout.WEST, lblM_2);
		lblM_6.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(lblM_6);

		JLabel label_16 = new JLabel("设计砂斗容积");
		sl_panel_3.putConstraint(SpringLayout.EAST, label_16, 0, SpringLayout.EAST, lblNewLabel_2);
		label_16.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(label_16);

		JLabel label_17 = new JLabel("沉砂室高度");
		sl_panel_3.putConstraint(SpringLayout.NORTH, label_11, 0, SpringLayout.NORTH, label_17);
		sl_panel_3.putConstraint(SpringLayout.NORTH, label_17, 19, SpringLayout.SOUTH, label_2);
		sl_panel_3.putConstraint(SpringLayout.EAST, label_17, 0, SpringLayout.EAST, label_5);
		label_17.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(label_17);

		outch3 = new MyJTextField("沉砂室高度");
		outch3.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		sl_panel_3.putConstraint(SpringLayout.NORTH, outch3, -4, SpringLayout.NORTH, label_17);
		sl_panel_3.putConstraint(SpringLayout.WEST, outch3, 5, SpringLayout.EAST, label_17);
		panel_3.add(outch3);
		outch3.setColumns(10);

		JLabel lblM_9 = new JLabel("m");
		sl_panel_3.putConstraint(SpringLayout.EAST, outch3, -17, SpringLayout.WEST, lblM_9);
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblM_9, 0, SpringLayout.NORTH, label_17);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblM_9, 0, SpringLayout.WEST, lblM_1);
		lblM_9.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(lblM_9);

		outV0 = new MyJTextField("设计砂斗容积");
		outV0.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		sl_panel_3.putConstraint(SpringLayout.NORTH, outV0, -4, SpringLayout.NORTH, label_16);
		sl_panel_3.putConstraint(SpringLayout.WEST, outV0, 329, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, outV0, 0, SpringLayout.EAST, outA);
		panel_3.add(outV0);
		outV0.setColumns(10);

		JLabel lblM_10 = new JLabel("m³/个");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblM_10, 0, SpringLayout.NORTH, label_16);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblM_10, 0, SpringLayout.WEST, lblM_2);
		lblM_10.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(lblM_10);

		JLabel lblNewLabel_6 = new JLabel("池总高度");
		sl_panel_3.putConstraint(SpringLayout.NORTH, label_16, 0, SpringLayout.NORTH, lblNewLabel_6);
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 17, SpringLayout.SOUTH, label_17);
		sl_panel_3.putConstraint(SpringLayout.EAST, lblNewLabel_6, 0, SpringLayout.EAST, label_5);
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(lblNewLabel_6);

		outHeight = new MyJTextField("池总高度");
		outHeight.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		sl_panel_3.putConstraint(SpringLayout.NORTH, outHeight, -4, SpringLayout.NORTH, lblNewLabel_6);
		sl_panel_3.putConstraint(SpringLayout.WEST, outHeight, 91, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, outHeight, 0, SpringLayout.EAST, outLL);
		panel_3.add(outHeight);
		outHeight.setColumns(10);

		JLabel lblM_11 = new JLabel("m");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblM_11, 0, SpringLayout.NORTH, lblNewLabel_6);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblM_11, 0, SpringLayout.WEST, lblM_1);
		lblM_11.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(lblM_11);

		JLabel label_18 = new JLabel("沉砂斗上口宽");
		sl_panel_3.putConstraint(SpringLayout.NORTH, label_18, 18, SpringLayout.SOUTH, label_16);
		sl_panel_3.putConstraint(SpringLayout.WEST, label_18, 0, SpringLayout.WEST, label_16);
		label_18.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(label_18);

		outtop = new MyJTextField("沉砂斗上口宽");
		outtop.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		sl_panel_3.putConstraint(SpringLayout.NORTH, outtop, -4, SpringLayout.NORTH, label_18);
		sl_panel_3.putConstraint(SpringLayout.WEST, outtop, 329, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, outtop, 0, SpringLayout.EAST, outA);
		panel_3.add(outtop);
		outtop.setColumns(10);

		JLabel lblM_12 = new JLabel("m");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblM_12, 0, SpringLayout.NORTH, label_18);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblM_12, 0, SpringLayout.WEST, lblM_2);
		lblM_12.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(lblM_12);

		JLabel label_19 = new JLabel("斗高");
		label_19.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		sl_panel_3.putConstraint(SpringLayout.NORTH, label_19, 1, SpringLayout.NORTH, label_18);
		sl_panel_3.putConstraint(SpringLayout.WEST, label_19, 0, SpringLayout.WEST, label_5);
		panel_3.add(label_19);

		outhh33 = new MyJTextField("斗高");
		outhh33.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		sl_panel_3.putConstraint(SpringLayout.NORTH, outhh33, -4, SpringLayout.NORTH, label_18);
		sl_panel_3.putConstraint(SpringLayout.WEST, outhh33, 0, SpringLayout.WEST, outLL);
		sl_panel_3.putConstraint(SpringLayout.EAST, outhh33, 0, SpringLayout.EAST, outLL);
		panel_3.add(outhh33);
		outhh33.setColumns(10);

		JLabel lblM_8 = new JLabel("m");
		lblM_8.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblM_8, 0, SpringLayout.NORTH, label_18);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblM_8, 0, SpringLayout.WEST, lblM_1);
		panel_3.add(lblM_8);

		JLabel label_20 = new JLabel("最小流速");
		label_20.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		sl_panel_3.putConstraint(SpringLayout.SOUTH, label_20, -10, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, label_20, 0, SpringLayout.EAST, lblNewLabel_2);
		panel_3.add(label_20);

		outVmin = new MyJTextField("最小流速");
		sl_panel_3.putConstraint(SpringLayout.NORTH, outVmin, -2, SpringLayout.NORTH, label_20);
		sl_panel_3.putConstraint(SpringLayout.WEST, outVmin, 0, SpringLayout.WEST, outA);
		sl_panel_3.putConstraint(SpringLayout.EAST, outVmin, 0, SpringLayout.EAST, outA);
		outVmin.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		panel_3.add(outVmin);
		outVmin.setColumns(10);

		JLabel label_23 = new JLabel("m/s");
		sl_panel_3.putConstraint(SpringLayout.WEST, label_23, 0, SpringLayout.WEST, lblM_2);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, label_23, 0, SpringLayout.SOUTH, label_20);
		label_23.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		panel_3.add(label_23);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(BorderFactory.createTitledBorder("示意图"));
		sl_pingliupanel.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, this);
		sl_pingliupanel.putConstraint(SpringLayout.WEST, panel_1, 444, SpringLayout.WEST, this);
		sl_pingliupanel.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, this);
		sl_pingliupanel.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, this);
		this.add(panel_1);
		panel_1.setLayout(null);

		final JLabel outh1 = new JLabel("");
		outh1.setBounds(109, 100, 61, 16);
		panel_1.add(outh1);

		final JLabel outh2 = new JLabel("");
		outh2.setBounds(109, 123, 54, 16);
		panel_1.add(outh2);

		final JLabel outh3 = new JLabel("");
		outh3.setBounds(131, 148, 61, 16);
		panel_1.add(outh3);

		final JLabel outL = new JLabel("");
		outL.setBounds(189, 483, 61, 16);
		panel_1.add(outL);

		// 清空
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RootWindow.getTishi().setText("");
				for (int i = 0; i < panel_1.getComponentCount(); i++) {
					if (panel_1.getComponent(i) instanceof JLabel) {
						((JLabel) panel_1.getComponent(i)).setText("");
					}
				}
				for (int i = 0; i < panel_2.getComponentCount(); i++) {
					if (panel_2.getComponent(i) instanceof MyJTextField) {
						((MyJTextField) panel_2.getComponent(i)).setText("");
					}
				}
				for (int i = 0; i < panel_3.getComponentCount(); i++) {
					if (panel_3.getComponent(i) instanceof MyJTextField) {
						((MyJTextField) panel_3.getComponent(i)).setText("");
					}
				}
			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 清空数据显示
				for (int i = 0; i < panel_1.getComponentCount(); i++) {
					if (panel_1.getComponent(i) instanceof JLabel) {
						((JLabel) panel_1.getComponent(i)).setText("");
					}
				}
				for (int i = 0; i < panel_3.getComponentCount(); i++) {
					if (panel_3.getComponent(i) instanceof MyJTextField) {
						((MyJTextField) panel_3.getComponent(i)).setText("");
					}
				}
				float sv = 0;// 速度
				float AA = 0;// 水流断面积
				float LL = 0;// 长度
				float BB = 0;// 宽度
				float VV = 0;// 容积
				double aa = 0;// 沉砂池上口宽
				double hh33 = 0;// 斗高
				double h3 = 0;

				if (!inputv.getText().isEmpty() && !inputt.getText().isEmpty()) {
					// 求长度
					sv = new Float(inputv.getText()).floatValue();// 速度
					float tt = new Float(inputt.getText()).floatValue();// 时间
					LL = sv * tt;
					outLL.setText(Utils.round(LL) + "");
				}

				if (!inputQ.getText().isEmpty() && sv != 0) {
					// 水流断面积
					float qq = new Float(inputQ.getText()).floatValue();// 流量
					AA = qq / sv;// 水流断面积
					outA.setText(Utils.round(AA) + "");
				}
				if (!inputh2.getText().isEmpty() && AA != 0) {
					// 池总宽度
					float h2 = new Float(inputh2.getText()).floatValue();
					BB = AA / h2;
					outB.setText(Utils.round(BB) + "");
					outh2.setText(inputh2.getText() + "m");
				}
				if (LL != 0 && BB != 0) {
					// 校核长宽比
					if (LL / BB < 4) {
						outjhck.setText("不符");
					} else {
						outjhck.setText("符合");
					}
				}
				if (!inputQ.getText().isEmpty() && !inputday.getText().isEmpty() && !inputpai.getText().isEmpty()
						&& !inputkz.getText().isEmpty()) {
					float qq = new Float(inputQ.getText()).floatValue();
					float dd = new Float(inputday.getText()).floatValue();
					float pp = new Float(inputpai.getText()).floatValue();
					float kz = new Float(inputkz.getText()).floatValue();
					VV = qq * dd * pp * 86400 / (kz * 1000000);
					outvv.setText(Utils.round(VV) + "");
				}
				// 计算斗高h3'
				if (!inputdoudi.getText().isEmpty() && !inputqj.getText().isEmpty() && BB != 0) {
					double qj = new Double(inputqj.getText()).doubleValue();
					double doudi = new Double(inputdoudi.getText()).doubleValue();
					hh33 = Math.tan(qj * Math.PI / 180) * (BB - doudi) / 2;
					outhh33.setText(Utils.round((float) hh33) + "");
				}

				// 计算斗顶宽
				if (hh33 != 0) {
					//
					double doudi = new Double(inputdoudi.getText()).doubleValue();
					double qj = new Double(inputqj.getText()).doubleValue();
					aa = (2 * hh33 / Math.tan(qj * Math.PI / 180)) + doudi;
					float af = new Float(aa).floatValue();
					outtop.setText(Utils.round(af) + "");
				}
				// 计算设计容积
				if (aa != 0) {
					double doudi = new Double(inputdoudi.getText()).doubleValue();
					double V0 = hh33 / 6.0 * (2 * aa * aa + 2 * aa * doudi + 2 * doudi * doudi);
					float V0f = new Float(V0).floatValue();
					outV0.setText(Utils.round(V0f) + "");
				}
				// 计算除砂室高度
				if (hh33 != 0 && LL != 0 && !inputpodu.getText().isEmpty() && aa != 0
						&& !inputdoudi.getText().isEmpty()) {
					double doudi = new Double(inputdoudi.getText()).doubleValue();
					double podu = new Double(inputpodu.getText()).doubleValue();
					h3 = hh33 + podu * (LL - 2 * aa - (aa - doudi)) / 2;
					outh3.setText(Utils.round((float) h3) + "m");
					outch3.setText(Utils.round((float) h3) + "");
				}
				if (!inputh1.getText().isEmpty()) {
					outh1.setText(inputh1.getText() + "m");
				}
				// 计算池总高度
				if (h3 != 0 && !inputh2.getText().isEmpty() && !inputh1.getText().isEmpty()) {
					float h2 = new Float(inputh2.getText()).floatValue();
					float h1 = new Float(inputh1.getText()).floatValue();
					float hh = h1 + h2 + (float) h3;
					outHeight.setText(Utils.round(hh) + "");
				}
				// 演算最小流速
				if (!inputmin.getText().isEmpty() && !inputQmin.getText().isEmpty() && BB != 0
						&& !inputshanum.getText().isEmpty() && !inputh2.getText().isEmpty()) {
					float h2 = new Float(inputh2.getText()).floatValue();
					float num = new Float(inputshanum.getText()).floatValue();
					float qmin = new Float(inputQmin.getText()).floatValue();
					float nummin = new Float(inputmin.getText()).floatValue();

					float min = qmin / (nummin * h2 * (BB / num));
					outVmin.setText(Utils.round(min) + "");

				}
			}
		});

		JLabel img1 = new JLabel("");
		img1.setIcon(new ImageIcon(RootWindow.class.getResource("/img/pl1.png")));
		//System.out.println(RootWindow.class.getResource("/img/pl1.png"));
		img1.setBounds(6, 21, 423, 239);
		panel_1.add(img1);

		JLabel img2 = new JLabel("");
		img2.setIcon(new ImageIcon(RootWindow.class.getResource("/img/pl2.png")));
		img2.setBounds(6, 286, 423, 239);
		panel_1.add(img2);
	
	}
	
	public static PlWindow getPlWindow(){
		return plWindow;
	}
}
