package Ex1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginLayout {

	public LoginLayout() {
	
		JFrame pantalla=new JFrame("Login Layout");
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel general=(JPanel)pantalla.getContentPane();
		general.setLayout(new GridBagLayout());
		
		GridBagConstraints c=new GridBagConstraints();
		
		JLabel user=new JLabel("User:");
		user.setHorizontalTextPosition(SwingConstants.LEFT);//marta??
		JLabel pas=new JLabel("Password:");
		JTextField inputUser=new JTextField();
		JTextField inputPas=new JTextField();
		JButton btnlogin=new JButton("Login");
		JButton btnreg=new JButton("Register");
		
		c.gridx=0;
		c.gridy=0;
		c.insets=new Insets(0,0,0,100);//marta??
		general.add(user,c);
		c.gridx=0;
		c.gridy=1;
		c.insets=new Insets(0,0,0,100);
		general.add(pas,c);
		
		c.gridx=1;
		c.gridy=0;
		c.insets=new Insets(0,0,0,50);
		c.ipadx=200;
		c.gridwidth=2;
		general.add(inputUser,c);
		c.gridx=1;
		c.gridy=1;
		c.insets=new Insets(0,0,0,50);
		c.ipadx=200;
		c.gridwidth=2;
		general.add(inputPas,c);
		
		c.gridwidth=1;
		
		c.gridx=0;
		c.gridy=2;
		c.insets=new Insets(0,0,0,100);
		c.ipadx=10;		
		general.add(btnlogin,c);
		
		c.gridx=2;
		c.gridy=2;
		c.insets=new Insets(0,0,0,50);
		c.ipadx=10;
		c.fill=GridBagConstraints.WEST;
		general.add(btnreg,c);
		
		
		pantalla.setVisible(true);
		pantalla.pack();
	}
	
	public static void main(String[]args){
		LoginLayout a=new LoginLayout();
	}

}
