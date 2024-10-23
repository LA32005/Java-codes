/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayclass;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author louis
 */

    
/**
 *
 * @author DFCAMCLP-IT
 */
public class App {
    Scanner input = new Scanner(System.in);
    ArrayList<Product> prodlist = new ArrayList<>();
    
    public void start(){
        System.out.println("Main Menu\n[1]Add Product\n[2]View All record\n[3]Search by Id\n[4]Update record\n[5]Delete record");
        prompt();
    }
    public void prompt(){
        System.out.print("Select Number: ");
        String choice = input.next();
        if(choice.equals("1")){
            addProduct();
        }
        if(choice.equals("2")){
            view_record();
        }
        if(choice.equals("3")){
            search();
        }
        if(choice.equals("4")){
            update();
        }
        if(choice.equals("5")){
            delete();
        }
        System.out.print("Do you want to go back to Main Menu?[y/n]: ");
        String choice1 = input.next();
        if(choice1.equalsIgnoreCase("y")){
        start();
        }
    }
    
    public void addProduct(){
        System.out.print("Product Id: ");
        int prod_id = input.nextInt();
        input.nextLine();
        System.out.print("Name of Product: ");
        String prodname = input.nextLine();
        System.out.print("Product Price: ");
        double prodprice = input.nextDouble();
      
        Product aw = new Product();
        aw.setprod_id(prod_id);
        aw.setProdname(prodname);
        aw.setprodprice(prodprice);
        prodlist.add(aw);
    }
    
    public void view_record(){
        for(int i = 0; i<prodlist.size(); i++){
            System.out.println(prodlist.get(i).getprod_id() + "\t" +prodlist.get(i).getProdname() + "\t" + prodlist.get(i).getprodprice());
        }
    }
    
    public void search(){
        System.out.print("Enter Id to search: ");
        int find = input.nextInt();
        for(int i = 0; i<prodlist.size(); i++){
            if(prodlist.get(i).getprod_id()== find){
            System.out.println(prodlist.get(i).getprod_id() + "\t" + prodlist.get(i).getProdname() + "\t" + prodlist.get(i).getprodprice());
            }
        }
    }
    
    public void update(){
        System.out.print("Enter Id update: ");
        int update_id= input.nextInt();
        for(int i = 0; i<prodlist.size(); i++){
            if(prodlist.get(i).getprod_id()== update_id){
                System.out.print("Product Id: ");
                int updated_id = input.nextInt();
                input.nextLine();
                System.out.print("Name of Product: ");
                String updated_prodname = input.nextLine();
                System.out.print("Product Price: ");
                double updated_prodprice = input.nextDouble();
                prodlist.get(i).setprod_id(updated_id);
                prodlist.get(i).setProdname(updated_prodname);
                prodlist.get(i).setprodprice(updated_prodprice);
            }
        }
    }
    
     public void delete(){
        System.out.print("Enter Id delete: ");
        int del_id= input.nextInt();
        for(int i = 0; i<prodlist.size(); i++){
            if(prodlist.get(i).getprod_id()== del_id){
                prodlist.remove(i);
            }
        }
    }
}

