package swing;

import javax.swing.*;
import java.awt.*;

public class SwingTest extends JFrame {
    public SwingTest() throws HeadlessException {
        super("hello world");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
