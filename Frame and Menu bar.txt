
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author DFCAMCLP-IT
 */
public class NewApplet extends Applet implements ActionListener  {

    Frame w1 = new Frame("Window 1");
    MenuBar mb = new MenuBar();
    Menu gs = new Menu("Grading System");
    Menu oe = new Menu("Online Equation");
    Menu ps = new Menu("Payroll System");
    
    MenuItem pg = new MenuItem("Prelim Grade");
    MenuItem mg = new MenuItem("Midterm Grade");
    MenuItem fg = new MenuItem("Finals Grade");
    MenuItem iq = new MenuItem("Identification");
    MenuItem cq = new MenuItem("Classification");
    MenuItem mc = new MenuItem("Multiple choice");
    MenuItem gp = new MenuItem("Grosspay");
    MenuItem tax = new MenuItem("Tax");
    
    Frame w2 = new Frame("Prelim Grade");
    Label label1 = new Label("GRADING SYSTEM");
    Label pL = new Label("Prelim Grade");
    Label quiz1 = new Label("Quizzes");
    Label q1L1 = new Label("Quiz 1:");
    Label q2L1 = new Label("Quiz 2:");
    TextField pq1 = new TextField(10);
    TextField pq2 = new TextField(10);
    Label pcs = new Label("Class Standing");
    Label swL1 = new Label("Seatwork:");
    Label proL1 = new Label("Project:");
    Label attL1 = new Label("Attendance:");
    Label asL1 = new Label("Assignment:");
    TextField psw = new TextField(10);
    TextField ppro = new TextField(10);
    TextField patt = new TextField(10);
    TextField pas = new TextField(10);
    Label meL1 = new Label("Major Exam");
    TextField pme = new TextField(10);
    Label PG = new Label("Prelim Grade: ");
    TextField TPG = new TextField(10);
    Button cal1 = new Button("Calculate");
    
    Frame w3 = new Frame("Midterm Grade");
    Label label2 = new Label("GRADING SYSTEM");
    Label mL = new Label("Midterm Grade");
    Label quiz2 = new Label("Quizzes");
    Label q1L2 = new Label("Quiz 1:");
    Label q2L2 = new Label("Quiz 2:");
    TextField mq1 = new TextField(10);
    TextField mq2 = new TextField(10);
    Label mcs = new Label("Class Standing");
    Label swL2 = new Label("Seatwork:");
    Label proL2 = new Label("Project:");
    Label attL2 = new Label("Attendance:");
    Label asL2 = new Label("Assignment:");
    TextField msw = new TextField(10);
    TextField mpro = new TextField(10);
    TextField matt = new TextField(10);
    TextField mas = new TextField(10);
    Label meL2 = new Label("Major Exam");
    TextField mme = new TextField(10);
    Label MG = new Label("Midterm Grade: ");
    TextField TMG = new TextField(10);
    Button cal2 = new Button("Calculate");
    
    Frame w4 = new Frame("Final Grade");
    Label label3 = new Label("GRADING SYSTEM");
    Label fL = new Label("Midterm Grade");
    Label quiz3 = new Label("Quizzes");
    Label q1L3 = new Label("Quiz 1:");
    Label q2L3 = new Label("Quiz 2:");
    TextField fq1 = new TextField(10);
    TextField fq2 = new TextField(10);
    Label fcs = new Label("Class Standing");
    Label swL3 = new Label("Seatwork:");
    Label proL3 = new Label("Project:");
    Label attL3 = new Label("Attendance:");
    Label asL3 = new Label("Assignment:");
    TextField fsw = new TextField(10);
    TextField fpro = new TextField(10);
    TextField fatt = new TextField(10);
    TextField fas = new TextField(10);
    Label meL3 = new Label("Major Exam");
    TextField fme = new TextField(10);
    Label FG = new Label("Final Grade: ");
    TextField TFG = new TextField(10);
    Button cal3 = new Button("Calculate");
    
    Frame w5 = new Frame("Identification");
    TextField f1 = new TextField(10);
    Label q1 = new Label ("1.What is the Capital of the Philippines?");
    TextField f2 = new TextField(10);
    Label q2 = new Label ("2.What is the Capital of South Korea");
    TextField f3 = new TextField(10);
    Label q3 = new Label ("3.What is the Capital of Thailand?");
    TextField f4 = new TextField(10);
    Label q4 = new Label ("4.What is the Capital of Oman");
    TextField f5 = new TextField(10);
    Label q5 = new Label ("5.What is the Capital of Lebanon? ");
    TextField f6 = new TextField(10);
    Label q6 = new Label ("6.What is the Capital of Jordan?");
    TextField f7 = new TextField(10);
    Label q7 = new Label ("7.What is the Capital of North Korea?");
    TextField f8 = new TextField(10);
    Label q8 = new Label ("8.What is the Capital of Sri Langka?");
    TextField f9 = new TextField(10);
    Label q9 = new Label ("9.What is the Capital of Kazashktan?");
    TextField f10 = new TextField(10);
    Label q10 = new Label ("10.What is the Capital of China? ");
    TextField f11 = new TextField(10);
    Label q11 = new Label ("11.What is the Capital of Israel?");
    TextField f12 = new TextField(10);
    Label q12 = new Label ("12.What is the Capital of Japan?.");
    TextField f13 = new TextField(10);
    Label q13 = new Label ("13.What is the Capital of Taiwan?");
    TextField f14 = new TextField(10);
    Label q14 = new Label ("14.What is the Capital of Canada");
    TextField f15 = new TextField(10);
    Label q15 = new Label ("15.What is the Capital of France?");
    Button  compute = new Button("Compute");
    Label firstscore = new Label("SCORE 1: ");
    TextField firstresult = new TextField(10);
    
