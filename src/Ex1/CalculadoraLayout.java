package Ex1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class CalculadoraLayout {


	public static void main(String[] args) {
		
		
		JFrame frame=new JFrame("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelcontenido=(JPanel)frame.getContentPane();
		BoxLayout boxlayaut=new BoxLayout(panelcontenido,BoxLayout.Y_AXIS);
		panelcontenido.setLayout(boxlayaut);
		
		
		JPanel visor=new JPanel();
		visor.setBackground(Color.red);
		visor.setMaximumSize(new Dimension(2999,50));//pq?
		
		JTextField pan= new JTextField("");
		pan.setHorizontalAlignment(JTextField.RIGHT);
		
		pan.setPreferredSize(new Dimension(300,35));
		
		visor.add(pan);
		panelcontenido.add(visor);
		
		JPanel botones=new JPanel(new GridLayout(4,4));
		
		String[][] nombres={{"7","8","9","+"},{"4","5","6","-"},{"3","2","1","X"},{"0","C","=","/"}};
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				botones.add(new JButton(nombres[i][j]));
			}
		}
		
		panelcontenido.add(botones);
		frame.setPreferredSize(new Dimension(300,350));
		frame.setResizable(false);
		frame.setVisible(true);
		frame.pack();
		
		

	}

}
