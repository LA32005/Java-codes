/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.system;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class NewApplet extends Applet implements ActionListener {
    double rp,hw,regp,ot,gp,np,tax;
    Label ename = new Label("Employee Name: ");
    Label prate = new Label("Enter Pay Rate: ");
    Label nhour = new Label("Enter No. of Hours worked: ");
    Label ecode = new Label("Employee Code");
    Label scode = new Label("Enter State Code");
    
    TextField name = new TextField(10);
    TextField pr = new TextField(10);
    TextField nh = new TextField(10);
    
    CheckboxGroup cg1 = new CheckboxGroup();
    Checkbox c1 = new Checkbox("A",cg1,false);
    Checkbox c2 = new Checkbox("B",cg1,false);
    
    CheckboxGroup cg2 = new CheckboxGroup();
    Checkbox c3 = new Checkbox("N",cg2,false);
    Checkbox c4 = new Checkbox("P",cg2,false);
    
    Button com = new Button("COMPUTE");
    
    Label pen = new Label("Employee Name: ");
    Label prp = new Label("Regular pay: ");
    Label pot = new Label("Overtime pay: ");
    Label pt = new Label("Tax: ");
    Label pgp = new Label("Gross Pay: ");
    Label pnp = new Label("Net Pay: ");

   
    public void init() {
        setLayout(null);
        add(ename);
        ename.setBounds(5,5,100,20);
        add(name);
        name.setBounds(120,5,150,20);
        add(prate);
        prate.setBounds(5,30,100,20);
        add(pr);
        pr.setBounds(120,30,150,20);
        add(nhour);
        nhour.setBounds(5,55,160,20);
        add(nh);
        nh.setBounds(170,55,100,20);
        add(ecode);
        ecode.setBounds(5,80,100,20);
        add(c1);
        c1.setBounds(120,80,50,20);
        add(c2);
        c2.setBounds(175,80,50,20);
        add(scode);
        scode.setBounds(5,105,100,20);
        add(c3);
        c3.setBounds(120,105,50,20);
        add(c4);
        c4.setBounds(175,105,50,20);
        add(com);
        com.setBounds(25,140,75,20);
        
        add(pen);
        pen.setBounds(5,220,250,20);
        add(prp);
        prp.setBounds(5,245,150,20);
        add(pot);
        pot.setBounds(5,270,150,20);
        add(pt);
        pt.setBounds(5,295,150,20);
        add(pgp);
        pgp.setBounds(5,320,150,20);
        add(pnp);
        pnp.setBounds(5,345,150,20);
        com.addActionListener(this);
 
    }
        
    public void actionPerformed (ActionEvent e){
        e.getSource();
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
        gp = regp+ot;
        if (c1.getState() == true && c2.getState() == false && c3.getState() == true && c4.getState() == false) tax = gp*0.07;
        if (c1.getState() == true && c2.getState() == false && c3.getState() == false && c4.getState() == true) tax = gp*(4.5/100);
        if (c2.getState() == true) tax = 0;
        np = gp - tax;
        pen.setText("Employee Name: " + name.getText());
        prp.setText("Regular Pay: " + regp);
        pot.setText("OverTime Pay: " + ot);
        pt.setText("Tax: " + tax);
        pgp.setText("Gross Pay: " + gp);
        pnp.setText("Net Pay: " + np);

        }
    }

