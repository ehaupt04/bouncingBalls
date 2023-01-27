//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private int x;
    private int y;
    private int size = (int)(Math.random() * 100.0);
    private int xSpeed;
    private int ySpeed;
    private Color color;

    public Ball() {
        this.x = (int)(Math.random() * (double)(255 - this.size)) + this.size;
        this.y = (int)(Math.random() * (double)(255 - this.size)) + this.size;
        this.xSpeed = (int)(Math.random() * 5.0 + 1.0);
        this.ySpeed = (int)(Math.random() * 5.0 + 1.0);
        this.color = new Color((int)(Math.random() * 255.0), (int)(Math.random() * 255.0), (int)(Math.random() * 255.0));
    }

    public int getSize() {
        return this.size;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void xFlip() {
        if (this.xSpeed < 0) {
            this.xSpeed = (int)(Math.random() * 5.0 + 1.0);
        } else {
            this.xSpeed = -((int)(Math.random() * 5.0 + 1.0));
        }

    }

    public void yFlip() {
        if (this.x < 0) {
            this.x = 0;
        }

        if (this.y < 0) {
            this.y = 0;
        }

        if (this.ySpeed < 0) {
            this.ySpeed = (int)(Math.random() * 5.0 + 1.0);
        } else {
            this.ySpeed = -((int)(Math.random() * 5.0 + 1.0));
        }

    }

    public Color getColor() {
        return this.color;
    }

    public void xAdd() {
        this.x += this.xSpeed;
    }

    public void yAdd() {
        this.y += this.ySpeed;
    }

    public void drawBall(Graphics g) {
        g.fillOval(this.getX(), this.getY(), this.getSize(), this.getSize());
        g.setColor(this.getColor());
    }
}