    Frame w6 = new Frame("Classification");
    Checkbox c1 = new Checkbox("Event");
    Checkbox c2 = new Checkbox("Property");
    Checkbox c3 = new Checkbox("Function");
    Checkbox c4 = new Checkbox("Method");
    Button onclick = new Button("Onclick");
    Button substring = new Button("substring");
    Button len= new Button("length");
    Button val = new Button("Val()");
    Button text = new Button("Text");
    Button mouseover = new Button("Mouseover");
    Button cursor = new Button("Cursor Changed");
    Button visible = new Button("Visible");
    Button keypress= new Button("Key press");
    Button enabled = new Button("Enabled");
    Button doubleclick = new Button("Doubleclick");
    Button width = new Button("Width");
    Button tolower = new Button("tolower");
    Button equals = new Button("equals");
    Button str = new Button("str()");
    Button compute2 = new Button("Compute");
    Label secondscore = new Label("SCORE 2: ");
    TextField secondresult = new TextField(10);
    int score2 = 0;
    
    Frame w7 = new Frame("Multiple Choice");
    Label thirdinstruction = new Label("TEST 3:MULTIPLE CHOICE");
    Label test3_q1 = new Label("1.ARTS AND SCIENCE OF CREATING A PROGRAM");
    CheckboxGroup choices1 = new CheckboxGroup();
    Checkbox choices1_a = new Checkbox("A. ENCODING",choices1,false);
    Checkbox choices1_b = new Checkbox("B. ANALYZING",choices1,false);
    Checkbox choices1_c = new Checkbox("C. PROGRAMMING",choices1,false);
    Checkbox choices1_d = new Checkbox("D. FLOWCHARTING",choices1,false);
    Label test3_q2 = new Label("2.IS A GRAPHICAL REPRESENTATION OF THE PROGRAM");
    CheckboxGroup choices2 = new CheckboxGroup();
    Checkbox choices2_a = new Checkbox("A. ENCODING",choices2,false);
    Checkbox choices2_b = new Checkbox("B. ANALYZING",choices2,false);
    Checkbox choices2_c = new Checkbox("C. PROGRAMMING",choices2,false);
    Checkbox choices2_d = new Checkbox("D. FLOWCHARTING",choices2,false);
    Label test3_q3 = new Label("3. FIRST INVENTED CALCULATOR");
    CheckboxGroup choices3 = new CheckboxGroup();
    Checkbox choices3_a = new Checkbox("A. SCIENTIFIC",choices3,false);
    Checkbox choices3_b = new Checkbox("B. PASCALINE",choices3,false);
    Checkbox choices3_c = new Checkbox("C. LEIBNITZ",choices3,false);
    Checkbox choices3_d = new Checkbox("D. DIGITAL CALCULATOR",choices3,false);
    Label test3_q4 = new Label("4.FOUNDER OF MICROSOFT");
    CheckboxGroup choices4 = new CheckboxGroup();
    Checkbox choices4_a = new Checkbox("A. BILL GATES",choices4,false);
    Checkbox choices4_b = new Checkbox("B. STEVE JOBS",choices4,false);
    Checkbox choices4_c = new Checkbox("C. HERMAN HOLLERITH",choices4,false);
    Checkbox choices4_d = new Checkbox("D. CHARLES BABBAGE",choices4,false);
    Label test3_q5 = new Label("5.USE TO ADD FUNCTIONALITY IN HTML");
    CheckboxGroup choices5 = new CheckboxGroup();
    Checkbox choices5_a = new Checkbox("A. JAVA SCRIPT",choices5,false);
    Checkbox choices5_b = new Checkbox("B. CSS",choices5,false);
    Checkbox choices5_c = new Checkbox("C. XML",choices5,false);
    Checkbox choices5_d = new Checkbox("D. JAVA",choices5,false);
    Label test3_q6 = new Label("6. IT DIRECTS CONTROL THE ENTIRE OPERATION OF THE COMPUTER");
    CheckboxGroup choices6 = new CheckboxGroup();
    Checkbox choices6_a = new Checkbox("A. MACHINE LANGUAGE",choices6,false);
    Checkbox choices6_b = new Checkbox("B. OPERATING SYSTEM",choices6,false);
    Checkbox choices6_c = new Checkbox("C. ASSEMBLY LANGUAGE",choices6,false);
    Label test3_q7 = new Label("7. NAPIERS BONE IS MADE UP OF");
    CheckboxGroup choices7 = new CheckboxGroup();
    Checkbox choices7_a = new Checkbox("A. BONE",choices7,false);
    Checkbox choices7_b = new Checkbox("B. IVORY",choices7,false);
    Checkbox choices7_c = new Checkbox("C.GEMS",choices7,false);
    Checkbox choices7_d = new Checkbox("D. BOTH A AND B",choices7,false);
    Label test3_q8 = new Label("8. IS A COLLECTION OF DATA AND INFORMATION ORGANIZE IN SPECIFIC MANNER");
    CheckboxGroup choices8 = new CheckboxGroup();
    Checkbox choices8_a = new Checkbox("A. SPREADSHEET",choices8,false);
    Checkbox choices8_b = new Checkbox("B. FILES",choices8,false);
    Checkbox choices8_c = new Checkbox("C.DATABASE",choices8,false);
    Checkbox choices8_d = new Checkbox("D. RECORD",choices8,false);
    Label test3_q9 = new Label("9. PHYSICAL PARTS OF COMPUTER");
    CheckboxGroup choices9 = new CheckboxGroup();
    Checkbox choices9_a = new Checkbox("A. HARDWARE",choices9,false);
    Checkbox choices9_b = new Checkbox("B. SOFTWARE",choices9,false);
    Checkbox choices9_c = new Checkbox("C. PEOPLEWARE",choices9,false);
    Checkbox choices9_d = new Checkbox("D. FIRMWARE",choices9,false);
    Label test3_q10 = new Label("10. EXAMPLE OF WORD PROCESSOR");
    CheckboxGroup choices10 = new CheckboxGroup();
    Checkbox choices10_a = new Checkbox("A. EXCEL",choices10,false);
    Checkbox choices10_b = new Checkbox("B. WORD",choices10,false);
    Checkbox choices10_c = new Checkbox("C.POWERPOINT",choices10,false);
    Checkbox choices10_d = new Checkbox("D. ACCESS",choices10,false);
    Button compute3 = new Button("Compute");
    Label thirdscore = new Label("SCORE 3:");
    TextField thirdresult = new TextField(10);
    
