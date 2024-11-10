package Bank;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
public class Signupthree extends JFrame implements ActionListener {
	
	JLabel lblpageinfo,lblaccounttype,lblcardno,lbl16digicardnumber,lblcarddetail,lblpinno,lblpass,lblpassdetail,lblservicereq;
	static JRadioButton rbnsavingacc,rbnfixdeposit,rbnreccuringdepositacc,rbncurrentacc;
	JCheckBox chkatmcard,chkintbanking,chkmobbanking,chkemailalerts;
	JButton btnsubmit,btncancel;
	String formno;
	
	
	Signupthree(String formno)
	{
		this.formno=formno;
	
		setLayout(null);
		setTitle("New Application Form Page 3");
		setVisible(true);
		setSize(800,700);
		setLocation(400,100);
		getContentPane().setBackground(Color.white);
		getContentPane().setForeground(Color.white);
		
		
		Font f= new Font("Arial",Font.BOLD,25);  
		Font f_for_radiobuttons = new Font("Arial",Font.BOLD,15);
		Font f1= new Font("Raleway",Font.BOLD,18);
		
		lblpageinfo = new JLabel("Page 3 :Account Details");
		lblpageinfo.setBounds(250,40,600,30);
		lblpageinfo.setFont(f);
		add(lblpageinfo);
		
		lblaccounttype = new JLabel("Account Type :");
		lblaccounttype.setBounds(100,140,200,30);
		lblaccounttype.setFont(f);
		add(lblaccounttype);
		
		rbnsavingacc = new JRadioButton("Saving Account");
		rbnsavingacc.setBackground(Color.white);
		rbnsavingacc.setForeground(Color.black);
		rbnsavingacc.setBounds(100, 170, 200, 30);
		rbnsavingacc.setFont(f_for_radiobuttons);
		add(rbnsavingacc);
		
		rbnfixdeposit = new JRadioButton("Fix Deposit Account");
		rbnfixdeposit.setBackground(Color.white);
		rbnfixdeposit.setForeground(Color.black);
		rbnfixdeposit.setBounds(350, 170, 200, 30);
		rbnfixdeposit.setFont(f_for_radiobuttons);
		add(rbnfixdeposit);
		
		rbncurrentacc = new JRadioButton("Current Account");
		rbncurrentacc.setBackground(Color.white);
		rbncurrentacc.setForeground(Color.black);
		rbncurrentacc.setFont(f_for_radiobuttons);
		rbncurrentacc.setBounds(100,200,200,30);
		add(rbncurrentacc);
		
		rbnreccuringdepositacc= new JRadioButton("Reccuring Deposit Account");
		rbnreccuringdepositacc.setBounds(350,200,200,30);
		rbnreccuringdepositacc.setBackground(Color.white);
		rbnreccuringdepositacc.setForeground(Color.black);
		rbnreccuringdepositacc.setFont(f_for_radiobuttons);
		add(rbnreccuringdepositacc);
		
		ButtonGroup Baccounttype = new ButtonGroup();
		Baccounttype.add(rbncurrentacc);
		Baccounttype.add(rbnfixdeposit);
		Baccounttype.add(rbnsavingacc);
		Baccounttype.add(rbnreccuringdepositacc);
		
		lblcardno = new JLabel("Card Number");
		lblcardno.setFont(f);
		lblcardno.setBounds(100,250,200,30);
		add(lblcardno);
		
		lbl16digicardnumber =new JLabel("[Your 16-Digit Card Number]");
		lbl16digicardnumber.setFont(new Font("Raleway",Font.BOLD,15));
		lbl16digicardnumber.setBounds(100,280,300,20);
		add(lbl16digicardnumber);
		
		lblcarddetail = new JLabel ("XXXX-XXXX-XXXX-9751");
		lblcarddetail.setBounds(350,250,200,20);
		lblcarddetail.setFont(new Font("Raleway",Font.BOLD,15));
		add(lblcarddetail);
		
		lblpinno = new JLabel("PIN Number");
		lblpinno.setFont(f);
		lblpinno.setBounds(100,330,200,30);
		add(lblpinno);
		
		lblpass = new JLabel("Your 4 Digit Password");
		lblpass.setFont(new Font("Raleway",Font.BOLD,15));
		lblpass.setBounds(100,360,200,20);
		add(lblpass);
		
		lblpassdetail = new JLabel("XXXX");
		lblpassdetail.setFont(new Font("Raleway",Font.BOLD,15));
		lblpassdetail.setBounds(350,330,200,20);
		add(lblpassdetail);
		
		lblservicereq = new JLabel("Service Required by You");
		lblservicereq.setFont(f);
		lblservicereq.setBounds(100,410,400,30);
		add(lblservicereq);
		
		chkatmcard= new JCheckBox("ATM Card");
		chkatmcard.setBackground(Color.white);
		chkatmcard.setForeground(Color.black);
		chkatmcard.setBounds(100,440,200,30);
		chkatmcard.setFont(f1);
		add(chkatmcard);
		
		chkintbanking= new JCheckBox("Internet Banking");
		chkintbanking.setFont(f1);
		chkintbanking.setBackground(Color.white);
		chkintbanking.setForeground(Color.black);
		chkintbanking.setBounds(350, 440, 200, 30);
		add(chkintbanking);
		
		
		chkmobbanking= new JCheckBox("Mobile Banking");
		chkmobbanking.setFont(f1);
		chkmobbanking.setBackground(Color.white);
		chkmobbanking.setForeground(Color.black);
		chkmobbanking.setBounds(100, 490, 200, 30);
		add(chkmobbanking);
		
		chkemailalerts= new JCheckBox("Email alerts");
		chkemailalerts.setFont(f1);
		chkemailalerts.setBackground(Color.white);
		chkemailalerts.setForeground(Color.black);
		chkemailalerts.setBounds(350, 490, 200, 30);
		add(chkemailalerts);
		
		btnsubmit = new JButton("Submit");
		btnsubmit.setBackground(Color.black);
		btnsubmit.setForeground(Color.white);
		btnsubmit.setBounds(150,600,100,30);
		add(btnsubmit);
		btnsubmit.addActionListener(this);
		

		btncancel = new JButton("Cancel");
		btncancel.setBackground(Color.black);
		btncancel.setForeground(Color.white);
		btncancel.setBounds(350,600,100,30);
		add(btncancel);
		btncancel.addActionListener(this);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Signupthree("");
		
		
		
	//	if(rbnsavingacc.issel)  --> We cannot use instance data members in p=main function,we can only use them if we make them static 

	}
	public void actionPerformed(ActionEvent ae) {
		
		String acctype="null";
		
		if(rbncurrentacc.isSelected())
		{
			acctype="Current Account";
		}
		else if(rbnsavingacc.isSelected())
		{
			acctype="Savings Account";
		}
		else if (rbnfixdeposit.isSelected())
		{
			acctype="Fixed Deposit account";
		}
		else if(rbnreccuringdepositacc.isSelected())
		{
			acctype="Fixed Reccuring account";
		}
		
		
		
		Random rnum = new Random();
		long num1= (rnum.nextLong()%900000000L)+60701598365412478L;
		String cardnumber=""+Math.abs(num1); //Inserting Longint generated random number  into String cardnumber using Math.abs.  
											//The Math.abs() method in Java returns the absolute value of a given numeric argument i.e no negative value will come
											//If a random negative number gets generated it automatically converts to positive value
		Random rnum2 = new Random();
		long num2= (rnum2.nextLong()%5000L) + 5000L;
		String pinnumber =""+ Math.abs(num2);
		
		String facility="null";
		
		if(chkatmcard.isSelected())   //Facility selection
		{
			facility=facility+"Atm Card";
		}
		
		if(chkemailalerts.isSelected())
		{
			facility=facility+"Email Alerts";
		}
		if(chkintbanking.isSelected())
		{
			facility=facility+"Internet Banking";
		}
		if(chkmobbanking.isSelected())
		{
			facility=facility+"Mobile Banking";
		}
		
		try   //Main code for button clicks
		{
			if(ae.getSource()==btnsubmit)
			{
				
			int i;
				
				for(i=0;i<1;i++)
				{
				if (acctype.equals("null"))
				{
					JOptionPane.showMessageDialog(null, "Please enter Account Type");
					break;
				}
				if(facility=="null")
				{
					JOptionPane.showMessageDialog(null,"Please select Facility");
					break;
				}
			    }
				if (i==0)
				{
					//if there would be any missing value in any above field the for loop will get break and "i" value will remain 0 not become 1 so else block will not get execute and connection to MySQL will not get established and query will not get executed and values will not be updates to database
					

				}
				else{
				
					ConnectionFactory con = new ConnectionFactory();
					String query1="Insert into Signupthree values('"+formno+"','"+acctype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query2="Insert into Login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
					con.stmt.executeUpdate(query1);
					con.stmt.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card number: "+cardnumber+ "\n Pin Number :"+pinnumber);
					
					new Transactions(pinnumber).setVisible(true); 
					setVisible(false);
			     
				}
			}
				else if (ae.getSource()==btncancel)
				{
					//System.exit(0);//This command  will exit the program
					
					setVisible(false);
					new Login().setVisible(true);
				
				}
			
		}
		
		catch( Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		
		
		
	}

}
