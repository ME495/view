package view;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.awt.Rectangle;
import java.awt.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.internal.handlers.WizardHandler.New;

import Controller.Listener;
import Controller.jiexieqi;
import Controller.mainLayout;

import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

import javax.swing.DebugGraphics;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.TextField;
import java.awt.Color;

import model.view_model;
public class View {

	private JFrame frmWenbe;
	private static Button button;
	private static Button button_1;
	private static Canvas canvas;
	private static Button button_2;
	private static TextArea textArea;
	public String codetext;
	view_model model = new view_model();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frmWenbe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
		
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				codetext=textArea.getText();
				String[] strings = codetext.split("\n");
				java.util.List<String> list = Arrays.asList(strings);
				System.out.println(list);
				jiexieqi jiexieqi = new jiexieqi();
				System.out.println(jiexieqi.jiexie(list));
				model.setCodetext(codetext);
				//System.out.println(codetext);
			}
		});
		
		//model.setCodetext(codetext);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				codetext=textArea.getText();
				saveFile(codetext);
				System.out.println("true");
			}
		});
		Mycanvas mycanvas = new Mycanvas();
		frmWenbe.getContentPane().add(mycanvas);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWenbe = new JFrame();
		frmWenbe.setTitle("wenbe");
		frmWenbe.getContentPane().setBackground(Color.WHITE);
		frmWenbe.setBounds(100, 100, 686, 879);
		frmWenbe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWenbe.getContentPane().setLayout(null);
		
		 button = new Button("save");
		button.setBackground(Color.WHITE);
		button.setActionCommand("save");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(177, 237, 76, 23);
		frmWenbe.getContentPane().add(button);
		
		 button_1 = new Button("run");
		button_1.setBackground(Color.WHITE);
		button_1.setActionCommand("run");
		button_1.setBounds(335, 237, 76, 23);
		frmWenbe.getContentPane().add(button_1);
		
		canvas = new Canvas();
		canvas.setBounds(110, 314, 430, 368);
		frmWenbe.getContentPane().add(canvas);
		
		 button_2 = new Button("save");
		button_2.setBackground(Color.WHITE);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(297, 712, 76, 23);
		frmWenbe.getContentPane().add(button_2);
		
		textArea = new TextArea();
		textArea.setBounds(131, 26, 440, 170);
		frmWenbe.getContentPane().add(textArea);
		 
		//textField = new TextField();
		// textField.setColumns(3);
		//textField.setBounds(131, 26, 380, 174);
		//frmWenbe.getContentPane().add(textField);
		
	}
	
	/*
	 * save date
	 */
	public void saveFile(String codetext) {
		System.out.println(codetext);
		//弹出文件选择框
		JFileChooser chooser = new JFileChooser();
		
		//后缀名过滤器
		FileNameExtensionFilter filter = new FileNameExtensionFilter("通讯录文件(*.con)", "con");
		chooser.setFileFilter(filter);
		
		//下面的方法将阻塞，直到【用户按下保存按钮且“文件名”文本框不为空】或【用户按下取消按钮】
		int option = chooser.showSaveDialog(null);
		if(option==JFileChooser.APPROVE_OPTION){	//假如用户选择了保存
			File file = chooser.getSelectedFile();
			
			String fname = chooser.getName(file);	//从文件名输入框中获取文件名
			
			//假如用户填写的文件名不带我们制定的后缀名，那么我们给它添上后缀
			if(fname.indexOf(".txt")==-1){
				file=new File(chooser.getCurrentDirectory(),fname+".txt");
				System.out.println("renamed");
				System.out.println(file.getName());
			}
			
			try {
				FileOutputStream fos = new FileOutputStream(file);
				
				fos.write(codetext.getBytes(),0,codetext.length());
				fos.close();
				
			} catch (IOException e) {
				System.err.println("IO异常");
				e.printStackTrace();
			}	
		}
	}
}
class Mycanvas extends JPanel{
	public void paintComponent(Graphics g){
		g.drawRect(0, 0, 10, 10);
	}
}
