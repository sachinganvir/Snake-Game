import javax.swing.*;
public class frame extends JFrame{
    frame(){
        // adding the panel to the frame
        this.add(new panel());
        // naming the frame Windiow
        this.setTitle("SnakeGame");
        // make sure unifrom game window size
        this.setResizable(false);
        this.setVisible(true);
        this.pack();

    }
}
