package Ex2;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;


public class Test_Ex2 extends JFrame implements ActionListener {
	
	private JTextArea textArea;
	private JToggleButton btnSub;
	private JToggleButton btnNeg;
	private JToggleButton btnCur;
	Map attributes;
	private final Font normal = new Font("Arial", Font.PLAIN, 14);
	private final Font negrita = new Font("Arial", Font.BOLD, 14);
	private final Font cursiva = new Font("Arial", Font.ITALIC, 14);
	private final Font cursivaNegrita = new Font("Arial", Font.ITALIC|Font.BOLD, 14);
	
	public Test_Ex2() {
		
		this.setTitle("TestEditLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//container
		JPanel contenedor=(JPanel)this.getContentPane();
		contenedor.setLayout(null);
		
		Insets  insets = contenedor.getInsets();
		
		//textArea
		textArea=new JTextArea("");
		textArea.setBounds(5+insets.left, 5+insets.top, 250, 200);
		Font normal = new Font("Arial", Font.PLAIN, 14);
		textArea.setFont(normal);

		
		contenedor.add(textArea);
		
		//button Subrayar
		btnSub=new JToggleButton("SUBRAYAR");
		btnSub.setBounds(textArea.getWidth()+5, 10+insets.top, 90, 25);
		btnSub.addActionListener(this);
		contenedor.add(btnSub);
		//button negrita
		btnNeg=new JToggleButton("NEGRITA");
		btnNeg.setBounds(textArea.getWidth()+5,60,90,25);
		btnNeg.addActionListener(this);
		contenedor.add(btnNeg);
		//button Cursiva
		btnCur=new JToggleButton("CURSIVA");
		btnCur.setBounds(textArea.getWidth()+5,110,90,25);
		btnCur.addActionListener(this);
		contenedor.add(btnCur);
		
		//this.setResizable(false);
		this.setSize(new Dimension(350,230));
		this.setVisible(true);
	}

	
	
	public static void main(String[] args) {
		
		Test_Ex2 a=new Test_Ex2();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		Font font = this.textArea.getFont();
		attributes = font.getAttributes();
		
		
		if(this.textArea.getText().length()!=0){
			
			if(e.getSource()==btnSub){//Boton subrayado
				
				if(btnSub.isSelected()){//Boton subrayado => seleccionado
					
					attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
					
					if(btnNeg.isSelected() && btnCur.isSelected() ){//+ negrita y cursiva
						
						this.textArea.setFont(cursivaNegrita.deriveFont(attributes));
						System.out.println("Subrayado + Negrita + Cursiva");
						
					
					}else if(btnNeg.isSelected()){ //+ negrita	
						
						this.textArea.setFont(negrita.deriveFont(attributes));
						System.out.println("Subrayado + Negrita");
						
					}else if(btnCur.isSelected()){//+cursiva
						
						this.textArea.setFont(cursiva.deriveFont(attributes));
					}else{//solo subrayado
						this.textArea.setFont(normal.deriveFont(attributes));
					}
				}else{//Boton subrayado => no seleccionado
					
					attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE);
					
					if(btnNeg.isSelected() && btnCur.isSelected() ){//+ negrita y cursiva
						
						this.textArea.setFont(cursivaNegrita.deriveFont(attributes));
					
					}else if(btnNeg.isSelected()){ //+ negrita	
						
						this.textArea.setFont(negrita.deriveFont(attributes));
				
					}else if(btnCur.isSelected()){//+cursiva
						
						this.textArea.setFont(cursiva.deriveFont(attributes));
					}else{
						this.textArea.setFont(normal.deriveFont(attributes));
					}
				}
				
			}else if(e.getSource()==btnNeg){//negrita 
				
				if(btnNeg.isSelected()){//Boton negrita => Seleccionado
					
					if(btnSub.isSelected() && btnCur.isSelected() ){//+ Subrayado y cursiva

						this.textArea.setFont(cursivaNegrita.deriveFont(attributes));
						System.out.println("Negita + Subrayado + Cursiva");
					
					}else if(btnSub.isSelected()){ //+ Subrayado	
						
						attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
						this.textArea.setFont(negrita.deriveFont(attributes));
						System.out.println("Negita + Subrayado");
						
					}else if(btnCur.isSelected()){//+cursiva
						
						this.textArea.setFont(cursivaNegrita);
						
					}else{//solo negrita
						this.textArea.setFont(negrita);
						System.out.println("solo negrita");
					}

				}else{//Boton negrita => NO Seleccionado
					
					
					if(btnSub.isSelected() && btnCur.isSelected() ){//+ Subrayado y cursiva
						
						//attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
						this.textArea.setFont(cursiva.deriveFont(attributes));
					
					}else if(btnSub.isSelected()){ //+ Subrayado	
						
						//attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
						this.textArea.setFont(normal.deriveFont(attributes));
				
					}else if(btnCur.isSelected()){//+cursiva
						
						this.textArea.setFont(cursiva);
					}else{
						this.textArea.setFont(normal);
					}
					
				}		
			}else if(e.getSource()==btnCur){//Boton Cursiva
				
				if(btnCur.isSelected()){//Boton Cursiva => Seleccionado
						
						if(btnSub.isSelected() && btnNeg.isSelected() ){//+ Subrayado y Negrita
							
							//attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);

							this.textArea.setFont(cursivaNegrita.deriveFont(attributes));
						
						}else if(btnSub.isSelected()){ //+ Subrayado	
							
							//attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
							this.textArea.setFont(cursiva.deriveFont(attributes));
					
						}else if(btnNeg.isSelected()){//+Negrita
							
							this.textArea.setFont(cursivaNegrita);
						}else{//solo Cursiva
							
							this.textArea.setFont(cursiva);
						}
		
				}else{//Boton Cursiva => NO Seleccionado
				
					if(btnSub.isSelected() && btnNeg.isSelected() ){//+ Subrayado y Negrita
						
						//attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);

						this.textArea.setFont(negrita.deriveFont(attributes));
					
					}else if(btnSub.isSelected()){ //+ Subrayado	
						
						//attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
						this.textArea.setFont(normal.deriveFont(attributes));
				
					}else if(btnNeg.isSelected()){//+Negrita
						
						this.textArea.setFont(negrita);
					}else{//solo Cursiva
						
						this.textArea.setFont(normal);
					}	
				}
		}else{
			//futuras opciones		
		}
	}
}
}
