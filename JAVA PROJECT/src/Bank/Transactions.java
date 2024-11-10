package Bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Transactions extends JFrame implements ActionListener{
	
	String pin;
	JLabel lblimage,l1;
	JButton b1,b2,b3,b4,b5,b6,btnexit;

	public Transactions(String pin)
	{
	this.pin=pin;
	
	
	setTitle("Transactions Page");
	
	setLayout(null);
	

	setSize(800,700);
	setLocation(400,100);
	setUndecorated(true);//This will delete the options for maximizing,minimising,and closing the window but will only work if frame is not visible
						 //we have to make frame visible after making it undecorated
	setVisible(true);
	
	
	
	
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm5.jpg"));  //Here we are getting resource for image path using ClassLoader class  
																					//giving path from icons sub folder in Bankmangement package in src folder there is stm.jpg image
	Image i2= i1.getImage().getScaledInstance(1000,1100,Image.SCALE_DEFAULT); //scaling image i1 i.e converting raw image to better image by giving height,breadth and storing reference in i2
	ImageIcon i3= new ImageIcon(i2); // Passing scaled image(filtered i1 image ) i2 to new Image i3
	
	lblimage= new JLabel(i3); //passing  image to Jlabel 
	lblimage.setBounds(0,0,800,700);
	add(lblimage);
	l1 = new JLabel("Please Select Your Transaction");
	l1.setFont(new Font("Tahoma",Font.BOLD,20));
	l1.setBounds(120,200,500,30);
	l1.setForeground(Color.white);
	//add(l1);   -->This will not work ,it will hide behind the imageicon
	lblimage.add(l1);
	
	b1 = new JButton("DEPOSIT");
	b2= new JButton("WITHDRAW");
	b3= new JButton("FAST CASH");
	b4= new JButton("MINI STATMENT");
	b5 = new JButton("BALANCE CHECK");
	b6 = new JButton("PIN CHANGE");
	btnexit = new JButton("EXIT");
	
	b1.setBounds(80,350,150,25);
	lblimage.add(b1);
	
	b2.setBounds(80,400,150,25);
	lblimage.add(b2);
	
	b3.setBounds(80,450,150,25);
	lblimage.add(b3);
	
	b4.setBounds(330,350,150,25);
	lblimage.add(b4);
	
	b5.setBounds(330,400,150,25);
	lblimage.add(b5);
	
	b6.setBounds(330,450,150,25);
	lblimage.add(b6);
	
	btnexit.setBounds(230,500,100,25);
	lblimage.add(btnexit);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	btnexit.addActionListener(this);
	
	
}
	

	public static void main(String[] args) {
	
		new Transactions("");
		// TODO Auto-generated method stub

	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btnexit)
		{
			System.exit(0);
			
		}
		if(e.getSource()==b1)
		{
			setVisible(false);
			new Deposit(pin).setVisible(true);
		}
		if(e.getSource()==b2)
		{
			setVisible(false);
			new Withdrawl(pin).setVisible(true);
		}
		if(e.getSource()==b3)
		{
			setVisible(false);
			new FastCash(pin).setVisible(true);
		}
		
	}

}
