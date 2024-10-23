/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grading.system;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author louis
 */
public class NewApplet extends Applet  implements ActionListener{

     Label name = new Label("Name of the Student:");
    TextField tname = new TextField(10);
    Label course = new Label("Course:");
    TextField tcourse = new TextField(10);
    
    Label gs = new Label("GRADING SYSTEM");
    Label pmf = new Label("Prelim 30%           Midterm 30%          Finals 40%");
    
    Label quiz = new Label("Quizzes");
    Label q1 = new Label("Quiz 1:");
    Label q2 = new Label("Quiz 2:");
    TextField pq1 = new TextField(10);
    TextField pq2 = new TextField(10);
    TextField mq1 = new TextField(10);
    TextField mq2 = new TextField(10);
    TextField fq1 = new TextField(10);
    TextField fq2 = new TextField(10);
    
    Label cs = new Label("Class Standing");
    Label sw = new Label("Seatwork:");
    Label pro = new Label("Project:");
    Label att = new Label("Attendance:");
    Label as = new Label("Assignment:");
    TextField psw = new TextField(10);
    TextField msw = new TextField(10);
    TextField fsw = new TextField(10);
    TextField ppro = new TextField(10);
    TextField mpro = new TextField(10);
    TextField fpro = new TextField(10);
    TextField patt = new TextField(10);
    TextField matt = new TextField(10);
    TextField fatt = new TextField(10);
    TextField pas = new TextField(10);
    TextField mas = new TextField(10);
    TextField fas = new TextField(10);

    Label me = new Label("Major Exam");
    TextField pme = new TextField(10);
    TextField mme = new TextField(10);
    TextField fme = new TextField(10);
    
    Label gs2 = new Label("GRADING SYSTEM");
    Label name2 = new Label("Student Name:");
    Label course2 = new Label("Course:");
    Label pg = new Label("Prelim Grade:");
    Label mg = new Label("Midterm Grade:");
    Label fg = new Label("Final Grade:");
    Label remarks = new Label("Remarks:");
    Label tg = new Label("Total Grade:");
    
    Button b1 = new Button("COMPUTE");


    public void init() {
        setLayout(null);
        add(name);
        add(tname);
        add(course);
        add(tcourse);
        
        add(gs);
        add(pmf);
        
        add(quiz);
        add(q1);
        add(q2);
        add(pq1);
        add(pq2);
        add(mq1);
        add(mq2);
        add(fq1);
        add(fq2);
        
        add(cs);
        add(sw);
        add(pro);
        add(att);
        add(as);
        add(psw);
        add(msw);
        add(fsw);
        add(ppro);
        add(mpro);
        add(fpro);
        add(patt);
        add(matt);
        add(fatt);
        add(pas);
        add(mas);
        add(fas);
        
        add(me);
        add(pme);
        add(mme);
        add(fme);
        
        add(gs2);
        add(name2);
        add(course2);
        add(pg);
        add(mg);
        add(fg);
        add(remarks);
        add(tg);
        add(b1);
        
        name.setBounds(0,0,120,20);
        tname.setBounds(120,0,200,20);
        course.setBounds(0,20,100,20);
        tcourse.setBounds(120,20,200,20);
        
        gs.setBounds(190,40,120,20);
        pmf.setBounds(100,60,270,20);
        
        quiz.setBounds(0,80,50,20);
        q1.setBounds(10,100,50,20);
        q2.setBounds(10,120,50,20);
        pq1.setBounds(100,100,50,20);
        pq2.setBounds(100,120,50,20);
        mq1.setBounds(200,100,50,20);
        mq2.setBounds(200,120,50,20);
        fq1.setBounds(300,100,50,20);
        fq2.setBounds(300,120,50,20);
        
        cs.setBounds(0,140,100,20);
        sw.setBounds(10,160,70,20);
        pro.setBounds(10,180,70,20);
        att.setBounds(10,200,70,20);
        as.setBounds(10,220,70,20);
        psw.setBounds(100,160,50,20);
        msw.setBounds(200,160,50,20);
        fsw.setBounds(300,160,50,20);
        ppro.setBounds(100,180,50,20);
        mpro.setBounds(200,180,50,20);
        fpro.setBounds(300,180,50,20);
        patt.setBounds(100,200,50,20);
        matt.setBounds(200,200,50,20);
        fatt.setBounds(300,200,50,20);
        pas.setBounds(100,220,50,20);
        mas.setBounds(200,220,50,20);
        fas.setBounds(300,220,50,20);
        
        me.setBounds(0,260,100,20);
        pme.setBounds(100,260,50,20);
        mme.setBounds(200,260,50,20);
        fme.setBounds(300,260,50,20);
        
        b1.setBounds(175,300,100,20);
        b1.addActionListener((ActionListener) this);
        
        gs2.setBounds(10,340,120,20);
        name2.setBounds(10,360,200,20);
        course2.setBounds(10,380,200,20);
        pg.setBounds(10,400,200,20);
        mg.setBounds(10,420,200,20);
        fg.setBounds(10,440,200,20);
        remarks.setBounds(10,460,200,20);
        tg.setBounds(10,480,100,20);

    }

