package Cube;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import Cube.*;
public class line extends JFrame{
  //variables
int height = 500;
int width = 500;
int line1x1 =350;
public void paint(Graphics line) {
  Graphics2D line2D= (Graphics2D) line;
 line2D.drawLine(line1x1,150,350, 350);
 line2D.drawLine(150,350,350, 350);
 line2D.drawLine(150,350,150, 150);
 line2D.drawLine(150,150,350, 150);
 // line2D.draw3DRect(300,200,100,200,false);
    }

  

   public line(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
ActionListener listener = new AbstractAction() {

  @Override
  public void actionPerformed(ActionEvent e) {
    if(line1x1 < height){
      line1x1+=10;
     // line.repaint();
    }
  
  }
  
};
   }
        
       public static void main(String[] args) {
        line line = new line();
        
       } 
    }
  

