package Cube;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import Cube.*;
public class line extends JFrame{
  //variables
int height = 500;
int width = 500;
int line1x1 =350;
int delay=100;
JPanel drawPanel = new JPanel();


  

   public line(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(width, height);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
AbstractAction listener = new AbstractAction() {

  
  public void actionPerformed(ActionEvent e) {
    if(line1x1 < height){
      line1x1+=1;
      drawPanel.repaint();


}

   }
  
  };
  Timer timer = new Timer(delay,listener);
   timer.start();
   add(drawPanel);
}   

private class DrawPanel extends JPanel{
public void paint(Graphics line) {
  Graphics2D line2D= (Graphics2D) line;
 line2D.drawLine(line1x1,150,350, 350);
 line2D.drawLine(150,350,350, 350);
 line2D.drawLine(150,350,150, 150);
 line2D.drawLine(150,150,350, 150);
 // line2D.draw3DRect(300,200,100,200,false);
}
}
       public static void main(String[] args) {
        line line = new line();
        EventQueue.invokeLater(new Runnable() {
          public void run() {
            new line();
          }
        });
       
       } 
      }
      
  

  
