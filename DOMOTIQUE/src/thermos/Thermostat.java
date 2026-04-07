//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package thermos;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Thermostat extends JPanel {
    private int temperature;

    public Thermostat() {
        this.setPreferredSize(new Dimension(100, 100));
        this.temperature = 20;
        JFrame f = new JFrame();
        f.setContentPane(this);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("" + this.temperature, 50, 50);
    }

    public void monterTemperature() {
        ++this.temperature;
        if (this.temperature > 25) {
            this.temperature = 25;
        }

        this.repaint();
    }

    public void baisserTemperature() {
        --this.temperature;
        if (this.temperature < 15) {
            this.temperature = 15;
        }

        this.repaint();
    }
}
