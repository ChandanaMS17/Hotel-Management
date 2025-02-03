import java.awt.*; 
import java.applet.Applet; 
 
public class samshape extends Applet { 
    public void paint(Graphics g){ 
       g.setColor(Color.red); 
        g.drawLine(20, 10, 521, 10); 
         
        g.setColor(Color.yellow); 
        g.drawOval(130, 20, 120, 60); 
         
       g.setColor(Color.magenta); 
        g.drawOval(20,30,40,50); 
         
          
        int[] xPoints = { 50,90,70,30,10}; 
        int[] yPoints = {100,140,190,190,140}; 
        g.drawPolygon(xPoints, yPoints,5);  
         
        g.setColor(Color.green); 
        g.draw3DRect(150, 100, 100,100, true); 
    } 
 
}