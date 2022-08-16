package Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    JFrame frame;
    JButton button;

    public Window(int _width, int _height, String _title, boolean _resizable, Color _color) {
        frame = new JFrame();
        frame.setTitle(_title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(_resizable);
        frame.setSize(_width, _height);
        frame.setLayout(null);
        frame.getContentPane().setBackground(_color);
        frame.setVisible(true);
    }

    public Window() {
        this(600, 400, "Window", false, Color.lightGray);

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(e -> System.out.println("Test"));
        button.setFocusable(false);
        button.setText("Button");
        button.setForeground(Color.black);
        button.setBackground(Color.PINK);
        button.setBorder(BorderFactory.createEtchedBorder());

        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
