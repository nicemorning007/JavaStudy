package javast;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class C09_Q02 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("今晚干什么");
		jFrame.setSize(500, 300);
		jFrame.setLocation(700, 400);

		ButtonGroup buttonGroup = new ButtonGroup();
		JRadioButton jRadioButtonmale = new JRadioButton("男");
		JRadioButton jRadioButtonfemale = new JRadioButton("女");
		buttonGroup.add(jRadioButtonfemale);
		buttonGroup.add(jRadioButtonmale);

		JTextArea jTextArea = new JTextArea("", 15, 30);
		jTextArea.setEditable(true);

		JCheckBox jCheckBoxb = new JCheckBox("吃宵夜");
		JCheckBox jCheckBoxp = new JCheckBox("喝糖水");
		JCheckBox jCheckBoxs = new JCheckBox("约师妹");

		JLabel jLabel = new JLabel("Habbit");
		JPanel jPanel = new JPanel();

		JScrollPane jScrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jPanel.add(jLabel);
		// jTextArea.add(jScrollPane);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (jCheckBoxb.isSelected()) {
					jTextArea.append("吃宵夜  ");
				}
				if (jCheckBoxp.isSelected()) {
					jTextArea.append("喝糖水  ");
				}
				if (jCheckBoxs.isSelected()) {
					jTextArea.append("约师妹  ");
				}
				if (jRadioButtonfemale.isSelected()) {
					jTextArea.append("女  ");
				}
				if (jRadioButtonmale.isSelected()) {
					jTextArea.append("男  ");
				}
				jTextArea.append("\n");
			}
		};

		jRadioButtonfemale.addActionListener(actionListener);
		jRadioButtonmale.addActionListener(actionListener);
		jCheckBoxb.addActionListener(actionListener);
		jCheckBoxp.addActionListener(actionListener);
		jCheckBoxs.addActionListener(actionListener);

		jPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 3));
		jPanel.add(jLabel);
		jPanel.add(jCheckBoxb);
		jPanel.add(jCheckBoxp);
		jPanel.add(jCheckBoxs);
		jPanel.add(jRadioButtonfemale);
		jPanel.add(jRadioButtonmale);

		jFrame.add(jPanel, BorderLayout.NORTH);
		jFrame.add(jScrollPane, BorderLayout.CENTER);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
