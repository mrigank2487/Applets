import java.awt.*;
import java.applet.*;

public class House extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(50,110,50,180);
        g.drawLine(250,110,250,180);
        g.drawLine(150,50,50,110);
        g.drawLine(150,50,250,110);
        g.drawLine(50,110,250,110);
        g.drawLine(50,180,250,180);
        g.setColor(Color.red);
        g.fillRect(125, 140, 45, 40);
        g.setColor(Color.yellow);
        g.fillOval(135, 70, 30, 30);
      
    }
}