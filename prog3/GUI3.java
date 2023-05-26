package prog3;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GUI3 implements ActionListener{
	static public JFrame f1=new JFrame("Student info");
	static public JLabel label1=new JLabel("Student name");
	static public JLabel label2=new JLabel("Student usn");
	static public JLabel label3=new JLabel("Student age");
	static public JLabel label4=new JLabel("Student address");
	static public JLabel label5=new JLabel("Student category");
	static public JLabel label6=new JLabel("Student sgpa1");
	static public JLabel label7=new JLabel("Student sgpa2");
	static public JLabel label8=new JLabel("Student sgpa3");
	static public JLabel label9=new JLabel("Student sgpa4");
	static public JTextField tname= new JTextField(20);
	static public JTextField tusn= new JTextField(20);
	static public JTextField tage= new JTextField(20);
	static public JTextField tadr= new JTextField(20);
	static public JTextField tcat= new JTextField(20);
	static public JTextField sg1= new JTextField(20);
	static public JTextField sg2= new JTextField(20);
	static public JTextField sg3= new JTextField(20);
	static public JTextField sg4= new JTextField(20);
	static public JButton submit= new JButton("submit");
	static public JButton done= new JButton("done");
	static public JButton display= new JButton("display");
	static ArrayList<STUDENTS> AA=new ArrayList<STUDENTS>();
	
	public static void main(String args[])
	{
		f1.setSize(500,600);
		f1.setVisible(true);
		f1.setLayout(new GridLayout(0,1));
		f1.add(label1);
		f1.add(tname);
		f1.add(label2);
		f1.add(tusn);
		f1.add(label3);
		f1.add(tage);
		f1.add(label4);
		f1.add(tadr);
		f1.add(label5);
		f1.add(tcat);
		f1.add(label6);
		f1.add(sg1);
		f1.add(label7);
		f1.add(sg2);
		f1.add(label8);
		f1.add(sg3);
		f1.add(label9);
		f1.add(sg4);
		f1.add(submit);
		f1.add(done);
		f1.add(display);
		submit.addActionListener(new GUI3());
		done.addActionListener(new GUI3());
		display.addActionListener(new GUI3());
		
	}	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==submit)
		{
			int age=Integer.parseInt(tage.getText());
			if(age<18 || age>30)
			{
				System.out.println("Invalid age");
				String temp=JOptionPane.showInputDialog(null, "Enter age btw range 18-30");
				tage.setText(temp);
			}
			else
			{
				System.out.println("valid age");
			}
			
			check(1,sg1);
			check(2,sg2);
			check(3,sg3);
			check(4,sg4);
			
		}
		else if(e.getSource()==done)
		{
			double s1=Double.parseDouble(sg1.getText());
			double s2=Double.parseDouble(sg2.getText());
			double s3=Double.parseDouble(sg3.getText());
			double s4=Double.parseDouble(sg4.getText());
			double cg=(s1+s2+s3+s4)/4;
			STUDENTS obj=new STUDENTS(tname.getText(),tusn.getText(),Integer.parseInt(tage.getText()),tadr.getText(),tcat.getText(),s1,s2,s3,s4);
			obj.cgpa=cg;
			AA.add(obj);
		}
		
		else
		{
			f1.setVisible(false);
			JFrame f2=new JFrame("Display details");
			f2.setSize(500,400);
			f2.setVisible(true);
			JTextArea info=new JTextArea(20,20);
			f2.add(info);
			for(STUDENTS ob1: AA)
			{
				info.append(ob1.toString() +"\n");  //to print multiple records on display details frame

			}	
		}
		
	}
	
	void check(int i, JTextField sgpa)
	{
		if(Double.parseDouble(sgpa.getText())>10)
		{
			String temp=JOptionPane.showInputDialog(null, "Enter valid cgpa");
			sgpa.setText(temp);
		}
	}
}
