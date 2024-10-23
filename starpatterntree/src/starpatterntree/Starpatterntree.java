/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starpatterntree;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class Starpatterntree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;
        
        while(true){
            System.out.print("Enter number of rows: ");
            rows = input.nextInt();

            for(int i = 0; i<rows; i++){
                for(int j = 0; j<=i; j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
                
        }
    }
    
}
