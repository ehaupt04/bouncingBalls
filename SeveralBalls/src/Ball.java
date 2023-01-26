import java.awt.*;
public class Ball
{
    private int x,y,size,xSpeed,ySpeed;
    private Color color;
    public Ball()
    {
        size = (int)(Math.random()*100);
        x = (int)(Math.random()* (255-size))+size;
        y = (int)(Math.random()* (255-size))+size;
        xSpeed = (int)(Math.random()*5+1);
        ySpeed = (int)(Math.random()*5+1);
        color  = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
    }
    public int getSize()
    {
        return size;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void xFlip()
    {
        if(xSpeed<0)
        {
            xSpeed=(int)(Math.random()*5+1);
        }
        else
        {
            xSpeed=-(int)(Math.random()*5+1);
        }

    }
    public void yFlip()
    {
        if(x<0)
        {
            x=0;
        }
        if(y<0)
        {
            y=0;
        }
        if(ySpeed<0)
        {
            ySpeed=(int)(Math.random()*5+1);
        }
        else
        {
            ySpeed=-(int)(Math.random()*5+1);
        }
    }
    public Color getColor()
    {
        return color;
    }
    public void xAdd()
    {
        x+=xSpeed;
    }
    public void yAdd()
    {
        y+=ySpeed;
    }
    public void drawBall(Graphics g)
    {
        g.fillOval(getX(),getY(), getSize(),getSize());
        g.setColor(getColor());
    }
}