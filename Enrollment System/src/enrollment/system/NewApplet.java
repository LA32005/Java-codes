/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrollment.system;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author DFCAMCLP-IT
 */
public class NewApplet extends Applet implements ActionListener {
    Label Enroll = new Label("Enrollment System");
    Label namelabel = new Label("Student Name: ");
    Label numlabel = new Label("Student no: ");
    Label courselabel = new Label("Courses: ");
    Label downpaymentlabel = new Label("Downpayment: ");
    Label discountlabel = new Label("Discount: ");
    Label moplabel = new Label("Mode of payment: ");
    Label offeredlabel = new Label("Subject offered: ");
    Label enrolledlabel = new Label("Subject Enrolled: ");
    Label rnum = new Label("Student no#: ");
    Label rname = new Label("Student name: ");
    Label rcourse = new Label("Course: ");
    Label rfee = new Label("Total Tuitio Fee: ");
    Label rdiscount = new Label("Discount: ");
    Label rpayment = new Label("Payment: ");
    Label rfull= new Label("Full: ");
    Label r2mode = new Label("2 mode: ");
    Label r3mode = new Label("3 mode: ");
    Label r4mode = new Label("4 mode: ");
    
    TextField tname = new TextField(10);
    TextField tnum = new TextField(10);
    TextField tdownpayment = new TextField(10);
    Choice courses = new Choice();
    Choice mop = new Choice();
    
    CheckboxGroup dg = new CheckboxGroup();
    Checkbox d1 = new Checkbox("5%",dg,false);
    Checkbox d2 = new Checkbox("10%",dg,false);
    Checkbox d3 = new Checkbox("20%",dg,false);
    
    List list1 = new List();
    List list2 = new List();
    
    Button transfer = new Button(">>>");
    Button back = new Button("<<<");
    Button validate = new Button("Validate");
    public void init() {
        setLayout(null);
        add(Enroll);
        add(namelabel);
        add(numlabel);
        add(tname);
        add(tnum);
        add(courselabel);
        add(downpaymentlabel);
        add(courses);
        courses.add("BSIS");
        courses.add("BSIT");
        courses.add("BSCS");
        courses.add("BSCPE");
        add(tdownpayment);
        add(discountlabel);
        add(d1);
        add(d2);
        add(d3);
        add(moplabel);
        add(mop);
        mop.add("Full payment");
        mop.add("2 mode");
        mop.add("3 mode");
        mop.add("4 mode");
        add(offeredlabel);
        add(enrolledlabel);
        add(list1);
        list1.add("CSC101 - Lec");
        list1.add("CSC101 - Lab");
        list1.add("ITE101 - Lec");
        list1.add("ITE101 - Lab");
        list1.add("MATH01");
        list1.add("ENG01");
        list1.add("FIL01");
        add(list2);
        add(transfer);
        add(back);
        add(validate);
        add(rnum);
        add(rname);
        add(rcourse);
        add(rfee);
        add(rdiscount);
        add(rpayment);
        add(rfull);
        add(r2mode);
        add(r3mode);
        add(r4mode);
        Enroll.setBounds(50,10,200,20);
        namelabel.setBounds(20,50,100,20);
        tname.setBounds(120,50,200,20);
        numlabel.setBounds(20,80,120,20);
        tnum.setBounds(140,80,200,20);
        courselabel.setBounds(20,110,100,20);
        courses.setBounds(130,110,100,20);
        downpaymentlabel.setBounds(20,150,100,20);
        tdownpayment.setBounds(130,150,200,20);
        discountlabel.setBounds(20,210,90,20);
        d1.setBounds(110,210,50,20);
        d2.setBounds(160,210,50,20);
        d3.setBounds(220,210,50,20);
        moplabel.setBounds(20,180,100,20);
        mop.setBounds(130,180,100,20);
        offeredlabel.setBounds(500,50,100,20);
        list1.setBounds(500,80,110,100);
        enrolledlabel.setBounds(750,50,100,20);
        list2.setBounds(710,80,100,100);
        transfer.setBounds(635,80,50,30);
        back.setBounds(635,120,50,30);
        validate.setBounds(500,200,50,30);
        rnum.setBounds(500,260,500,20);
        rname.setBounds(500,290,500,20);
        rcourse.setBounds(500,320,100,20);
        rfee.setBounds(500,350,350,20);
        rdiscount.setBounds(500,380,100,20);
        rpayment.setBounds(500,410,100,20);
        rfull.setBounds(500,440,1000,20);
        r2mode.setBounds(500,470,1000,20);
        r3mode.setBounds(500,500,1000,20);
        r4mode.setBounds(500,530,1000,20);
        
        
        validate.addActionListener(this);
        transfer.addActionListener(this);
        back.addActionListener(this);
    }
    
