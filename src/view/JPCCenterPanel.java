package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

import utilities.Utilities;

public class JPCCenterPanel extends JPanel{
	private static String [] BUTTONS_CONTEN= {"%","√"," x²","1/x"};
	JButton jButton;
	JPanel jPanelaux;
	JPanel jPanelauxNorth;
	JPanel jPanelauxCenter;
	public JPCCenterPanel() {
		setLayout(new BorderLayout());
//		setPreferredSize(new DimensionUIResource(0, 232/3));
		setBackground(Utilities.mainColor());
		initComponents();
	}

	private void initComponents() {
		jPanelauxNorth = new JPanel();
		jPanelauxNorth.setBackground(Utilities.secundaryColor());
//		jPanelauxNorth.setBackground(Color.red);
		jPanelauxNorth.setPreferredSize(new Dimension(0, 1));
		this.add(jPanelauxNorth,BorderLayout.NORTH);

		jPanelauxCenter = new JPanel();
		jPanelauxCenter.setBackground(Utilities.mainColor());
		jPanelauxCenter.setLayout(new GridLayout(1,4));

			for (int i = 0; i < 4; i++) {
				jButton = new JButton();
				jButton.setForeground(Utilities.mainLetterColor());
				jButton.setBackground(Utilities.mainColor());
				jButton.setFont(i==3?Utilities.mediumLetter():Utilities.bigPlainLetter());
				jButton.setText(BUTTONS_CONTEN[i]);
				jButton.setBorder(new RoundedBorder(0,Utilities.mainColor()));
				jPanelauxCenter.add(jButton);
			}
		this.add(jPanelauxCenter,BorderLayout.CENTER);
	}
}
