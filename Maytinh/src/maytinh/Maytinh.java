package maytinh;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Maytinh extends JFrame implements ActionListener{
	double So1=0, So2=0, kq=0;
	String dau="";
	JTextField t1=new JTextField();
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton b0=new JButton("0");
	JButton bcham=new JButton(".");
	JButton btncong=new JButton("+");
	JButton btntru=new JButton("-");
	JButton btnnhan=new JButton("*");
	JButton btnchia=new JButton("/");
	JButton btnBang=new JButton("=");
	JButton btnAC=new JButton("AC");
	JButton btnOFF=new JButton("OFF");
	
	GridLayout gb;
	public  Maytinh(String title)
	{
		super(title);
		gb=new GridLayout(7,4);
		setLayout(gb);
	
		t1=new JTextField("");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bcham.addActionListener(this);
		btncong.addActionListener(this);
		btntru.addActionListener(this);
		btnnhan.addActionListener(this);
		btnchia.addActionListener(this);
		btnBang.addActionListener(this);
		btnAC.addActionListener(this);
		btnOFF.addActionListener(this);
		
		add(t1);
		add(b1);
		add(b2); add(b3);
		add(b4);add(b5); add(b6);
		add(b7);add(b8); add(b9);
		add(b0); add(bcham);
		add(btncong);
		add(btntru);
		add(btnnhan);
		add(btnchia);
		add(btnBang);
		add(btnAC);
		add(btnOFF);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==b1 )
		{
			t1.setText(t1.getText()+b1.getLabel());
			
		}
		if(ae.getSource()==b2 )
		{
			t1.setText(t1.getText()+b2.getLabel());
		}
		if(ae.getSource()==b3 )
		{
			t1.setText(t1.getText()+b3.getLabel());
		}
		
		if(ae.getSource()==b4 )
		{
			t1.setText(t1.getText()+b4.getLabel());
		}
			
	
		if(ae.getSource()==b5 )
		{
			t1.setText(t1.getText()+b5.getLabel());
		}
	
		if(ae.getSource()==b6 )
		{
			t1.setText(t1.getText()+b6.getLabel());
		}
		
		if(ae.getSource()==b7 )
		{
			t1.setText(t1.getText()+b7.getLabel());
		}
		
		if(ae.getSource()==b8 )
		{
			t1.setText(t1.getText()+b8.getLabel());
		}
		
		if(ae.getSource()==b9 )
		{
			t1.setText(t1.getText()+b9.getLabel());
		}
		
		if(ae.getSource()==b0 )
		{
			t1.setText(t1.getText()+b0.getLabel());
			
		}
		if(ae.getSource()==bcham )
		{
			t1.setText(t1.getText()+bcham.getLabel());
			
		}
		
		if(ae.getSource()==btncong)
			
		{
			So1=Double.parseDouble(t1.getText());
			t1.setText("");
			dau="+";
			
		}
		if(ae.getSource()==btntru)
		{
			So1=Double.parseDouble(t1.getText());
			t1.setText("");
			dau="-";
			
		}
		if(ae.getSource()==btnnhan)
		{
			So1=Double.parseDouble(t1.getText());
			t1.setText("");
			dau="*";

		}
		if(ae.getSource()==btnchia)
		{
			So1=Double.parseDouble(t1.getText());
			t1.setText("");
			dau="/";

		}
		if(ae.getSource()==btnBang)
		{
			So2=Double.parseDouble(t1.getText());
			switch(dau)
			{
			case "+": kq=So1+So2; break;
			case "-": kq=So1-So2; break;
			case "*": kq=So1*So2; break;
			case "/": kq=So1/So2; break;
			
			}
			t1.setText(String.valueOf(kq));
		}

		if(ae.getSource()==btnAC)
		{
			t1.setText("");
		}
		if(ae.getSource()==btnOFF)
		{
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Maytinh f=new Maytinh("May tinh cua toi");
f.setSize(200,200);
f.show();
		
	}

}