    public void actionPerformed(ActionEvent ae) {
       int n1 = Integer.parseInt(pq1.getText()); // for prelim
       int n2 = Integer.parseInt(pq2.getText());
       int n3 = Integer.parseInt(pas.getText());
       int n4 = Integer.parseInt(patt.getText());
       int n5 = Integer.parseInt(ppro.getText());
       int n6 = Integer.parseInt(psw.getText());
       int n7 = Integer.parseInt(pme.getText());
       
       double pqp = (((n1+n2)/2)*.40);
       double pcs = ((n3 + n4 + n5 + n6)/4)*0.10;
       double ppme = n7*0.5;
       double PG = pqp + pcs + ppme;
       
       int n8 = Integer.parseInt(mq1.getText()); // for midterm
       int n9 = Integer.parseInt(mq2.getText());
       int n10 = Integer.parseInt(mas.getText());
       int n11 = Integer.parseInt(matt.getText());
       int n12 = Integer.parseInt(mpro.getText());
       int n13 = Integer.parseInt(msw.getText());
       int n14 = Integer.parseInt(mme.getText());
       
       double mqp = (((n8+n9)/2)*.40);
       double mcs = ((n10 + n11 + n12 + n13)/4)*0.10;
       double mpme = n14*0.5;
       double MG = mqp + mcs + mpme;
       
       int n15 = Integer.parseInt(fq1.getText()); // for finals
       int n16 = Integer.parseInt(fq2.getText());
       int n17 = Integer.parseInt(fas.getText());
       int n18 = Integer.parseInt(fatt.getText());
       int n19 = Integer.parseInt(fpro.getText());
       int n20 = Integer.parseInt(fsw.getText());
       int n21 = Integer.parseInt(fme.getText());
       
       double fqp = (((n15+n16)/2)*.40);
       double fcs = ((n17 + n18 + n19 + n20)/4)*0.10;
       double fpme = n21*0.5;
       double FG = fqp + fcs + fpme;
       
       double TG = (PG * 0.3) + (MG * 0.3) + (FG * 0.4);
       String mark;
       if(TG > 75){
            mark = "Passed";
       }
       else{
           mark = "fail";
       }
       
    
       String studname = tname.getText();
       name2.setText("Student Name: " + studname);
       String course3 = tcourse.getText();
       course2.setText("Course: " + course3);
       pg.setText("Prelim Grade: " + PG);
       mg.setText("Midterm Grade: " + MG);
       fg.setText("Final Grade: " + FG);
       remarks.setText("Remarks: " + mark);
       tg.setText("Total Grade: " + TG);
       
       

}
}   