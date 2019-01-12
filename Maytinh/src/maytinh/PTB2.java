
package maytinh;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PTB2 extends JFrame{
	public PTB2(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        gb=new GridBagLayout();
        //setLayout(gb);
        gbc=new GridBagConstraints();
        container = this.getContentPane();
        container.setLayout(gb);
        
        l1=new JLabel("Gia phuong trinh bac nhat");
        l2=new JLabel("Nhap a: ");
        l3=new JLabel("Nhap b: ");
        l4=new JLabel("Ket qua: ");
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf3.setEditable(false);
        b1=new JButton("Tinh");
        b2=new JButton("Reset");
        b3=new JButton("Cancel");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=6;
        gbc.gridheight=1;
        gbc.ipady=40;
        container.add(l1,gbc);
        
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=3;
        gbc.gridheight=1;
        gbc.ipady=0;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        container.add(l2,gbc);
        
        gbc.gridx=3;
        gbc.gridy=1;
        gbc.gridwidth=3;
        gbc.gridheight=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        container.add(tf1,gbc);
        
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=3;
        gbc.gridheight=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        container.add(l3,gbc);
        
        gbc.gridx=3;
        gbc.gridy=2;
        gbc.gridwidth=3;
        gbc.gridheight=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        container.add(tf2,gbc);
        
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridwidth=3;
        gbc.gridheight=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        container.add(l4,gbc);
        
        gbc.gridx=3;
        gbc.gridy=3;
        gbc.gridwidth=3;
        gbc.gridheight=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        container.add(tf3,gbc);
        
        gbc.gridx=0;
        gbc.gridy=4;
        gbc.gridwidth=2;
        gbc.gridheight=1;
        gbc.ipadx=20;
        gbc.ipady=20;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        container.add(b1,gbc);
        
        gbc.gridx=2;
        gbc.gridy=4;
        gbc.gridwidth=2;
        gbc.gridheight=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        container.add(b2,gbc);
        
        gbc.gridx=4;
        gbc.gridy=4;
        gbc.gridwidth=2;
        gbc.gridheight=1;
        
        gbc.fill=GridBagConstraints.HORIZONTAL;
        container.add(b3,gbc);
        
        pack();
        show();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PTB2 x=new PTB2("Huong");
		
	}

}
