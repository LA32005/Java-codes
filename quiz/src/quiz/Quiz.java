/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20;
        String n21,n22,n23,n24,n25,n26,n27,n28,n29,n30,n31,n32,n33,n34,n35;
        
        System.out.println("Test 1: Identification");
        System.out.println("1.What is the capital of Philippines?");
        n1 = input.nextLine();
        System.out.println("2.What is the capital of Japan");
        n2 = input.nextLine();
        System.out.println("3.What is the capital of South Korea?");
        n3 = input.nextLine();
        System.out.println("4.What is the capital of North korea?");
        n4 = input.nextLine();
        System.out.println("5.What is the capital of Bangladesh?");
        n5 = input.nextLine();
        System.out.println("6.What is the capital of Vietnam?");
        n6 = input.nextLine();
        System.out.println("7.What is the capital of Oman?");
        n7 = input.nextLine();
        System.out.println("8.What is the capital of Lebanon?");
        n8 = input.nextLine();
        System.out.println("9.What is the capital of Jordan?");
        n9 = input.nextLine();
        System.out.println("10.What is the capital of Thailand?");
        n10 = input.nextLine();
        
        int score1 = 0;
         for(int i=0; i<1;i++){
            if (n1.equalsIgnoreCase("manila")){
                score1++;
            }if (n2.equalsIgnoreCase("tokyo")){
                score1++;
            }if (n3.equalsIgnoreCase("seoul")){
                score1++;
            }if (n4.equalsIgnoreCase("pyongyang")){
                score1++;
            }if (n5.equalsIgnoreCase("dhaka")){
                score1++;
            }if (n6.equalsIgnoreCase("hanoi")){
                score1++;
            }if (n7.equalsIgnoreCase("muscat")){
                score1++;
            }if (n8.equalsIgnoreCase("beirut")){
                score1++;
            }if (n9.equalsIgnoreCase("amman")){
                score1++;
            }if (n10.equalsIgnoreCase("bangkok")){
                score1++;
            }
         }
         System.out.println("Test 1\nScore: " + score1);
            
        System.out.println("\nTest 2: Multiple choice");
        System.out.println("11. What is the Capital of Indonesia?");
        System.out.println("A. Jakarta   B. Seoul   C. Manila");
        n11 = input.nextLine();
        System.out.println("12. What is the capital of USA?");
        System.out.println("A. Washington DC.   B. Havana   C.Mexico");
        n12 = input.nextLine();
        System.out.println("13. What is the capital of Argentina?");
        System.out.println("A. Buenos Aires   B. Cuba   C.California");
        n13 = input.nextLine();
        System.out.println("14. What is the capital of Mexico?");
        System.out.println("A. Mexico City   B. Jordan   C.Seoul");
        n14 = input.nextLine();
        System.out.println("15. What is the capital of Singapore?");
        System.out.println("A. Singapore City   B. Tokyo   C. Manila");
        n15 = input.nextLine();
        System.out.println("16. What is the capital of Saudi Arabia?");
        System.out.println("A. Riyadh   B. Beirut   C. Amman");
        n16 = input.nextLine();
        System.out.println("17. What is the capital of Taiwan?");
        System.out.println("A. Taipei   B. Tokyo   C. Seoul");
        n17 = input.nextLine();
        System.out.println("18. What is the capital of Myanmar?");
        System.out.println("A. Naypyidaw   B. Astana   C.Muscat");
        n18 = input.nextLine();
        System.out.println("19. Who is the capital of Kyrgystan?");
        System.out.println("A. Bishkek   B. UAE   C.Astana");
        n19 = input.nextLine();
        System.out.println("20. What is the capital Tajikistan?");
        System.out.println("A. Dushanbe   B. Astana   C. Astana");
        n20 = input.nextLine();
        
        int score2 = 0;
         for(int i=0; i<1;i++){
            if (n11.equalsIgnoreCase("a")){
                score2 = score2 + 1;
            }if (n12.equalsIgnoreCase("a")){
                score2 = score2 + 1;
            }if (n13.equalsIgnoreCase("a")){
                score2 = score2 + 1;
            }if (n14.equalsIgnoreCase("a")){
                score2 = score2 + 1;
            }if (n15.equalsIgnoreCase("a")){
                score2 = score2 + 1;
            }if (n16.equalsIgnoreCase("a")){
                score2 = score2 + 1;
            }if (n17.equalsIgnoreCase("a")){
                score2 = score2 + 1;
            }if (n18.equalsIgnoreCase("a")){
                score2 = score2 + 1;
            }if (n19.equalsIgnoreCase("a")){
                score2 = score2 + 1;
            }if (n20.equalsIgnoreCase("a")){
                score2 = score2 + 1;
            }
         }
            System.out.println("Test 2\nScore: " + score2);
        
          System.out.println("Test 3: Enumeration");
          String firstletter = "abcde";
          String nameletter = "louis";
          String numbers = "12345";
          
          System.out.println("Give the first letter in alphabet?");
          n21 = input.nextLine();
          n22 = input.nextLine();
          n23 = input.nextLine();
          n24 = input.nextLine();
          n25 = input.nextLine();
          
          System.out.println("Give the five letter in my name 'Louis'?");
          n26 = input.nextLine();
          n27 = input.nextLine();
          n28 = input.nextLine();
          n29 = input.nextLine();
          n30 = input.nextLine();
          
          System.out.println("Give the first five number?");
          n31 = input.nextLine();
          n32 = input.nextLine();
          n33 = input.nextLine();
          n34 = input.nextLine();
          n35 = input.nextLine();
          
          int score3 = 0;
          for(int i=0; i<1;i++){
             if (firstletter.contains(n21.toLowerCase())){
              score3+=1;
             }
             if (firstletter.contains(n22.toLowerCase())){
              score3+=1;
             }
             if (firstletter.contains(n23.toLowerCase())){
              score3+=1;
             }
             if (firstletter.contains(n24.toLowerCase())){
              score3+=1;
             }
             if (firstletter.contains(n25.toLowerCase())){
              score3+=1;
             }
             if (nameletter.contains(n26.toLowerCase())){
              score3+=1;
             }
             if (nameletter.contains(n27.toLowerCase())){
              score3+=1;
             }if (nameletter.contains(n28.toLowerCase())){
              score3+=1;
             }if (nameletter.contains(n29.toLowerCase())){
              score3+=1;
             }
             if (nameletter.contains(n30.toLowerCase())){
              score3+=1;
             }
             if (numbers.contains(n31)){
              score3+=1;
             }
             if (numbers.contains(n32)){
              score3+=1;
             }
             if (numbers.contains(n33)){
              score3+=1;
             }
             if (numbers.contains(n34)){
              score3+=1;
             }
             if (numbers.contains(n35)){
              score3+=1;
             }  
          }
           System.out.println("Test 3\nScore: " + score3);
    }
    
}
