
public class line extends JFrame{

  static repeater repeater = new repeater();

    public line() {
   
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
   } 

    public void paint(Graphics g) {
     Graphics2D g2D= (Graphics2D) g; 
     g2D.drawLine(repeater.line1x1,repeater.line1y1,repeater.line1x2,repeater.line1y2);
       }

    public static void pause(long milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }
   
    
    public static void main(String[] args) throws InterruptedException {
      
        line line = new line();
      for (int i = 0; i < 10; i++) {
        repeater.runLineOne();
        line.repaint(); 
        pause(1000);
      }
              
}
      
}

     
  
    