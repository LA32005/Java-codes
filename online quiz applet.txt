/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.quiz;

import java.applet.Applet;
import java.awt.*;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.*;

/**
 *
 * @author louis
 */
public class NewApplet extends Applet implements ActionListener {

     Label instruction = new Label ("TEST 1: IDENTIFICATION");
    TextField f1 = new TextField(10);
    Label q1 = new Label ("1.IS THE FATHER OF MODERN COMPUTER.");
    TextField f2 = new TextField(10);
    Label q2 = new Label ("2.THE FOUNDER OF MICROSOFT CORPORATION.");
    TextField f3 = new TextField(10);
    Label q3 = new Label ("3.THE DEVELOPER OF THE FIRST CALCULATOR.");
    TextField f4 = new TextField(10);
    Label q4 = new Label ("4.THE FOUNDER OF IBM.");
    TextField f5 = new TextField(10);
    Label q5 = new Label ("5.DEVELOPER OF SLIDE RULE. ");
    TextField f6 = new TextField(10);
    Label q6 = new Label ("6.THE MOST EXPENSIVE COMPUTER. ");
    TextField f7 = new TextField(10);
    Label q7 = new Label ("7.MOST POWERFUL COMPUTER. ");
    TextField f8 = new TextField(10);
    Label q8 = new Label ("8.FIRST MANUAL MECHANICAL DEVICE. ");
    TextField f9 = new TextField(10);
    Label q9 = new Label ("9.IS A PHYSICAL PARTS OF COMPUTER. ");
    TextField f10 = new TextField(10);
    Label q10 = new Label ("10.IS AN INSTRUCTION THAT COMPUTER WILL FOLLOW. ");
    TextField f11 = new TextField(10);
    Label q11 = new Label ("11.CAPITAL OF THE PHILIPPINES.");
    TextField f12 = new TextField(10);
    Label q12 = new Label ("12.CAPITAL OF JAPAN.");
    TextField f13 = new TextField(10);
    Label q13 = new Label ("13.CAPITAL OF SOUTH KOREA.");
    TextField f14 = new TextField(10);
    Label q14 = new Label ("14.CAPITAL OF CANADA.");
    TextField f15 = new TextField(10);
    Label q15 = new Label ("15.CAPITAL OF THAILAND.");
    Button  compute = new Button("Compute");
    Label firstscore = new Label("SCORE 1: ");
    TextField firstresult = new TextField(10);
            
    Label secondinstruction = new Label("TEST 2. CLASSIFY THE FOLLOWING IF PROPERTY, METHOD OR EVENT.");
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
    Label secondscore = new Label("SCORE 2: ");
    TextField secondresult = new TextField(10);
    
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
    Button compute2 = new Button("Compute");
    Label thirdscore = new Label("SCORE 3:");
    TextField thirdresult = new TextField(10);
    
