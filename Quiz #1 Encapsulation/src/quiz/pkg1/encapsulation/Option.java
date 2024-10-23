/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg1.encapsulation;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class Option {
    Scanner input = new Scanner(System.in);
    int choice;
    public void start(){
        GradingSystem first_call = new GradingSystem();
        PayrollSystem second_call = new PayrollSystem();
        System.out.print("[1]Grading System\n[2]Payroll System\nSelect number [1-2]: ");
        choice = input.nextInt();
        if (choice == 1){
            first_call.GradingSystem();
        }
        if(choice ==  2){
            second_call.PayrollSystem();
        }
        start();
        
    }
        
    
}
