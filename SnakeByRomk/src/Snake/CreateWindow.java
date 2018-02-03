package Snake;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.util.Properties;
 
public class CreateWindow {
    public void Draw(int x,int y,int stopflag) {
        BufferedImage image = new BufferedImage(1200, 900, BufferedImage.TYPE_INT_RGB);
        Graphics gr =image.getGraphics();
        //// рисуем!!
        
        // Ложим рисунок на JLabel, а ее - на JScrollPane
        JLabel jl = new JLabel(new ImageIcon(image));
        JScrollPane jsp = new JScrollPane(jl);
        // создаем фрейм, ложим в центр созданный JScrollPane
        JFrame jf = new JFrame("JScroll Window");
        //jf.setSize(500, 500);       
        
        //if (stopflag<1) 
        {
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true); 
        jf.setBounds(100, 100, 500, 500);}
        
        gr.fillOval(x*20, y*20, 10, 10);
        //gr.drawString("str", x, y);
        //Head zz = new Head();zz.waiting(200);
        
        //jf.setVisible(false); 
        //gr.drawString("67tghjn ncn", 100,100);

        //jf.dispose();
        jf.add(jsp);
        
        
        jf.repaint();
        
        
    }
}