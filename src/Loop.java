import java.awt.*;
import java.applet.*;

public class Loop extends Applet
{
   
    public void paint(Graphics g)
    {
        int y=0;
     for(int i=1; i<=5; i++)
     {
         if(i%2==0)
         {
             g.fillOval(100, y+60, 50, 50);
             y=y+60;
         }
         else 
         {
             g.drawOval(100, y+60, 50, 50);
             y=y+60;
         }
     }
    }
}