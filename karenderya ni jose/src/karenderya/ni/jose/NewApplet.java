/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karenderya.ni.jose;

import java.applet.Applet;
import java.awt.*;

import java.awt.event.*;



/**
 *
 * @author louis
 */
public class NewApplet extends Applet 
        implements ActionListener{

    //ULAM
    Button a1=new Button("ADOBO P160");
    Button a2=new Button("SINIGANG P150");
    Button a3=new Button("TINOLA P160");
    Button a4=new Button("KALDERETA P150");
    Button a5=new Button("SISIG P160");
    Button a6=new Button("AFRIDATA P150");
    Button a7=new Button("KARE-KARE P160");
    Button a8=new Button("BULALO P150");
    Button a9=new Button("NILAGA P160");
    Button a10=new Button("BISTEK P150");
    
    //2RICE
    Button b1=new Button("WHITE RICE P50");
    Button b2=new Button("BROWN RICE P50");
    Button b3=new Button("BLACK RICE P50");
    Button b4=new Button("RED RICE P50");
    Button b5=new Button("FRIED RICE P50");
    Button b6=new Button("JAVA RICE P100");
    Button b7=new Button("BASMATI RICE P50");
    Button b8=new Button("BOMBA RICE P50");
    Button b9=new Button("SUSHI RICE P100");
    Button b10=new Button("WILD RICE P50");
    //3DRINKS
    Button c1=new Button("ORANGEJUICE P20");
    Button c2=new Button("LEMONJUICE P20");
    Button c3=new Button("MANGOJUICE P20");
    Button c4=new Button("REDJUICE P20");
    Button c5=new Button("COKE P35");
    Button c6=new Button("ROYAL P35");
    Button c7=new Button("PEPSI P35");
    Button c8=new Button("SPRITE P35");
    Button c9=new Button("MOUNTAINJEW P35");
    Button c10=new Button("REDHORSE P100");
    //4desert
    Button d1=new Button("HALO-HALO P35");
    Button d2=new Button("LECHE FLAN P70");
    Button d3=new Button("UBE P50");
    Button d4=new Button("CAKE P100");
    Button d5=new Button("ICE CREAM P20");
    Button d6=new Button("COFFEE JELLY P50");
    Button d7=new Button("MANGO GRAHAM P25");
    Button d8=new Button("SAPIN SAPIN P30");
    Button d9=new Button("PALITAW P30");
    Button d10=new Button("BANANA Q P15");
    
    //label
    Label l1=new Label("ULAM:");
    Label l2=new Label("RICE:");
    Label l3=new Label("DRINKS:");
    Label l4=new Label("DESSERT:");
    Button clear=new Button("Clear");
    Button comp=new Button("Compute");
    // PAYMENT
    TextField T1=new TextField(10);
    TextField T2=new TextField(10);
    Label QT=new Label("QTY:");
    Label TT=new Label("TOTAL:");
    Label CH=new Label("CHANGE:");
    Label CA=new Label("CASH:");
    
    Label LTT=new Label("0");
    Label LCH=new Label("0");
    int CTT;
    public void init() {
         setLayout(null);
        
      
        add(a1);
        add(a2);
        add(a3);
        add(a4);
        add(a5);
        add(a6);
        add(a7);
        add(a8);
        add(a9);
        add(a10);
       
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
        
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        add(c7);
        add(c8);
        add(c9);
        add(c10);
        
        add(d1);
        add(d2);
        add(d3);
        add(d4);
        add(d5);
        add(d6);
        add(d7);
        add(d8);
        add(d9);
        add(d10);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        
         add(T1); 
         add(T2);
         add(QT); 
         add(TT);
         add(CH); 
         add(CA);
         add(LTT);
         add(LCH);
         
        
      
        
        //1
        a1.setBounds(50,50,110,50);
        a2.setBounds(50,100,110,50);
        a3.setBounds(50,150,110,50);
        a4.setBounds(50,200,110,50);
        a5.setBounds(50,250,110,50);
        a6.setBounds(50,300,110,50);
        a7.setBounds(50,350,110,50);
        a8.setBounds(50,400,110,50);
        a9.setBounds(50,450,110,50);
        a10.setBounds(50,500,110,50);
        //2
        b1.setBounds(200,50,110,50);
        b2.setBounds(200,100,110,50);
        b3.setBounds(200,150,110,50);
        b4.setBounds(200,200,110,50);
        b5.setBounds(200,250,110,50);
        b6.setBounds(200,300,110,50);
        b7.setBounds(200,350,110,50);
        b8.setBounds(200,400,110,50);
        b9.setBounds(200,450,110,50);
        b10.setBounds(200,500,110,50);
        //3
        c1.setBounds(350,50,120,50);
        c2.setBounds(350,100,120,50);
        c3.setBounds(350,150,120,50);
        c4.setBounds(350,200,120,50);
        c5.setBounds(350,250,120,50);
        c6.setBounds(350,300,120,50);
        c7.setBounds(350,350,120,50);
        c8.setBounds(350,400,120,50);
        c9.setBounds(350,450,120,50);
        c10.setBounds(350,500,120,50);
        
        d1.setBounds(500,50,110,50);
        d2.setBounds(500,100,110,50);
        d3.setBounds(500,150,110,50);
        d4.setBounds(500,200,110,50);
        d5.setBounds(500,250,110,50);
        d6.setBounds(500,300,110,50);
        d7.setBounds(500,350,110,50);
        d8.setBounds(500,400,110,50);
        d9.setBounds(500,450,110,50);
        d10.setBounds(500,500,110,50);
        //
        l1.setBounds(50,20,100,50);
        l2.setBounds(200,20,100,50);
        l3.setBounds(350,20,100,50);
        l4.setBounds(500,20,100,50);
        
        //
        T1.setBounds(800,400,100,20);
        T2.setBounds(800,550,100,20);
        //
        QT.setBounds(750,400,100,20);
        TT.setBounds(750,450,100,20);
        CH.setBounds(750,500,100,20);
        CA.setBounds(750,550,100,20);
        
        LTT.setBounds(850,450,100,20);
        LCH.setBounds(850,500,100,20);
       
        clear.setBounds(950,550,150,50);
        add(comp);
        add(clear);
        comp.setBounds(950,500,150,50);
            
            
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        a4.addActionListener(this);
        a5.addActionListener(this);
        a6.addActionListener(this);
        a7.addActionListener(this);
        a8.addActionListener(this);
        a9.addActionListener(this);
        a10.addActionListener(this);
        
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
        
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        c5.addActionListener(this);
        c6.addActionListener(this);
        c7.addActionListener(this);
        c8.addActionListener(this);
        c9.addActionListener(this);
        c10.addActionListener(this);
        
        d1.addActionListener(this);
        d2.addActionListener(this);
        d3.addActionListener(this);
        d4.addActionListener(this);
        d5.addActionListener(this);
        d6.addActionListener(this);
        d7.addActionListener(this);
        d8.addActionListener(this);
        d9.addActionListener(this);
        d10.addActionListener(this);
        
        clear.addActionListener(this);
        comp.addActionListener(this);

    }

     public void actionPerformed(ActionEvent ae) {
        int price=0;
        int q;
                
        q = Integer.parseInt(T1.getText());
        if (ae.getSource() == a1) price = 160;
        else if (ae.getSource() == a2) price = 150;
        else if (ae.getSource() == a3) price = 160;
        else if (ae.getSource() == a4) price = 150;
        else if (ae.getSource() ==  a5) price = 160;
        else if (ae.getSource() == a6) price = 150;
        else if (ae.getSource() == a7) price = 160;
        else if (ae.getSource() == a8) price = 150;
        else if (ae.getSource() == a9) price = 160;
        else if (ae.getSource() == a10) price = 150;
        else if (ae.getSource() == b1) price = 50;
        else if (ae.getSource() == b2) price = 50;
        else if (ae.getSource() == b3) price = 50;
        else if (ae.getSource() == b4) price = 50;
        else if (ae.getSource() == b5) price = 50;
        else if (ae.getSource() == b6) price = 100;
        else if (ae.getSource() == b7) price = 50;
        else if (ae.getSource() == b8) price = 50;
        else if (ae.getSource() == b9) price = 100;
        else if (ae.getSource() == b10) price = 50;
        else if (ae.getSource() == c1) price = 20;
        else if (ae.getSource() == c2) price = 20;
        else if (ae.getSource() == c3) price = 20;
        else if (ae.getSource() == c4) price = 20;
        else if (ae.getSource() == c5) price = 35;
        else if (ae.getSource() == c6) price = 35;
        else if (ae.getSource() == c7) price = 35;
        else if (ae.getSource() == c8) price = 35;
        else if (ae.getSource() == c9) price = 35;
        else if (ae.getSource() == c10) price = 100;
        else if (ae.getSource() == d1) price = 35;
        else if (ae.getSource() == d2) price = 70;
        else if (ae.getSource() == d3) price = 50;
        else if (ae.getSource() == d4) price = 100;
        else if (ae.getSource() == d5) price = 20;
        else if (ae.getSource() == d6) price = 50;
        else if (ae.getSource() == d7) price = 25;
        else if (ae.getSource() == d8) price = 30;
        else if (ae.getSource() == d9) price = 30;
        else if (ae.getSource() == d10) price = 15;
       
        
        CTT += price*q;
        LTT.setText(""+CTT);
        if (ae.getSource() == comp){
            if (!CA.getText().isEmpty()){
                int cash = Integer.parseInt(T2.getText());
                int CCH = cash - CTT;
                
                LCH.setText(""+CCH);
        
        }
        if (ae.getSource() == clear){
            CTT = 0;
        
        }
        }
     }
}
