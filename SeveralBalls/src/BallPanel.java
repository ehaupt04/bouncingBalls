import javax.swing.*;
import java.awt.*;
import java.util.*;
public class BallPanel extends JPanel
{
    ArrayList <Ball> balls = new ArrayList<>();
    public BallPanel()
    {
        setBackground(Color.RED);
        for(int i=0;i<20;i++)
        {
            Ball tempBall = new Ball();
            balls.add(tempBall);
        }
    }
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Ball instantBall:balls)
        {
            instantBall.drawBall(g);
        }
        for(Ball instantBall:balls)
        {
            instantBall.xAdd();
            instantBall.yAdd();
        }
        for(Ball instantBall:balls)
        {
            if(instantBall.getX()>=(getWidth()-instantBall.getSize())||instantBall.getX()<=0)
            {
                instantBall.xFlip();
            }
        }
        for(Ball instantBall:balls){
            if(instantBall.getY()>=(getHeight()-instantBall.getSize())||instantBall.getY()<=0)
            {
                instantBall.yFlip();
            }
        }

        try{
            Thread.sleep(12);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        repaint();
    }
}