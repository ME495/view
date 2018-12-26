import java.awt.EventQueue;

import javax.swing.JFrame;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;

import Controller.Listener;
import Controller.mainLayout;

import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.Color;

public class View {

	private JFrame frmWenbe;
	private static Button button;
	private static Button button_1;
	private static Canvas canvas;
	private static Button button_2;
	private static TextField textField;
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
		
		ActionListener bt1_ls=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String codetext=textField.getText();
			}
		};
		button_1.addActionListener(bt1_ls);
		
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
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
		
		 textField = new TextField();
		textField.setBounds(128, 38, 380, 174);
		frmWenbe.getContentPane().add(textField);
	}
	
}
