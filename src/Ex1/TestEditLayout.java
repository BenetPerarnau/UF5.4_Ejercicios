package Ex1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestEditLayout extends JFrame {

	
	public TestEditLayout(){
		this.setTitle("TestEditLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//container
		JPanel contenedor=(JPanel)this.getContentPane();
		contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));
		
		//izquierda
		
		JPanel izquierda=new JPanel();
		izquierda.setMinimumSize(new Dimension(200,200));
		//derecha
		
		JPanel derecha=new JPanel();
		derecha.setLayout(new BoxLayout(derecha,BoxLayout.Y_AXIS) );
	
		///Componentes
		
		JTextArea textArea=new JTextArea("",15,15);
		textArea.setMinimumSize(new Dimension(200,200));
		
		JButton btnSub=new JButton("SUBRAYAR");
		JButton btnCur=new JButton("CURSIVA");
		JButton btnNeg=new JButton("NEGRITA");
		
		//add componentes a iz/der
		
		izquierda.add(textArea);
		derecha.add(btnNeg);
		derecha.add(btnCur);
		derecha.add(btnSub);
		
		
		//add al container izquierda/derecha
		
		contenedor.add(izquierda);
		contenedor.add(derecha);
		
		
		this.pack();
		this.setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		TestEditLayout a=new TestEditLayout();
	}


}
