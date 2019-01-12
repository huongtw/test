package maytinh;
import java.awt.*;
public class MyGUI extends Frame {
	 Button button;
	 Label label ;
	 TextField textfield;
	 TextArea textarea;
	 Choice combobox;

	 public MyGUI(String title) {
	  super(title);

	  GridBagLayout gb = new GridBagLayout();
	  GridBagConstraints gbc = new GridBagConstraints();
	  setLayout(gb);

	  gbc.gridx = 0; //o day ta thiet lap san gia tri default cho constraints. 
	  gbc.gridy = 0; // Sau nay muon thay doi gia tri nao chi viec thay doi no
	  gbc.gridwidth = 1;
	  gbc.gridheight = 1; //1 cung la gia tri mac dinh
	 gbc.insets = new Insets(10, 10, 10, 10); //top, left, bottom, right 
	  //gives the space between the components and the border of the frame 
	  //(not in between the components). 

	  // Label Username
	  label = new Label("User Name: ");
	  gb.setConstraints(label, gbc);
	  add(label);

	  // TextField Username
	  textfield = new TextField(10);
	  gbc.gridx = 1;
	  gb.setConstraints(textfield, gbc);
	  add(textfield);

	  // TextArea . Remainder
	  textarea = new TextArea("This is a TextArea", 2, 30);
	  gbc.gridx = 2;
	  gbc.gridheight = 3;
	  gb.setConstraints(textarea, gbc);
	  add(textarea);

	  //Label Password
	  label = new Label("Password: ");
	  gbc.gridx = 0;
	  gbc.gridy = 1;
	  gb.setConstraints(label, gbc);
	  add(label);

	  // TextField Password
	  textfield = new TextField(10);
	  gbc.gridx = 1;
	  gbc.gridwidth = 1;
	  gb.setConstraints(textfield, gbc);
	  add(textfield);

	  //Button Login
	  button = new Button("Login");
	  gbc.gridx = 0;
	  gbc.gridy = 3;
	  gb.setConstraints(button, gbc);
	  add(button);

	  //Button reset
	  button = new Button("Reset");
	  gbc.gridx = 2;
	  gbc.gridy = 3;
	  gb.setConstraints(button, gbc);
	  add(button);

	  //Choice
	  combobox = new Choice();
	  combobox.addItem("                ");
	   combobox.addItem("Ha Noi");
	  gbc.gridx = 0;
	  gbc.gridy = 6;
	  gbc.gridwidth = 2;
	  gb.setConstraints(combobox, gbc);
	  add(combobox);

	  //property for Frame container
	  setSize(480, 380);
	  setVisible(true);
	  setLocationRelativeTo(null);
	 }

	
	 public static void main(String[] args) {
	  new MyGUI("Homework");
	 }
	}