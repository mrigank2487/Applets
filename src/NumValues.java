/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandeep
 */
import java.awt.*;
import java.applet.*;

public class NumValues extends Applet
{
    public void paint (Graphics g)
    {
        int value1=10;
        int value2=20;
        int sum=value1+value2;
        String S="Sum: "+String.valueOf(sum);
        g.drawString(S,100,100);
    }
}
