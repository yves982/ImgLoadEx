package pkg;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import utils.ImageProxy;
import utils.ImageUtil;

public class Launcher
{

	public static void main(String[] args)
	{
		try
		{
			JFrame frm = new JFrame("toto");
			LayoutManager layout = new FlowLayout();
			frm.setLayout(layout);
			frm.setSize(400, 600);
			Image img = new ImageProxy("vitre05");
			img = ImageUtil.resize(img, 215, 50);
			ImageIcon icon = new ImageIcon(img);
			JLabel lbl = new JLabel(icon);
			lbl.setBounds(4, 4, 200, 200);

			frm.add(lbl);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frm.setVisible(true);
		} catch (Exception ex)
		{
			System.err.println(ex.getMessage());
		}
	}

}