    public void init() {
         setLayout(null);
        add(instruction);
        add(f1);
        add(q1);
        add(f2);
        add(q2);
        add(f3);
        add(q3);
        add(f4);
        add(q4);
        add(f5);
        add(q5);
        add(f6);
        add(q6);
        add(f7);
        add(q7);
        add(f8);
        add(q8);
        add(f9);
        add(q9);
        add(f10);
        add(q10);
        add(f11);
        add(q11);
        add(f12);
        add(q12);
        add(f13);
        add(q13);
        add(f14);
        add(q14);
        add(f15);
        add(q15);
        add(compute);
        add(firstscore);
        add(firstresult);
        
        add(secondinstruction);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(onclick);
        add(substring);
        add(len);
        add(val);
        add(text);
        add(mouseover);
        add(cursor);
        add(visible);
        add(keypress);
        add(enabled);
        add(doubleclick);
        add(str);
        add(tolower);
        add(equals);
        add(width);
        add(secondscore);
        add(secondresult);
        
        add(thirdinstruction);
        add(test3_q1);
        add(choices1_a);
        add(choices1_b);
        add(choices1_c);
        add(choices1_d);
        add(test3_q2);
        add(choices2_a);
        add(choices2_b);
        add(choices2_c);
        add(choices2_d);
        add(test3_q3);
        add(choices3_a);
        add(choices3_b);
        add(choices3_c);
        add(choices3_d);
        add(test3_q4);
        add(choices4_a);
        add(choices4_b);
        add(choices4_c);
        add(choices4_d);
        add(test3_q5);
        add(choices5_a);
        add(choices5_b);
        add(choices5_c);
        add(choices5_d);
        add(test3_q6);
        add(choices6_a);
        add(choices6_b);
        add(choices6_c);
        add(test3_q7);
        add(choices7_a);
        add(choices7_b);
        add(choices7_c);
        add(choices7_d);
        add(test3_q8);
        add(choices8_a);
        add(choices8_b);
        add(choices8_c);
        add(choices8_d);
        add(test3_q9);
        add(choices9_a);
        add(choices9_b);
        add(choices9_c);
        add(choices9_d);
        add(test3_q10);
        add(choices10_a);
        add(choices10_b);
        add(choices10_c);
        add(choices10_d);
        add(compute2);
        add(thirdscore);
        add(thirdresult);

        instruction.setBounds(10,20,150,20);
        f1.setBounds(10,50,150,20);
        q1.setBounds(170,50,300,20);
        f2.setBounds(10,90,150,20);
        q2.setBounds(170,90,300,20);
        f3.setBounds(10,130,150,20);
        q3.setBounds(170,130,300,20);
        f4.setBounds(10,170,150,20);
        q4.setBounds(170,170,300,20);
        f5.setBounds(10,210,150,20);
        q5.setBounds(170,210,300,20);
        f6.setBounds(10,250,150,20);
        q6.setBounds(170,250,300,20);
        f7.setBounds(10,290,150,20);
        q7.setBounds(170,290,300,20);
        f8.setBounds(10,330,150,20);
        q8.setBounds(170,330,300,20);
        f9.setBounds(10,370,150,20);
        q9.setBounds(170,370,300,20);
        f10.setBounds(10,410,150,20);
        q10.setBounds(170,410,350,20);
        f11.setBounds(10,450,150,20);
        q11.setBounds(170,450,300,20);
        f12.setBounds(10,490,150,20);
        q12.setBounds(170,490,300,20);
        f13.setBounds(10,530,150,20);
        q13.setBounds(170,530,300,20);
        f14.setBounds(10,570,150,20);
        q14.setBounds(170,570,300,20);
        f15.setBounds(10,610,150,20);
        q15.setBounds(170,610,300,20);
        compute.setBounds(10,630,100,20);
       firstscore.setBounds(175,640,60,20);
       firstresult.setBounds(230,640,100,20);
        
       secondinstruction.setBounds(550,20,450,20);
       c1.setBounds(550,50,50,20);
       c2.setBounds(620,50,70,20);
       c3.setBounds(700,50,70,20);
       c4.setBounds(780,50,70,20);
       onclick.setBounds(550,100,70,20);
       substring.setBounds(700,100,70,20);
       doubleclick.setBounds(850,100,70,20);
       len.setBounds(550,150,70,20);
       val.setBounds(700,150,70,20);
       width.setBounds(850,150,70,20);
       text.setBounds(550,200,70,20);
       mouseover.setBounds(700,200,70,20);
       tolower.setBounds(850,200,70,20);
       cursor.setBounds(550,250,100,20);
       visible.setBounds(700,250,70,20);
       equals.setBounds(850,250,70,20);
       keypress.setBounds(550,300,70,20);
       enabled.setBounds(700,300,70,20);
       str.setBounds(850,300,70,20);
       secondscore.setBounds(550,350,60,20);
       secondresult.setBounds(620,350,70,20);
       
       thirdinstruction.setBounds(1050,20,150,20);
       test3_q1.setBounds(1050,50,400,20);
       choices1_a.setBounds(1050,70,150,20);
       choices1_b.setBounds(1050,90,150,20);
       choices1_c.setBounds(1200,70,150,20);
       choices1_d.setBounds(1200,90,150,20);
       test3_q2.setBounds(1050,110,400,20);
       choices2_a.setBounds(1050,130,150,20);
       choices2_b.setBounds(1050,150,150,20);
       choices2_c.setBounds(1200,130,150,20);
       choices2_d.setBounds(1200,150,150,20);
       test3_q3.setBounds(1050,170,400,20);
       choices3_a.setBounds(1050,190,150,20);
       choices3_b.setBounds(1050,210,150,20);
       choices3_c.setBounds(1200,190,150,20);
       choices3_d.setBounds(1200,210,200,20);
       test3_q4.setBounds(1050,230,400,20);
       choices4_a.setBounds(1050,250,150,20);
       choices4_b.setBounds(1050,270,150,20);
       choices4_c.setBounds(1200,250,200,20);
       choices4_d.setBounds(1200,270,200,20);
       test3_q5.setBounds(1050,290,400,20);
       choices5_a.setBounds(1050,310,150,20);
       choices5_b.setBounds(1050,330,150,20);
       choices5_c.setBounds(1200,310,200,20);
       choices5_d.setBounds(1200,330,200,20);
       test3_q6.setBounds(1050,350,500,20);
       choices6_a.setBounds(1050,370,200,20);
       choices6_b.setBounds(1050,390,150,20);
       choices6_c.setBounds(1250,370,200,20);
       test3_q7.setBounds(1050,410,400,20);
       choices7_a.setBounds(1050,430,150,20);
       choices7_b.setBounds(1050,450,150,20);
       choices7_c.setBounds(1200,430,200,20);
       choices7_d.setBounds(1200,450,200,20);
       test3_q8.setBounds(1050,470,400,20);
       choices8_a.setBounds(1050,490,150,20);
       choices8_b.setBounds(1050,510,150,20);
       choices8_c.setBounds(1200,490,200,20);
       choices8_d.setBounds(1200,510,200,20);
       test3_q9.setBounds(1050,530,400,20);
       choices9_a.setBounds(1050,550,150,20);
       choices9_b.setBounds(1050,570,150,20);
       choices9_c.setBounds(1200,550,200,20);
       choices9_d.setBounds(1200,570,200,20);
       test3_q10.setBounds(1050,600,400,20);
       choices10_a.setBounds(1050,620,150,20);
       choices10_b.setBounds(1050,640,150,20);
       choices10_c.setBounds(1200,620,200,20);
       choices10_d.setBounds(1200,640,200,20);
       compute2.setBounds(1050,660,100,20);
       thirdscore.setBounds(1200,660,60,20);
       thirdresult.setBounds(1270,660,100,20);
       
       compute.addActionListener(this);
       onclick.addActionListener(this);
       substring.addActionListener(this);
       len.addActionListener(this);
       val.addActionListener(this);
       text.addActionListener(this);
       mouseover.addActionListener(this);
       cursor.addActionListener(this);
       visible.addActionListener(this);
       keypress.addActionListener(this);
       enabled.addActionListener(this);
       doubleclick.addActionListener(this);
       width.addActionListener(this);
       tolower.addActionListener(this);
       equals.addActionListener(this);
       str.addActionListener(this);
       compute2.addActionListener(this);
       
    }
    
