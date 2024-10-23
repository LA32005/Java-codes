/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listbox;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;    
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.List;

public class NewApplet extends Applet implements ActionListener {

    CheckboxGroup cg = new CheckboxGroup();
    Checkbox c1 = new Checkbox("Apple",cg,true);
    Checkbox c2 = new Checkbox("Banana",cg,false);
    Checkbox c3 = new Checkbox("Grapes",cg,false);
    
    Button setLabel = new Button("setLabel()");
    Button getLabel = new Button("getLabel()");
    Button setState = new Button("setState()");
    Button getState = new Button("getState()");
    Button getselecteditem = new Button("getSelectedItem()");
    Button getselectedindex = new Button("getSelectedIndex()");
    Button additem = new Button("AddItem()");
    
    Choice choices = new Choice();
    List list1 = new List();
    List list2 = new List();
    Label answer = new Label("Answer:");
    Label addlist = new Label("Add item:");
    TextField tfield = new TextField(10);
    
    public void init() {
        setLayout(null);
        add(c1);
        add(c2);
        add(c3);
        add(setLabel);
        add(getLabel);
        add(setState);
        add(getState);
        add(getselecteditem);
        add(getselectedindex);
        add(additem);
        add(choices);
        add(list1);
        add(list2);
        choices.add("Checkbox 1");
        choices.add("Checkbox 2");
        choices.add("Checkbox 3");
        choices.add("Listbox 1");
        choices.add("Listbox 2");
        add(answer);
        add(addlist);
        add(tfield);
        
        c1.setBounds(10,10,100,20);//checkbox
        c2.setBounds(110,10,100,20);
        c3.setBounds(220,10,60,20);
        
        setLabel.setBounds(500,50,100,20);//button
        getLabel.setBounds(500,80,100,20);
        setState.setBounds(500,110,100,20);
        getState.setBounds(500,140,100,20);
        getselecteditem.setBounds(500,170,100,20);
        getselectedindex.setBounds(500,200,100,20);
        additem.setBounds(500,230,100,20);
        
        choices.setBounds(10,50,100,20);//choice
        
        list1.setBounds(10,80,150,50);
        list2.setBounds(180,80,150,50);
        answer.setBounds(10,250,100,20);
        addlist.setBounds(10,270,100,20);
        tfield.setBounds(110,270,100,20);
        
        setLabel.addActionListener(this);
        getLabel.addActionListener(this);
        setState.addActionListener(this);
        getState.addActionListener(this);
        getselecteditem.addActionListener(this);
        getselectedindex.addActionListener(this);
        additem.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == setLabel){
            if(choices.getSelectedItem().equals("Checkbox 1")){
                c1.setLabel(tfield.getText());
            }
            if(choices.getSelectedItem().equals("Checkbox 2")){
                c2.setLabel(tfield.getText());
            }
            if(choices.getSelectedItem().equals("Checkbox 3")){
                c3.setLabel(tfield.getText());
            }
        }
        if(ae.getSource() == getLabel){
            if(choices.getSelectedItem().equals("Checkbox 1")){
                answer.setText("Answer: " + c1.getLabel());
            }
            if(choices.getSelectedItem().equals("Checkbox 2")){
                answer.setText("Answer: " + c2.getLabel());
            }
            if(choices.getSelectedItem().equals("Checkbox 3")){
                answer.setText("Answer: " + c3.getLabel());
            }
        }
        if(ae.getSource() == setState){
            if(choices.getSelectedItem().equals("Checkbox 1")){
                c1.setState(true);
            }
            if(choices.getSelectedItem().equals("Checkbox 2")){
                c2.setState(true);
            }
            if(choices.getSelectedItem().equals("Checkbox 3")){
                c3.setState(true);
            }
        }
        if(ae.getSource() == getState){
            if(choices.getSelectedItem().equals("Checkbox 1")){
                answer.setText("Answer: " + Boolean.toString(c1.getState()));
            }
            if(choices.getSelectedItem().equals("Checkbox 2")){
                answer.setText("Answer: " + Boolean.toString(c2.getState()));
            }
            if(choices.getSelectedItem().equals("Checkbox 3")){
                answer.setText("Answer: " + Boolean.toString(c3.getState()));
            }
        }
        if(ae.getSource() == additem){
            if(choices.getSelectedItem().equals("Listbox 1")){
                list1.add(tfield.getText());
            }
            else if(choices.getSelectedItem().equals("Listbox 2")){
                list2.add(tfield.getText());
            } 
        }
        if(ae.getSource() == getselecteditem){
            if(choices.getSelectedItem().equals("Listbox 1")){
                answer.setText("Answer: " + list1.getSelectedItem());
            }
            if(choices.getSelectedItem().equals("Listbox 2")){
                answer.setText("Answer: " + list2.getSelectedItem());
            }
        }
        if(ae.getSource() == getselectedindex){
            if(choices.getSelectedItem().equals("Listbox 1")){
                answer.setText("Answer: " + list1.getSelectedIndex());
            }
            if(choices.getSelectedItem().equals("Listbox 2")){
                answer.setText("Answer: " + list2.getSelectedIndex());
            }
        }
        
    }

}
