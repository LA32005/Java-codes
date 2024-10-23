/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package identification.quiz;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class IdentificationQuiz {
    static void calculate(String n1,String n2,String n3,String n4,String n5,String n6,String n7,String n8,String n9,String n10){
        int score = 0;
        if (n1.toLowerCase().equals("manila")){  /* or i can use of n1.equalsIgnoreCase("manila") ignore whether is capital or small*/
            score+=1;
        }
        if (n2.toLowerCase().equals("tokyo")){
            score+=1;
        }
        if (n3.toLowerCase().equals("pyongyang")){
            score+=1;
        }
        if (n4.toLowerCase().equals("taipei")){
            score+=1;
        }
        if (n5.toLowerCase().equals("beijing")){
            score+=1;
        }
        if (n6.equalsIgnoreCase("havana")){
            score+=1;
        }
        if (n7.equalsIgnoreCase("bangkok")){
            score+=1;
        }if (n8.equalsIgnoreCase("dili")){
            score+=1;
        }
        if (n9.equalsIgnoreCase("hanoi")){
            score+=1;
        }
        if (n10.equalsIgnoreCase("abu dhabi")){
            score+=1;
        } 
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
        
        System.out.println("Test 1: Identification");
        System.out.println("1.What is the capital of Philippines?");
        n1 = in.nextLine();
        System.out.println("2.What is the capital of Japan?");
        n2 = in.nextLine();
        System.out.println("3.What is the capital of North Korea?");
        n3 = in.nextLine();
        System.out.println("4.What is the capital of Taiwan?");
        n4 = in.nextLine();
        System.out.println("5.What is the capital of China?");
        n5 = in.nextLine();
        System.out.println("6.What is the capital of Cuba?");
        n6 = in.nextLine();
        System.out.println("7.What is the capital of Thailand?");
        n7 = in.nextLine();
        System.out.println("8.What is the capital of East timor?");
        n8 = in.nextLine();
        System.out.println("9.What is the capital of Vietnam?");
        n9 = in.nextLine();
        System.out.println("10.What is the capital of United Arab Emirates?");
        n10 = in.nextLine();
        
        System.out.println();
        
        
        calculate(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10);
    }
    
}
