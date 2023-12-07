
package SpringHibernate.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import SpringHibernate.service.PelangganService;

public class PelangganForm extends JFrame {
    private JTextField namaField;
    private JTextField alamatField;
    private JButton tambahButton;
    private JTextArea hasilArea;

    public PelangganForm() {
        setTitle("Aplikasi Pelanggan");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(3, 2));
        JLabel namaLabel = new JLabel("Nama:");
        namaField = new JTextField();
        JLabel alamatLabel = new JLabel("No meja:");
        alamatField = new JTextField();
        tambahButton = new JButton("Tambah Pelanggan");

        formPanel.add(namaLabel);
        formPanel.add(namaField);
        formPanel.add(alamatLabel);
        formPanel.add(alamatField);
        formPanel.add(new JLabel()); // Spacer
        formPanel.add(tambahButton);

        hasilArea = new JTextArea();
        hasilArea.setEditable(false);

        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahPelanggan();
            }
        });

        add(formPanel, BorderLayout.NORTH);
        add(new JScrollPane(hasilArea), BorderLayout.CENTER);
    }

    public PelangganForm(PelangganService pelangganService) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void tambahPelanggan() {
        String nama = namaField.getText();
        String alamat = alamatField.getText();

        // Lakukan sesuatu dengan data pelanggan, misalnya tambahkan ke daftar atau tampilkan di JTextArea
        String hasil = "Pelanggan Baru:\nNama: " + nama + "\nAlamat: " + alamat + "\n";
        hasilArea.append(hasil);

        // Bersihkan input field setelah ditambahkan
        namaField.setText("");
        alamatField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PelangganForm form = new PelangganForm();
                form.setVisible(true);
            }
        });
    }
}
