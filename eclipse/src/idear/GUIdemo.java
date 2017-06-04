package idear;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIdemo {
	public static void main(String[] args) {
		Frame f = new Frame("GUI界面");
		//创建一个文本框
		final TextField t = new TextField(30);
		//把文本框放在窗口的北部
		f.add(t,BorderLayout.NORTH);
		f.pack();//自己调节窗口大小
		//创建一个按钮:Button
		Button btn = new Button("点击查看");
		btn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String info = t.getText();
				System.out.println("芳芳，你好啊！"+info);
			}
			
		});
		f.add(btn);//
		f.setVisible(true);//显示组件
		f.addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);//退出JVM
			 }
		});
	}
}

