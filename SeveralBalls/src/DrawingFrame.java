import javax.swing.*;
public class DrawingFrame
{
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        BallPanel bPanel = new BallPanel();
        //myFrame.add(myPanel);
        myFrame.add(bPanel);
        myFrame.setVisible(true);

    }
}