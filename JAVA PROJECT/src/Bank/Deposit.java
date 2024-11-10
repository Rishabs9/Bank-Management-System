package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;


public class Deposit extends JFrame implements ActionListener{
	
	JTextField tf1,tf2,tf3,tf4;
	JLabel l1,l2,l3,l4;
	JButton b1,b2,b3,b4;
	String pin;
	
	public Deposit(String pin)
	{
		this.pin = pin;
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm5.jpg"));
		Image i2 =i1.getImage().getScaledInstance(1000,1180,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		l1 = new JLabel(i3); //passing image in JLabel
		l1.setBounds(0,0,900,900);
		add(l1);
		
		
		l2= new JLabel("ENTER AMMOUNT FOR DEPOSIT");
		l2.setForeground(Color.white);
		l2.setFont(new Font("Tahoma",Font.BOLD,15));
		l2.setBounds(190,300,300,15);
		l1.add(l2);
		
		tf1 = new JTextField();
		tf1.setBounds(190,350,300,30);
		tf1.setForeground(Color.black);
		l1.add(tf1);
		
		b1 = new JButton("DEPOSIT");
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
	public static void main(String[] args)throws SQLException {
		
		new Deposit("");
		// TODO Auto-generated method stub

	}
	public void actionPerformed(ActionEvent e)  {
		// TODO Auto-generated method stub
		
		String ammount=tf1.getText();
		Date date =new Date(); //This date class we are taking from java.util.date package ,we could not not use java.sql.date package->it will throw an error
		if(e.getSource()==b1)
		{
		if(b1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Please Enter Some Ammount");
		}
		else
		{
			ConnectionFactory cf = new ConnectionFactory();
			String query1="insert into bank values('"+pin+"','"+date+"','Deposit','"+ammount+"')";
			try {
				cf.stmt.executeUpdate(query1);
			} catch (SQLException e1) {
				
				e1.printStackTrace();
				System.out.println("error:"+e);
			}
			//cf.stmt.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+ammount+"')");
			JOptionPane.showMessageDialog(null, "RS."+ammount+"DEPOSITED SUCCESFULLY");
			setVisible(false);
			
			
		}
		
		}
		else if (e.getSource()==b2)
		{
			setVisible(false);
			new Transactions(pin).setVisible(true);
		}
		
	}

}
