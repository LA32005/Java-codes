/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listbox.and.choice;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.Choice;
import java.awt.List;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;


/**
 *
 * @author louis
 */
public class NewApplet extends Applet implements ActionListener{
    
   Label q1 = new Label("What is your favorite color?");
   Label q2 = new Label("What is your favorite subject?");
   Label q3 = new Label("Who is your celebrity crush?");
   Label q4 = new Label("What is the 3 primary colors?");
   Label q5 = new Label("What is the capital of japan?");
   Label q6 = new Label("Give me your top 3 favorite food");
   Label ans1 = new Label("Answer: ");
   Label ans2 = new Label("Answer: ");
   Label ans3 = new Label("Answer: ");
   Label score1 = new Label("Score: ");
   Label score2 = new Label("Score: ");
   Label ans4 = new Label("Answer: ");
   Label ai = new Label("Add Item: ");
   TextField tai = new TextField(10);
   
   Choice choices = new Choice();
   List list1 = new List();
   List list2 = new List();
   Checkbox red = new Checkbox("Red");
   Checkbox blue = new Checkbox("Blue");
   Checkbox yellow = new Checkbox("Yellow");
   Checkbox green = new Checkbox("Green");
   Checkbox orange = new Checkbox("Orange");
   
   CheckboxGroup japan = new CheckboxGroup();
   Checkbox seoul = new Checkbox("Seoul",japan,false);
   Checkbox china = new Checkbox("Beijing",japan,false);
   Checkbox tokyo = new Checkbox("Tokyo",japan,false);
   
   CheckboxGroup food = new CheckboxGroup();
   Checkbox f1 = new Checkbox("Adobo",food,false);
   Checkbox f2 = new Checkbox("Sinigang",food,false);
   Checkbox f3 = new Checkbox("Fried Chicken",food,false);
   
   Button setLabel = new Button("setLabel()");
   Button getLabel = new Button("getLabel()");
   Button setState = new Button("setState()");
   Button getState = new Button("getState()");
   Button additem = new Button("add Item");
   Button getselecteditem = new Button("getSelectedItem()");
   Button getselectedindex = new Button("getSelectedIndex()");
   Button submit1 = new Button("Submit");
   Button submit2 = new Button("Submit");
   Button submit3 = new Button("Submit");
   Button submit4 = new Button("Submit");
   Button submit5 = new Button("Submit");
   
