package maytinh;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gridbanglayout extends JFrame implements ActionListener
{	
	
		JTextField t1=new JTextField();
		JButton b1=new JButton("1"); 
	
		GridBagLayout gb;
		GridBagConstraints gbc;
		public void addComponent(Component c, int row, int col, int nrow, int ncol)
		{	gbc.gridx=col;
			gbc.gridy=row;
			gbc.gridwidth=nrow;
			gbc.gridheight=ncol;
			gb.setConstraints(c,gbc);
			add(c);
		}

		public  Gridbanglayout(String title)
		{
			JTextField t1=new JTextField("                                    ");
					 
			JButton jbtn1 = new JButton("Button 1");
		     JButton jbtn2 = new JButton("Button 2");
		     JButton jbtn3 = new JButton("Button 3");
		     JButton jbtn4 = new JButton("Button 4");
		     JButton jbtn5 = new JButton("Button 5");
		     
		     //new GridBagLayout
		     GridBagLayout layout = new GridBagLayout();
		      setLayout(layout);
		     //new GridBagConstraints
		     GridBagConstraints gbc = new GridBagConstraints();
		     //add button to JFrame
		     gbc.fill = GridBagConstraints.NORTH;
		     gbc.gridx = 0;
		     gbc.gridy = 0;
		     gbc.ipady = 20;
		     add(t1, gbc);
		     
		     GridLayout gl=new GridLayout(3,4);
		    		 setLayout(gl);
		    		 add(jbtn1);
		    		 add(jbtn2);
		    		 add(jbtn3);
		    		 add(jbtn4);
		    		 add(jbtn5);
		    	
		    		 
		    		 
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Gridbanglayout f=new Gridbanglayout("May tinh cua toi");
	f.setSize(500,500);
	f.show();
			
		}

	}

