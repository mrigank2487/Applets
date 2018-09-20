import java.awt.*;
import java.applet.*;

public class Pattern extends Applet
{
   
    public void paint(Graphics g)
    {
        int x=0,y=0;
     for(int i=1; i<=9; i++)
     {
             
         
         if(i%2==0)
          {
              if(i%3==1)
              {
                x=0;
                y=y+60;
                  g.fillOval(60, y+60, 50, 50);  
              }
              else
              {
                  g.fillOval(x+60, y+60, 50, 50);
              }
             
             x=x+60;
          }
          else 
          {
             if(i%3==1)
              {
                x=0;
                y=y+60;
                  g.drawOval(60, y+60, 50, 50);  
              }
              else
              {
                  g.drawOval(x+60, y+60, 50, 50);
              }
             
             x=x+60;
          }
         
         }
     
       
     }
   }