   Choice choices2 = new Choice();
   @Override
    public void init() {
        setLayout(null);
        add(q1);
        add(q2);
        add(q3);
        add(q4);
        add(q5);
        add(q6);
        add(choices);
        add(list1);
        add(list2);
        choices.add("Red");
        choices.add("yellow");
        choices.add("Green");
        choices.add("Blue");
        choices.add("Pink");
        add(red);
        add(blue);
        add(yellow);
        add(green);
        add(orange);
        add(seoul);
        add(tokyo);
        add(china);
        add(f1);
        add(f2);
        add(f3);
        add(ans1);
        add(ans2);
        add(ans3);
        add(ans4);
        add(score1);
        add(score2);
        add(submit1);
        add(submit2);
        add(submit3);
        add(submit4);
        add(submit5);
        add(ai);
        add(tai);
        add(setLabel);
        add(getLabel);
        add(setState);
        add(getState);
        add(additem);
        add(getselecteditem);
        add(getselectedindex);
        add(choices2);
        choices2.add("checkbox 1");
        choices2.add("checkbox 2");
        choices2.add("checkbox 3");
        choices2.add("List 1");
        choices2.add("List 2");
        list1.add("Math");
        list1.add("English");
        list1.add("filipino");
        list1.add("A.P");
        list1.add("Science");
        
        list2.add("Han sohee");
        list2.add("Bae suzy");
        list2.add("Ha jiwon");
        list2.add("Eun yhe");
        list2.add("IU");
        
        q1.setBounds(20,10,200,30);
        choices.setBounds(50,40,100,30);
        ans1.setBounds(50,150,100,30);
        submit1.setBounds(50,190,100,20);
        q2.setBounds(250,10,200,30);
        list1.setBounds(250,40,150,100);
        ans2.setBounds(250,150,100,30);
        submit2.setBounds(250,190,100,20);
        q3.setBounds(500,10,200,30);
        list2.setBounds(500,40,150,100);
        ans3.setBounds(500,150,100,30);
        submit3.setBounds(500,190,100,20);
        q4.setBounds(750,10,200,30);
        red.setBounds(750,40,60,20);
        blue.setBounds(810,40,60,20);
        yellow.setBounds(870,40,60,20);
        green.setBounds(750,70,60,30);
        orange.setBounds(820,70,60,30);
        score1.setBounds(750,150,100,30);
        submit4.setBounds(750,190,100,20);
        q5.setBounds(1000,10,200,20);
        tokyo.setBounds(1000,30,80,20);
        china.setBounds(1000,60,80,20);
        seoul.setBounds(1000,90,80,20);
        score2.setBounds(1000,150,100,30);
        submit5.setBounds(1000,190,100,20);
        q6.setBounds(1230,10,200,20);
        f1.setBounds(1230,30,200,20);
        f2.setBounds(1230,60,200,20);
        f3.setBounds(1230,90,200,20);
        ans4.setBounds(1230,150,200,30);
        setLabel.setBounds(1460,10,100,20);
        getLabel.setBounds(1460,40,100,20);
        setState.setBounds(1460,70,100,20);
        getState.setBounds(1460,100,100,20);
        additem.setBounds(1460,130,100,20);
        getselecteditem.setBounds(1460,160,100,20);
        getselectedindex.setBounds(1460,190,100,20);
        choices2.setBounds(1650,10,100,20);
        ai.setBounds(1650,50,60,20);
        tai.setBounds(1720,50,100,20);
        
        setLabel.addActionListener(this);
        getLabel.addActionListener(this);
        setState.addActionListener(this);
        getState.addActionListener(this);
        additem.addActionListener(this);
        getselecteditem.addActionListener(this);
        getselectedindex.addActionListener(this);
        submit1.addActionListener(this);
        submit2.addActionListener(this);
        submit3.addActionListener(this);
        submit4.addActionListener(this);
        submit5.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit1){           
            ans1.setText("Answer: " + choices.getSelectedItem());   
        }
        if(ae.getSource() == submit2){           
            ans2.setText("Answer: " + list1.getSelectedItem());   
        }
        if(ae.getSource() == submit3){           
            ans3.setText("Answer: " + list2.getSelectedItem());   
        }
        if(ae.getSource() == submit4){     
            int sc1 = 0;
            if(red.getState()==true && yellow.getState()==true && blue.getState()==true && green.getState()==false && orange.getState()==false) {
                sc1+=3;
                score1.setText("Score: " + sc1);
            }
            else{
                sc1+=0;
                score1.setText("Score: " + sc1);
            }
        }
        if(ae.getSource() == submit5){  
            int sc2 = 0;
            if(tokyo.getState() == true){
                sc2+=1;
                score2.setText("Score: " + sc2);
            }
            else{
                sc2+=0;
                score2.setText("Score: " + sc2);
            }
        }
        if(ae.getSource() == setLabel){  
            if(choices2.getSelectedItem().equals("checkbox 1")){
                f1.setLabel(tai.getText());
            }
            if(choices2.getSelectedItem().equals("checkbox 2")){
                f2.setLabel(tai.getText());
            }
            if(choices2.getSelectedItem().equals("checkbox 3")){
                f3.setLabel(tai.getText());
            }
        }
        if(ae.getSource() == getLabel){  
            if(choices2.getSelectedItem().equals("checkbox 1")){
                ans4.setText("Answer: " + f1.getLabel());
            }
            if(choices2.getSelectedItem().equals("checkbox 2")){
                ans4.setText("Answer: " + f2.getLabel());
            }
            if(choices2.getSelectedItem().equals("checkbox 3")){
                ans4.setText("Answer: " + f3.getLabel());
            }
        }
        if(ae.getSource() == setState){ 
            if(choices2.getSelectedItem().equals("checkbox 1")){
                f1.setState(true); 
            }
            if(choices2.getSelectedItem().equals("checkbox 2")){
                f2.setState(true); 
            }
            if(choices2.getSelectedItem().equals("checkbox 3")){
                f3.setState(true); 
            }
        } 
        if(ae.getSource() == getState){ 
            if(choices2.getSelectedItem().equals("checkbox 1")){
                ans4.setText("Answer: " + Boolean.toString(f1.getState()));
            }
            if(choices2.getSelectedItem().equals("checkbox 2")){
                ans4.setText("Answer: " + Boolean.toString(f2.getState())); 
            }
            if(choices2.getSelectedItem().equals("checkbox 3")){
                ans4.setText("Answer: " + Boolean.toString(f3.getState()));
            }
        } 
        if(ae.getSource() == additem){ 
            if(choices2.getSelectedItem().equals("List 1")){
                list1.add(tai.getText());
            }
            if(choices2.getSelectedItem().equals("List 2")){
                list2.add(tai.getText());
            }
        }
        if(ae.getSource() == getselecteditem){
            if(choices2.getSelectedItem().equals("List 1")){
                ans4.setText("Answer: " + list1.getSelectedItem());
            }
            if(choices2.getSelectedItem().equals("List 2")){
                ans4.setText("Answer: " + list2.getSelectedItem());
            }
        } 
        if(ae.getSource() == getselectedindex){
            if(choices2.getSelectedItem().equals("List 1")){
                ans4.setText("Answer: " + list1.getSelectedIndex());
            }
            if(choices2.getSelectedItem().equals("List 2")){
                ans4.setText("Answer: " + list2.getSelectedIndex());
            }
        } 
    }
}