    Frame w8 = new Frame("Grosspay");
    double rp,hw,regp,ot,GP,np,Tax;
    Label ename = new Label("Employee Name: ");
    Label prate = new Label("Enter Pay Rate: ");
    Label nhour = new Label("Enter No. of Hours worked: ");
    Label ecode = new Label("Employee Code");
    Label scode = new Label("Enter State Code");   
    TextField name = new TextField(10);
    TextField pr = new TextField(10);
    TextField nh = new TextField(10);
    CheckboxGroup cg1 = new CheckboxGroup();
    Checkbox c5 = new Checkbox("A",cg1,false);
    Checkbox c6 = new Checkbox("B",cg1,false);
    CheckboxGroup cg2 = new CheckboxGroup();
    Checkbox c7 = new Checkbox("N",cg2,false);
    Checkbox c8 = new Checkbox("P",cg2,false);
    Button compute4 = new Button("COMPUTE");
    Label pen = new Label("Employee Name: ");
    Label pgp = new Label("Gross Pay: ");
    
    Frame w9 = new Frame("Tax");
    Label ename_T = new Label("Employee Name: ");
    Label prate_T  = new Label("Enter Pay Rate: ");
    Label nhour_T  = new Label("Enter No. of Hours worked: ");
    Label ecode_T  = new Label("Employee Code");
    Label scode_T  = new Label("Enter State Code");   
    TextField name_T  = new TextField(10);
    TextField pr_T  = new TextField(10);
    TextField nh_T  = new TextField(10);
    Button compute4_T  = new Button("COMPUTE");
    Label pen_T  = new Label("Employee Name: ");
    Label pt = new Label("Tax: ");
    
