package prog4;
import java.awt.GridLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;

import javax.swing.*;

public class MARKETS implements ActionListener{
	public JLabel label1=new JLabel("Enter customer phone");
	public JTextField cusno=new JTextField(20);
	public JButton check=new JButton("Check CID");
	public JLabel label2=new JLabel("CID");
	public JTextField cid=new JTextField(20);
	public JLabel label3=new JLabel("1.Apples-50/kg  2.Oranges-60/kg");
	public JLabel label4=new JLabel("Enter itemno");
	public JTextField item_no=new JTextField(20);
	public JLabel label5=new JLabel("Enter qty in kg");
	public JTextField kg=new JTextField(20);
	public JRadioButton rb=new JRadioButton("discount 30%");
	public JButton bill=new JButton("Calc bill");
	public JTextField am=new JTextField(20);
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	HashMap<Integer,Double> item=new HashMap<Integer,Double>();

	public void add_call()
	{
		hm.put("9741278570",121);
		hm.put("9900726035",122);
		hm.put("9900001111",123);
	}
	public void add_item()
	{
		item.put(1,150.0);
		item.put(2,60.0);
	}
	
	MARKETS()
	{
		JFrame jf=new JFrame("Customer details");
		String uname= JOptionPane.showInputDialog(null,"Enter username");
		String pswd= JOptionPane.showInputDialog(null,"Enter password");
		add_call();
		add_item();
		if(uname.equals("msrit123")&& pswd.equals("ise123"))
		{
			JOptionPane.showMessageDialog(null,"Valid Login");
			jf.setSize(500,600);
			jf.setVisible(true);
			jf.setLayout(new GridLayout(0,1));
			jf.add(label1);
			jf.add(cusno);
			jf.add(check);
			jf.add(label2);
			jf.add(cid);
			check.addActionListener(this);
			jf.add(label3);
			jf.add(label4);
			jf.add(item_no);
			jf.add(label5);
			jf.add(kg);
			jf.add(rb);
			jf.add(bill);
			jf.add(am);
			bill.addActionListener(this);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"inValid Login");
		}
	}
		
	public static void main(String args[])
	{
		MARKETS ob1=new MARKETS();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==check)
		{
			String phno=cusno.getText();
			if(hm.containsKey(phno))
			{
				JOptionPane.showMessageDialog(null,"UR an old customer with cid= "+hm.get(phno));
				cid.setText(Integer.toString(hm.get(phno)));

			}
			else
			{
				hm.put(phno, 124);
				JOptionPane.showMessageDialog(null,"UR an old customer with cid= "+hm.get(phno));
				cid.setText(Integer.toString(hm.get(phno)));
			}
		}
		else
		{
			double price;
			int ino=Integer.parseInt(item_no.getText()); 
			if(item.containsKey(ino))
			{
				price= (item.get(ino));
			}
			else
			{
				int i= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter valid item no"));
				item_no.setText(Integer.toString(i));
				price= (item.get(i));
			}

			int qty=Integer.parseInt(kg.getText());
			double discount= rb.isSelected() ?0.30:0.0;  //if radio button is selected 30% discount, else no discount
			double amt= price*qty -(price*qty*discount);
			am.setText(Double.toString(amt));			
		}	
	}
}
