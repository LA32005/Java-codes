/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg1.encapsulation;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author louis
 */
public class PayrollSystem {
    Scanner input = new Scanner(System.in);
    ArrayList<PayrollResult> Employees_data = new ArrayList<>();
    
    public void PayrollSystem(){
        while(true){
        System.out.println("\n[1]Add Record\n[2]View Record\n[3]Update Record\n[4]Delete Records\n[5]Search Record\n");
        System.out.print("Enter [1-5]: ");
        int subchoice = input.nextInt();
        switch (subchoice){
            case 1:
               Addrecord();
            break;
            case 2:
              Viewrecord();
            break;
            case 3:
                Updaterecord();
            break;
            case 4:
                Deleterecord();
            break;
            case 5:
                Searchrecord();
            break;
            
            default:
                System.out.println("Invalid Input");      
        }
        System.out.print("Do you want to continue [y/n]?");
        String again2 = input.next();
        if(!again2.equalsIgnoreCase("y")){
            break;
        }
    }
}
    
    public void Addrecord(){
        System.out.print("Enter Employee's name: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.print("Enter Rate per day: ");
        int rpd = input.nextInt();
        System.out.print("Enter no. of days present: ");
        int ndp = input.nextInt();
        System.out.print("Enter Employee's code[A/B]: ");
        String ec = input.next();
        System.out.print("Enter state code[N/P]: ");
        String sc = input.next();
        //computation
        double rp;
        double ot;
        double gp;
        double tax;
        double np;
        if(ndp > 40){
            rp = rpd * 40;
            ot =  (rp * .50);
        }
        else{
            rp = rpd * ndp;
            ot = (rp * .25);
        }
            gp = rp + ot;
            
        if(ec.equalsIgnoreCase("a") && sc.equalsIgnoreCase("n")){
            tax = gp * .10;
        }
        else if(ec.equalsIgnoreCase("a") && sc.equalsIgnoreCase("p")){
            tax = gp * 0.5;
        }
        else{
            tax = 0;
        }
        np = gp - tax;
        
        PayrollResult add_items = new PayrollResult();
        add_items.setEmployeeName(name);
        add_items.setGrosspay(gp);
        add_items.set_tax(tax);
        add_items.setOvertime(ot);
        add_items.setNetpay(np);
        Employees_data.add(add_items);
    
    } 
    
    public void Viewrecord(){
        for(int i = 0; i<Employees_data.size(); i++){
            System.out.println("Employee's Name: " + Employees_data.get(i).getEmployeeName() + "\nGrosspay: " + Employees_data.get(i).getGrosspay() + "\nTax:" + Employees_data.get(i).get_tax() + "\nOvertime:" + Employees_data.get(i).getOvertime()+ "\nNetpay: " + Employees_data.get(i).getNetpay() + "\n");
        }
    }
    
    public void Updaterecord(){
        System.out.print("Enter Employees name you want to update: ");
        input.nextLine();  // Consume the newline character
        String update_name= input.nextLine();
        for(int i = 0; i<Employees_data.size(); i++){
            if(Employees_data.get(i).getEmployeeName().equalsIgnoreCase(update_name)){
                System.out.print("Enter Employee's name: ");
                String updated_name = input.nextLine();
                System.out.print("Enter Rate per day: ");
                int updated_rpd = input.nextInt();
                System.out.print("Enter no. of days present: ");
                int updated_ndp = input.nextInt();
                System.out.print("Enter Employee's code[A/B]: ");
                input.nextLine();
                String updated_ec = input.next();
                System.out.print("Enter state code[N/P]: ");
                input.nextLine();
                String updated_sc = input.next();
                //computation
                double updated_rp;
                double updated_ot;
                double updated_gp;
                double updated_tax;
                double updated_np;
                if(updated_ndp > 40){
                    updated_rp = updated_rpd * 40;
                    updated_ot = 0;
                }
                else{
                    updated_rp = updated_rpd * updated_ndp;
                    updated_ot = updated_rp + (updated_rp * .25);
                }
                    updated_gp = updated_rp + updated_ot;

                if(updated_ec.equalsIgnoreCase("a") && updated_sc.equalsIgnoreCase("n")){
                    updated_tax = updated_gp * .10;
                }
                else if(updated_ec.equalsIgnoreCase("a") && updated_sc.equalsIgnoreCase("p")){
                    updated_tax = updated_gp * 0.5;
                }
                else{
                    updated_tax = 0;
                }
                updated_np = updated_gp - updated_tax;
                 Employees_data.get(i).setEmployeeName(updated_name);
                 Employees_data.get(i).setGrosspay(updated_gp) ;
                 Employees_data.get(i).set_tax(updated_tax) ;
                 Employees_data.get(i).setOvertime(updated_ot) ;
                 Employees_data.get(i).setNetpay(updated_np) ;

            }
           }
        }
    
    public void Deleterecord(){
        System.out.print("Enter Name you want to  delete: ");
        input.nextLine();// Consume the newline character
        String del_name= input.nextLine();
        for(int i = 0; i<Employees_data.size(); i++){
            if(Employees_data.get(i).getEmployeeName().equalsIgnoreCase(del_name)){
                Employees_data.remove(i);
            }
        }
    }
    
      public void Searchrecord(){
        System.out.print("Enter name you want  to search: ");
        input.nextLine();
        String find = input.nextLine();
        for(int i = 0; i<Employees_data.size(); i++){
            if(Employees_data.get(i).getEmployeeName().equalsIgnoreCase(find)){
              System.out.println("Employee's Name: " + Employees_data.get(i).getEmployeeName() + "\nGrosspay: " + Employees_data.get(i).getGrosspay() + "\nTax:" + Employees_data.get(i).get_tax() + "\nOvertime:" + Employees_data.get(i).getOvertime()+ "\nNetpay: " + Employees_data.get(i).getNetpay() + "\n");
            }
            else{
                System.out.println("Employee's not found");
            }
        }
    }
    
}
