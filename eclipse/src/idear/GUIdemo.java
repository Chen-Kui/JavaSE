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
		Frame f = new Frame("GUI����");
		//����һ���ı���
		final TextField t = new TextField(30);
		//���ı�����ڴ��ڵı���
		f.add(t,BorderLayout.NORTH);
		f.pack();//�Լ����ڴ��ڴ�С
		//����һ����ť:Button
		Button btn = new Button("����鿴");
		btn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String info = t.getText();
				System.out.println("��������ð���"+info);
			}
			
		});
		f.add(btn);//
		f.setVisible(true);//��ʾ���
		f.addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);//�˳�JVM
			 }
		});
	}
}

