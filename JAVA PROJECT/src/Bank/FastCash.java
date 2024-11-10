package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;

public class FastCash extends JFrame implements ActionListener{
	
	JLabel lblimage,l2,l3;
	JButton b1,b2,b3,b4,b5,b6,btnback,b8;
	String pin;
	
	FastCash(String pin)
	{
		this.pin=pin;
		setTitle("Fast Cash");
		
		setLayout(null);
		

		setSize(800,700);
		setLocation(400,100);
		setUndecorated(false);//This will delete the options for maximizing,minimising,and closing the window but will only work if frame is not visible
							 //we have to make frame visible after making it undecorated
		setVisible(true);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm5.jpg"));  //Here we are getting resource for image path using ClassLoader class  
		//giving path from icons sub folder in Bankmangement package in src folder there is stm.jpg image
        Image i2= i1.getImage().getScaledInstance(1000,1100,Image.SCALE_DEFAULT); //scaling image i1 i.e converting raw image to better image by giving height,breadth and storing reference in i2
        ImageIcon i3= new ImageIcon(i2); // Passing scaled image(filtered i1 image ) i2 to new Image i3

        lblimage= new JLabel(i3); //passing  image to Jlabel 
        lblimage.setBounds(0,0,800,700);
        add(lblimage);
        
        l2= new JLabel("Please Select Withdraw Ammount");
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        l2.setForeground(Color.white);
        l2.setBounds(100,200,400,15);
        lblimage.add(l2);
        
        
        
        b1= new JButton("100");
        b2= new JButton("1000");
        b3= new JButton("2000");
        b4= new JButton("500");
        b5= new JButton("5000");
        b6= new JButton("10000");
        btnback= new JButton("BACK");
        

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
    	
    	btnback.setBounds(230,500,100,25);
    	lblimage.add(btnback);
    	
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	b4.addActionListener(this);
    	b5.addActionListener(this);
    	b6.addActionListener(this);
    	btnback.addActionListener(this);
    	
    	
        
        
		
		
		
	}
	
	public static void main(String[] args)
	{
		new FastCash("").setVisible(true);
		
	}
	

	public void actionPerformed(ActionEvent ae) {
		
		
		try {
			
			String ammount=((JButton)ae.getSource()).getText().substring(3);//ae.getsource() returns object type,so we casting return value i.e object to JButton and then taking text from JButton and
	                                                                        //getText() will return something like Rs 500 ,we only need ammount 500,so we used substring menthod and passing begining of index to read as 3(Skipping these indexes R->0th index,s->1 index,_->2 indeex)		
		    
		
			
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
				
			
			if(ae.getSource()!=btnback && balance< Integer.parseInt(ammount))
			{
				JOptionPane.showMessageDialog(null,"Insufficient Balance");
				return;
			}s
		
			if(ae.getSource()==btnback)
			{
				this.setVisible(false);
				new Transactions(pin).setVisible(true);
			}
			else
			{
				Date date = new Date();

				cf.stmt.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+ammount+"')");
				JOptionPane.showMessageDialog(null,"Rs."+ammount+"Debited Succesfully");
				setVisible(false);
				new Transactions(pin).setVisible(true);
			}
		
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
	
	

}