    public void init() {
        w1.setLayout(new FlowLayout());
        w1.show();
        w1.resize(400,200);
        w1.setMenuBar(mb);
        mb.add(gs);
        gs.add(pg);
        gs.add(mg);
        gs.add(fg);
        mb.add(oe);
        oe.add(iq);
        oe.add(cq);
        oe.add(mc);
        mb.add(ps);
        ps.add(gp);
        ps.add(tax);
        
        pg.addActionListener(this);
        mg.addActionListener(this);
        fg.addActionListener(this);
        iq.addActionListener(this);
        cq.addActionListener(this);
        mc.addActionListener(this);
        gp.addActionListener(this);
        tax.addActionListener(this);
    
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== pg){
            w2.setLayout (null);
            w2.setBounds(10,100,200,200);
            w2.show();
            w2.resize(500,400);
            w2.add(label1);
            w2.add(pL);
            w2.add(quiz1);
            w2.add(q1L1);
            w2.add(q2L1);
            w2.add(pq1);
            w2.add(pq2);
            w2.add(pcs);
            w2.add(swL1);
            w2.add(proL1);
            w2.add(attL1);
            w2.add(asL1);
            w2.add(psw);
            w2.add(ppro);
            w2.add(patt);
            w2.add(pas);
            w2.add(meL1);
            w2.add(pme);
            w2.add(PG);
            w2.add(TPG);
            w2.add(cal1);
            cal1.addActionListener(this);
              
            label1.setBounds(190,40,120,20);
            pL.setBounds(100,60,270,20);
            quiz1.setBounds(10,80,50,20);
            q1L1.setBounds(10,100,50,20);
            q2L1.setBounds(10,120,50,20);
            pq1.setBounds(100,100,50,20);
            pq2.setBounds(100,120,50,20);
            pcs.setBounds(10,140,100,20);
            swL1.setBounds(10,160,70,20);
            proL1.setBounds(10,180,70,20);
            attL1.setBounds(10,200,70,20);
            asL1.setBounds(10,220,70,20);
            psw.setBounds(100,160,50,20);
            ppro.setBounds(100,180,50,20);
            patt.setBounds(100,200,50,20);
            pas.setBounds(100,220,50,20);
            meL1.setBounds(10,240,70,20);
            pme.setBounds(100,240,50,20);
            cal1.setBounds(20,300,50,20);
            PG.setBounds(10,350,100,20);
            TPG.setBounds(110,350,100,20);      
        }
        if(ae.getSource() == cal1){
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
                TPG.setText(" " + PG);
        }
        if(ae.getSource()== mg){
            w3.setLayout (null);
            w3.setBounds(220,100,200,200);
            w3.show();
            w3.resize(500,400);
            
            w3.add(label2);
            w3.add(mL);
            w3.add(quiz2);
            w3.add(q1L2);
            w3.add(q2L2);
            w3.add(mq1);
            w3.add(mq2);
            w3.add(mcs);
            w3.add(swL2);
            w3.add(proL2);
            w3.add(attL2);
            w3.add(asL2);
            w3.add(msw);
            w3.add(mpro);
            w3.add(matt);
            w3.add(mas);
            w3.add(meL2);
            w3.add(mme);
            w3.add(MG);
            w3.add(TMG);
            w3.add(cal2);
            cal2.addActionListener(this);
            
            label2.setBounds(190,40,120,20);
            mL.setBounds(100,60,270,20);
            quiz2.setBounds(10,80,50,20);
            q1L2.setBounds(10,100,50,20);
            q2L2.setBounds(10,120,50,20);
            mq1.setBounds(100,100,50,20);
            mq2.setBounds(100,120,50,20);
            mcs.setBounds(10,140,100,20);
            swL2.setBounds(10,160,70,20);
            proL2.setBounds(10,180,70,20);
            attL2.setBounds(10,200,70,20);
            asL2.setBounds(10,220,70,20);
            msw.setBounds(100,160,50,20);
            mpro.setBounds(100,180,50,20);
            matt.setBounds(100,200,50,20);
            mas.setBounds(100,220,50,20);
            meL2.setBounds(10,240,70,20);
            mme.setBounds(100,240,50,20);
            cal2.setBounds(20,300,50,20);
            MG.setBounds(10,350,100,20);
            TMG.setBounds(110,350,100,20);           
        }
        if(ae.getSource()==cal2){
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
                TMG.setText(" " + MG);

         }
        if(ae.getSource()== fg){
            w4.setLayout (null);
            w4.show();
            w4.resize(500,400); 
            
            w4.add(label3);
            w4.add(fL);
            w4.add(quiz3);
            w4.add(q1L3);
            w4.add(q2L3);
            w4.add(fq1);
            w4.add(fq2);
            w4.add(fcs);
            w4.add(swL3);
            w4.add(proL3);
            w4.add(attL3);
            w4.add(asL3);
            w4.add(fsw);
            w4.add(fpro);
            w4.add(fatt);
            w4.add(fas);
            w4.add(meL3);
            w4.add(fme);
            w4.add(FG);
            w4.add(TFG);
            w4.add(cal3);
            cal3.addActionListener(this);
            
            label3.setBounds(190,40,120,20);
            fL.setBounds(100,60,270,20);
            quiz3.setBounds(10,80,50,20);
            q1L3.setBounds(10,100,50,20);
            q2L3.setBounds(10,120,50,20);
            fq1.setBounds(100,100,50,20);
            fq2.setBounds(100,120,50,20);
            fcs.setBounds(10,140,100,20);
            swL3.setBounds(10,160,70,20);
            proL3.setBounds(10,180,70,20);
            attL3.setBounds(10,200,70,20);
            asL3.setBounds(10,220,70,20);
            fsw.setBounds(100,160,50,20);
            fpro.setBounds(100,180,50,20);
            fatt.setBounds(100,200,50,20);
            fas.setBounds(100,220,50,20);
            meL3.setBounds(10,240,70,20);
            fme.setBounds(100,240,50,20);
            cal3.setBounds(20,300,50,20);
            FG.setBounds(10,350,100,20);
            TFG.setBounds(110,350,100,20);
        }
        if(ae.getSource()==cal3){
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
                TFG.setText(" " + FG);
        }
        if(ae.getSource()== iq){
            w5.setLayout (null);
            w5.show();
            w5.resize(500,500);  
            
            w5.add(f1);
            w5.add(q1);
            w5.add(f2);
            w5.add(q2);
            w5.add(f3);
            w5.add(q3);
            w5.add(f4);
            w5.add(q4);
            w5.add(f5);
            w5.add(q5);
            w5.add(f6);
            w5.add(q6);
            w5.add(f7);
            w5.add(q7);
            w5.add(f8);
            w5.add(q8);
            w5.add(f9);
            w5.add(q9);
            w5.add(f10);
            w5.add(q10);
            w5.add(f11);
            w5.add(q11);
            w5.add(f12);
            w5.add(q12);
            w5.add(f13);
            w5.add(q13);
            w5.add(f14);
            w5.add(q14);
            w5.add(f15);
            w5.add(q15);
            w5.add(compute);
            compute.addActionListener(this);
            w5.add(firstscore);
            w5.add(firstresult);
            
            f1.setBounds(10,40,150,20);
            q1.setBounds(170,40,300,20);
            f2.setBounds(10,60,150,20);
            q2.setBounds(170,60,300,20);
            f3.setBounds(10,80,150,20);
            q3.setBounds(170,80,300,20);
            f4.setBounds(10,100,150,20);
            q4.setBounds(170,100,300,20);
            f5.setBounds(10,120,150,20);
            q5.setBounds(170,120,300,20);
            f6.setBounds(10,140,150,20);
            q6.setBounds(170,140,300,20);
            f7.setBounds(10,160,150,20);
            q7.setBounds(170,160,300,20);
            f8.setBounds(10,180,150,20);
            q8.setBounds(170,180,300,20);
            f9.setBounds(10,200,150,20);
            q9.setBounds(170,200,300,20);
            f10.setBounds(10,220,150,20);
            q10.setBounds(170,220,350,20);
            f11.setBounds(10,240,150,20);
            q11.setBounds(170,240,300,20);
            f12.setBounds(10,260,150,20);
            q12.setBounds(170,260,300,20);
            f13.setBounds(10,280,150,20);
            q13.setBounds(170,280,300,20);
            f14.setBounds(10,300,150,20);
            q14.setBounds(170,300,300,20);
            f15.setBounds(10,320,150,20);
            q15.setBounds(170,320,300,20);
            compute.setBounds(10,350,100,20);
           firstscore.setBounds(10,380,60,20);
           firstresult.setBounds(70,380,100,20);
        }
        if (ae.getSource() == compute){
            int score1 = 0;
            String ans1 = f1.getText().toUpperCase();
            String ans2 = f2.getText().toUpperCase();
            String ans3 = f3.getText().toUpperCase();
            String ans4 = f4.getText().toUpperCase();
            String ans5 = f5.getText().toUpperCase();
            String ans6 = f6.getText().toUpperCase();
            String ans7 = f7.getText().toUpperCase();
            String ans8 = f8.getText().toUpperCase();
            String ans9 = f9.getText().toUpperCase();
            String ans10 = f10.getText().toUpperCase();
            String ans11 = f11.getText().toUpperCase();
            String ans12 = f12.getText().toUpperCase();
            String ans13 = f13.getText().toUpperCase();
            String ans14 = f14.getText().toUpperCase();
            String ans15 = f15.getText().toUpperCase();
             if(ans1.equals("MANILA")){
                 score1+=1;
             }if(ans2.equals("SEOUL")){
                 score1+=1;  
             }if(ans3.equals("BANGKOK")){
                 score1+=1;
             }if(ans4.equals("MUSCAT")){
                 score1+=1;
             }if(ans5.equals("BEIRUT")){
                 score1+=1;
             }if(ans6.equals("AMMAN")){
                 score1+=1;
             }if(ans7.equals("PYONGYANG")){
                 score1+=1;
             }if(ans8.equals("COLOMBO")){
                 score1+=1;
             }if(ans9.equals("ASTANA")){
                 score1+=1;
             }if(ans10.equals("BEIJING")){
                 score1+=1;
             }if(ans11.equals("JERUSALEM")){
                 score1+=1;
             }if(ans12.equals("TOKYO")){
                 score1+=1;
             }if(ans13.equals("TAIPEI")){
                 score1+=1;
             }if(ans14.equals("OTTAWA")){
                 score1+=1;
             }if(ans15.equals("PARIS")){
                 score1+=1;
             }
             firstresult.setText("    " + score1);
         }
        if(ae.getSource()== cq){
            w6.setLayout (null);
            w6.show();
            w6.resize(500,500); 
            
            w6.add(c1);
            w6.add(c2);
            w6.add(c3);
            w6.add(c4);
            w6.add(onclick);
            onclick.addActionListener(this);
            w6.add(substring);
            substring.addActionListener(this);
            w6.add(len);
            len.addActionListener(this);
            w6.add(val);
            val.addActionListener(this);
            w6.add(text);
            text.addActionListener(this);
            w6.add(mouseover);
            mouseover.addActionListener(this);
            w6.add(cursor);
            cursor.addActionListener(this);
            w6.add(visible);
            visible.addActionListener(this);
            w6.add(keypress);
            keypress.addActionListener(this);
            w6.add(enabled);
            enabled.addActionListener(this);
            w6.add(doubleclick);
            doubleclick.addActionListener(this);
            w6.add(str);
            str.addActionListener(this);
            w6.add(tolower);
            tolower.addActionListener(this);
            w6.add(equals);
            equals.addActionListener(this);
            w6.add(width);
            width.addActionListener(this);
            w6.add(secondscore);
            w6.add(secondresult);
            
            c1.setBounds(20,50,50,20);
            c2.setBounds(80,50,70,20);
            c3.setBounds(160,50,70,20);
            c4.setBounds(230,50,70,20);
            onclick.setBounds(20,100,70,20);
            substring.setBounds(100,100,70,20);
            doubleclick.setBounds(180,100,70,20);
            len.setBounds(20,150,70,20);
            val.setBounds(100,150,70,20);
            width.setBounds(180,150,70,20);
            text.setBounds(20,200,70,20);
            mouseover.setBounds(100,200,70,20);
            tolower.setBounds(180,200,70,20);
            cursor.setBounds(20,250,100,20);
            visible.setBounds(130,250,70,20);
            equals.setBounds(210,250,70,20);
            keypress.setBounds(20,300,70,20);
            enabled.setBounds(100,300,70,20);
            str.setBounds(180,300,70,20);
            secondscore.setBounds(20,390,60,20);
            secondresult.setBounds(80,390,70,20);
        }
            if(c1.getState()==true && c2.getState()== false&& c3.getState()== false&& c4.getState()== false){
                 if(ae.getSource() == onclick){
                    score2 +=1;
                    onclick.setEnabled(false);
                    secondresult.setText("    " + score2);
                 }if(ae.getSource() == cursor){
                     score2 +=1;
                    cursor.setEnabled(false);
                    secondresult.setText("    " + score2);
                 }if(ae.getSource() == mouseover){
                     score2 +=1;
                    mouseover.setEnabled(false);
                    secondresult.setText("    " + score2);
                }if(ae.getSource() == keypress){
                     score2 +=1;
                     keypress.setEnabled(false);
                     secondresult.setText("    " + score2);
                }if(ae.getSource() == doubleclick){
                    score2 +=1;
                    doubleclick.setEnabled(false);
                    secondresult.setText("    " + score2);
                 }if(ae.getSource() == len){
                     len.setEnabled(false);
                 }if(ae.getSource() == text){
                     text.setEnabled(false);
                 }if(ae.getSource() == substring){
                     substring.setEnabled(false);
                 }if(ae.getSource() == val){
                     val.setEnabled(false);
                 }if(ae.getSource() == visible){
                     visible.setEnabled(false);
                 }if(ae.getSource() == enabled){
                     enabled.setEnabled(false);
                 }if(ae.getSource() == str){
                     str.setEnabled(false);
                 }if(ae.getSource() == width){
                     width.setEnabled(false);
                 }if(ae.getSource() == tolower){
                     tolower.setEnabled(false);
                 }if(ae.getSource() == equals){
                     equals.setEnabled(false);
                 }
            }
             if(c1.getState()== false && c2.getState()== true && c3.getState()== false&& c4.getState()== false){
                 if(ae.getSource() == visible){
                     score2 +=1;
                     visible.setEnabled(false);
                     secondresult.setText("    " + score2);
                 }
                 if(ae.getSource() == enabled){
                     score2 +=1;
                     enabled.setEnabled(false);
                     secondresult.setText("    " + score2);
                 }
                 if(ae.getSource() == text){
                     score2 +=1;
                     text.setEnabled(false);
                     secondresult.setText("    " + score2);
                 }
                 if(ae.getSource() == width){
                     score2 +=1;
                     width.setEnabled(false);
                     secondresult.setText("    " + score2);
                 }
                 }if(ae.getSource() == onclick){
                     onclick.setEnabled(false);
                 }if(ae.getSource() == doubleclick){
                     doubleclick.setEnabled(false);
                 }if(ae.getSource() == substring){
                     substring.setEnabled(false);
                 }if(ae.getSource() == val){
                     val.setEnabled(false);
                 }if(ae.getSource() == mouseover){
                     mouseover.setEnabled(false);
                 }if(ae.getSource() == cursor){
                     cursor.setEnabled(false);
                 }if(ae.getSource() == str){
                     str.setEnabled(false);
                 }if(ae.getSource() == keypress){
                     keypress.setEnabled(false);
                 }if(ae.getSource() == tolower){
                     tolower.setEnabled(false);
                 }if(ae.getSource() == equals){
                     equals.setEnabled(false);
                 }
             
