/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



/**
 *
 * @author louis
 */
public class NewApplet extends Applet implements ActionListener  {

    Button b1 = new Button("Adobo - 50 pesos");
    Button b2 = new Button("Sinigang - 50 pesos");
    Button b3 = new Button("Caldereta - 50 pesos");
    Button b4 = new Button("Menudo - 50 pesos");
    Button b5 = new Button("Tinola - 50 pesos");
    Button b6 = new Button("Afritada - 50 pesos");
    Button b7 = new Button("Dinuguan - 50 pesos");
    Button b8 = new Button("Pares - 50 pesos");
    Button b9 = new Button("Lechon paksiw - 50 pesos");
    Button b10 = new Button("Lechon Kawali - 50 pesos");
    Button b11 = new Button("Papaitan - 50 pesos");
    Button b12 = new Button("Sisig - 50 pesos");
    Button b13 = new Button("Plain rice - 12 pesos");
    Button b14 = new Button("Fried rice - 15 pesos");
    Button b15 = new Button("Java rice - 20 pesos");
    Button b16 = new Button("Basmati rice - 12 pesos");
    Button b17 = new Button("Jasmin rice -12 pesos");
    Button b18 = new Button("Black rice - 12 pesos");
    Button b19 = new Button("Brown rice - 12 pesos");
    Button b20 = new Button("Aromatic rice - 12 pesos");
    Button b21 = new Button("Glutinous rice - 12 pesos");
    Button b22 = new Button("Red rice - 12 pesos");
    Button b23 = new Button("White rice - 12 pesos");
    Button b24 = new Button("Yellow rice - 12 pesos");
    Button b25 = new Button("Water - 15 pesos");
    Button b26 = new Button("Rc - small  15 pesos");
    Button b27 = new Button("Rc - big - 30 pesos");
    Button b28 = new Button("Royal - small  15 pesos");
    Button b29 = new Button("Royal - big  30 pesos");
    Button b30 = new Button("Sprite - small  15 pesos");
    Button b31 = new Button("Sprite - big  30 pesos");
    Button b32 = new Button("Mountain Dew - small  15 pesos");
    Button b33 = new Button("Mountain Dew - big  30 pesos");
    Button b34 = new Button("Pepsi blue - small  15 pesos");
    Button b35 = new Button("Pepsi blue - big 30 pesos");
    Button b36 = new Button("Real leaf - 24 pesos");
    Button b37 = new Button("Graham - 150 pesos");
    Button b38 = new Button("Halo - halo -  small  20 pesos");
    Button b39 = new Button("Halo - halo -  big  40 pesos");
    Button b40 = new Button("Letche plan -  100 pesos");
    Button b41 = new Button("Ice cream -  25 pesos");
    Button b42 = new Button("Cupcake/chocolate -  45 pesos");
    Button b43 = new Button("Cupcake/milk  -  45 pesos");
    Button b44 = new Button("Cupcake/strawberry -  45 pesos");
    Button b45 = new Button("Cupcake/vanilla -  45 pesos");
    Button b46 = new Button("Nachos - small  25 pesos");
    Button b47 = new Button("Nachos - big  50 pesos");
    Button b48 = new Button("Cotton Candy - 25 pesos");
    
    Button compute = new Button("Compute");
    Button clear = new Button("Clear");
    
    int foodprice = 50;
    int normalrice = 12;
    int friedrice = 15;
    int javaprice = 20;
    int smallprice = 15;
    int bigprice = 30;
    int realleaf = 24;
    int graham = 150;
    int halohalosmall = 20;
    int halohalobig = 40;
    int letche = 100;
    int twentyfive = 25;
    int cupcake = 45;
    int nachosbig = 50;
    Label dishes = new Label("Menu:");
    Label rice= new Label("Rice:");
    Label drinks = new Label("Drinks:");
    Label dessert = new Label("Dessert:");
    
    Label Quantity = new Label("Quantity");
    TextField quan = new TextField(10);
    Label total = new Label("Total Amount");
    TextField amount = new TextField(10);
    Label change = new Label("Change");
    TextField sukli = new TextField(10);
    Label cash = new Label("Cash");
    TextField purchase = new TextField(10);
    
