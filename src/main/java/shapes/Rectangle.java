package shapes;

import java.awt.*;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(Point initPos,Color col,int h,int w){
        super(initPos, col);
        height=h;
        width=w;

    }
    @Override
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x, pos.y,width,height);
    }

}
