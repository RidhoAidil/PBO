import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
    public static void main(String[] args){
        new Panel().MainGUI();
    }

    private void MainGUI(){
        JFrame frame = new JFrame("Panel");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setMaximumSize(new Dimension(800, 600));
        frame.setLocationRelativeTo(null);

        JPanel panelUtama = new JPanel();
        panelUtama.setBackground(Color.BLACK);

        panelUtama.setLayout(null);

        JLabel labelJudul = new JLabel("RENTAL PS RIJAL");
        labelJudul.setForeground(Color.WHITE);
        labelJudul.setBounds(290, 20, 500, 50);
        labelJudul.setFont(new Font("ROBOTO", Font.BOLD, 30));

        // Images label
        ImageIcon headerImg = new ImageIcon(
            getClass().getResource("images/img-header.png")
        );

        Image scaledImg = headerImg.getImage().getScaledInstance(800, 100, Image.SCALE_SMOOTH);

        JLabel labelHeaderImg = new JLabel(new ImageIcon(scaledImg));
        labelHeaderImg.setBounds(0, 0, 800, 100);

        JPanel panelJudul = new JPanel();
        panelJudul.setBackground(Color.CYAN);
        panelJudul.setBounds(0, 100, 800, 100);

        panelJudul.setLayout(null);

        JLabel labelJudulPanel = new JLabel("APALAH INI");
        labelJudulPanel.setForeground(Color.WHITE);
        labelJudulPanel.setBounds(0, 0, 200, 50);

        panelJudul.add(labelJudulPanel);

        panelUtama.add(panelJudul);

        JPanel panelKonten = new JPanel();
        panelKonten.setBackground(Color.BLUE);
        panelKonten.setBounds(0, 200, 800, 100);

        panelUtama.add(panelKonten);

        panelUtama.add(labelJudul);
        panelUtama.add(labelHeaderImg);

        frame.setContentPane(panelUtama);
        frame.setVisible(true);
    }
}
