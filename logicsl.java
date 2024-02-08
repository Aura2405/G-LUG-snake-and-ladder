import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo4
{
    public static void main(String args[])
    {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setBounds(200,100,1100,900);
    }
}

class FDemo extends Frame
{
    FDemo()
    {
        Font f=new Font("",Font.BOLD,30);
        setFont(f);
    }
    public void paint(Graphics g)
    {
        int x=255;
        int y=585;
        int k=1;
        int count=15;
        int count1=0;
        A:
        for(int i=1;i<=6;i++)
        {
            if(k==7)
            {
                x-=100;
                k--;
            }
            if(k==0)
            {
                x+=100;
                k++;
            }
            for(int j=1;j<=6;j++)
            {
            count1++;
            try{Thread.sleep(200);}catch(Exception e){}
            g.drawString(""+k,x,y);
            if(count1==count)
            break A;
            if(i%2==1){
                x+=100;    
                k++;
            }
            else
            {
                x-=100;
                k--;
            }
            }
            y-=100;
        }
    }
}

