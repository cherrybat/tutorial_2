import java.awt.*;

public class Circle{
    private int rad;
    private Point pos;
    private Color col;
    // Fields

    public Circle(Point initPos, Color col, int radius) { // The constructor
        rad=radius;
        pos=initPos;
        this.col=col;//the parameter 'col' here is the same name as the Field 'col', so we
        //put this to identify the parameter here.
    }

    // Initialize fields
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad, rad);
    }
}
