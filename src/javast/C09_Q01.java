package javast;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class C09_Q01 {

	public static void main(String[] args) {
		//设置JFrame窗口
		JFrame jFrame = new JFrame("Mouse");
		jFrame.setSize(200, 300);
		jFrame.setLocation(300, 500);
		//添加Lable组件，布局到NORTH
		Label label = new Label("Mouse Location");
		jFrame.add(label, BorderLayout.NORTH);
		//添加鼠标事件监听器
		jFrame.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				if (event.getButton() == MouseEvent.BUTTON3) {
					label.setText("Mouse Location:" + event.getX() + "," + event.getY());
				}
			}
		});
		//设置关闭按钮
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口可见
		jFrame.setVisible(true);
	}

}