             if(c1.getState()== false && c2.getState()== false && c3.getState()== true && c4.getState()== false){
                 if(ae.getSource() == val){
                     score2 +=1;
                     val.setEnabled(false);
                     secondresult.setText("    " + score2);
                 }
                 if(ae.getSource() == str){
                     score2 +=1;
                     str.setEnabled(false);
                     secondresult.setText("    " + score2);
                 }
                 if(ae.getSource() == len){
                     len.setEnabled(false);
                 }if(ae.getSource() == text){
                     text.setEnabled(false);
                 }if(ae.getSource() == substring){
                     substring.setEnabled(false);
                 }if(ae.getSource() == mouseover){
                     mouseover.setEnabled(false);
                 }if(ae.getSource() == visible){
                     visible.setEnabled(false);
                 }if(ae.getSource() == enabled){
                     enabled.setEnabled(false);
                 }if(ae.getSource() == cursor){
                     cursor.setEnabled(false);
                 }if(ae.getSource() == width){
                     width.setEnabled(false);
                 }if(ae.getSource() == tolower){
                     tolower.setEnabled(false);
                 }if(ae.getSource() == equals){
                     equals.setEnabled(false);
                 }if(ae.getSource() == onclick){
                     onclick.setEnabled(false);
                 }if(ae.getSource() == keypress){
                     keypress.setEnabled(false);
                 }if(ae.getSource() == doubleclick){
                     doubleclick.setEnabled(false);
                 }
             }
             if(c1.getState()== false && c2.getState()== false && c3.getState()== false && c4.getState()== true){
                 if(ae.getSource() == len){
                     score2 +=1;
                     len.setEnabled(false);
                     secondresult.setText("    " + score2);
                 }
                 if(ae.getSource() == substring){
                     score2 +=1;
                     substring.setEnabled(false);
                     secondresult.setText("    " + score2);
                 }
                 if(ae.getSource() == tolower){
                     score2 +=1;
                     tolower.setEnabled(false);
                     secondresult.setText("    " + score2);
                 }
                 if(ae.getSource() == equals){
                     score2 +=1;
                     equals.setEnabled(false);
                     secondresult.setText("    " + score2);
                 }
                 if(ae.getSource() == val){
                     val.setEnabled(false);
                 }if(ae.getSource() == text){
                     text.setEnabled(false);
                 }if(ae.getSource() == str){
                     str.setEnabled(false);
                 }if(ae.getSource() == mouseover){
                     mouseover.setEnabled(false);
                 }if(ae.getSource() == visible){
                     visible.setEnabled(false);
                 }if(ae.getSource() == enabled){
                     enabled.setEnabled(false);
                 }if(ae.getSource() == cursor){
                     cursor.setEnabled(false);
                 }if(ae.getSource() == width){
                     width.setEnabled(false);
                 }if(ae.getSource() == onclick){
                     onclick.setEnabled(false);
                 }if(ae.getSource() == keypress){
                     keypress.setEnabled(false);
                 }if(ae.getSource() == doubleclick){
                     doubleclick.setEnabled(false);
                 }
        }
        if(ae.getSource()== mc){
            w7.setLayout (null);
            w7.show();
            w7.resize(500,800);  
            
            w7.add(test3_q1);
            w7.add(choices1_a);
            w7.add(choices1_b);
            w7.add(choices1_c);
            w7.add(choices1_d);
            w7.add(test3_q2);
            w7.add(choices2_a);
            w7.add(choices2_b);
            w7.add(choices2_c);
            w7.add(choices2_d);
            w7.add(test3_q3);
            w7.add(choices3_a);
            w7.add(choices3_b);
            w7.add(choices3_c);
            w7.add(choices3_d);
            w7.add(test3_q4);
            w7.add(choices4_a);
            w7.add(choices4_b);
            w7.add(choices4_c);
            w7.add(choices4_d);
            w7.add(test3_q5);
            w7.add(choices5_a);
            w7.add(choices5_b);
            w7.add(choices5_c);
            w7.add(choices5_d);
            w7.add(test3_q6);
            w7.add(choices6_a);
            w7.add(choices6_b);
            w7.add(choices6_c);
            w7.add(test3_q7);
            w7.add(choices7_a);
            w7.add(choices7_b);
            w7.add(choices7_c);
            w7.add(choices7_d);
            w7.add(test3_q8);
            w7.add(choices8_a);
            w7.add(choices8_b);
            w7.add(choices8_c);
            w7.add(choices8_d);
            w7.add(test3_q9);
            w7.add(choices9_a);
            w7.add(choices9_b);
            w7.add(choices9_c);
            w7.add(choices9_d);
            w7.add(test3_q10);
            w7.add(choices10_a);
            w7.add(choices10_b);
            w7.add(choices10_c);
            w7.add(choices10_d);
            w7.add(compute3);
            compute3.addActionListener(this);
            w7.add(thirdscore);
            w7.add(thirdresult);
            
            test3_q1.setBounds(10,50,400,20);
            choices1_a.setBounds(10,70,150,20);
            choices1_b.setBounds(10,90,150,20);
            choices1_c.setBounds(170,70,150,20);
            choices1_d.setBounds(170,90,150,20);
            test3_q2.setBounds(10,110,400,20);
            choices2_a.setBounds(10,130,150,20);
            choices2_b.setBounds(10,150,150,20);
            choices2_c.setBounds(170,130,150,20);
            choices2_d.setBounds(170,150,150,20);
            test3_q3.setBounds(10,170,400,20);
            choices3_a.setBounds(10,190,150,20);
            choices3_b.setBounds(10,210,150,20);
            choices3_c.setBounds(170,190,150,20);
            choices3_d.setBounds(170,210,200,20);
            test3_q4.setBounds(10,230,400,20);
            choices4_a.setBounds(10,250,150,20);
            choices4_b.setBounds(10,270,150,20);
            choices4_c.setBounds(170,250,200,20);
            choices4_d.setBounds(170,270,200,20);
            test3_q5.setBounds(10,290,400,20);
            choices5_a.setBounds(10,310,150,20);
            choices5_b.setBounds(10,330,150,20);
            choices5_c.setBounds(170,310,200,20);
            choices5_d.setBounds(170,330,200,20);
            test3_q6.setBounds(10,350,500,20);
            choices6_a.setBounds(10,370,160,20);
            choices6_b.setBounds(10,390,150,20);
            choices6_c.setBounds(170,370,200,20);
            test3_q7.setBounds(10,410,400,20);
            choices7_a.setBounds(10,430,150,20);
            choices7_b.setBounds(10,450,150,20);
            choices7_c.setBounds(170,430,200,20);
            choices7_d.setBounds(170,450,200,20);
            test3_q8.setBounds(10,470,400,20);
            choices8_a.setBounds(10,490,150,20);
            choices8_b.setBounds(10,510,150,20);
            choices8_c.setBounds(170,490,200,20);
            choices8_d.setBounds(170,510,200,20);
            test3_q9.setBounds(10,530,400,20);
            choices9_a.setBounds(10,550,150,20);
            choices9_b.setBounds(10,570,150,20);
            choices9_c.setBounds(170,550,200,20);
            choices9_d.setBounds(170,570,200,20);
            test3_q10.setBounds(10,600,400,20);
            choices10_a.setBounds(10,620,150,20);
            choices10_b.setBounds(10,640,150,20);
            choices10_c.setBounds(170,620,200,20);
            choices10_d.setBounds(170,640,200,20);
            compute3.setBounds(10,660,100,20);
            thirdscore.setBounds(140,660,60,20);
            thirdresult.setBounds(200,660,100,20);
        }
        int score3 = 0;
        if(ae.getSource()==compute3){
             if(choices1_c.getState() == true ){
                 score3 += 1;
             }
             if(choices2_d.getState() == true){
                 score3 += 1;
             }
             if(choices3_b.getState() == true){
                 score3 += 1;
             }
             if(choices4_a.getState() == true){
                 score3 += 1;
             }
             if(choices5_a.getState() == true){
                 score3 += 1;
             }
             if(choices6_b.getState() == true){
                 score3 += 1;
             }
             if(choices7_d.getState() == true){
                 score3 += 1;
             }
             if(choices8_c.getState() == true){
                 score3 += 1;
             }
             if(choices9_a.getState() == true){
                 score3 += 1;
             }
             if(choices10_b.getState() == true){
                 score3 += 1;
             }
             thirdresult.setText("    " + score3);    
         }
        if(ae.getSource()== gp){
            w8.setLayout (null);
            w8.show();
            w8.resize(500,500); 
            w8.add(ename);
            w8.add(name);
            w8.add(prate);
            w8.add(pr);
            w8.add(nhour);
            w8.add(nh);
            w8.add(ecode);
            w8.add(c5);
            w8.add(c6);
            w8.add(scode);
            w8.add(c7);
            w8.add(c8);
            w8.add(compute4);
            compute4.addActionListener(this);
            w8.add(pen);
            w8.add(pgp);
            
            ename.setBounds(25,50,100,20);
            name.setBounds(130,50,150,20);
            prate.setBounds(25,80,100,20);
            pr.setBounds(130,80,150,20);
            nhour.setBounds(25,110,160,20);
            nh.setBounds(190,110,100,20);
            ecode.setBounds(25,140,100,20);
            c5.setBounds(120,170,50,20);
            c6.setBounds(175,170,50,20);
            scode.setBounds(25,200,100,20);
            c7.setBounds(120,230,50,20);
            c8.setBounds(175,230,50,20);
            compute4.setBounds(25,260,75,20);
            pen.setBounds(25,300,250,20);
            pgp.setBounds(25,330,150,20);
        }
        if(ae.getSource()==compute4){
        String state;
        rp = Double.parseDouble(pr.getText());
        hw = Integer.parseInt(nh.getText());
        if (hw<= 40){
            regp = rp*hw;
            ot = 0;
        }
        else{
            regp = rp*40; 
            ot = (1.5*rp)*(hw-40);
        }
        GP = regp+ot;
        if (c5.getState() == true && c6.getState() == false && c7.getState() == true && c8.getState() == false) Tax = GP*0.07;
        if (c5.getState() == true && c6.getState() == false && c7.getState() == false && c8.getState() == true) Tax = GP*(4.5/100);
        if (c6.getState() == true) Tax = 0;
        np = GP - Tax;
        pen.setText("Employee Name: " + name.getText());
        pgp.setText("Gross Pay: " + GP);
        if (c5.getState() == true && c6.getState() == false){
            state = "true";
        }
        else{
            state = "false";
        }
        }
        if(ae.getSource()== tax){
            w9.setLayout (null);
            w9.show();
            w9.resize(500,500); 
            String namevalue = name.getText();
            String prvalue = pr.getText();
            String nhvalue = nh.getText();
            CheckboxGroup cg1_T = new CheckboxGroup();
            Checkbox c5_T = new Checkbox("A",cg1_T , c5.getState());
            Checkbox c6_T = new Checkbox("B",cg1_T , c6.getState());
            CheckboxGroup cg2_T = new CheckboxGroup();
            Checkbox c7_T = new Checkbox("N", cg2_T, c7.getState());
            Checkbox c8_T = new Checkbox("P", cg2_T, c8.getState());
            w9.add(ename_T);
            w9.add(name_T);
            name_T.setText("" + namevalue);
            w9.add(prate_T);
            w9.add(pr_T);
            pr_T.setText(" "+prvalue);
            w9.add(nhour_T);
            w9.add(nh_T);
            nh_T.setText(" "+nhvalue);
            w9.add(ecode_T);
            w9.add(c5_T);
            w9.add(c6_T);
            w9.add(scode_T);      
            w9.add(c7_T);
            w9.add(c8_T);
            w9.add(compute4_T);
            w9.add(pen_T);
            w9.add(pt);
            
            ename_T.setBounds(25,50,100,20);
            name_T.setBounds(130,50,150,20);
            prate_T.setBounds(25,80,100,20);
            pr_T.setBounds(130,80,150,20);
            nhour_T.setBounds(25,110,160,20);
            nh_T.setBounds(190,110,100,20);
            ecode_T.setBounds(25,140,100,20);
            c5_T.setBounds(120,170,50,20);
            c6_T.setBounds(175,170,50,20);
            scode_T.setBounds(25,200,100,20);
            c7_T.setBounds(120,230,50,20);
            c8_T.setBounds(175,230,50,20);
            compute4_T.setBounds(25,260,75,20);
            pen_T.setBounds(25,300,250,20);
            pt.setBounds(25,330,150,20);
            
            pen_T.setText("Employee Name: " + name.getText());
            pt.setText("Tax: " + Tax);             
        }
    }
}
