package hu.szamalk.nezet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class GuiForm extends JFrame {
    private JPanel pnlMain;
    private JButton btnUjAuto;
    private JList lstLista;
    private JButton btnMasol;
    private JButton btnMozgat;
    private JComboBox comboBox1;
    private JLabel lblKolcsonJarmuvek;
    private JLabel lblJarmuvek;

    public GuiForm() {
        setContentPane(pnlMain);
        setSize(300, 400);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);


        JMenuBar menuBar = new JMenuBar();
        JMenuItem mnuBeolvas = new JMenuItem("Beolvas");
        JMenuItem mnuKilep = new JMenuItem("Kilépés");
        JMenu menu = new JMenu("Program");

        menuBar.add(menu);
        menu.add(mnuBeolvas);
        menu.add(new JSeparator());
        menu.add(mnuKilep);
        setJMenuBar(menuBar);

        mnuBeolvas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser kivalaszto = new JFileChooser(new File(System.getProperty("jarmu.bin")));
                kivalaszto.showSaveDialog(null);
            }
        });

        mnuKilep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kilepes();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                kilepes();
            }
        });

        setVisible(true);
    }

    private void kilepes() {
        String uzenet = "Biztos ki szeretnél lépni?";
        String cim = "Kilépés";
        int valaszt = JOptionPane.YES_NO_OPTION;
        int gomb = JOptionPane.showConfirmDialog(null, uzenet, cim, valaszt);
        if(gomb == JOptionPane.YES_OPTION) {
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        new GuiForm();
    }
}
