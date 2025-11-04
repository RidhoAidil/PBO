import java.awt.Dimension;
import javax.swing.*;
import javax.swing.JFrame;

public class HelloGUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("Contoh GUI");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setMaximumSize(new Dimension(800, 600));
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel nama = new JLabel("Apalah ini", JLabel.CENTER);
        nama.setBounds(200, 200, 150, 30);
        JButton tombol = new JButton("Klik kali");
        tombol.setBounds(200, 250, 150, 30);
        frame.add(nama);
        frame.add(tombol, "North");

        JTextField txUser = new JTextField();
        txUser.setBounds(120, 30, 150, 30);
        frame.add(txUser);

        JButton btnLogin = new JButton("Input");
        btnLogin.setBounds(150, 130, 80, 30);
        frame.add(btnLogin);

        JDialog dialog = new JDialog();


        tombol.addActionListener(e -> {
            dialog.setTitle("Selamat Datang");
            dialog.setSize(200, 100);
            JLabel dialogLabel = new JLabel("Ke klik nih", JLabel.CENTER);
            dialog.add(dialogLabel);
            dialog.setLocationRelativeTo(frame);
            dialog.setVisible(true);
        });
        frame.setVisible(true);
    }
}