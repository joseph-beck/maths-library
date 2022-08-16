package Window;

import javax.swing.*;

public class Window {
    private JFrame frame = new JFrame();

    public Window(int _width, int _height) {
        frame.setSize(_width, _height);
        frame.setVisible(true);
    }
}
