//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;

public class BallPanel extends JPanel {
    ArrayList<Ball> balls = new ArrayList();

    public BallPanel() {
        this.setBackground(Color.RED);

        for(int i = 0; i < 20; ++i) {
            Ball tempBall = new Ball();
            this.balls.add(tempBall);
        }

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Iterator var2 = this.balls.iterator();

        Ball instantBall;
        while(var2.hasNext()) {
            instantBall = (Ball)var2.next();
            instantBall.drawBall(g);
        }

        var2 = this.balls.iterator();

        while(var2.hasNext()) {
            instantBall = (Ball)var2.next();
            instantBall.xAdd();
            instantBall.yAdd();
        }

        var2 = this.balls.iterator();

        while(true) {
            do {
                if (!var2.hasNext()) {
                    var2 = this.balls.iterator();

                    while(true) {
                        do {
                            if (!var2.hasNext()) {
                                try {
                                    Thread.sleep(12L);
                                } catch (Exception var4) {
                                    System.out.println(var4);
                                }

                                this.repaint();
                                return;
                            }

                            instantBall = (Ball)var2.next();
                        } while(instantBall.getY() < this.getHeight() - instantBall.getSize() && instantBall.getY() > 0);

                        instantBall.yFlip();
                    }
                }

                instantBall = (Ball)var2.next();
            } while(instantBall.getX() < this.getWidth() - instantBall.getSize() && instantBall.getX() > 0);

            instantBall.xFlip();
        }
    }
}
