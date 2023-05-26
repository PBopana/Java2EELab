package prog3;

public class STUDENTS {
	String name,usn,category,address;
	int age;
	double sgpa1,sgpa2,sgpa3,sgpa4,cgpa;
	STUDENTS(String n,String u, int ag,String adr,String cat, double sg1,double sg2,double sg3,double sg4)
	{
		name=n;
		usn=u;
		age=ag;
		address=adr;
		category=cat;
		sgpa1=sg1;
		sgpa2=sg2;
		sgpa3=sg3;
		sgpa4=sg4;
	}
	
	public String toString()
	{
		return "name: "+name+"\tUSN: "+usn+"\tAddress: "+address+"\t Category: "+category+"\tAge: "+age+"\tSGPA1="+sgpa1+"\tSGPA2="+sgpa2+"\tSGPA3="+sgpa3+"\tSGPA4="+sgpa4+"\tCGPA="+cgpa;
	}

}
