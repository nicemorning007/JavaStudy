package javast;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
class jframe extends JFrame {
	public jframe() {
		this.setTitle("JFrame");
		this.setLocation(300, 350);
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar jMenuBar = new JMenuBar();
		this.setJMenuBar(jMenuBar);
		JMenu jmenu = new JMenu("Menu1");
		JMenu jmenu2 = new JMenu("Menu2");
		JMenuItem jMenuItem = new JMenuItem("MenuItem1");
		jMenuItem.setName("MenuItem1");
		JMenuItem jMenuItem2 = new JMenuItem("MenuItem2");
		jMenuItem2.setName("MenuItem2");
		JMenuItem jMenuItem3 = new JMenuItem("MenuItem3");
		jMenuItem3.setName("MenuItem3");
		jMenuBar.add(jmenu);
		jMenuBar.add(jmenu2);
		jmenu.add(jMenuItem);
		jmenu.addSeparator();
		jmenu.add(jMenuItem2);
		jmenu2.add(jMenuItem3);
		JLabel jLabel = new JLabel("Text here");
		this.add(jLabel, BorderLayout.CENTER);
		jMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jLabel.setText(jMenuItem.getName());
			}
		});
		jMenuItem2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jLabel.setText(jMenuItem2.getName());
			}
		});
		jMenuItem3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jLabel.setText(jMenuItem3.getName());
			}
		});
		this.setVisible(true);
	}
}

public class C09_Q03 {

	public static void main(String[] args) {
		new jframe();
	}

}
