
import java.awt.*;
import javax.swing.*;
public class line extends JFrame{

  
line() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
   }
        public void paint(Graphics line) {
          Graphics2D line2D= (Graphics2D) line;
         line2D.drawLine(400,200,400, 400);
         line2D.drawLine(200,400,400, 400);

            }
    public static void pause(long milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }
       public static void main(String[] args) {
        line line = new line();
        pause(2000);
       } 
    }

