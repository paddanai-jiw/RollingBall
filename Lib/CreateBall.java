package Lib;

import javax.swing.*;
import java.awt.*;

public class CreateBall extends JPanel {
    private static final int DIAMETER = 100;

    public CreateBall() {
        this.setPreferredSize(new Dimension(260, 260));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int x = (getWidth() - DIAMETER) / 2;
        int y = (getHeight() - DIAMETER) / 2;

        g2.setColor(Color.BLACK);
        g2.fillArc(x, y, DIAMETER, DIAMETER, 0, 180);

        g2.setColor(Color.WHITE);
        g2.fillArc(x, y, DIAMETER, DIAMETER, 180, 180);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3f));
        g2.drawOval(x, y, DIAMETER, DIAMETER);
    }
}
