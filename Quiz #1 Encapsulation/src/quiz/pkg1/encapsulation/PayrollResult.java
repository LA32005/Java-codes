/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg1.encapsulation;

/**
 *
 * @author louis
 */
public class PayrollResult {
     String Employeename;
    double grosspay;
    double Tax;
    double Overtime;
    double Netpay;
    
    //setting the value
    public void setEmployeeName(String name){
        Employeename = name;
    }
    public void setGrosspay(double gp){
        grosspay = gp;
    }
    public void set_tax(double tax){
        Tax = tax;
    }
    public void setOvertime(double ot){
        Overtime = ot;
    }
    public void setNetpay(double np){
        Netpay = np;
    }
    //getting the value
    public String getEmployeeName(){
        return Employeename;
    }
    public double getGrosspay(){
        return grosspay ;
    }
    public double get_tax(){
        return Tax;
    }
    public double getOvertime(){
        return Overtime;
    }
    public double getNetpay(){
        return Netpay;
    }
}
