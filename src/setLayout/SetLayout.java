package setLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class SetLayout {

	public static JFrame window;
	
	public SetLayout() {
		
	}
	
	public void init(String windowName) {
		System.out.println(windowName);
		window = new JFrame(windowName);
		window.setLayout(null);
	}
	
	public JFrame startWindow(){
		return window;
	}
	
	public void setBounds(int a, int b, int c, int d) {
		window.setBounds(a, b, c, d);
		window.setResizable(false);
	}

	public void setLabel(String name, int x, int y, int width, int height) {
		JLabel label = new JLabel(name);
		label.setBounds(x, y, width, height);
		window.add(label);
	}

	public void setTextField( String text, int x, int y, int width, int height) {
		JTextField textField = new JTextField();
		textField.setBounds(x, y, width, height);
		textField.setText(text);
		window.add(textField);
	}
	
	public void setTextField(int x, int y, int width, int height) {
		JTextField textField = new JTextField();
		textField.setBounds(x, y, width, height);
		window.add(textField);
	}
	
	public void setButton(String name, int x,int y,int width,int height){
		JButton btn = new  JButton(name);
		btn.setBounds(x, y, width, height);
		window.add(btn);
	}
	
	public void setList(int x,int y,int width,int height){
		JList<String> list = new JList<String>();
		JScrollPane scrollPanel = new JScrollPane(list);
		scrollPanel.setBounds(x, y, width, height);
		window.add(scrollPanel);
	}
	
	public void setTextArea(int x,int y,int width,int height){
		JTextArea textArea = new JTextArea();
		textArea.setBounds(x, y, width, height);
		textArea.setEditable(false);
		textArea.setBorder(new TitledBorder("聊天记录"));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		JScrollPane scrollPanel = new JScrollPane(textArea);
		scrollPanel.setBounds(x,y,width,height);
		window.add(scrollPanel);
	}
	
	public void setVisibility(){
		window.setVisible(true);
	}

}
 

