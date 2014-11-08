package Ex1;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class SelectLanguageLayout {

	public SelectLanguageLayout() {
		
		JFrame pantalla=new JFrame("Selected Language");
		
		JPanel principal=(JPanel)pantalla.getContentPane();
		
		//principal.setLayout(new CardLayout());
		
		JTabbedPane panel=new JTabbedPane();
		
		
		JPanel a=new JPanel();
		a.add(new JButton("Hola"));
		JPanel b=new JPanel();
		b.add(new JButton("Hello"));
		
		panel.addTab("Català", null,a,"Català!");
		panel.addTab("Anglès", b);
		
	
		
		pantalla.setSize(new Dimension(400,300));
		principal.add(panel);
		
		
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pantalla.setVisible(true);
		
		
	}
	public static void main(String[]args){
		SelectLanguageLayout a=new SelectLanguageLayout();
	}

}