      int subamount=0;
    public void actionPerformed(ActionEvent ae){
        int price = 0;
        double discount = 0;
        double totalfee ;
        int percent =0;
         double tf;
        
        if(ae.getSource() == transfer){
            String enrolledsub;
            enrolledsub = list1.getSelectedItem();
            list2.add(enrolledsub);
            list1.delItem(list1.getSelectedIndex());
            if(enrolledsub.equals("CSC101 - Lec")){
                 subamount+= 2500;
            }
            if(enrolledsub.equals("CSC101 - Lab")){
                 subamount+= 2000;
            }
            if(enrolledsub.equals("ITE101 - Lec")){
                 subamount+= 2500;
            }
            if(enrolledsub.equals("ITE101 - Lab")){
                 subamount+= 2000;
            }
            if(enrolledsub.equals("MATH01")){
                 subamount+= 2500;
            }
            if(enrolledsub.equals("ENG01")){
                 subamount+= 2500;
            }
            if(enrolledsub.equals("FIL01")){
                 subamount+= 2500;
            }            
        }
        if(ae.getSource() == back){
            String cancelled = list2.getSelectedItem();
            list1.add(cancelled);
            list2.delItem(list2.getSelectedIndex());
            if(cancelled.equals("CSC101 - Lec")){
                 subamount-= 2500;
            }
            if(cancelled.equals("CSC101 - Lab")){
                 subamount-= 2000;
            }
            if(cancelled.equals("ITE101 - Lec")){
                 subamount-= 2500;
            }
            if(cancelled.equals("ITE101 - Lab")){
                 subamount-= 2000;
            }
            if(cancelled.equals("MATH01")){
                 subamount-= 2500;
            }
            if(cancelled.equals("ENG01")){
                 subamount-= 2500;
            }
            if(cancelled.equals("FIL01")){
                 subamount-= 2500;
            }            
        }
        int dp = Integer.parseInt(tdownpayment.getText());
        if(d1.getState() == true && d2.getState() == false && d3.getState() == false ){
            discount = 0.05 * subamount;
            percent = 5;
        }
        else if(d1.getState() == false && d2.getState() == true && d3.getState() == false ){
            discount = 0.10 * subamount;
            percent = 10;
        }
        else if(d1.getState() == false && d2.getState() == false && d3.getState() == true ){
            discount = 0.20 * subamount;
            percent = 20;
        }
        tf=(subamount - discount)-dp;
        
        if(ae.getSource() == validate){
            rnum.setText("Student no#: " + tnum.getText());
            rname.setText("Student name: " + tname.getText());
            rcourse.setText("Course: " + courses.getSelectedItem());
            rfee.setText("Total Tuition Fee: " + "Php" + tf);
            rdiscount.setText("Discount: " + percent + "%");
            
            if(mop.getSelectedItem().equals("Full Payment")){
            double gives = tf/1;
            rfull.setText("Full: Php" + gives);
            }
            else if(mop.getSelectedItem().equals("2 mode")){
                double gives = tf/2;
                r2mode.setText("2 mode: Php"+gives+"   Php" + gives);
            }
            else if(mop.getSelectedItem().equals("3 mode")){
                double gives = tf/3;
                r3mode.setText("3 mode: Php"+gives+"   Php" + gives+"   Php" + gives);

            }
            else if(mop.getSelectedItem().equals("4 mode")){
                double gives = tf/4;
                r4mode.setText("4 mode: Php"+gives+"   Php" + gives+"   Php" + gives+"   Php" + gives);

            }
        }
    }
}

