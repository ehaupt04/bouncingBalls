//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.swing.JFrame;

public class DrawingFrame {
    public DrawingFrame() {
    }

    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(500, 500);
        BallPanel bPanel = new BallPanel();
        myFrame.add(bPanel);
        myFrame.setVisible(true);
    }
}
