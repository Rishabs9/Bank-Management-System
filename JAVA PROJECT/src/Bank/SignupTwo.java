package Bank;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener  {
	JLabel lblcustinfo,lblreligion,lblcategory,lblincome,lbleducation,lbloccupation,lbladharno,lblpanno,lblsencitizen,lblexistingacc;
	JTextField tfpanno,tfadharno,tfsencitizen;
	JComboBox jcbReligion,jcbCategory,jcbIncome,jcbEducation,jcbOccupation;
	JRadioButton rbnSencitizenyes,rbnSencitizenno,rbnExistingaccyes,rbnExistingaccNo;
	JButton Next;
	String formno;
	
	public SignupTwo(String formno) {   //  -->We have created  a parameterized constructor so to get the value formno and inserting into current class form no.
		                                //The value of form no we are getting from Signup class when creating annonymous object in action listner method on clicking next button
		this.formno=formno;
		
		setLayout(null);
		setTitle("New Application form Page 2");
		setVisible(true);
		setSize(800,700);
		setLocation(400,100);
		getContentPane().setBackground(Color.white);
		getContentPane().setForeground(Color.gray);
		
		Font f = new Font("Tahoma",Font.BOLD,25);  //Creating a general font class object .So i will just pass this object as arguement in setFont method for labels and textfields
		Font f1= new Font("Raleway",Font.BOLD,15);
		
		
		
		lblcustinfo=new JLabel("Additional Information Of Customer");            //Addition info
		lblcustinfo.setFont(f);
		lblcustinfo.setBounds(150,40,600,40);
		add(lblcustinfo);
		
		lblreligion= new JLabel("Religion");                                      //Religion
		lblreligion.setFont(f1);
		lblreligion.setBounds(100, 140, 200, 40);
		add(lblreligion);
		
		String[] Religion= {"Sikh","hindu","Muslim","Christian","Others"};
		
		jcbReligion=new JComboBox(Religion);
		jcbReligion.setBounds(305,140,200,30);
		jcbReligion.setFont(new Font("Tahoma",Font.BOLD,20));
		jcbReligion.setBackground(Color.white);
		add(jcbReligion);
		
		lblcategory=new JLabel("Category");                                        //Category
		lblcategory.setFont(f1);
		lblcategory.setBounds(100,180,200,30);
		add(lblcategory);
		
		String[] Category= {"General","SC","OBC","ST","BC","Others"};
		
		jcbCategory= new JComboBox(Category);
		jcbCategory.setFont(new Font("Tahoma",Font.BOLD,20));
		jcbCategory.setBounds(305, 180, 200, 30);
		jcbCategory.setBackground(Color.white);
		add(jcbCategory);
		
		lblincome=new JLabel("Income");                                               //Income
		lblincome.setFont(f1);
		lblincome.setBounds(100,220,200,30);
		add(lblincome);
		
		String [] income = {"No income","<1,50,000","<2,50,000","<5,00,00"};
		jcbIncome = new JComboBox(income);
		jcbIncome.setFont(new Font("Tahoma",Font.BOLD,20));
		jcbIncome.setBackground(Color.white);
		jcbIncome.setBounds(305, 220, 200, 30);
		add(jcbIncome);
		
		
		lbleducation= new JLabel("Education");                                          //Education
		lbleducation.setFont(f1);
		lbleducation.setBounds(100, 260, 200, 30);
		add(lbleducation);
		
		String [] education = {"Non-Graduate","Graduate","Post-Graduate","Doctrate"};
		jcbEducation=new JComboBox(education);
		jcbEducation.setFont(new Font("Tahoma",Font.BOLD,20));
		jcbEducation.setBackground(Color.white);
		jcbEducation.setBounds(305, 260, 200, 30);
		add(jcbEducation);
		
		lbloccupation=new JLabel("Occupation");                                        //Occupation
		lbloccupation.setFont(f1);
		lbloccupation.setBounds(100,300,200,30);
		add(lbloccupation);
		
		String [] Occupation= {"Salaried","Self-Employed","Buisness","Student"};
		jcbOccupation=new JComboBox(Occupation);
		jcbOccupation.setFont(new Font("Tahoma",Font.BOLD,20));
		jcbOccupation.setBounds(305,300,200,30);
		add(jcbOccupation);
		
		lblpanno =new JLabel("Pan Number");                                             //Pan Number
		lblpanno.setFont(f1);
		lblpanno.setBounds(100, 340, 200, 30);
		add(lblpanno);
		
		tfpanno= new JTextField(20);
		tfpanno.setFont(f);
		tfpanno.setBounds(305, 340, 200, 30);
		add(tfpanno);
		
		lbladharno =new JLabel("Adhar Number");                                        //Adhar Number
		lbladharno.setFont(f1);
		lbladharno.setBounds(100, 380, 200, 30);
		add(lbladharno);
		
		tfadharno= new JTextField(20);
		tfadharno.setFont(f);
		tfadharno.setBounds(305, 380, 200, 30);
		add(tfadharno);
		
		lblsencitizen=new JLabel("Senior Citizen");                                 //Senior Citizen
		lblsencitizen.setFont(f1);
		lblsencitizen.setBounds(100,420,200,30);
		add(lblsencitizen);
		
		rbnSencitizenyes = new JRadioButton("Yes");
	    rbnSencitizenyes.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnSencitizenyes.setBackground(Color.white);
		rbnSencitizenyes.setBounds(305,420,100,30);
		add(rbnSencitizenyes);
		
		rbnSencitizenno = new JRadioButton("No");
		rbnSencitizenno.setFont(new Font("Tahoma",Font.BOLD,14));
		rbnSencitizenno.setBackground(Color.white);		
		rbnSencitizenno.setBounds(405,rbnSencitizenyes.getY(),100,30);   //  -->Another way to get bounds by passing any other label's co-ordinates,here we are passing rbnSencitizenyes Radio button's Y-Cordinate
		add(rbnSencitizenno);
		
		ButtonGroup bsencitizen = new ButtonGroup();
		bsencitizen.add(rbnSencitizenyes);
		bsencitizen.add(rbnSencitizenno);
		
		lblexistingacc= new JLabel("Existing Account");                           //Existing Account 
		lblexistingacc.setBounds(100,460,150,30);
		lblexistingacc.setFont(f1);
		add(lblexistingacc);
		
	    // JRadioButton rbnExistingaccyes = new JRadioButton("Yes");   -->Another way of declaring rbnExistingyes radiobutton by not declaring at top in class but if we declare this button here this is local Jcomponent and can be used only in Constructor not outside it
		rbnExistingaccyes = new JRadioButton("Yes"); 
		rbnExistingaccyes.setBounds(305,460,100,30);
		rbnExistingaccyes.setBackground(Color.white);
		rbnExistingaccyes.setFont(f1);
		add(rbnExistingaccyes);
		
		
		rbnExistingaccNo = new JRadioButton("No");
		rbnExistingaccNo.setBackground(Color.white);
		rbnExistingaccNo.setBounds(405, 460, 100, 30);
		rbnExistingaccNo.setFont(f1);
		add(rbnExistingaccNo);
		
		ButtonGroup bexistingacc = new ButtonGroup();
		bexistingacc.add(rbnExistingaccyes);
		bexistingacc.add(rbnExistingaccNo);
		
		Next = new JButton("Next");												//Next
		Next.setFont( new Font("Tahoma",Font.BOLD,14));
		Next.setBackground(Color.black);
		Next.setForeground(Color.white);
		Next.setBounds(550, 540, 200, 40);
		add(Next);
		Next.addActionListener(this);
		
		
		
		
	}

	public static void main(String[] args) {
		
		SignupTwo obj = new SignupTwo("");
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		String Religion =(String) jcbReligion.getSelectedItem(); //-->Typecasting value to string because getSelectedItem() returns an object from combox value selected.
		                                                         //For eg "Hindu" is selected ,getSelectedItem() method will return an object of type "Hindu".So we typecasted this object to String form  
		String Category=(String) jcbCategory.getSelectedItem();
		String Income =(String) jcbIncome.getSelectedItem();
		String Education=(String)jcbEducation.getSelectedItem();
		String Occupation=(String)jcbOccupation.getSelectedItem();
		
		
		String panno= tfpanno.getText();
		String adharno = tfadharno.getText();
		String Seniorcitizen=("");
		if(rbnSencitizenyes.isSelected())
		{
			Seniorcitizen="Yes";
		}
		else
		{
			Seniorcitizen="NO";
		}
		String Existingacc="";
		if(rbnExistingaccyes.isSelected())
		{
			Existingacc="Yes";
		}
		else 
		{
			Existingacc="No";
		}
		
		try {
             int i;
			
			for(i=0;i<1;i++)
			{
				if(tfpanno.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter your Pan number");
					break;
					
					
				}
				else if(adharno.equals(""))          // Another way to check blank field for text field by checking through local variable created of string adharno
				{
					JOptionPane.showMessageDialog(null,"Please Enter your Adhar number");
			
					break;
				}
				else if(Seniorcitizen.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Senior Citizen as Yes or No ");
			
					break;
				}
				else if(Existingacc==(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Existing Account as 'Yes' or 'No' ");
			
					break;
				}
				}
			
				
			if(i==0)
			{
				//if there would be any missing value in any above field the for loop will get break and "i" value will remain 0 not become 1 so else block will not get execute and connection to MySQL will not get established and query will not get executed and values will not be updates to database
				
			}
			else {
				ConnectionFactory cf= new ConnectionFactory();
				String query="Insert into SignupTwo values('"+formno+"','"+Religion+"','"+Category+"','"+Income+"','"+Education+"','"+Occupation+"','"+panno+"','"+adharno+"','"+Seniorcitizen+"','"+Existingacc+"')";
				//Insert into SignupTwo values -->This command is very important we cannot write anyting we want here 
				//It is Sql command for inserting value to tables i.e. Insert into Table_name Values(------);
				
				cf.stmt.executeUpdate(query);
				
				setVisible(false);
				new Signupthree(formno).setVisible(true);
				
				
				//JOptionPane.showMessageDialog(null, "Congrats you have signed up");
			}
		}

		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}
