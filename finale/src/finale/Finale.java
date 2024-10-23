/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finale;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class Finale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20;
        int score=0;
        
        Scanner in=new Scanner(System.in);
        System.out.println("Test 1: Identification");
        //IDENTIFICATION
        System.out.println("1.What is the color of sky?");
        n1=in.nextLine();
        System.out.println("2.What is the color of Gumamela?");
        n2=in.nextLine();
        System.out.println("3.What is the tallest animal in the world?");
        n3=in.nextLine();
        System.out.println("4.Who is the king of filipino rap music?");
        n4=in.nextLine();
        System.out.println("5.Who is the king of comedy ?");
        n5=in.nextLine();
        System.out.println("6.Who is the king of pinoy action movie?");
        n6=in.nextLine();
        System.out.println("7.Who is the king of rhyme in the phillipines?");
        n7=in.nextLine();
        System.out.println("8.Who is the president of phillipines?");
        n8=in.nextLine();
        System.out.println("9.Who is the guy main character in titanic?");
        n9=in.nextLine();
        System.out.println("10.Who is the female main character in titanic?");
        n10=in.nextLine();
        //MULTIPLE CHOICE
        System.out.println("Multiple choice");
        System.out.println("11.Who is the greatest basketball player of all time? ");
        System.out.println("a.Jordan     b.Lebron     c.Bryant");
        n11=in.nextLine();
        System.out.println("12.Who is the greatest shooter of all time?");
        System.out.println("a.Curry    b. Ray allen    c. Miller");
        n12=in.nextLine();
        System.out.println("13.Who is the father of katipunan?");
        System.out.println("a.Jose Rizal  b.Andres Bonifacio c.Emilio Aguinaldo");
        n13=in.nextLine();
        System.out.println("14.What is the english of ibon?");
        System.out.println("a. dog     b. bird     c. cat");
        n14=in.nextLine();
        System.out.println("15.What is the english of asul?");
        System.out.println("a. red     b.blue      c. green");
        n15=in.nextLine();
        System.out.println("16.What is the english of pula?");
        System.out.println("a.blue     b.green     c.red");
        n16=in.nextLine();
        System.out.println("17.What is the english buhay ?");
        System.out.println("a. dead     b.breath       c.life");
        n17=in.nextLine();
        System.out.println("18.What is the color of sun?");
        System.out.println("a.yellow     b. orange    c.black");
        n18=in.nextLine();
        System.out.println("19.What is the english of ilog?");
        System.out.println("a.river    b.ocean       c.sea");
        n19=in.nextLine();
        System.out.println("20.What is the english of karagatan?");
        System.out.println("a. ocean     b.river     c.sea");
        n20=in.nextLine();
        
        
        if(n1.toLowerCase().equals("blue"))
        score=score+1;
        if(n2.toLowerCase().equals("red"))
        score=score+1;
        if(n3.toLowerCase().equals("giraffe"))
        score=score+1;
        if(n4.toLowerCase().equals("francis m"))
        score=score+1;
        if(n5.toLowerCase().equals("dolphy"))
        score=score+1;
        if(n6.toLowerCase().equals("fpj"))
        score=score+1;
        if(n7.toLowerCase().equals("loonie"))
        score=score+1;
        if(n8.toLowerCase().equals("bbm"))
        score=score+1;
        if(n9.toLowerCase().equals("jack"))
        score=score+1;
        if(n10.toLowerCase().equals("rose"))
        score=score+1;
        if(n11.toLowerCase().equals("a"))
        score=score+1; 
        if(n12.toLowerCase().equals("a"))
        score=score+1;  
        if(n13.toLowerCase().equals("b"))
        score=score+1;  
        if(n14.toLowerCase().equals("b"))
        score=score+1;  
        if(n15.toLowerCase().equals("b"))
        score=score+1; 
        if(n16.toLowerCase().equals("c"))
        score=score+1; 
        if(n17.toLowerCase().equals("c"))
        score=score+1;  
        if(n18.toLowerCase().equals("a"))
        score=score+1;  
        if(n19.toLowerCase().equals("a"))
        score=score+1;
        if(n20.toLowerCase().equals("a"))
        score=score+1; 
    
        System.out.println("Score:"+ score);
        
        if(score>9)
            System.out.println("Passed");
        else
            System.out.println("Failed");
        
        
        
        
        
                
        
      
    }
    
}
