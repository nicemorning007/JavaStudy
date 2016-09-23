package javast;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TEST {

	public static void main(String[] args) {
		Frame frame = new Frame("诗琪傻逼");
		frame.setSize(400, 300);
		frame.setLocation(400, 500);
		frame.setVisible(true);
		Button button = new Button("Button");
		frame.add(button);
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseEvent) {
				int clickcount = mouseEvent.getClickCount();
				if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
					if (clickcount == 2) {
						System.out.println("Mouse Left Click twice.");
					}
					if (clickcount == 1) {
						System.out.println("Mouse Left Click once.");
					}
				}
				if (mouseEvent.getButton() == MouseEvent.BUTTON2) {
					System.out.println("Mouse Center Click once.");
				}
				if (mouseEvent.getButton() == MouseEvent.BUTTON3) {
					System.out.println("Mouse Right Click once.");
				}
			}
		});
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				Window window = event.getWindow();
				window.setVisible(false);
				window.dispose();
				System.out.println("Window Closing");
			}

			public void windowClosed(WindowEvent event) {
				System.out.println("Window Clossed");
			}
		});
	}

}
