import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{

	private Container c;
	private JLabel title;
	private JLabel count;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno, tadd;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp, b1, b2, b3, b4, b5, b6;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JRadioButton ex1, ex2, ex3, ex4, ex5, ex6;
	private JRadioButton g1, g2, g3, g4, g5, g6;
	private JRadioButton f1, f2, f3, f4, f5, f6;
	private JRadioButton p1, p2, p3, p4, p5, p6;
	private JButton button7, button8;
	private JLabel add, comm, add1;
	private JTextArea tcomm, tadd1;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
    private JCheckBox dine_in;
    private JCheckBox take_out;
    private JCheckBox breakfast;
    private JCheckBox lunch;
    private JCheckBox dinner;
	private JLabel qof, ps, eo, srv, cn, ov;

	private String dates[]
		= { "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	private String months[]
		= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sup", "Oct", "Nov", "Dec" };
	private String years[]
		= { "1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010",
			"2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018",
			"2019", "2020", "2021", "2022","2023"};

	
	public MyFrame()
	{
		setTitle("Restaurant Survey Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Restaurant Survey Form",JLabel.CENTER);
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(450, 30);
		title.setLocation(550,60);
		c.add(title);

		count = new JLabel("How many in your party??",JLabel.CENTER);
		count.setFont(new Font("Arial", Font.PLAIN, 20));
		count.setSize(250, 22);
		count.setLocation(300, 140);
		c.add(count);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 20));
		tname.setSize(300, 20);
		tname.setLocation(550, 140);
		c.add(tname);

        dob = new JLabel("Date");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(880, 140);
		c.add(dob);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(70, 20);
		date.setLocation(950, 140);
		c.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(70, 20);
		month.setLocation(1020, 140);
		c.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(70, 20);
		year.setLocation(1090, 140);
		c.add(year);

        dine_in = new JCheckBox("Dine in"); 
        dine_in.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dine_in.setBounds(400,200, 100,50);
		c.add(dine_in);  
        take_out = new JCheckBox("Take Out");  
        take_out.setFont(new Font("Arial", Font.PLAIN, 20)); 
        take_out.setBounds(550,200, 150,50);    
        c.add(take_out); 
		breakfast = new JCheckBox("Breakfast"); 
        breakfast.setFont(new Font("Arial", Font.PLAIN, 20)); 
        breakfast.setBounds(700,200, 150,50);
		c.add(breakfast); 
		lunch = new JCheckBox("Lunch"); 
        lunch.setFont(new Font("Arial", Font.PLAIN, 20)); 
        lunch.setBounds(850,200, 100,50);
		c.add(lunch); 
		dinner = new JCheckBox("Dinner"); 
        dinner.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dinner.setBounds(1000,200, 100,50);
		c.add(dinner);  
        c.setSize(400,400);  

		mno = new JLabel("Mobile");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(400, 280);
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(150, 20);
		tmno.setLocation(500, 280);
		c.add(tmno);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(750, 280);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(false);
		male.setSize(75, 20);
		male.setLocation(850, 280);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(950, 280);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		add = new JLabel("Name : ");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(250, 20);
		add.setLocation(370, 350);
		c.add(add);

		tadd = new JTextField();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(600, 20);
		tadd.setLocation(550, 350);
		tadd.setBorder(BorderFactory.createLineBorder(Color.black));
		c.add(tadd);

        add1 = new JLabel("What did you order??");
		add1.setFont(new Font("Arial", Font.PLAIN, 20));
		add1.setSize(250, 20);
		add1.setLocation(300, 420);
		c.add(add1);

		tadd1 = new JTextArea();
		tadd1.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd1.setSize(600, 50);
		tadd1.setLocation(550, 420);
		tadd1.setBorder(BorderFactory.createLineBorder(Color.black));
		tadd1.setLineWrap(true);
		c.add(tadd1);

		qof = new JLabel("Quality of Food : ",JLabel.CENTER);
		qof.setFont(new Font("Arial", Font.PLAIN, 20));
		qof.setSize(250, 25);
		qof.setLocation(250, 520);
		c.add(qof);


		ex1 = new JRadioButton("Excellent"); 
        ex1.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ex1.setBounds(600,520, 150,30);
		ex1.setSelected(false);
		c.add(ex1);  
        g1 = new JRadioButton("Good");  
        g1.setFont(new Font("Arial", Font.PLAIN, 15)); 
        g1.setBounds(750,520, 150,30); 
		g1.setSelected(false);  
        c.add(g1); 
		f1 = new JRadioButton("Fair"); 
        f1.setFont(new Font("Arial", Font.PLAIN, 15)); 
        f1.setBounds(900,520, 150,30);
		f1.setSelected(false);
		c.add(f1); 
		p1 = new JRadioButton("Poor"); 
        p1.setFont(new Font("Arial", Font.PLAIN, 15)); 
        p1.setBounds(1050,520, 100,30);
		p1.setSelected(false);
		c.add(p1);   

		ps = new JLabel("Portion Size : ",JLabel.CENTER);
		ps.setFont(new Font("Arial", Font.PLAIN, 20));
		ps.setSize(250, 25);
		ps.setLocation(250, 550);
		c.add(ps);


		ex2 = new JRadioButton("Excellent"); 
        ex2.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ex2.setBounds(600,550, 150,30);
		c.add(ex2);  
        g2 = new JRadioButton("Good");  
        g2.setFont(new Font("Arial", Font.PLAIN, 15)); 
        g2.setBounds(750,550, 150,30);    
        c.add(g2); 
		f2 = new JRadioButton("Fair"); 
        f2.setFont(new Font("Arial", Font.PLAIN, 15)); 
        f2.setBounds(900,550, 150,30);
		c.add(f2); 
		p2 = new JRadioButton("Poor"); 
        p2.setFont(new Font("Arial", Font.PLAIN, 15)); 
        p2.setBounds(1050,550, 100,30);
		c.add(p2);   
		

		eo = new JLabel("Ease of Ordering : ",JLabel.CENTER);
		eo.setFont(new Font("Arial", Font.PLAIN, 20));
		eo.setSize(250, 25);
		eo.setLocation(250, 580);
		c.add(eo);


		ex3 = new JRadioButton("Excellent"); 
        ex3.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ex3.setBounds(600,580, 150,30);
		c.add(ex3);  
        g3 = new JRadioButton("Good");  
        g3.setFont(new Font("Arial", Font.PLAIN, 15)); 
        g3.setBounds(750,580, 150,30);    
        c.add(g3); 
		f3 = new JRadioButton("Fair"); 
        f3.setFont(new Font("Arial", Font.PLAIN, 15)); 
        f3.setBounds(900,580, 150,30);
		c.add(f3); 
		p3 = new JRadioButton("Poor"); 
        p3.setFont(new Font("Arial", Font.PLAIN, 15)); 
        p3.setBounds(1050,580, 100,30);
		c.add(p3);  

		srv = new JLabel("Service : ",JLabel.CENTER);
		srv.setFont(new Font("Arial", Font.PLAIN, 20));
		srv.setSize(250, 25);
		srv.setLocation(250, 610);
		c.add(srv);

		ex4 = new JRadioButton("Excellent"); 
        ex4.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ex4.setBounds(600,610, 150,30);
		c.add(ex4);  
        g4 = new JRadioButton("Good");  
        g4.setFont(new Font("Arial", Font.PLAIN, 15)); 
        g4.setBounds(750,610, 150,30);    
        c.add(g4); 
		f4 = new JRadioButton("Fair"); 
        f4.setFont(new Font("Arial", Font.PLAIN, 15)); 
        f4.setBounds(900,610, 150,30);
		c.add(f4); 
		p4 = new JRadioButton("Poor"); 
        p4.setFont(new Font("Arial", Font.PLAIN, 15)); 
        p4.setBounds(1050,610, 100,30);
		c.add(p4);   

		cn = new JLabel("Cleanliness : ",JLabel.CENTER);
		cn.setFont(new Font("Arial", Font.PLAIN, 20));
		cn.setSize(250, 25);
		cn.setLocation(250, 640);
		c.add(cn);

		ex5 = new JRadioButton("Excellent"); 
        ex5.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ex5.setBounds(600,640, 150,30);
		c.add(ex5);  
        g5 = new JRadioButton("Good");  
        g5.setFont(new Font("Arial", Font.PLAIN, 15)); 
        g5.setBounds(750,640, 150,30);    
        c.add(g5); 
		f5 = new JRadioButton("Fair"); 
        f5.setFont(new Font("Arial", Font.PLAIN, 15)); 
        f5.setBounds(900,640, 150,30);
		c.add(f5); 
		p5 = new JRadioButton("Poor"); 
        p5.setFont(new Font("Arial", Font.PLAIN, 15)); 
        p5.setBounds(1050,640, 100,30);
		c.add(p5);   

		ov = new JLabel("Overall Value : ",JLabel.CENTER);
		ov.setFont(new Font("Arial", Font.PLAIN, 20));
		ov.setSize(250, 25);
		ov.setLocation(250, 670);
		c.add(ov);

		ex6 = new JRadioButton("Excellent"); 
        ex6.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ex6.setBounds(600,670, 150,30);
		c.add(ex6);  
        g6 = new JRadioButton("Good");  
        g6.setFont(new Font("Arial", Font.PLAIN, 15)); 
        g6.setBounds(750,670, 150,30);    
        c.add(g6); 
		f6 = new JRadioButton("Fair"); 
        f6.setFont(new Font("Arial", Font.PLAIN, 15)); 
        f6.setBounds(900,670, 150,30);
		c.add(f6); 
		p6 = new JRadioButton("Poor"); 
        p6.setFont(new Font("Arial", Font.PLAIN, 15)); 
        p6.setBounds(1050,670, 100,30);
		c.add(p6);  

		b1 = new ButtonGroup();
		b1.add(ex1);
		b1.add(g1);
		b1.add(f1);
		b1.add(p1);
		b2 = new ButtonGroup();
		b2.add(ex2);
		b2.add(g2);
		b2.add(f2);
		b2.add(p2);
		b3 = new ButtonGroup();
		b3.add(ex3);
		b3.add(g3);
		b3.add(f3);
		b3.add(p3);
		b4 = new ButtonGroup();
		b4.add(ex4);
		b4.add(g4);
		b4.add(f4);
		b4.add(p4);
		b5 = new ButtonGroup();
		b5.add(ex5);
		b5.add(g5);
		b5.add(f5);
		b5.add(p5);
		b6 = new ButtonGroup();
		b6.add(ex6);
		b6.add(g6);
		b6.add(f6);
		b6.add(p6);
		comm = new JLabel("Any Comments?");
		comm.setFont(new Font("Arial", Font.PLAIN, 20));
		comm.setSize(250, 20);
		comm.setLocation(300, 720);
		c.add(comm);

		tcomm = new JTextArea();
		tcomm.setFont(new Font("Arial", Font.PLAIN, 15));
		tcomm.setSize(600, 50);
		tcomm.setLocation(550, 720);
		tcomm.setLineWrap(true);
		tcomm.setBorder(BorderFactory.createLineBorder(Color.black));
		c.add(tcomm);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(650, 780);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(770, 780);
		reset.addActionListener(this);
		c.add(reset);

		Icon icon1 = new ImageIcon("C:\\Users\\ejssp\\OneDrive\\Pictures\\restaurant.jpg");
		button8 = new JButton(icon1);
		button8.setSize(250, 200);
		button8.setLocation(50,200);
		c.add(button8);

		Icon icon = new ImageIcon("C:\\Users\\ejssp\\OneDrive\\Pictures\\thanks1.jpg");
		button7 = new JButton(icon);
		button7.setFont(new Font("Arial", Font.PLAIN, 15));
		button7.setSize(250, 118);
		button7.setLocation(1200,200);
		c.add(button7);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
    {     
		if (e.getSource() == sub) {
			String s1 = "Thanks for submitting Survey...........";
			button7.setText(s1);
		}

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
			tadd1.setText(def);
			tcomm.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
 	}
}

class Task_1_Survey_Form {

	public static void main(String[] args) throws Exception
	{
		MyFrame f = new MyFrame();		 
	}	
}

