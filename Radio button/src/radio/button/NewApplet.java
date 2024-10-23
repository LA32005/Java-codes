/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio.button;
import java.awt.*;
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.*;


public class NewApplet extends Applet implements ActionListener{
    Label name = new Label("Employee name:");
    TextField fname= new TextField(10);
    Label payrate = new Label("Enter Payrate:");
    TextField fpayrate= new TextField(10);
    Label nhw = new Label("Enter No. hours worked:");
    TextField fnhw= new TextField(10);
    Label e_code = new Label("Employee code:");
    CheckboxGroup employee_code = new CheckboxGroup();
    Checkbox a = new Checkbox("A",employee_code,false);
    Checkbox b = new Checkbox("B",employee_code,false);
    Label statecode = new Label("Enter state code:");
    CheckboxGroup state_code = new CheckboxGroup();
    Checkbox n = new Checkbox("N",state_code,false);
    Checkbox p = new Checkbox("P",state_code,false);
    
    Button calculate = new Button("Calculate");
    
    Label rname = new Label("Employee Name:");
    Label regular = new Label("Regular Pay:");
    Label overtime = new Label("Overtime Pay:");
    Label tax = new Label("Tax:");
    Label gross = new Label("Gross pay:");
    Label net = new Label("Employee Name:");
    
    public void init() {
        setLayout(null);
        add(name);
        add(fname);
        add(payrate);
        add(fpayrate);
        add(nhw);
        add(fnhw);
        add(e_code);
        add(a);
        add(b);
        add(statecode);
        add(n);
        add(p);
        add(rname);
        add(regular);
        add(overtime);
        add(tax);
        add(gross);
        add(net);
        add(calculate);
        
        name.setBounds(10,20,100,20);
        fname.setBounds(110,20,150,20);
        payrate.setBounds(10,50,100,20);
        fpayrate.setBounds(110,50,150,20);
        nhw.setBounds(10,80,150,20);
        fnhw.setBounds(160,80,150,20);
        e_code.setBounds(10,110,100,20);
        a.setBounds(110,110,50,20);
        b.setBounds(160,110,50,20);
        statecode.setBounds(10,140,100,20);
        n.setBounds(110,140,50,20);
        p.setBounds(170,140,50,20);
        calculate.setBounds(10,170,50,20);
        calculate.addActionListener(this);
        
        rname.setBounds(10,200,500,20);
        regular.setBounds(10,230,500,20);
        overtime.setBounds(10,260,500,20);
        tax.setBounds(10,290,500,20);
        gross.setBounds(10,320,500,20);
        net.setBounds(10,350,500,20);
        
    }
    
        double regularpay;
        double ot;
        double grosspay;
        double netpay;
        double total_tax;
    public void actionPerformed(ActionEvent ae){
        String employee_name = fname.getText();
        double pr = Double.parseDouble(fpayrate.getText());
        double hoursworked = Double.parseDouble(fnhw.getText());
        
        if(ae.getSource() == calculate){
            if(hoursworked <= 40){
                regularpay = pr * hoursworked;
                ot = 0;
            }
            else if(hoursworked > 40){
                regularpay = pr * 40;
                ot = 1.5 * pr * (hoursworked - 40);
            }
            grosspay = regularpay + ot;
      
            if(a.getState() == true && n.getState() == true && b.getState() == false && p.getState() ==false){
                total_tax = grosspay * (0.07);
            }
            else if(a.getState() == true && p.getState() == true && b.getState() == false && n.getState() ==false){
                total_tax = grosspay * (0.045);
            }
            else if(b.getState() == true){
                total_tax = 0;
            }
            
            netpay = grosspay - total_tax;
            
            rname.setText("Employee Name: " + employee_name);
            regular.setText("Regular Pay: " + regularpay);
            overtime.setText("Overtime Pay: " + ot);
            tax.setText("Tax: " + total_tax);
            gross.setText("Gross Pay: " + grosspay);
            net.setText("Netpay: " + netpay);
            
        }
        
    }
}
