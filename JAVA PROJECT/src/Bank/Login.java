package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Login extends JFrame implements ActionListener {
	JLabel lblWelcome,lblCardnumber,lblpinnumber;
	JTextField tfCardnumber;
	JPasswordField pfpinnumber;
	JButton btnLogin,btnClear,btnSignup;


	public Login()
	{
		

		setTitle("BANK MANAGEMENT SYSTEM");
		setVisible(true);
		setSize(800,500);
		setLocation(400,200);//Location of frame
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		lblWelcome= new JLabel("WELCOME TO BANK MANAGEMENT SYSTEM");
		lblWelcome.setFont(new Font ("Arial",Font.BOLD,20));
		lblWelcome.setBounds(200,40,530,40);  //Bound --> right from left side(x),down from upside(y),width of field,height of field
		add(lblWelcome);
		
		lblCardnumber= new JLabel("Enter Card No:");
		lblCardnumber.setFont(new Font ("Tahoma",Font.BOLD,15));
		lblCardnumber.setBounds(120,150,400,30);
		add(lblCardnumber);
		
		tfCardnumber = new JTextField(20);
		tfCardnumber.setBounds(250,150,230,30);
		tfCardnumber.setFont(new Font("Tahoma",Font.BOLD,15));
		add (tfCardnumber);
		
		lblpinnumber= new JLabel("Enter Pin No:");
		lblpinnumber.setFont(new Font ("Tahoma",Font.BOLD,15));
		lblpinnumber.setBounds(120,250,400,30);
		add(lblpinnumber);
		
		pfpinnumber = new JPasswordField(20);
		pfpinnumber.setFont(new Font("Tahoma",Font.BOLD,15));
		pfpinnumber.setBounds(250,250,230,30);
		add(pfpinnumber);
		
		btnLogin=new JButton("Login");
		btnLogin.setBackground(Color.black);
		btnLogin.setForeground(Color.white);
		btnLogin.setFont(new Font("Tahoma",Font.BOLD,15));
		btnLogin.setBounds(250,320,100,30);
		add(btnLogin);
		
		btnClear= new JButton("Clear");
		btnClear.setBackground(Color.black);
		btnClear.setForeground(Color.white);
		btnClear.setFont(new Font("Tahoma",Font.BOLD,15));
		btnClear.setBounds(350,320,100,30);
		add(btnClear);
		
		
		btnSignup= new JButton("Signup");
		btnSignup.setBackground(Color.black);
		btnSignup.setForeground(Color.white);
		btnSignup.setFont(new Font("Tahoma",Font.BOLD,15));
		btnSignup.setBounds(450,320,100,30);
		add(btnSignup);
		
		btnLogin.addActionListener(this);  //adding action listener ->all code will be in action performed function on pressing btnlogin button action performed fucnction will be called 
		btnClear.addActionListener(this);
		btnSignup.addActionListener(this);
		
		
		
		//Changing background color of frame
	}
	public static void main(String[] args) {
		
		Login obj = new Login();

		
	}
	public void actionPerformed(ActionEvent ae) {  // abstract method overriden from Java.awt.event package
		
		// TODO Auto-generated method stub
		try {
            int i;
            
			
			for(i=0;i<1;i++)
			{
				if (ae.getSource()==btnSignup)
				{
					this.setVisible(false);
					new Signup();
					break;
					//This is for clear purpose
					
				}
				 if(ae.getSource()==btnClear)
					{
						//This is for sign up purpose
						tfCardnumber.setText("");
						pfpinnumber.setText("");
						
					break;	
					}
				 if (tfCardnumber.getText().equals(""))
				{
					
					 JOptionPane.showMessageDialog(null,"Please enter your Card Number");
						break;
						
					
				}
				if(pfpinnumber.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter your name");
					break;
					
					
				}
			}
		    
			if(i==0)
			{
				//if there would be any missing value in any above field the for loop will get break and "i" value will remain 0 not become 1 so else block will not get execute and connection to MySQL will not get established and query will not get executed and values will not be updates to database
				
			}
			
			else if(ae.getSource()==btnLogin)
			{
				//This is for login purpose
				String cardno = tfCardnumber.getText();
				String pin= pfpinnumber.getText();//Line is showing because string in this field is not visible to user as it is a password field 
				
				ConnectionFactory cf = new ConnectionFactory();
				String query = "Select * from Login where cardnumber ='"+cardno+"' and pin= '"+pin+"'"; //MySql query for Checking if there is any value that matches given condition i.e matches card number and pin then that value will be stored in rs(reference variable of ResultSet)
				ResultSet rs =cf.stmt.executeQuery(query); // we have to import java.sql.ResultSet package for this to execute
				
				if(rs.next())
				{
					setVisible(false);
					new Transactions(pin).setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Credentials");
					
				}
				
				
				
				
				
			}
			/*else if (ae.getSource()==btnClear)
			{
				//This is for sign up purpose
				tfCardnumber.setText("");
				pfpinnumber.setText("");
				
				
			}*/
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

}
