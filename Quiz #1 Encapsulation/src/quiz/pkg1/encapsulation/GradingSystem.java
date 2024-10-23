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
public class GradingSystem {
    Scanner input = new Scanner(System.in);
    ArrayList <GradeResult> Student_data = new ArrayList<>();
    
    public void GradingSystem(){
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
            String again1 = input.next();
            if(!again1.equalsIgnoreCase("y")){
                break;
            }
        }
    }

    public void Addrecord(){
         System.out.print("Name: ");
         input.nextLine();// Consume the newline character
         String name = input.nextLine();
         System.out.println("PRELIM");
         System.out.print("Enter Quiz 1:");
         int pq1 = input.nextInt();
         System.out.print("Enter Quiz 2:");
         int pq2 = input.nextInt();
         System.out.print("Enter Assignment:");
         int pass = input.nextInt();
         System.out.print("Enter Attendace:");
         int patt = input.nextInt();
         System.out.print("Enter Project:");
         int pproj = input.nextInt();
         System.out.print("Enter Seatwork:");
         int psw = input.nextInt();
         System.out.print("Enter Major Exam:");
         int pe = input.nextInt();
         // computation
         double pqp = ((pq1 + pq2)/2)*0.4;
         double pcs = ((pass + patt + pproj + psw)/4)*0.10;
         double pme = pe*0.5;
         double pg = pqp + pcs + pme;
         
         System.out.println("MIDTERM");
         System.out.print("Enter Quiz 1:");
         int mq1 = input.nextInt();
         System.out.print("Enter Quiz 2:");
         int mq2 = input.nextInt();
         System.out.print("Enter Assignment:");
         int mass = input.nextInt();
         System.out.print("Enter Attendace:");
         int matt = input.nextInt();
         System.out.print("Enter Project:");
         int mproj = input.nextInt();
         System.out.print("Enter Seatwork:");
         int msw= input.nextInt();
         System.out.print("Enter Major Exam:");
         int me = input.nextInt();
         // computation
         double mqp = ((mq1 + mq2)/2)*0.4;
         double mcs = ((mass + matt + mproj + msw)/4)*0.10;
         double mme = pe*0.5;
         double mg = mqp + mcs + mme;
         
         System.out.println("FINALS");
         System.out.print("Enter Quiz 1:");
         int fq1 = input.nextInt();
         System.out.print("Enter Quiz 2:");
         int fq2 = input.nextInt();
         System.out.print("Enter Assignment:");
         int fass = input.nextInt();
         System.out.print("Enter Attendace:");
         int fatt = input.nextInt();
         System.out.print("Enter Project:");
         int fproj = input.nextInt();
         System.out.print("Enter Seatwork:");
         int fsw= input.nextInt();
         System.out.print("Enter Major Exam:");
         int fe = input.nextInt();
         // computation
         double fqp = ((fq1 + fq2)/2)*0.4;
         double fcs = ((fass + fatt + fproj + fsw)/4)*0.10;
         double fme = pe*0.5;
         double fg = fqp + fcs + fme;
         //computation
         double tg = (pg * 0.3) + (mg * 0.3) + (fg * 0.4);
         
        GradeResult add_items = new GradeResult();
        add_items.setStudentName(name);
        add_items.setPrelimGrade(pg);
        add_items.setMidtermGrade(mg);
        add_items.setFinalGrade(fg);
        add_items.setTotalGrade(tg);
        Student_data.add(add_items);
         
    }

        public void Viewrecord(){
        for(int i = 0; i<Student_data.size(); i++){
            System.out.println("Student Name: " + Student_data.get(i).getStudentName() + "\nPrelim Grade: " + Student_data.get(i).getPrelimGrade() + "\nMidterm Grade:" + Student_data.get(i).getMidtermGrade() + "\nFinal Grade:" + Student_data.get(i).getFinalGrade() + "\nTotal Grade: " + Student_data.get(i).getTotalGrade() + "\n");
        }
    }
        
        public void Updaterecord(){
        System.out.print("Enter Student name you want to update: ");
        input.nextLine();  // Consume the newline character
        String update_name= input.nextLine();
        for(int i = 0; i<Student_data.size(); i++){
            if(Student_data.get(i).getStudentName().equalsIgnoreCase(update_name)){
                System.out.print("Name: ");
                String updated_name = input.nextLine();
                System.out.println("PRELIM");
                System.out.print("Enter Quiz 1:");
                int updated_pq1 = input.nextInt();
                System.out.print("Enter Quiz 2:");
                int updated_pq2 = input.nextInt();
                System.out.print("Enter Assignment:");
                int updated_pass = input.nextInt();
                System.out.print("Enter Attendace:");
                int updated_patt = input.nextInt();
                System.out.print("Enter Project:");
                int updated_pproj = input.nextInt();
                System.out.print("Enter Seatwork:");
                int updated_psw = input.nextInt();
                System.out.print("Enter Major Exam:");
                int updated_pe = input.nextInt();
                // computation
                double updated_pqp = ((updated_pq1 + updated_pq2)/2)*0.4;
                double updated_pcs = ((updated_pass + updated_patt + updated_pproj + updated_psw)/4)*0.10;
                double updated_pme = updated_pe*0.5;
                double updated_pg = updated_pqp + updated_pcs + updated_pme;

                System.out.println("MIDTERM");
                System.out.print("Enter Quiz 1:");
                int updated_mq1 = input.nextInt();
                System.out.print("Enter Quiz 2:");
                int updated_mq2 = input.nextInt();
                System.out.print("Enter Assignment:");
                int updated_mass = input.nextInt();
                System.out.print("Enter Attendace:");
                int updated_matt = input.nextInt();
                System.out.print("Enter Project:");
                int updated_mproj = input.nextInt();
                System.out.print("Enter Seatwork:");
                int updated_msw= input.nextInt();
                System.out.print("Enter Major Exam:");
                int updated_me = input.nextInt();
                // computation
                double updated_mqp = ((updated_mq1 + updated_mq2)/2)*0.4;
                double updated_mcs = ((updated_mass + updated_matt + updated_mproj + updated_msw)/4)*0.10;
                double updated_mme = updated_pe*0.5;
                double updated_mg = updated_mqp + updated_mcs + updated_mme;

                System.out.println("FINALS");
                System.out.print("Enter Quiz 1:");
                int updated_fq1 = input.nextInt();
                System.out.print("Enter Quiz 2:");
                int updated_fq2 = input.nextInt();
                System.out.print("Enter Assignment:");
                int updated_fass = input.nextInt();
                System.out.print("Enter Attendace:");
                int updated_fatt = input.nextInt();
                System.out.print("Enter Project:");
                int updated_fproj = input.nextInt();
                System.out.print("Enter Seatwork:");
                int updated_fsw= input.nextInt();
                System.out.print("Enter Major Exam:");
                int updated_fe = input.nextInt();
                // computation
                double updated_fqp = ((updated_fq1 + updated_fq2)/2)*0.4;
                double updated_fcs = ((updated_fass + updated_fatt + updated_fproj + updated_fsw)/4)*0.10;
                double updated_fme = updated_pe*0.5;
                double updated_fg = updated_fqp + updated_fcs + updated_fme;
                //computation
                double updated_tg = (updated_pg * 0.3) + (updated_mg * 0.3) + (updated_fg * 0.4);
                Student_data.get(i).setStudentName(updated_name);
                Student_data.get(i).setPrelimGrade(updated_pg) ;
                Student_data.get(i).setMidtermGrade(updated_mg) ;
                Student_data.get(i).setFinalGrade(updated_fg) ;
                Student_data.get(i).setTotalGrade(updated_tg) ;
                }
            }
        }
        
        public void Deleterecord(){
        System.out.print("Enter Name you want to  delete: ");
        input.nextLine();// Consume the newline character
        String del_name= input.nextLine();
        for(int i = 0; i<Student_data.size(); i++){
            if(Student_data.get(i).getStudentName().equalsIgnoreCase(del_name)){
                Student_data.remove(i);
            }
        }
    }
        
        public void Searchrecord(){
        System.out.print("Enter name you want  to search: ");
        input.nextLine();
        String find = input.nextLine();
        for(int i = 0; i<Student_data.size(); i++){
            if(Student_data.get(i).getStudentName().equalsIgnoreCase(find)){
             System.out.println("Name: " + Student_data.get(i).getStudentName() + "\nPrelim Grade: " + Student_data.get(i).getPrelimGrade() + "\nMidterm Grade:" + Student_data.get(i).getMidtermGrade() + "\nFinal Grade:" + Student_data.get(i).getFinalGrade() + "\nTotal Grade: " + Student_data.get(i).getTotalGrade() + "\n");
            }
            else{
                System.out.println("Employee's not found");
            }
        }
    }


}

