import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Frame f;

    public void paint (Graphics g){
        Point p = new Point(200, 200);
        Color c = new Color(0x992266);
        Circle cir= new Circle(p,c,10);
        cir.draw(g);
    }
    // The constructor
    public Drawing() {

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
        setBackground(Color.WHITE);
        setSize(400, 400);
    }

}

