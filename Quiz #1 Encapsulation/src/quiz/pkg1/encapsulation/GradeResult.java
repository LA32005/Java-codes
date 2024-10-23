/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg1.encapsulation;

/**
 *
 * @author louis
 */
public class GradeResult {
    String Studentname;
    double PG;
    double MG;
    double FG;
    double TG;
    
    //setting the value
    public void setStudentName(String name){
        Studentname = name;
    }
    public void setPrelimGrade(double pg){
        PG = pg;
    }
    public void setMidtermGrade(double mg){
        MG = mg;
    }
    public void setFinalGrade(double fg){
        FG = fg;
    }
    public void setTotalGrade(double tg){
        TG = tg;
    }
    //getting the value
     public String getStudentName(){
        return Studentname;
    }
    public double getPrelimGrade(){
        return PG;
    }
    public double getMidtermGrade(){
        return MG;
    }
    public double getFinalGrade(){
        return FG;
    }
    public double getTotalGrade(){
        return TG;
    }
}
