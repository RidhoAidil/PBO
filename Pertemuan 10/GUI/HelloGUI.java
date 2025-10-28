import javax.swing.*;

public class HelloGUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("Contoh GUI");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nama = new JLabel("Apalah ini", JLabel.CENTER);
        nama.setBounds(50, 30, 150, 30);
        JButton tombol = new JButton("Klik kali");
        tombol.setBounds(80, 70, 100, 30);
        frame.add(nama);
        frame.add(tombol, "South");
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