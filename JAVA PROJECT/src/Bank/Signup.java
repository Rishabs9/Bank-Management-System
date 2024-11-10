package Bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{
	
	JLabel lblApplication,lblpersdetail,lblName,lblfname,lblDOB,lblgender,lblstate,lblcity,lblpincode,lblmartial,lbladress,lblemail,l14,l15;
	JTextField tfname,tffathname,tfemail,tfcity,tfstate,tfpincode,tfadress,tf8; 
	JRadioButton rbgender1,rbgender2,rbmarrigestatus1,rbmarrigestatus2,rbmarrigestatus3;
	JButton Next,previous;
	JDateChooser dateChooser;
	String number;
	
	
	public Signup()
	{
	
		Random r =new Random();
		long randnum=r.nextLong()%9000;
		number=""+Math.abs(randnum); //Maths.abs will only give positive random value 
		
		setLayout(null);
		setTitle("New Application Signup Form");
		setVisible(true);
		getContentPane().setBackground(Color.white);
		setSize(800,700);
		setLocation(400,100);
		
		
		lblApplication = new JLabel("Application Form "+ number);   //Application Form
		lblApplication.setFont(new Font("Raleway",Font.BOLD,40));
		lblApplication.setBounds(150, 20, 600,30);
		add(lblApplication);
		
		
		lblpersdetail= new JLabel("Personal detail of Customer");  //Personal Details
		lblpersdetail.setFont(new Font("Raleway",Font.BOLD,25));
		lblpersdetail.setBounds(150,80,600,40);
		add(lblpersdetail);
		
		lblName = new JLabel("Name");                              	//Name
		lblName.setFont(new Font("Raleway",Font.BOLD,15));
		lblName.setBounds(100,140,200,40);
		add(lblName);
		
		tfname = new JTextField(20);
		tfname.setFont(new Font("Arial",Font.BOLD,15));
		tfname.setBounds(305,140,200,30);
		add(tfname);
		
		lblfname= new JLabel("Father Name");						//Father Name
		lblfname.setFont(new Font("Raleway",Font.BOLD,15));
		lblfname.setBounds(100,180,200,30);
		add(lblfname);
		
		tffathname = new JTextField(20);
		tffathname.setFont(new Font("Arial",Font.BOLD,15));
		tffathname.setBounds(305,180,200,30);
		add(tffathname);
		
		lblDOB = new JLabel("Date of Birth");							//DOB
		lblDOB.setFont(new Font("Raleway",Font.BOLD,15));
		lblDOB.setBounds(100, 220, 200, 40);
		add(lblDOB);
		
		dateChooser = new JDateChooser();
		dateChooser.setForeground(Color.RED);
		dateChooser.setBounds(305, 220, 200, 30);
		add(dateChooser);
		
		lblgender=new JLabel("Gender");									//Gender
		lblgender.setFont(new Font("Realeway",Font.BOLD,15));
		lblgender.setBounds(100, 260, 200, 40);
		add(lblgender);
		
		rbgender1= new JRadioButton("Male");
		rbgender1.setBackground(Color.white);
		rbgender1.setFont(new Font("Tahoma",Font.BOLD,14));
		rbgender1.setBounds(305, 260, 100,30);
		add(rbgender1);
		
		rbgender2= new JRadioButton("Female");
		rbgender2.setBackground(Color.white);
		rbgender2.setFont(new Font("Tahoma",Font.BOLD,14));
		rbgender2.setBounds(405,260,100,30);
		add(rbgender2); 
		
		ButtonGroup Bggender = new ButtonGroup();
		Bggender.add(rbgender1);
		Bggender.add(rbgender2);
		
		lblemail= new JLabel("Email adress");								//Email adress
		lblemail.setFont(new Font("Raleway",Font.BOLD,15));
		lblemail.setBounds(100, 300,200,40);
		add(lblemail);
		
		tfemail= new JTextField(20);
		tfemail.setFont(new Font("Arial",Font.BOLD,15));
		tfemail.setBounds(305, 300, 200, 30);
		add(tfemail);
		
		lblmartial = new JLabel("Martial status");							//Matial Status
		lblmartial.setFont(new Font("Raleway",Font.BOLD,15));
		lblmartial.setBounds(100, 340,200,40);
		add(lblmartial);
		
		Font f = new Font("Tahoma",Font.BOLD,14);//another way of setting up font by making object of Font class f and passing object as arguement in setFont method
		
		
		rbmarrigestatus1= new JRadioButton("Married");
		rbmarrigestatus1.setBackground(Color.white);
		rbmarrigestatus1.setFont(f);
		rbmarrigestatus1.setBounds(305, 340, 100, 30);
		add(rbmarrigestatus1);
		
		rbmarrigestatus2= new JRadioButton("Unmarried");
		rbmarrigestatus2.setBackground(Color.white);
		rbmarrigestatus2.setFont(f);
		rbmarrigestatus2.setBounds(405, 340, 120, 30);
		add(rbmarrigestatus2);
		
		rbmarrigestatus3= new JRadioButton("Others");
		rbmarrigestatus3.setBackground(Color.white);
		rbmarrigestatus3.setFont(f);
		rbmarrigestatus3.setBounds(525, 340, 100, 30);
		add(rbmarrigestatus3);
		
		ButtonGroup bgstatus = new ButtonGroup();
		bgstatus.add(rbmarrigestatus1);
		bgstatus.add(rbmarrigestatus2);
		bgstatus.add(rbmarrigestatus3);
		
		
		lbladress= new JLabel("Adress");										//Adress
		lbladress.setFont(new Font("Raleway",Font.BOLD,15));
		lbladress.setBounds(100,380,300,40);
		add(lbladress);
		
		tfadress= new JTextField(20);
		tfadress.setFont(new Font("Arial",Font.BOLD,15));
		tfadress.setBounds(305, 380, 200, 30);
		add(tfadress);
		
		
		lblpincode=new JLabel("Pin Code");										//Pincode
		lblpincode.setFont(new Font("Raleway",Font.BOLD,15));
		lblpincode.setBounds(100, 420, 200, 40);
		add(lblpincode);
		
		tfpincode= new JTextField(20);
		tfpincode.setFont(new Font("Arial",Font.BOLD,15));
		tfpincode.setBounds(305, 420, 200, 30);
		add(tfpincode);
		
		lblstate=new JLabel("State");											//State
		lblstate.setFont(new Font("Raleway",Font.BOLD,15));
		lblstate.setBounds(100,460,200,40);
		add(lblstate);
		
		tfstate= new JTextField(20);
		tfstate.setFont(new Font("Arial",Font.BOLD,15));
		tfstate.setBounds(305, 460, 200, 30);
		add(tfstate);
		
		lblcity= new JLabel("City");											//City
		lblcity.setFont(new Font("Raleway",Font.BOLD,15));
		lblcity.setBounds(100, 500, 200, 40);
		add(lblcity);
		
		tfcity= new JTextField(20);
		tfcity.setFont(new Font("Arial",Font.BOLD,15));
		tfcity.setBounds(305, 500, 200, 30);
		add(tfcity);	
		
		Next = new JButton("Next");												//Next
		Next.setFont(f);
		Next.setBackground(Color.black);
		Next.setForeground(Color.white);
		Next.setBounds(550, 560, 200, 40);
		add(Next);
		Next.addActionListener(this); /*adding action listener on clicking next actionPerformed method will run on reaching try catch block if statement having condition of tfname=""i.e (null value) will execute and it will pop up dialog message "Please enter your name"
	     -->'this' here shows that executing actionPerformed method of current class i.e. Signup class 
		*/
	
		previous = new JButton("Previous");
		previous.setFont(f);
		previous.setBackground(Color.black);
		previous.setForeground(Color.white);
		previous.setBounds(200,560,200,40);
		add(previous);
		previous.addActionListener(this);
		
		
		
		
		
	}

	public static void main(String[] args) {
	
		Signup obj = new Signup();
	}

	public void actionPerformed(ActionEvent e) {
		
		/*class A{
	 int abc() {          // -->>We cannot create a method inside a method.Here we are overiding an abstract method actionPerformed which was given in interface ActionListener.So this abc() method will throw compilation error 
			
		 return 0;        // -->we can create a method inside a method by declaring a class inside method and in class we can declare as many class level methods methods we want
		}*/
		
		
		String formNum=number;
		
		String name =tfname.getText();
		String fname =tffathname.getText();
		String dob= ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText(); //JTextfield is typecasting the date and using getText() we are getting the text
		String gender="";
		if(rbgender1.isSelected())
		{
			gender="Male";
		}
		else if(rbgender2.isSelected())
		{
			gender="Female";
		}
		String email=tfemail.getText();
		String martialstatus="";
		if(rbmarrigestatus1.isSelected())
		{
			martialstatus="Married";
		}
		else if(rbmarrigestatus2.isSelected())
		{
			martialstatus="Unmarried";
		}
		else if(rbmarrigestatus3.isSelected())
		{
			martialstatus="Others";
		}
		String adress=tfadress.getText();
		String city=tfcity.getText();
		String pincode=tfpincode.getText();
		String state=tfstate.getText();
	
		
		try{
			int i;
			
			for(i=0;i<1;i++)
			{
				 if (e.getSource()==previous)
				{
					setVisible(false);
					
					new Login();
					break;
				
					
				}
				if(tfname.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter your name");
					break;
					
					
				}
				else if(tffathname.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter your Father name");
			
					break;
				}
				else if (dob.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter your Date of birth");
					break;
				}
				else if (gender.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter your Gender");
					break;
				}
				
				else if(tfemail.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter your Email");
					break;
				}
				else if (martialstatus.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter your Martial Status");
					break;
				}
				
				else if(tfadress.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter adress");
					break;
				}
				else if(tfpincode.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter pincode");
					break;
				}
				else if(tfstate.getText().equals("")) 
				{
					JOptionPane.showMessageDialog(null,"Please Enter your State");
					break;
				}
				else if(tfcity.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter your City");
					break;
				}
				}
			if(i==0)
			{
				//if there would be any missing value in any above field the for loop will get break and "i" value will remain 0 not become 1 so else block will not get execute and connection to MySQL will not get established and query will not get executed and values will not be updates to database
				
			}
			else {
			
					ConnectionFactory cf= new ConnectionFactory();
					String query="Insert into Signup values('"+formNum+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martialstatus+"','"+adress+"','"+city+"','"+pincode+"','"+state+"')";
					cf.stmt.executeUpdate(query);
					//JOptionPane.showMessageDialog(null,"Congrats you have signed up");
					setVisible(false);
					new SignupTwo(formNum).setVisible(true); //-->Creating annyoumous object of SignupTwo class as on creation parameterized constructor of Class SignupTwo would get invoke passing formNum as actual arguement
					
			}
			
				
		}
			
		
		catch(Exception ex){
			ex.printStackTrace();
			
		}
		
		
	}



}
