package Bank;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.util.Date;
import java.sql.ResultSet;

public class Withdrawl extends JFrame implements ActionListener {
	
	
	JTextField tf1,tf2;
	JButton b1,b2;
	JLabel l1,l2,l3;
	String pin;
	
	public Withdrawl(String pin)
	{
		this.pin=pin;
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(false);
		setVisible(true);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm5.jpg"));
		Image i2= i1.getImage().getScaledInstance(1000,1180,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		l1 = new JLabel(i3); //passing image in JLabel
		l1.setBounds(0,0,900,900);
		add(l1);
		
		
		l2= new JLabel("ENTER AMMOUNT FOR WITHDRAWL");
		l2.setForeground(Color.white);
		l2.setFont(new Font("Tahoma",Font.BOLD,15));
		l2.setBounds(190,300,300,15);
		l1.add(l2);

		tf1 = new JTextField();
		tf1.setBounds(190,350,300,30);
		tf1.setForeground(Color.black);
		l1.add(tf1);
		
		l3= new JLabel("Maximium Withdrawl Ammount is RS.10,000 ");
		l3.setBounds(190,400,300,30);
		l3.setFont(new Font("Tahoma",Font.BOLD,12));
		l3.setForeground(Color.white);
		l1.add(l3);
							
		
		
		b1 = new JButton("Withdraw");
		b1.setBounds(370, 500,150,35);
		b1.setForeground(Color.black);
		l1.add(b1);
		b1.addActionListener(this);
		
		
		b2= new JButton("BACK");
		b2.setBounds(370, 570,150,35);
		b2.setForeground(Color.black);
		l1.add(b2);
		b2.addActionListener(this);
		
		
	}
	
	
	
	
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		try {
		
		String ammount =tf1.getText();
		Date date=new Date();
		if(e.getSource()==b1)
			
		{
			
			if(ammount=="")
			{
		
				JOptionPane.showMessageDialog(null,"Please Enter Some Ammount");
			
			}
			else
			{
				
				ConnectionFactory cf= new ConnectionFactory();
				String query="Select * from bank where pin ='"+pin+"'";
				ResultSet rs =cf.stmt.executeQuery(query);
				int balance= 0 ;//local varaiable
				while(rs.next())
				{
					if(rs.getString("type").equals("Deposit"))
					{
						balance+=Integer.parseInt(rs.getString("ammount"));
					}
					else
					{
						balance-=Integer.parseInt(rs.getString("ammount"));
					}
					
					if(balance<Integer.parseInt(rs.getString("ammount")))
					{
						JOptionPane.showMessageDialog(null,"Insufficient Balance");
						return;
					}
					
				
			
					
					cf.stmt.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+ammount+"')");
					JOptionPane.showMessageDialog(null,"Rs."+ammount+"Debited Succesfully");
					setVisible(false);
					new Transactions(pin).setVisible(true);
				}
				
				
				
			}
		}
			
		else if(e.getSource()==b2)
		{
			setVisible(false);
			new Transactions(pin).setVisible(true);
		}
		
		
		
		}
		catch(Exception ae)
		{
			
			ae.printStackTrace();
			System.out.println("error:"+ae);
		}
	}
	
	
	
	public static void main(String[]args)
	{
		new Withdrawl("").setVisible(true);
	}

}
