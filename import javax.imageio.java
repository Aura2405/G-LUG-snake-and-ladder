import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import java.io.File;
import java.io.IOException;

class Demo
{
    public static void main(String args[])
    {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setBounds(200,100,990,735);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}

class FDemo extends JFrame
{
    JPDemo jp1;
    FDemo()
    {
        super.setTitle("Snake and Ladder");
        jp1=new JPDemo();
        add(jp1);
    }
}
class JPDemo extends JPanel implements ActionListener
{
    ImageIcon st,img,img1,img2,img3,img4,img5,img6;
    Image swt,board,start,piece,dice,diceb,dice1,dice2,dice3,dice4,dice5,dice6;
    JButton b1,b2,b3;
    
    int px1=255;
    int py1=585;
    JPDemo()
    {
        setBackground(new Color(120,0,0));
        try
        {
            BufferedImage bufferedImage = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/heading.png"));
            swt = bufferedImage.getScaledInstance(308,320,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImage1 = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/OIP.jpeg"));
            board = bufferedImage1.getScaledInstance(650,690,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImage2 = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/3cd1070ecd85406b3f49c3d072e4a920.jpg"));
            start = bufferedImage2.getScaledInstance(200,120,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImage3 = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/R.png"));
            piece = bufferedImage3.getScaledInstance(70,100,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImage4 = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/R1.png"));
            dice = bufferedImage4.getScaledInstance(150,150,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImageb = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/dice.png"));
            diceb = bufferedImageb.getScaledInstance(90,90,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImage5 = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/dice-one-vector-icon.png"));
            dice1 = bufferedImage5.getScaledInstance(90,90,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImage6 = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/dice-two-vector-icon.png"));
            dice2 = bufferedImage6.getScaledInstance(90,90,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImage7 = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/dice-three-vector-icon.png"));
            dice3 = bufferedImage7.getScaledInstance(90,90,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImage8 = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/dice-four-vector-icon.png"));
            dice4 = bufferedImage8.getScaledInstance(90,90,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImage9 = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/dice-five-vector-icon.png"));
            dice5 = bufferedImage9.getScaledInstance(90,90,Image.SCALE_DEFAULT);
            
            BufferedImage bufferedImage10 = ImageIO.read(new File("C:/Users/ANUBRATA/Pictures/Saved Pictures/dice-six-vector-icon.png"));
            dice6 = bufferedImage10.getScaledInstance(90,90,Image.SCALE_DEFAULT);
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        
        st=new ImageIcon(start);
        img=new ImageIcon(diceb);
        img1=new ImageIcon(dice1);
        img2=new ImageIcon(dice2);
        img3=new ImageIcon(dice3);
        img4=new ImageIcon(dice4);
        img5=new ImageIcon(dice5);
        img6=new ImageIcon(dice6);
        
        setLayout(null);
        b1=new JButton(st);
        b1.setBounds(60,575,200,120);
        add(b1);
        
        b2=new JButton("RESET");
        b2.setBounds(110,330,100,40);
        add(b2);
        b2.setBackground(new Color(51,153,255));
        
        b3=new JButton("ROLL");
        b3.setBounds(110,540,100,30);
        add(b3);
        b3.setForeground(new Color(255,120,0));
        
        b3.addActionListener(this);
    }
    
public void paintComponent(Graphics g)
{
    super.paintComponent(g);
    g.setColor(Color.yellow);
    g.fillRect(0,0,320,735);
    g.drawImage(swt,5,5,this);
    g.drawImage(board,320,5,this);
    g.drawImage(piece,px1,py1,this);
    g.drawImage(dice,20,400,this);
    g.drawImage(diceb,160,430,this);
}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b3)
    {
     int random=(int)Math.round(Math.random()*5+1);   
     px1=255;
     py1=585;
     switch(random)
     {
         case 1:
             img=new ImageIcon(dice1);
             px1+=100;
             break;
         case 2:
             img=new ImageIcon(dice2);
             px1+=100*2;
             break;
         case 3:
             img=new ImageIcon(dice3);
             px1+=100*3;
             break;
         case 4:
             img=new ImageIcon(dice4);
             px1+=100*4;
             break;
         case 5:
             img=new ImageIcon(dice5);
             px1+=100*5;
             break;
         case 6:
             img=new ImageIcon(dice6);
             px1+=100*6;
             break; 
     }
     diceb=img.getImage();
     repaint();
}
}
}