    public void init() {
        setLayout(null);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(b17);
        add(b18);
        add(b19);
        add(b20);
        add(b21);
        add(b22);
        add(b23);
        add(b24);
        add(b25);
        add(b26);
        add(b27);
        add(b28);
        add(b29);
        add(b30);
        add(b31);
        add(b32);
        add(b33);
        add(b34);
        add(b35);
        add(b36);
        add(b37);
        add(b38);
        add(b39);
        add(b40);
        add(b41);
        add(b42);
        add(b43);
        add(b44);
        add(b45);
        add(b46);
        add(b47);
        add(b48);
        add(dishes);
        add(rice);
        add(drinks);
        add(dessert);
        add(Quantity);
        add(quan);
        add(total);
        add(amount);
        add(change);
        add(sukli);
        add(cash);
        add(purchase);
        add(compute);
        add(clear);
        
        
        dishes.setBounds(175,10,200,50);
        b1.setBounds(100,50,200,50);
        b2.setBounds(100,110,200,50);
        b3.setBounds(100,170,200,50);
        b4.setBounds(100,230,200,50);
        b5.setBounds(100,290,200,50);
        b6.setBounds(100,350,200,50);
        b7.setBounds(100,410,200,50);
        b8.setBounds(100,470,200,50);
        b9.setBounds(100,530,200,50);
        b10.setBounds(100,590,200,50);
        b11.setBounds(100,650,200,50);
        b12.setBounds(100,710,200,50);
        
        rice.setBounds(475,10,200,50);
        b13.setBounds(400,50,200,50);
        b14.setBounds(400,110,200,50);
        b15.setBounds(400,170,200,50);
        b16.setBounds(400,230,200,50);
        b17.setBounds(400,290,200,50);
        b18.setBounds(400,350,200,50);
        b19.setBounds(400,410,200,50);
        b20.setBounds(400,470,200,50);
        b21.setBounds(400,530,200,50);
        b22.setBounds(400,590,200,50);
        b23.setBounds(400,650,200,50);
        b24.setBounds(400,710,200,50);
        
        drinks.setBounds(775,10,200,50);
        b25.setBounds(700,50,200,50);
        b26.setBounds(700,110,200,50);
        b27.setBounds(700,170,200,50);
        b28.setBounds(700,230,200,50);
        b29.setBounds(700,290,200,50);
        b30.setBounds(700,350,200,50);
        b31.setBounds(700,410,200,50);
        b32.setBounds(700,470,200,50);
        b33.setBounds(700,530,200,50);
        b34.setBounds(700,590,200,50);
        b35.setBounds(700,650,200,50);
        b36.setBounds(700,710,200,50);
        
        dessert.setBounds(1075,10,200,50);
        b37.setBounds(1000,50,200,50);
        b38.setBounds(1000,110,200,50);
        b39.setBounds(1000,170,200,50);    
        b40.setBounds(1000,230,200,50);
        b41.setBounds(1000,290,200,50);
        b42.setBounds(1000,350,200,50);
        b43.setBounds(1000,410,200,50);
        b44.setBounds(1000,470,200,50);
        b45.setBounds(1000,530,200,50);
        b46.setBounds(1000,590,200,50);
        b47.setBounds(1000,650,200,50);
        b48.setBounds(1000,710,200,50);
        
        Quantity.setBounds(1500,50,100,50);
        quan.setBounds(1600,50,200,30);
        total.setBounds(1500,100,100,50);
        amount.setBounds(1600,100,200,30);
        change.setBounds(1500,150,100,50);
        sukli.setBounds(1600,150,200,30);
        cash.setBounds(1500,200,100,50);
        purchase.setBounds(1600,200,200,30);
        compute.setBounds(1500,250,100,30);
        clear.setBounds(1700,250,100,30);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);
        b31.addActionListener(this);
        b32.addActionListener(this);
        b33.addActionListener(this);
        b34.addActionListener(this);
        b35.addActionListener(this);
        b36.addActionListener(this);
        b37.addActionListener(this);
        b38.addActionListener(this);
        b39.addActionListener(this);
        b40.addActionListener(this);
        b41.addActionListener(this);
        b42.addActionListener(this);
        b43.addActionListener(this);
        b44.addActionListener(this);
        b45.addActionListener(this);
        b46.addActionListener(this);
        b47.addActionListener(this);
        b48.addActionListener(this);
        compute.addActionListener(this);
        clear.addActionListener(this);



    }
        int totalAmount = 0;
     public void actionPerformed(ActionEvent ae){
           int quantity;
           quantity =  Integer.parseInt(quan.getText());
            if (ae.getSource() == b1){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b2){
                totalAmount+= quantity*foodprice;
            }if (ae.getSource() == b3){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b4){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b5){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b6){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b7){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b8){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b9){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b10){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b11){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b12){
                totalAmount += quantity*foodprice;
            }if (ae.getSource() == b13){
                totalAmount += quantity*normalrice;
            }if (ae.getSource() == b14){
                totalAmount += quantity*friedrice;
            }if (ae.getSource() == b15){
                totalAmount += quantity*javaprice;
            }if (ae.getSource() == b16){
                totalAmount += quantity*normalrice;
            }if (ae.getSource() == b17){
                totalAmount += quantity*normalrice;
            }if (ae.getSource() == b18){
                totalAmount += quantity*normalrice;
            }if (ae.getSource() == b20){
                totalAmount += quantity*normalrice;
            }if (ae.getSource() == b21){
                totalAmount += quantity*normalrice;
            }if (ae.getSource() == b22){
                totalAmount += quantity*normalrice;
            }if (ae.getSource() == b23){
                totalAmount += quantity*normalrice;
            }if (ae.getSource() == b24){
                totalAmount += quantity*normalrice;
            }if (ae.getSource() == b25){
                totalAmount += quantity*smallprice;
            }if (ae.getSource() == b26){
                totalAmount += quantity*smallprice;
            }if (ae.getSource() == b27){
                totalAmount += quantity*bigprice;
            }if (ae.getSource() == b28){
                totalAmount += quantity*smallprice;
            }if (ae.getSource() == b29){
                totalAmount += quantity*bigprice;
            }if (ae.getSource() == b30){
                totalAmount += quantity*smallprice;
            }if (ae.getSource() == b31){
                totalAmount += quantity*bigprice;
            }if (ae.getSource() == b32){
                totalAmount += quantity*smallprice;
            }if (ae.getSource() == b33){
                totalAmount += quantity*bigprice;
            }if (ae.getSource() == b34){
                totalAmount += quantity*smallprice;
            }if (ae.getSource() == b35){
                totalAmount += quantity*bigprice;
            }if (ae.getSource() == b36){
                totalAmount += quantity*realleaf;
            }if (ae.getSource() == b37){
                totalAmount += quantity*graham;
            }if (ae.getSource() == b38){
                totalAmount += quantity*halohalosmall;
            }if (ae.getSource() == b39){
                totalAmount += quantity*halohalobig;
            }if (ae.getSource() == b40){
                totalAmount += quantity*letche;
            }if (ae.getSource() == b41){
                totalAmount += quantity*twentyfive;
            }if (ae.getSource() == b42){
                totalAmount += quantity*cupcake;
            }if (ae.getSource() == b43){
                totalAmount += quantity*cupcake;
            }if (ae.getSource() == b44){
                totalAmount += quantity*cupcake;
            }if (ae.getSource() == b45){
                totalAmount += quantity*cupcake;
            }if (ae.getSource() == b46){
                totalAmount += quantity*twentyfive;
            }if (ae.getSource() == b47){
                totalAmount += quantity*nachosbig;
            }if (ae.getSource() == b48){
                totalAmount += quantity*twentyfive;
            }  
        amount.setText( "Php " + totalAmount );
            if (ae.getSource() == compute){
                calculate();
            } 
            if (ae.getSource() == clear){
                clearout();
            }
    
     }
     public void calculate(){
         int money;
         money = Integer.parseInt(purchase.getText());
             int sobra = money - totalAmount;
             sukli.setText( "Php " + sobra);
         }
    
     public void clearout(){
         totalAmount = 0;
         quan.setText("");
         sukli.setText("");
         amount.setText("");
         purchase.setText("");
     }
     
}