    int score2 = 0;
    
    public void actionPerformed(ActionEvent ae){
        int score= 0;
        int score3 = 0;

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
        
         if (ae.getSource() == compute){
             if(ans1.equals("CHARLES BABBAGE")){
                 score+=1;
             }if(ans2.equals("BILL GATE")){
                 score+=1;  
             }if(ans3.equals("BLAISE PASCAL")){
                 score+=1;
             }if(ans4.equals("WILLIAM HOLLERITH")){
                 score+=1;
             }if(ans5.equals("WILLIAM OUGHTRED")){
                 score+=1;
             }if(ans6.equals("APPLE COMPUTER")){
                 score+=1;
             }if(ans7.equals("SUPER COMPUTER")){
                 score+=1;
             }if(ans8.equals("ABACUS")){
                 score+=1;
             }if(ans9.equals("HARDWARE")){
                 score+=1;
             }if(ans10.equals("PROGRAM")){
                 score+=1;
             }if(ans11.equals("MANILA")){
                 score+=1;
             }if(ans12.equals("TOKYO")){
                 score+=1;
             }if(ans13.equals("SEOUL")){
                 score+=1;
             }if(ans14.equals("OTTAWA")){
                 score+=1;
             }if(ans15.equals("BANGKOK")){
                 score+=1;
             }
             firstresult.setText("    " + score);
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
         if(ae.getSource() == compute2){
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
         
    }
    
}

  