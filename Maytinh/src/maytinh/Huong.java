package maytinh;
import java.awt.*;
public class Huong extends Frame {
	Button btnTinh=new Button("Tinh");
	Button btnThoat=new Button("Thoat");
	 Label label1 =new Label("Tinh tong");
	 Label la =new Label("a=");
	 Label lb =new Label("b=");
	 Label ltong =new Label("tong=");
	 TextField ta =new TextField(20);
	 TextField tb =new TextField(20);
	 TextField ttong =new TextField(20);
	 TextArea textarea;
	 
	 public Huong(String title) {
		  super(title);
		  GridBagLayout gb = new GridBagLayout();
		  GridBagConstraints gbc = new GridBagConstraints();
		  setLayout(gb);
		  gbc.gridx=0;
		  gbc.gridy=0;
		  gbc.gridwidth = 1;
		  gbc.gridheight = 1;
		 gb.setConstraints(label1, gbc);
		  add(label1);	  
		
		  gbc.gridy=1;
		  gb.setConstraints(la, gbc);
		  add(la);	
		  gbc.gridx=1;
		  gbc.gridy=1;
	
		  gb.setConstraints(ta, gbc);
		  add(ta);
		  
		  gbc.gridx=0;
		  gbc.gridy=2;
		  gb.setConstraints(lb, gbc);
		  add(lb);
		  
		  gbc.gridx=1;
		  gbc.gridy=2;
		  gb.setConstraints(tb, gbc);
		  add(tb);
		  
		  gbc.gridx=0;
		  gbc.gridy=3;
		  gb.setConstraints(ltong, gbc);
		  add(ltong);
		  
		  gbc.gridx=1;
		  gbc.gridy=3;
		  gb.setConstraints(ttong, gbc);
		  add(ttong);
		  
		  gbc.gridx=0;
		  gbc.gridy=4;
		 // gbc.gridheight =2;
		//  gbc.gridwidth  =2;
		  gbc.ipadx =10;
		  gbc.ipady =10;
		// gbc.fill=2;
		  gbc.fill=gbc.BOTH ;
		  gb.setConstraints(btnTinh, gbc);
		  add(btnTinh);
		  
		  gbc.gridx=1;
		  gbc.gridy=4;
		
		  gbc.fill=gbc.NONE ;
		 // gbc.gridwidth  =4;
		  gb.setConstraints(btnThoat, gbc);
		  add(btnThoat);
		  
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Huong f=new Huong("may tinh Huong");
		f.setSize(480, 380);
		  f.setVisible(true);
		  
	}

}
