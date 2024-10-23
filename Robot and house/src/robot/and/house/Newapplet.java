/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot.and.house;

import java.awt.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

/**
 *
 * @author DFCAMCLP-IT
 */
public class Newapplet extends Applet {

    public void paint(Graphics g){ 
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(2));
        g.setColor(Color.white);//Robot
        g.fillOval(210,350,60,60);
        g.fillOval(280,350,60,60);
        g.setColor(new Color(255,255,120));
        g.fillRect(120, 230, 240, 140);
        g.fillOval(150,100,150,150);
        g.setColor(Color.black);
        g.drawOval(150,100,150,150);
        g.setColor(Color.white);
        g.fillOval(155,125,140,125);
        g.fillOval(180,230,90,80);
        g.fillOval(210,250,90,70);
        g.setColor(Color.black);
        g.drawArc(200,230,80,80,0,-180);
        g.drawArc(200,260,80,10,0,-180);
        g.setColor(Color.black);
        g.drawOval(155,125,140,125);
        g.setColor(new Color(255,102,102));//light red
        int [] xaxis = {280,280,190,190};
        int [] yaxis = {225,245,250,240};
        g.fillPolygon(xaxis,yaxis,4);
        int [] x2axis = {180,150,160};
        int [] y2axis = {120,82,140};  
        g.fillPolygon(x2axis,y2axis,3);
        int [] x3axis = {275,300,290};
        int [] y3axis = {125,87,145};
        g.fillPolygon(x3axis,y3axis,3);
        g.fillOval(255, 310, 15, 15);
        g.setColor(new Color(255,255,120));//light yellow
        g.fillOval(215, 230, 30, 30);
        g.setColor(Color.black);
        g.drawOval(215, 230, 30, 30);
        g.drawOval(180, 155, 25, 30);
        g.drawOval(240, 155, 25, 30);
        g.fillOval(187, 157, 15, 25);
        g.fillOval(247, 158, 15, 25);
        g.drawArc(200, 230, 160, 30,90,-90);
        g.drawArc(230, 240, 130, 30,270,90);
        g.drawArc(110, 240, 160, 30,180,-90);
        g.drawArc(110, 250, 130, 30,270,-90);
        g.drawPolygon(x2axis,y2axis,3);
        g.drawPolygon(x3axis,y3axis,3);
        g.drawLine(177, 270, 210, 350);
        g.drawLine(307, 270, 337, 350);
        g.drawArc(210,330,60,40,-180,180);
        g.drawArc(270,330,66,40,-180,180);
        g.drawArc(215,178,10,10,180,-180);
        g.drawLine(190, 110, 200, 130);
        g.drawLine(260, 110, 250, 129);
        g.setColor(Color.white);
        g.fillOval(193, 165, 5, 7);
        g.fillOval(254, 165, 5, 7);
        g.fillOval(90,240,40,40);
        g.fillOval(340,225,40,40);
        g.fillOval(185,45,80,20);
        g.setColor(Color.pink);
        g.fillArc(200, 175, 50, 50,180,180);
        g.fillArc(215, 93, 20, 20,180,-180);
        g.fillRect(223, 65, 5, 30);
        g.fillOval(220, 50, 10, 10);
        g.setColor(new Color(255,255,150));
        int [] xpoints = {117,180,215,117};
        int [] ypoints = {280,283,370,370};
        g.fillPolygon(xpoints,ypoints,4);
        int [] x2points = {117,175,182,117};
        int [] y2points = {230,230,240,240};
        g.fillPolygon(x2points,y2points,4);
        int [] x3points = {312,370,370,350};
        int [] y3points = {270,270,370,370};
        g.fillPolygon(x3points,y3points,4);
        g.setColor(Color.black);
        g.drawLine(145, 245, 155, 280);
        g.drawLine(315, 233, 325, 268);
        g.drawOval(212, 312, 15, 15);
        g.drawOval(255, 310, 15, 15);
        g.drawOval(300, 310, 15, 15);
        g2.setStroke(new BasicStroke(4));
        g.setColor(Color.orange);
        g.drawLine(70,80, 90, 60);
        g.drawLine(90,60, 110, 80);
        g.drawLine(110,80, 130, 60);
        g.drawLine(130,60, 150, 75); 
        g.drawLine(300,80, 320, 60);
        g.drawLine(320,60, 340, 80);
        g.drawLine(340,80, 360, 60);
        g.drawLine(360,60, 380, 75);
        g.setColor(Color.green);//dark green
        g.fillOval(212, 312, 15, 15);
        g.setColor(new Color(135, 206, 235));//skyblue
        g.fillOval(300, 310, 15, 15);
        //House
        g.setColor(Color.black);
        g2.setStroke(new BasicStroke(2));
        g.drawRect(599,120, 352, 250);
        g.drawRect(549,377, 452, 245);
        g.setColor(new Color(245,245,220));//dirty white
        g.fillRect(600,120, 350, 250);
        int[]rxa={580,770,960};//roof axis
        int[]rya={120,20,120};
        g.fillPolygon(rxa,rya,3);
        int[]r2xa={537,770,1010};//2nd roof axis
        int[]r2ya={375,275,375};
        g.fillPolygon(r2xa,r2ya,3);
        g.setColor(new Color(135, 206, 235));//skyblue
        g.fillRect(672, 160, 100, 100);
        g.fillRect(775, 160, 100, 100);
        g.setColor(new Color(255,102,102));//light red
        g.fillPolygon(r2xa,r2ya,3);
        g.fillPolygon(rxa,rya,3);
        g.fillRect(650,150,247,10);
        g.drawPolygon(r2xa,r2ya,3);
        g.drawPolygon(rxa,rya,3);
        g.setColor(new Color(245,245,220));//dirty white
        g.fillRect(550,376, 450, 245);
        g.setColor(new Color(255,102,102));//light red
        g.fillRect(560,410,235,10);
        g.fillRect(860,450,120,10);
        g.setColor(new Color(135, 206, 235));//skyblue
        g.fillRect(575, 420, 100, 100);
        g.fillRect(678, 420, 100, 100);
        g.setColor(new Color(210,180,140));//brown
        g.fillRect(870,470,100,150);
        g.setColor(new Color(245,245,220));//dirty white
        g.fillOval(880, 530, 20, 20);
        g.setColor(Color.black);
        g.drawPolygon(rxa,rya,3);
        g.drawPolygon(r2xa,r2ya,3);
        g.drawRect(672, 160, 100, 100);
        g.drawRect(775, 160, 100, 100);
        g.drawRect(575, 420, 100, 100);
        g.drawRect(678, 420, 100, 100);
        g.drawRect(870,470,100,150);
        g.setColor(Color.green);
        g.fillRect(360, 623, 700, 200);
        g.fillRect(360, 414, 187, 400);
        g.fillRect(1003, 414, 187, 410);
        //car
        g.setColor(Color.LIGHT_GRAY);
        g.fillRoundRect(400, 545, 15, 20,5,5);
        g.fillRoundRect(485, 545, 15, 20,5,5);
        g.setColor(Color.black);
        g.fillOval(383,490,50,20);
        g.fillOval(470,490,50,20);
        g.setColor(new Color(148,100,255));//light violet
        g.fillRoundRect(400, 500, 100, 50,15,15);
        int [] cxa={400,410,490,500};//trapezoid car axis
        int [] cya={510,480,480,510,};
        g.fillPolygon(cxa,cya,4);
        g.setColor(Color.LIGHT_GRAY);
        int [] c2xa={405,415,485,495};//small trapezoid car axis
        int [] c2ya={505,485,485,505,};
        g.fillPolygon(c2xa,c2ya,4);
        g.setColor(new Color(255,102,102));//light red
        g.fillOval(410, 530, 10, 10);
        g.fillOval(480, 530, 10, 10);
        g.fillOval(425, 530, 10, 10);
        g.fillOval(465, 530, 10, 10);
        g.setColor(Color.black);
        g2.setStroke(new BasicStroke(2));
        g.drawOval(880, 530, 20, 20);
        g.drawOval(403, 525, 40, 20);
        g.drawOval(456, 525, 40, 20);
        g.drawOval(410, 507, 80, 15);
        g.drawLine(415, 512, 485, 512);
        g.drawLine(420, 515, 480, 515);
        g.drawLine(425, 518, 475, 518);
        //clouds
        g.setColor(Color.white);
        g.fillOval(500,5,100,50);
        g.fillOval(580,5,100,50);
        g.fillOval(550,25,100,50);
        g.fillOval(850,25,100,50);
        g.fillOval(910,25,100,50);
        g.fillOval(890,5,100,50);
    }
    public void init(){
        setBackground(new Color(255,255,160));
    }
}
