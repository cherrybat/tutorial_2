import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Frame f;
    private Circle cir;
    private shapes.Rectangle rec;
    private Square squ;

    public void paint (Graphics g){
        Point p = new Point(200, 200);
        Color c = new Color(0x992266);
        Circle cir= new Circle(p,c,10);
        cir.draw(g);

        Point o =new Point(300,70);
        Color co= new Color(30,22,100);
        shapes.Rectangle rec=new Rectangle(o,co,20,100);
        rec.draw(g);

        Point o2=new Point(100,20);
        Color co2=new Color(100,300,60);
        Square squ=new Square(o2,co2,30,30);
        squ.draw(g);
    }


    // The constructor
    public Drawing() {
        setupFrame();
        setupCanvas();
        setupShape();
    }
    private void setupShape() {
//code for selecting a shape to draw?
    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400, 400);
    }

    private void setupFrame() {
        f = new Frame("My window");
// Instantiates the Frame
// Adds the Canvas to the Frame
// Stops the frame from trying to layout contents
// Sets the dimensions of the frame
        f.add(this);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

}

