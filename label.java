import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//A basic subclass of the JLabel with two constructors
public class label extends JLabel {

    //Label with text and position
    public label(String text, int x, int y) {
        super();
        this.setBounds(x, y, (int) (App.windowWidth*0.70), (int) (App.windowHeight*0.15));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setFont(new Font ("Arial", Font.BOLD, 24));
        this.setText(text);
        this.setOpaque(true);
        this.setBackground(new Color(108 ,180, 198));
    }

    //Label for images with position and size
    public label(Icon image, int x, int y, int width, int height) {
        super(image);
        this.setBounds(x, y, width, height);
    }

}
